<script setup lang="ts">
import {onMounted, ref, watch, getCurrentInstance, nextTick} from 'vue';
import {roundRect, getWidthByTextNum, loadImage,loadImage2d, clipRoundRect, fillRoundRect, rpx2px,loadFace} from "./canvasUtils";
import {colorStringToRGBA} from "./colorUtils";
import {onReady} from "@dcloudio/uni-app";
import SvgPath from "./svgPath/index";


interface ShowImage {
  width: number,
  height: number,
  showWidth: number,
  showHeight: number,
  zoom: number,
}

const emit = defineEmits<{
  (e: 'change', path: string, imageInfo: ShowImage, showNodeElements: NodeElement[]): void
  (e: 'redrawing', isRedrawing :boolean): void
  (e: 'nodeClick', item: NodeElement[]): void
}>();

const currentInstance = getCurrentInstance();

export interface NodeElement {
  resourceType: 'text' | 'image' | 'icon' | 'group',
  text?: string,
  url?: string,
  name?: string,
  id: string,
  css: {
    top: number,
    left: number,
    width?: number,
    height?: number,
    mode?: 'scaleToFill' | 'aspectFit' | 'aspectFill' | 'widthFix' | 'heightFix',
    font?: string,
    color?: string,
    backgroundColor?: string,
    maxLine?: number,
    textOverflow?: string,
    borderWidth?: number,
    borderColor?: string,
    /**
     * 自定义形状 polygon(50% 0, 100% 50%, 50% 100%, 0 50%)
     * 如果设置， borderRadius 将不起作用
     */
    clipPath?: string,
    /**
     * 如果设置 polygon，将不起作用
     */
    borderRadius?: number,
    shadowOffsetX?: number,
    shadowOffsetY?: number,
    shadowBlur?: number,
    shadowColor?: string,
    angle?: number,
    lineSpacing?: number,
    textAlign?: 'center' | 'left' | 'right',
    zIndex?: number
  }
  width?: number,
  height?: number,
  nodes?: NodeElement[],
  clickStop?: boolean  // 是否阻止点击穿透
}


interface Face {
  name: string,
  url: string
}

export interface DrawData {

  nodeElements: NodeElement[],
  width: number,
  height: number,
  faces?: Face[]

}

const props = defineProps<{
  drawData: DrawData
}>()

let nodes :NodeElement[] = [];

const getTextOverflowString = (textOverflow: string) => {
  if (textOverflow === 'ellipsis') {
    return '...'
  }
  if (textOverflow) {
    return textOverflow
  }
  return '';
}

// watch(() => props.drawData.nodeElements,
//     (newVal) => {
//       nodesConversion(newVal);
//       reDraw();
//     },
//     {
//       deep: true,
//       // immediate: true
//     }
// )

let imageRect = null;

let redrawing = false;
let tempDrawData;
let nextRedraw = false;
let stt = 0;
const reDraw = async (data?: DrawData) => {

  if (redrawing) {
    nextRedraw = true;
    tempDrawData = data;
    return;
  }

  if(!canvas){
    return;
  }
  if(!data){
    return;
  }
  nodesConversion(data.nodeElements);

  width = rpx2px(data.width);
  height = rpx2px(data.height);


  canvas.width = width;
  canvas.height = height;
  redrawing = true;

  await drawNodeElements();

  redrawing = false;
  image.value = canvas.toDataURL("image/png");

  nextTick(() => {
    uni.createSelectorQuery().in(currentInstance).select(`#${id} #showImage`).boundingClientRect((res) => {
      imageRect = res;
      zoom = imageRect.width / width;
      emit('change', image.value, {width, height, showWidth: width * zoom, showHeight: height * zoom,zoom},nodes);
      if(nextRedraw){
        nextRedraw = false;
        if(tempDrawData){
          reDraw(tempDrawData);
        }
      }
    }).exec()
  });

}

defineExpose({
  reDraw
});

const image = ref('');
const canvasId = 'mpCardCanvas';
const canvasTempId = 'mpCardCanvasTemp';
let width = rpx2px(props.drawData.width);
let height = rpx2px(props.drawData.height);

let canvasTempWidth = 1000;
let canvasTempHeight = 1000;
let fontFamily = ref('');

let canvasContext = null;
let canvas = null;


async function drawImageIconNode(node: NodeElement) {

  drawShadow(node);

  canvasContext.save();

  //旋转
  node.css.angle = node.css.angle || 0;
  const angle = node.css.angle;
  canvasContext.translate(node.css.left + node.css.width / 2, node.css.top + node.css.height / 2);
  canvasContext.rotate(angle * Math.PI / 180);
  canvasContext.translate(-(node.css.left + node.css.width / 2), -(node.css.top + node.css.height / 2));


  //锁定区域
  clipRoundRect(canvasContext, node.css.left, node.css.top, node.css.width, node.css.height, node.css.borderRadius);

  //填充背景
  darwBg(node);

  //填充图片
  if (!node.url) {
    console.warn('图标地址为空', node.url);
    return;
  }
  const imageUrl = await imageChangeColor(node.url, node.css.color);
  const image = await loadImage2d(imageUrl,node.css.width, node.css.height);
  canvasContext.drawImage(image, node.css.left, node.css.top, node.css.width, node.css.height);
  node.width = node.css.width;
  node.height = node.css.height;


  //填充边框
  darwBorder(node);

  //解锁区域
  canvasContext.restore();

}



async function drawNodeElements() {
  for (let i = 0; i < nodes.length; i++) {
    const item = nodes[i];
    if (item.resourceType === 'text') {
      await fillTextNode(item);
    } else if (item.resourceType === 'image') {
      await drawImageNode(item);
    } else if (item.resourceType === 'icon') {
      await drawImageIconNode(item);
    }else if (item.resourceType === 'group') {
      drawCurrentGroup = item;
      await drawGroupNode(item);
    }
  }
}

let drawCurrentGroup = null;
let groupLeftTopAccumulate = {
  left: 0,
  top: 0
};

async function drawGroupNode(group: NodeElement) {

  //组定位累加
  groupLeftTopAccumulate.left += group.css.left;
  groupLeftTopAccumulate.top += group.css.top;

  //组开始 锁定组区域
  // clipRoundRect(canvasContext, groupLeftTopAccumulate.left, groupLeftTopAccumulate.top, group.css.width, group.css.height, group.css.borderRadius);
  for (let i = 0; i < group.nodes.length; i++) {
    const item = group.nodes[i];
    if (item.resourceType === 'group') {
      drawCurrentGroup = item;
      item.width = group.css.width;
      item.height = group.css.height;
      await drawGroupNode(item);
      return;
    }
    item.css.left += groupLeftTopAccumulate.left;
    item.css.top += groupLeftTopAccumulate.top;
    if (item.resourceType === 'text') {
      await fillTextNode(item);
    } else if (item.resourceType === 'image') {
      await drawImageNode(item);
    } else if (item.resourceType === 'icon') {
      await drawImageIconNode(item);
    }
  }
  groupLeftTopAccumulate.left = 0;
  groupLeftTopAccumulate.top = 0;


  //组结束 解锁组区域
  // canvasContext.restore();


}

function drawTextBak(node: NodeElement) {
  let tFontSize = 30;
  canvasContext.restore();
  if (node.css.shadowColor && node.css.shadowBlur > 0) {
    canvasContext.shadowBlur = node.css.shadowBlur;
    canvasContext.shadowColor = node.css.shadowColor;
    canvasContext.shadowOffsetX = node.css.shadowOffsetX;
    canvasContext.shadowOffsetY = node.css.shadowOffsetY;

    // canvasContext.setShadow(node.css.shadowOffsetX, node.css.shadowOffsetY, node.css.shadowBlur, node.css.shadowColor);
    canvasContext.fillStyle = node.css.shadowColor;
  }

  (() => {
    canvasContext.textBaseline = 'top';
    const tFont = node.css.font.replace(/(\d+)r?px/g, (r, fontSize) => {
      if (r.indexOf('r') !== -1) {
        tFontSize = rpx2px(+fontSize);
        return tFontSize + 'px';
      }
      tFontSize = +fontSize;
      return r
    })
    canvasContext.fillStyle = node.css.color;
    canvasContext.font = tFont;
    //计算文本分成几行 并分成行内容数组

    function _textAutoWidthHetght() {
      const jpv = JSON.parse('{"v":"' + `${node.text}`.replace('&#x', '\\u').replace(';', '') + '"}');
      const rText = jpv.v;
      const textR = canvasContext.measureText(rText);

      node.width = textR.width;
      node.height = tFontSize;
      if (node.width > width - node.css.left) {
        const num = getWidthByTextNum(canvasContext, rText, width - node.css.left);
        node.width = width - node.css.left;
        canvasContext.fillText(rText.substring(0, num) + getTextOverflowString(node.css.textOverflow), node.css.left, node.css.top);
      } else {
        canvasContext.fillText(rText, node.css.left, node.css.top);
      }
      //厦门市软件园厦门市软件园二期观日路24号楼之二202室二期观日路24号楼之二202室
    }

    if (node.css.width <= 0 || node.css.height <= 0) {
      _textAutoWidthHetght();
      return;
    }

    const jpv = JSON.parse('{"v":"' + `${node.text}`.replace('&#x', '\\u').replace(';', '') + '"}');
    const rText = jpv.v;
    const drawText = (lineIndex = 0, text?: string) => {
      if (lineIndex > node.css.maxLine - 1) {
        return;
      }
      text = text || rText;
      const textR = canvasContext.measureText(text);

      let fontHeight = tFontSize;

      let lineHeight = fontHeight;

      const lineSpacing = node.css.lineSpacing || 0;

      let top = node.css.top + lineIndex * (lineHeight + lineSpacing);
      let left = node.css.left;
      let myNodeWidth = textR.width;

      if(node.css.textAlign === 'center'){
        left = node.css.left + (node.css.width - myNodeWidth/*自己的宽度*/)/2
      }else if(node.css.textAlign === 'right'){
        left = node.css.left + node.css.width - myNodeWidth;
      }

      if (textR.width <= node.css.width) {
        canvasContext.fillText(text, left, top);
        return;
      }

      //处理文字换行
      const textNum = getWidthByTextNum(canvasContext, text, node.css.width);
      const textLine1 = text.substring(0, textNum);
      const textLine1Meas = canvasContext.measureText(textLine1);
      myNodeWidth = textLine1Meas.width;
      if(node.css.textAlign === 'center'){
        left = node.css.left + (node.css.width - myNodeWidth/*自己的宽度*/)/2
      }else if(node.css.textAlign === 'right'){
        left = node.css.left + node.css.width - myNodeWidth;
      }


      //超出全部高度
      if ((lineHeight + lineSpacing) * (lineIndex + 1) >= height - node.css.top && textNum < text.length) {
        canvasContext.fillText(textLine1.substring(0, textLine1.length - 1) + getTextOverflowString(node.css.textOverflow), left, top);
        return;
      }

      //达到最后一行 且还有剩余字符 是否需要 ...
      if (lineIndex == node.css.maxLine - 1 && textNum < text.length) {
        canvasContext.fillText(textLine1.substring(0, textLine1.length - 1) + getTextOverflowString(node.css.textOverflow), left, top);
        return;
      }

      if (lineHeight * (lineIndex + 1) >= node.css.height && textNum < text.length) {
        canvasContext.fillText(textLine1.substring(0, textLine1.length - 1) + getTextOverflowString(node.css.textOverflow), left, top);
        return;
      }
      canvasContext.fillText(textLine1, left, top);
      const textLineLast = text.substring(textNum);
      drawText(lineIndex + 1, textLineLast);
    }
    drawText();
    if (node.css.shadowColor && node.css.shadowBlur > 0) {
      canvasContext.shadowOffsetX = node.css.shadowOffsetX;
      canvasContext.shadowOffsetY = node.css.shadowOffsetY;
      canvasContext.shadowBlur = 0;
      canvasContext.shadowColor = 'transparent';

      // canvasContext.setShadow(node.css.shadowOffsetX, node.css.shadowOffsetY, 0, 'transparent');
    }
    node.width = node.css.width;
    node.height = Math.max(node.css.height,tFontSize);
  })();


  // canvasContext.shadowColor = 'transparent';
}


function drawText(node: NodeElement) {
  let tFontSize = 30;
  canvasContext.restore();
  if (node.css.shadowColor && node.css.shadowBlur > 0) {
    canvasContext.setShadow(node.css.shadowOffsetX, node.css.shadowOffsetY, node.css.shadowBlur, node.css.shadowColor);
    canvasContext.fillStyle = node.css.shadowColor;
  }

  canvasContext.textBaseline = 'top';
  const tFont = node.css.font.replace(/(\d+)r?px/g, (r, fontSize) => {
    if (r.indexOf('r') !== -1) {
      tFontSize = rpx2px(+fontSize);
      return tFontSize + 'px';
    }
    tFontSize = +fontSize;
    return r
  })
  canvasContext.fillStyle = node.css.color;
  canvasContext.font = tFont;
  //计算文本分成几行 并分成行内容数组
  const jpv = JSON.parse('{"v":"' + `${node.text}`.replace('&#x', '\\u').replace(';', '') + '"}');
  const rText = jpv.v;
  const textR = canvasContext.measureText(rText);

  function _textAutoWidthHetght() {

    const textR = canvasContext.measureText(rText);
    node.width = textR.width;
    node.height = tFontSize;
    if (node.width > width - node.css.left) {
      const num = getWidthByTextNum(canvasContext, rText, width - node.css.left);
      node.width = width - node.css.left;

      //处理文字旋转
      //旋转

      canvasContext.save();
      node.css.angle = node.css.angle || 0;
      const angle = node.css.angle;
      canvasContext.translate(node.css.left + node.width  / 2, node.css.top + node.height / 2);
      canvasContext.rotate(angle * Math.PI / 180);
      canvasContext.translate(-(node.css.left + node.width / 2), -(node.css.top + node.height / 2));

      const texta = rText.substring(0, num);
      let textOverflowString = getTextOverflowString(node.css.textOverflow);
      const textWidth = canvasContext.measureText(textOverflowString).width;
      const text = texta.split('').reverse().join('');
      const tNum = getWidthByTextNum(canvasContext,text,textWidth);
      canvasContext.fillText(texta.substring(0,texta.length - tNum) + getTextOverflowString(node.css.textOverflow), node.css.left, node.css.top);
      canvasContext.restore();

    } else {

      canvasContext.save();
      node.css.angle = node.css.angle || 0;
      const angle = node.css.angle;
      canvasContext.translate(node.css.left + node.width  / 2, node.css.top + node.height / 2);
      canvasContext.rotate(angle * Math.PI / 180);
      canvasContext.translate(-(node.css.left + node.width / 2), -(node.css.top + node.height / 2));

      canvasContext.fillText(rText, node.css.left, node.css.top);
      canvasContext.restore();
    }
    //厦门市软件园厦门市软件园二期观日路24号楼之二202室二期观日路24号楼之二202室
  }

  if (node.css.width <= 0 || node.css.height <= 0) {
    _textAutoWidthHetght();
  }else{

    const lineMaxWidth = node.css.width > width - node.css.left ? width - node.css.left : node.css.width;
    let lineWidth = node.css.width < lineMaxWidth ? node.css.width : lineMaxWidth;
    let lineMaxHeight = node.css.height > height - node.css.top ? height - node.css.top : node.css.height;

    //向上取整
    const lineNum = Math.ceil(textR.width/lineWidth);
    const lineData = [];
    let showMaxLine = 0;

    node.height = 0;
    node.width = lineWidth;


    let lineStartIndex = 0;

    for (let i = 0; i < lineNum; i++) {
      let widthByTextNum = getWidthByTextNum(canvasContext, rText.substring(lineStartIndex), lineWidth);
      //最多行限制
      if(i > node.css.maxLine - 1){
        if(lineStartIndex < rText.length){
          let textOverflowString = getTextOverflowString(node.css.textOverflow);
          const textWidth = canvasContext.measureText(textOverflowString).width;
          const text = lineData[i - 1].text.split('').reverse().join('');
          const tNum = getWidthByTextNum(canvasContext,text,textWidth);
          lineData[i - 1].text = lineData[i - 1].text.substring(0,lineData[i - 1].text.length - tNum) + textOverflowString;
        }
        break;
      }

      let lineContent = rText.substring(lineStartIndex, lineStartIndex + widthByTextNum + 1);

      let fontHeight = tFontSize;
      let lineHeight = fontHeight;
      const lineSpacing = node.css.lineSpacing || 0;

      node.height += lineHeight + lineSpacing;
      if(node.height > lineMaxHeight){
        if(i > 0){
          node.height -= lineHeight + lineSpacing;
          if(lineStartIndex + widthByTextNum < rText.length){
            let textOverflowString = getTextOverflowString(node.css.textOverflow);
            const textWidth = canvasContext.measureText(textOverflowString).width;
            const tNum = getWidthByTextNum(canvasContext,lineData[i - 1].text.split('').reverse().join(''),textWidth);
            lineData[i - 1].text = lineData[i - 1].text.substring(0,lineData[i - 1].text.length - tNum) + textOverflowString;
          }
        }

        break;
      }

      showMaxLine = i + 1;

      lineData[i] = {
        text: lineContent,
        width: lineWidth,
        lineNum: i
      }
      lineStartIndex += widthByTextNum;
      const textR = canvasContext.measureText(lineData[i].text);

      let top = node.css.top + lineData[i].lineNum * (lineHeight + lineSpacing);
      let left = node.css.left;
      let myNodeWidth = textR.width;

      if(node.css.textAlign === 'center'){
        left = node.css.left + (node.css.width - myNodeWidth/*自己的宽度*/)/2;
      }else if(node.css.textAlign === 'right'){
        left = node.css.left + node.css.width - myNodeWidth;
      }
      lineData[i].top = top;
      lineData[i].left = left;
    }

    canvasContext.save();
    node.css.angle = node.css.angle || 0;
    const angle = node.css.angle;
    canvasContext.translate(node.css.left + node.width  / 2, node.css.top + node.height / 2);
    canvasContext.rotate(angle * Math.PI / 180);
    canvasContext.translate(-(node.css.left + node.width / 2), -(node.css.top + node.height / 2));

    for (let i = 0; i < showMaxLine; i++) {
      //支持文字垂直居中
      if(node.css.textAlign === 'center'){
        const topCenter = (node.css.height - node.height) / 2;
        canvasContext.fillText(lineData[i].text, lineData[i].left, lineData[i].top + topCenter);
      }else{
        canvasContext.fillText(lineData[i].text, lineData[i].left, lineData[i].top);
      }
    }
    node.height = node.css.height;
    canvasContext.restore();

  }

  if (node.css.shadowColor && node.css.shadowBlur > 0) {
    canvasContext.setShadow(node.css.shadowOffsetX, node.css.shadowOffsetY, 0, 'transparent');
  }

  // canvasContext.shadowColor = 'transparent';
}


function getImageModeLeftTopWidthHeight(image: {width: number, height: number}, node: NodeElement) {
  const showBox = node.css;
  if (showBox.mode === 'scaleToFill') {
    return [showBox.left, showBox.top, showBox.width, showBox.height];
  }

  //保持纵横比缩放图片，使图片的长边能完全显示出来。也就是说，可以完整地将图片显示出来。
  if (showBox.mode === 'aspectFit') {
    if (image.width / image.height > showBox.width / showBox.height) {
      return [showBox.left, showBox.top,showBox.width, showBox.width * image.height / image.width];
    }
    return [showBox.left, showBox.top,showBox.height * image.width / image.height, showBox.height];
  }
  //保持纵横比缩放图片，使图片的短边能完全显示出来。也就是说，可以完整地将图片显示出来。
  if (showBox.mode === 'aspectFill') {
    if (image.width / image.height > showBox.width / showBox.height) {
      return [showBox.left, showBox.top,showBox.height * image.width / image.height, showBox.height];
    }
    return [showBox.left, showBox.top,showBox.width, showBox.width * image.height / image.width];
  }
  //宽度不变，高度自动变化，保持原图宽高比不变
  if (showBox.mode === 'widthFix') {
    return [showBox.left, showBox.top,showBox.width, showBox.width * image.height / image.width];
  }
  //保持纵横比缩放图片，使图片的短边能完全显示出来。也就是说，可以完整地将图片显示出来。
  if (showBox.mode === 'heightFix') {
    return [showBox.left, showBox.top,showBox.height * image.width / image.height, showBox.height];
  }
  if(showBox.mode === 'center'){
    return [showBox.left + (showBox.width - image.width)/2, showBox.top + (showBox.height - image.height)/2,image.width, image.height];
  }
  if (showBox.mode === 'top') {
    return [showBox.left, showBox.top,image.width, image.height];
  }
  if (showBox.mode === 'bottom') {
    return [showBox.left, showBox.top + (showBox.height - image.height),image.width, image.height];
  }
  if (showBox.mode === 'left') {
    return [showBox.left, showBox.top,image.width, image.height];
  }
  if (showBox.mode === 'right') {
    return [showBox.left + (showBox.width - image.width), showBox.top,image.width, image.height];
  }
}

async function drawImage(node: NodeElement) {
  if (!node.url) {
    console.warn('图片地址为空', node.url);
    return;
  }
  const image = await loadImage2d(node.url,node.css.width, node.css.height);

  const [left,top,width, height] = getImageModeLeftTopWidthHeight(image, node);

  canvasContext.drawImage(image, left,top,width, height);
  node.width = node.css.width;
  node.height = node.css.height;
}

function darwBg(node: NodeElement) {
  if (node.css.backgroundColor) {
    canvasContext.fillStyle = node.css.backgroundColor;
    canvasContext.fillRect(node.css.left, node.css.top, node.css.width, node.css.height);
  }
}

function darwBorder(node: NodeElement) {
  if (node.css.borderWidth === 0 || !node.css.borderColor) {
    return;
  }
  canvasContext.strokeStyle = node.css.borderColor;
  canvasContext.lineWidth = node.css.borderWidth;
  roundRect(canvasContext, node.css.left, node.css.top, node.css.width, node.css.height, node.css.borderRadius);

}

async function fillTextNode(node: NodeElement) {

  canvasContext.save();

  //锁定区域
  clipRoundRect(canvasContext, node.css.left, node.css.top, node.css.width, node.css.height, node.css.borderRadius);

  //填充背景
  darwBg(node);

  //填充文字
  drawText(node);

  //填充边框
  darwBorder(node);

  //解锁区域
  canvasContext.restore();

}


function drawShadow(node: NodeElement) {
  if (node.css.shadowColor && node.css.shadowBlur > 0) {
    // canvasContext.setShadow(node.css.shadowOffsetX, node.css.shadowOffsetY, node.css.shadowBlur, node.css.shadowColor);
    canvasContext.shadowOffsetX = node.css.shadowOffsetX;
    canvasContext.shadowOffsetY = node.css.shadowOffsetY;
    canvasContext.shadowColor = node.css.shadowColor;
    canvasContext.shadowBlur = node.css.shadowBlur;
    canvasContext.fillStyle = node.css.shadowColor;
    fillRoundRect(canvasContext, node.css.left, node.css.top, node.css.width, node.css.height, node.css.borderRadius);
    // canvasContext.setShadow(0, 0, 0, 'transparent');
    canvasContext.shadowOffsetX = 0;
    canvasContext.shadowOffsetY = 0;
    canvasContext.shadowColor = 'transparent';
    canvasContext.shadowBlur = 0;
    // canvasContext.shadowColor = 'transparent';
  }
}

function clipPath(node: NodeElement) {
  if(!node.css.clipPath){
    clipRoundRect(canvasContext, node.css.left, node.css.top, node.css.width, node.css.height, node.css.borderRadius);
  }else{
    //polygon(50% 0, 100% 50%, 50% 100%, 0 50%)
    if(node.css.clipPath.startsWith('polygon')){
        let clipPathMatchArray = node.css.clipPath.match(/^polygon\((.+)\)$/);
        if(clipPathMatchArray){
          //50% 0, 100% 50%, 50% 100%, 0 50%
          const points = clipPathMatchArray[1].split(',').map((item)=>{
            const tItem = item.replace(/%/g,'')
            let xy = tItem.trim().split(' ');
            console.log(xy);
            return {
              x: (+xy[0] / 100) * node.css.width + node.css.left,
              y: (+xy[1] / 100) * node.css.height + node.css.top,
            }
          });
          canvasContext.beginPath();
          canvasContext.moveTo(points[0].x, points[0].y);
          for (let i = 1; i < points.length; i++) {
            canvasContext.lineTo(points[i].x, points[i].y);
          }
          canvasContext.lineTo(points[0].x, points[0].y);
          canvasContext.closePath();
          canvasContext.clip();
        }
    }else if(node.css.clipPath.startsWith('path')){
      let clipPathMatchArray = node.css.clipPath.match(/^path\((.+)\)$/);
      if(clipPathMatchArray){
        //M23.6,0c-3.4,0-6.3,2.7-7.6,5.6C14.7,2.7,11.8,0,8.4,0C3.8,0,0,3.8,0,8.4c0,9.4,9.5,11.9,16,21.2 c6.1-9.3,16-12.1,16-21.2C32,3.8,28.2,0,23.6,0z
        //M512 229.333333a282.666667 282.666667 0 1 1 0 565.333334H282.666667c-29.44 0-53.333333-23.893333-53.333334-53.333334V512A282.666667 282.666667 0 0 1 512 229.333333z m26.666667 312.021334H383.104a5.333333 5.333333 0 0 0-5.333333 5.290666v53.333334c0 2.986667 2.389333 5.376 5.333333 5.376h155.562667a5.333333 5.333333 0 0 0 5.333333-5.376v-53.333334a5.333333 5.333333 0 0 0-5.333333-5.290666z m102.229333-122.709334H383.104a5.333333 5.333333 0 0 0-5.333333 5.376v53.333334c0 2.944 2.389333 5.290667 5.333333 5.290666h257.792a5.333333 5.333333 0 0 0 5.333333-5.290666v-53.333334a5.333333 5.333333 0 0 0-5.333333-5.376z
        let svgPath = new SvgPath(clipPathMatchArray[1]);
        let [svgWidth, svgHeight] = svgPath.size;
        const scaleX = node.css.width / svgWidth;
        const scaleY = node.css.height / svgHeight;
        svgPath.save()
            .beginPath()
            .trim()
            .scale(scaleX,scaleY)
            .translate(node.css.left, node.css.top)
            .to(canvasContext);
        canvasContext.clip();
      }
    }


  }
}

async function drawImageNode(node: NodeElement) {

  //1.锁定区域
  //2.填充背景
  //3.填充图片
  //4.填充边框
  //6.解锁区域
  //7.结束

  drawShadow(node);

  canvasContext.save();

  //旋转
  node.css.angle = node.css.angle || 0;
  const angle = node.css.angle;
  canvasContext.translate(node.css.left + node.css.width / 2, node.css.top + node.css.height / 2);
  canvasContext.rotate(angle * Math.PI / 180);
  canvasContext.translate(-(node.css.left + node.css.width / 2), -(node.css.top + node.css.height / 2));

  //锁定区域
  clipPath(node);

  //填充背景
  darwBg(node);

  //填充图片
  await drawImage(node);

  //填充边框
  darwBorder(node);

  //解锁区域
  canvasContext.restore();


}

let zoom = 1;


const nodesConversion = (nodeElements: NodeElement[]) => {

  nodes = nodeElements

  function _nodesRpx2PxSort(tNodeElements: NodeElement[]) {
    if(tNodeElements == null || tNodeElements.length == 0){
      return
    }

    tNodeElements.sort((a, b) => {
      const aZindex = a.css.zIndex || 0;
      const bZindex = b.css.zIndex || 0;
      return aZindex - bZindex;
    })
    tNodeElements.forEach((item, index) => {
      item.css.top = rpx2px(item.css.top|| 0);
      item.css.left = rpx2px(item.css.left|| 0);
      item.css.width = rpx2px(item.css.width || 0);
      item.css.height = rpx2px(item.css.height || 0);
      item.css.borderWidth = rpx2px(item.css.borderWidth|| 0);
      item.css.borderRadius = rpx2px(item.css.borderRadius|| 0);
      item.css.lineSpacing = rpx2px(item.css.lineSpacing|| 0);
      item.css.font = item.css.font || "32rpx Arial";
      item.css.shadowBlur = rpx2px(item.css.shadowBlur|| 0);
      item.css.maxLine = item.css.maxLine || 1;
      item.css.textAlign = item.css.textAlign || 'left';
      item.css.mode = item.css.mode || 'scaleToFill';
      _nodesRpx2PxSort(item.nodes);
    })
  }
  _nodesRpx2PxSort(nodes);
}

const init = async () => {
  nodesConversion(props.drawData.nodeElements);

  width = rpx2px(props.drawData.width);
  height = rpx2px(props.drawData.height);

  //加载图标
  if(props.drawData.faces && props.drawData.faces.length > 0){
    for (let i = 0; i < props.drawData.faces.length; i++) {
      const face = props.drawData.faces[i];
      // console.log('加载图表库 name', face.name, 'url', face.url);
      fontFamily.value = face.name + ','
      await loadFace(face.name, face.url);
    }
  }

  // fontFamily.value = fontFamily.value.substring(0, fontFamily.value.length - 1);

  canvas = document.querySelector(`#${id} #${canvasId} canvas`);
  canvas.width = width;
  canvas.height = height;

  canvasContext = canvas.getContext('2d');

}

function pointInRect({x1, y1}, {x, y, width, height}) {

  const max = x + width;
  const min = x;
  const max2 = y + height;
  const min2 = y;
  if (x1 >= min && x1 <= max && y1 >= min2 && y1 <= max2) {
    return true;
  }
  return false;
}



const imageClick = async (e: any) => {
  let {x, y} = e.detail;
  x = x - imageRect.left;
  y = y - imageRect.top;
  const zoom = imageRect.width / width;
  // clickItems.splice(0, clickItems.length);
  let clickItems = [];
  function _nodesRpx2PxSort(tNodeElement: NodeElement) {

    if(tNodeElement.nodes == null || tNodeElement.nodes.length == 0){
      const item = tNodeElement;
      const isClick = pointInRect({x1: x, y1: y}, {x: item.css.left * zoom, y: item.css.top * zoom, width: item.width * zoom, height: item.height * zoom});
      if (isClick) {
        clickItems.push(item);
        if (item.clickStop) {
          throw new Error('clickStop');
        }
      }
      return;
    }
    for (let i = tNodeElement.nodes.length - 1; i >= 0; i--) {
      const item = tNodeElement.nodes[i];
      _nodesRpx2PxSort(item);
    }
  }
  try {
    const tNodes = JSON.parse(JSON.stringify(nodes));
    for (let i = nodes.length - 1; i >= 0; i--) {
      const item = nodes[i];
      _nodesRpx2PxSort(item);
    }
  }catch (e) {}
  emit('nodeClick', clickItems);
}

let canvasTemp = null;
let canvasTempContext = null;

async function imageChangeColor(imageUrl: string, color: string): Promise<string> {
  return new Promise<string>(async resolve => {
    //先加载图片到canvas
    if (!canvasTempContext) {
      canvasTemp = document.querySelector(`#${id} #${canvasTempId} canvas`);
      canvasTempContext = canvasTemp.getContext('2d');
    }

    let image = await loadImage2d(imageUrl);
    canvasTemp.width = image.width;
    canvasTemp.height = image.height;
    const colors = colorStringToRGBA(color);
    canvasTempContext.drawImage(image, 0, 0, image.width, image.height);
    let res = canvasTempContext.getImageData(0,0,image.width, image.height);

    const imageData = res.data;
    for (let i = 0; i < res.width; i++) {
      for (let j = 0; j < res.height; j++) {
        const index = (i + j * res.width) * 4;
        if (imageData[index + 3] > 0) {
          imageData[index] = colors[0];
          imageData[index + 1] = colors[1];
          imageData[index + 2] = colors[2];
          //向下取整
          // imageData[index + 3] = colors[3];
        }
      }
    }

    canvasTempContext.putImageData(res,0,0);

    resolve(canvasTemp.toDataURL('image/png'));
  })
}
//#ifdef H5
onMounted(() => {
  init();
})
//#endif
onReady(() => {
  init()
})

const id = `id-${Date.now()}`;
</script>

<template>
  <view class="mp-card-canvas" :id="id" :style="{ fontFamily: `${fontFamily}` }">

    <image :src="image" mode="widthFix" @click="imageClick" id="showImage"></image>
<!--    <view class="load-image" :class="{ 'load-opacity': image }"  :style="{width:width + 'px',height:height + 'px'}">-->
<!--      <view class="loading"></view>-->
<!--    </view>-->
    <canvas id="mpCardCanvas" canvas-id="mpCardCanvas" :style="{
      width: `${width}px`,
      height: `${height}px`
    }"></canvas>
    <canvas id="mpCardCanvasTemp" canvas-id="mpCardCanvasTemp" :style="{
      width: `${canvasTempWidth}px`,
      height: `${canvasTempHeight}px`
    }"></canvas>
  </view>
</template>

<style scoped lang="scss">
.mp-card-canvas {
  display: flex;
  justify-content: center;
  align-items: center;
  position: relative;
  width: 100%;

  canvas {
    position: fixed;
    top: 0;
    left: 0;
    z-index: -1;
    transform: translateX(-100000px);
  }

  image {
    width: 100%;
    opacity: 1;
  }

  .image-opacity {
    opacity: 1;
    /* 设置动画持续时间 */
    transition: opacity 1s;
  }

  .load-opacity {
    opacity: 0;
    /* 设置动画持续时间 */
    transition: opacity 1s;
  }

  .load-image {
    background: #ffffff;
    color: #000;
    display: flex;
    justify-content: center;
    align-items: center;
    position: absolute;
    top: 0;
    left: 0;
    z-index: -1;

    .loading {
      width: 30px;
      height: 30px;
      border: 2px solid #000;
      border-top-color: transparent;
      border-radius: 100%;

      animation: circle infinite 0.75s linear;
    }

    // 转转转动画
    @keyframes circle {
      0% {
        transform: rotate(0);
      }

      100% {
        transform: rotate(360deg);
      }
    }
  }
}
</style>
