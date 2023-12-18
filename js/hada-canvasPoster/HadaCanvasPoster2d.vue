<script setup lang="ts">
import {getCurrentInstance, onMounted, ref, watch} from 'vue';
import md5 from 'js-md5';
import {
  clipRoundRect,
  fillRoundRect,
  getImageModeLeftTopWidthHeight,
  getWidthByTextNum,
  getWidthByTextNum1,
  loadFace,
  roundRect,
  rpx2px
} from "./canvasUtils";
import {onReady} from "@dcloudio/uni-app";
import SvgPath from "./svgPath";
import {DrawData, NodeElement, ShowImage} from "./types";


const emit = defineEmits<{
  (e: 'change', path: string, imageInfo: ShowImage, showNodeElements: NodeElement[]): void
  (e: 'redrawing', isRedrawing :boolean): void
  (e: 'nodeClick', item: NodeElement[]): void
}>();

const currentInstance = getCurrentInstance();

const props = defineProps<{
  drawData: DrawData
}>()

let nodes :NodeElement[] = [];

const getTextOverflowString = (textOverflow: string) => {
  if (textOverflow === 'ellipsis') {
    return '...'
  }
  if (textOverflow) {
    return unescape(textOverflow.replace('&#x', '\%u').replace(';', ''));
  }
  return '';
}

watch(() => props.drawData.nodeElements,
    (newVal) => {
      nodesConversion(newVal);
      reDraw();
    },
    {
      deep: true,
      // immediate: true
    }
)

let imageRect = null;

let redrawing = false;
let nextRedraw = false;

const resourcesMap = new Map();

function loadImageByCtx(url) {
  return new Promise((resolve, reject) => {
    let img = null;
    //#ifdef H5
    img = new Image();
    img.crossOrigin = "Anonymous";
    //#endif
    //#ifdef MP
    img = canvas.createImage();
    //#endif
    img.onload = async () => {
      const systemInfo = uni.getSystemInfoSync();
      if(systemInfo.platform === 'windows'){
        let imageInfo = await uni.getImageInfo({src: url});
        Object.defineProperty(img,'width',{
          get:function(){
            return imageInfo.width;
          }
        })
        Object.defineProperty(img,'height',{
          get:function(){
            return imageInfo.height;
          }
        })
      }

      resolve(img);
    };
    img.onerror = reject;
    img.src = url;
  });
}

function md5Str(str: string) {
  return md5(str);
}
async function preloadFaces(data) {

  //加载图标
  const resourcesFaces = [];
  if(data.faces && data.faces.length > 0){
    const loadFaces = data.faces.filter(i=>i.url && i.name).filter(i=>!resourcesMap.has(i.url));

    for (let i = 0; i < loadFaces.length; i++) {
      const face = loadFaces[i];
      resourcesFaces.push(loadFace(face.name, face.url));
    }
    let all = await Promise.all(resourcesFaces);
    for (let i = 0; i < loadFaces.length; i++) {
      const node = loadFaces[i];
      resourcesMap.set(node.url, all[i]);
    }
  }
  return Promise.resolve();
}

async function preloadImages() {
  const resourcesImages = [];

  //加载所有图片
  let images = nodes.filter(i => i.resourceType === 'image').filter(i=>i.url).filter(i=>!resourcesMap.has(md5Str(i.url)));
  images.forEach(i => {
    resourcesImages.push(loadImageByCtx(i.url));
  })

  let all = await Promise.all(resourcesImages);

  for (let i = 0; i < images.length; i++) {
    const node = images[i];
    resourcesMap.set(md5Str(node.url), all[i]);
  }

  return all;
}

async function preloadAllResources(data?: DrawData) {
  await Promise.all([preloadFaces(data),preloadImages()]);
}

const reDraw = async () => {

  if (redrawing) {
    nextRedraw = true;
    return;
  }
  if (!canvasContext) {
    return
  }
  redrawing = true;
  // 通知重新渲染生成
  emit('redrawing',redrawing);


  await preloadAllResources(props.drawData);

  canvasContext.clearRect(0, 0, width, height);

  await drawNodeElements();

  setTimeout(() => {
    image.value = canvas.toDataURL('image/png');

    zoom = canvas.width / width;
    emit('change', image.value, {width, height, showWidth: width * zoom, showHeight: height * zoom,zoom},nodes);


  },100)

  redrawing = false;
  // 通知重新渲染生成完成
  emit('redrawing',redrawing);
  if (nextRedraw) {
    nextRedraw = false;
    reDraw();
  }


}

defineExpose({
  reDraw,
  getNodeElementByPoint
});

const image = ref('');
const canvasId = 'mpCardCanvas';
let width = rpx2px(props.drawData.width);
let height = rpx2px(props.drawData.height);


let fontFamily = ref('');
let canvasContext = null;
let canvas = null;



function drawIcon(node: NodeElement) {

  let svgPath = new SvgPath(node.d);
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

  canvasContext.fillStyle = node.css.color;
  canvasContext.fill();

}

async function drawImageIconNode(node: NodeElement) {



  canvasContext.save();

  //旋转
  node.css.angle = node.css.angle || 0;
  const angle = node.css.angle;
  canvasContext.translate(node.css.left + node.css.width / 2, node.css.top + node.css.height / 2);
  canvasContext.rotate(angle * Math.PI / 180);
  canvasContext.translate(-(node.css.left + node.css.width / 2), -(node.css.top + node.css.height / 2));

  drawShadow(node);

  //锁定区域
  clipRoundRect(canvasContext, node.css.left, node.css.top, node.css.width, node.css.height, node.css.borderRadius);

  //填充背景
  darwBg(node);

  drawIcon(node);
  node.width = node.css.width;
  node.height = node.css.height;

  //填充边框
  darwBorder(node);

  //解锁区域
  canvasContext.restore();
}



function calcDynamicLocation(item: NodeElement, drawNodes: NodeElement[]) {
  let dynamicLocation = item.css.dynamicLocation;
  //获取上一个元素
  let preItem = drawNodes[drawNodes.length - 1];
  let left = preItem.css.left;
  let top = preItem.css.top;
  if (preItem) {
    if(dynamicLocation.direction === 'left'){
      left = preItem.css.left - preItem.width;
    }else if(dynamicLocation.direction === 'top'){
      top = preItem.css.top + preItem.height;
    }else if(dynamicLocation.direction === 'right'){
      left = preItem.css.left + preItem.width;
    }else if(dynamicLocation.direction === 'bottom'){
      top = preItem.css.top - preItem.height;
    }
    left = left + dynamicLocation.offset.left;
    top = top + dynamicLocation.offset.top;
  }
  return {left, top};
}

async function drawNodeElements() {

  const drawNodes: NodeElement[] = [];

  for (let i = 0; i < nodes.length; i++) {
    const item = nodes[i];
    if(item.css.dynamicLocation){
      const {left,top} = calcDynamicLocation(item,drawNodes);
      item.css.left = left;
      item.css.top = top;
    }
    canvasContext.globalAlpha = item.css.opacity;
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
    drawNodes.push(item);
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
  for (let i = 0; i < group.children.length; i++) {
    const item = group.children[i];
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





function drawText(node: NodeElement) {
  let tFontSize = 30;
  canvasContext.restore();
  if (node.css.shadowColor && node.css.shadowBlur > 0) {
    canvasContext.setShadow(node.css.shadowOffsetX, node.css.shadowOffsetY, node.css.shadowBlur, node.css.shadowColor);
    canvasContext.fillStyle = node.css.shadowColor;
  }

  canvasContext.textBaseline = 'top';
  let tFont = '';
  if(node.css.font){
    tFont = node.css.font.replace(/(\d+)r?px/g, (r, fontSize) => {
      if (r.indexOf('r') !== -1) {
        tFontSize = rpx2px(+fontSize);
        return tFontSize + 'px';
      }
      tFontSize = +fontSize;
      return r
    })
  }else{
    tFontSize = +node.css.fontSize;
    tFont = `${node.css.fontSize}px ${node.css.fontFamily}`
  }

  canvasContext.fillStyle = node.css.color;
  canvasContext.font = tFont;
  //计算文本分成几行 并分成行内容数组
  const rText = unescape(node.text.replace('&#x', '\%u').replace(';', ''));
  const textR = canvasContext.measureText(rText);

  function _textAutoWidthHetght() {
    const textR = canvasContext.measureText(rText);
    node.width = textR.width;

    node.height = tFontSize;
    let maxWidth = width - node.css.left;
    let isOverflow = node.width > maxWidth;
    if(node.css.maxWidth > 0 && node.width > node.css.maxWidth){
      isOverflow = true;
      maxWidth = node.css.maxWidth;
      node.width = maxWidth;
    }
    if (isOverflow) {

      const num = getWidthByTextNum(canvasContext, rText, maxWidth);

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
      const tNum = getWidthByTextNum1(canvasContext,text,textWidth);
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
          const tNum = getWidthByTextNum1(canvasContext,text,textWidth);
          lineData[i - 1].text = lineData[i - 1].text.substring(0,lineData[i - 1].text.length - tNum - 1) + textOverflowString;
        }
        break;
      }


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
            const tNum = getWidthByTextNum1(canvasContext,lineData[i - 1].text.split('').reverse().join(''),textWidth);
            lineData[i - 1].text = lineData[i - 1].text.substring(0,lineData[i - 1].text.length - tNum - 1) + textOverflowString;
          }
        }

        break;
      }

      if(i === lineNum - 1){
        widthByTextNum = rText.length - lineStartIndex;
      }
      let lineContent = rText.substring(lineStartIndex, lineStartIndex + widthByTextNum);


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

async function drawImage(node: NodeElement) {
  if (!node.url) {
    console.warn('图片地址为空', node.url);
    return;
  }

  const image = resourcesMap.get(md5Str(node.url));
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
    canvasContext.setShadow(node.css.shadowOffsetX, node.css.shadowOffsetY, node.css.shadowBlur, node.css.shadowColor);
    canvasContext.fillStyle = node.css.shadowColor;
    fillRoundRect(canvasContext, node.css.left, node.css.top, node.css.width, node.css.height, node.css.borderRadius);
    canvasContext.setShadow(0, 0, 0, 'transparent');
    canvasContext.fillStyle = 'transparent';
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

  if(nodeElements == null || nodeElements.length == 0){
    return
  }
  nodes = JSON.parse(JSON.stringify(nodeElements))

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

      item.css.maxWidth = rpx2px(item.css.maxWidth || 0);
      if(item.css.dynamicLocation){
        item.css.dynamicLocation.offset.left = rpx2px(item.css.dynamicLocation.offset.left || 0);
        item.css.dynamicLocation.offset.top = rpx2px(item.css.dynamicLocation.offset.top || 0);
      }

      item.css.height = rpx2px(item.css.height || 0);
      item.css.borderWidth = rpx2px(item.css.borderWidth|| 0);
      item.css.borderRadius = rpx2px(item.css.borderRadius|| 0);
      item.css.lineSpacing = rpx2px(item.css.lineSpacing|| 0);
      // item.css.font = item.css.font || "32rpx Arial";
      item.css.fontSize =  rpx2px(item.css.fontSize || 32);
      item.css.fontFamily = item.css.fontFamily || "SimHei";
      item.css.shadowBlur = rpx2px(item.css.shadowBlur|| 0);
      item.css.maxLine = item.css.maxLine || 1;
      item.css.textAlign = item.css.textAlign || 'left';
      item.css.mode = item.css.mode || 'scaleToFill';
      item.css.opacity = item.css.opacity || 1;
      _nodesRpx2PxSort(item.children);
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
      fontFamily.value = face.name + ','
      await loadFace(face.name, face.url);
    }
  }

  uni.createSelectorQuery().in(currentInstance).select(`#${id} #${canvasId}`).fields({
    size: true,
    node: true
  }).exec((res) => {


    canvas = res[0].node??document.createElement('canvas');
    //#ifdef H5
    let element = document.querySelector(`#${id} #${canvasId}`);
    const oCanvas = element.querySelector('canvas');
    canvas.style.width = '100%';
    canvas.style.borderRadius = '0';

    element.insertBefore(canvas,oCanvas);
    oCanvas.remove();
    //#endif

    canvas.width = width;
    canvas.height = height;
    canvasContext =  canvas.getContext('2d');
    canvasContext.setShadow = (shadowOffsetX,shadowOffsetY,shadowBlur,shadowColor)=>{
      canvasContext.shadowColor = shadowColor;
      canvasContext.shadowOffsetX = shadowOffsetX;
      canvasContext.shadowOffsetY = shadowOffsetY;
      canvasContext.shadowBlur = shadowBlur;
    }

    reDraw();
    uni.createSelectorQuery().in(currentInstance).select(`#${id}`).boundingClientRect((res) => {
      imageRect = res;
      zoom = imageRect.width / width;
    }).exec()
  })


}

function pointInRect({x1, y1}, {x, y, width, height,angle}) {

  // 旋转后的矩形的四个顶点坐标
  const rotatedRect = [
    { x: x, y: y },
    { x: x + width, y: y },
    { x: x + width, y: y + height },
    { x: x, y: y + height }
  ];

// 待判断的位置点坐标
  const point = { x: x1, y: y1 };

// 旋转中心坐标
  const center = { x: x + width/2, y: y + height/2 };

// 旋转角度 转弧度
  const angleRadians = angle * Math.PI / 180;

// 将待判断的位置点绕旋转中心逆时针旋转回原始矩形的方向
  const rotatedPoint = {
    x: center.x + (point.x - center.x) * Math.cos(-angleRadians) - (point.y - center.y) * Math.sin(-angleRadians),
    y: center.y + (point.x - center.x) * Math.sin(-angleRadians) + (point.y - center.y) * Math.cos(-angleRadians)
  };

// 判断旋转回去的点是否在未旋转的矩形范围内
  const isInside = (
      rotatedRect[0].x <= rotatedPoint.x && rotatedPoint.x <= rotatedRect[2].x &&
      rotatedRect[0].y <= rotatedPoint.y && rotatedPoint.y <= rotatedRect[2].y
  );

  return isInside;
}


const imageClick = async (e: any) => {
  let {x, y} = e.detail;
  console.log(x,y)
  const clickItems = await getNodeElementByPoint(x, y);
  emit('nodeClick', clickItems);
}

async function getNodeElementByPoint(x:number,y:number){
  x = x - imageRect.left;
  y = y - imageRect.top;
  const zoom = imageRect.width / width;
  // clickItems.splice(0, clickItems.length);
  let clickItems = [];
  function _nodesRpx2PxSort(tNodeElement: NodeElement) {
    if(tNodeElement.children == null || tNodeElement.children.length == 0){
      const item = tNodeElement;
      const isClick = pointInRect({x1: x, y1: y},
          {x: item.css.left * zoom, y: item.css.top * zoom,
            width: item.width * zoom, height: item.height * zoom,
            angle:item.css.angle});
      if (isClick) {
        clickItems.push(item);
      }
      return;
    }
    for (let i = tNodeElement.children.length - 1; i >= 0; i--) {
      const item = tNodeElement.children[i];
      _nodesRpx2PxSort(item);
    }
  }
  try {
    for (let i = nodes.length - 1; i >= 0; i--) {
      const item = nodes[i];
      _nodesRpx2PxSort(item);
    }
  }catch (e) {}
  return clickItems;
}

//#ifdef H5
onMounted(() => {
  init();
})
//#endif

// #ifndef H5
onReady(() => {
  init()
})
// #endif


const id = `id-${Date.now()}`;
</script>

<template>
  <view class="mp-card-canvas" :id="id" :style="{ fontFamily: `${fontFamily}` }">

    <!--    <image :class="{ 'image-opacity': image }" :src="image" mode="widthFix" @click="imageClick" id="showImage"></image>-->
    <!--    <view class="load-image" :class="{ 'load-opacity': image }"  :style="{width:width + 'px',height:height + 'px'}">-->
    <!--      <view class="loading"></view>-->
    <!--    </view>-->
    <canvas @click="imageClick" id="mpCardCanvas" canvas-id="mpCardCanvas" type="2d" :style="{
      width: `100%`,
      height: `100%`,
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
  height: 100%;

  canvas {
    width: 100%;
    height: 100%;
  }

  image {
    width: 100%;
    opacity: 0;
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
