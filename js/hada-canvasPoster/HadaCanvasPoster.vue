<script setup lang="ts">
import {onMounted, ref, watch, getCurrentInstance, nextTick} from 'vue';
import {roundRect, getWidthByTextNum, loadImage, clipRoundRect, fillRoundRect, rpx2px} from "./canvasUtils";
import {colorStringToRGBA} from "./colorUtils";
import {onReady} from "@dcloudio/uni-app";

interface ShowImage {
  width: number,
  height: number,
  showWidth: number,
  showHeight: number,
}

const emit = defineEmits<{
  (e: 'change', path: string, imageInfo: ShowImage): void
  (e: 'nodeClick', item: NodeElement): void
}>();

const currentInstance = getCurrentInstance();

interface NodeElement {
  resourceType: 'text' | 'image' | 'icon',
  text?: string,
  url?: string,
  css: {
    top: number,
    left: number,
    width: number,
    height: number,
    font: string,
    color: string,
    backgroundColor: string,
    maxLine: number,
    textOverflow: string,
    borderWidth: number,
    borderColor: string,
    borderRadius: number,
    shadowOffsetX: number,
    shadowOffsetY: number,
    shadowBlur: number,
    shadowColor: string,
    angle: number,
    lineSpacing: number,
    textAlign: 'center' | 'left' | 'right',
    zIndex: number
  }
  width?: number,
  height?: number,
  clickStop: boolean  // 是否阻止点击穿透
}

interface Face {
  name: string,
  url: string
}

export interface DrawData {

  nodeElements: NodeElement[],
  width: number,
  height: number,
  faces: Face[]

}

const props = defineProps<{
  drawData: DrawData
}>()

const nodes = ref<NodeElement[]>([]);

const getTextOverflowString = (textOverflow: string) => {
  if (textOverflow === 'ellipsis') {
    return '...'
  }
  if (textOverflow) {
    return textOverflow
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
    }
)

let imageRect = null;

let redrawing = false;
let nextRedraw = false;
let stt;
const reDraw = async () => {

  // 如果正在重绘，则继续重绘
  if (redrawing) {
    nextRedraw = true;
    return;
  }
  // 如果没有上下文，则返回
  if (!canvasContext) {
    return
  }
  // 清空画布
  redrawing = true;
  canvasContext.clearRect(0, 0, width, height);
  // 空图片
  image.value = '';
  // 清空超时
  stt > 0 && clearTimeout(stt);
  // 绘制节点
  await drawNodeElements();

  // 设置超时
  stt = setTimeout(() => {
    // 绘制完成后，将图片路径赋值给image.value
    canvasContext.draw(true, () => {
      uni.canvasToTempFilePath({
        canvasId,
        canvas,
        success: (res) => {
          image.value = res.tempFilePath;
          // 绘制完成后，将图片宽高赋值给imageRect
          nextTick(() => {
            uni.createSelectorQuery().in(currentInstance).select(`#${id} #showImage`).boundingClientRect((res) => {
              imageRect = res;
              // 绘制完成后，发射change事件，设置图片宽高，显示宽高
              emit('change', image.value, {width, height, showWidth: width * zoom, showHeight: height * zoom});
              stt = 0;
            }).exec()
          });

        }
      }, currentInstance);
    })
  }, 0)

  // 恢复重绘
  redrawing = false;
  // 如果已经重绘，则继续重绘
  if (nextRedraw) {
    reDraw();
    nextRedraw = false;
  }
}


const image = ref('');
const canvasId = 'mpCardCanvas';
const canvasTempId = 'mpCardCanvasTemp';
let width = rpx2px(props.drawData.width);
let height = rpx2px(props.drawData.height);

let canvasTempWidth = 1000;
let canvasTempHeight = 1000;
let fontFamily = ref('');

let canvasContext = null;
let canvasTempContext = null;
let canvas = null;


async function drawImageIconNode(node: NodeElement) {

  const imageUrl = await imageChangeColor(node.url, node.css.color);
  console.log(imageUrl, 'imageUrl')
  node.resourceType = 'image';
  node.url = imageUrl;
  await drawImage(node);

}

async function drawNodeElements() {
  for (let i = 0; i < nodes.value.length; i++) {
    const item = nodes.value[i];
    if (item.resourceType === 'text') {
      await fillTextNode(item);
    } else if (item.resourceType === 'image') {
      await drawImageNode(item);
    } else if (item.resourceType === 'icon') {
      await drawImageIconNode(item);
    }
  }
}

function drawText(node: NodeElement) {
  let tFontSize = 30;
  canvasContext.restore();
  if (node.css.shadowColor && node.css.shadowBlur > 0) {
    canvasContext.setShadow(node.css.shadowOffsetX, node.css.shadowOffsetY, node.css.shadowBlur, node.css.shadowColor);
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

    function _textAutoWidthHetght() {
      const jpv = JSON.parse('{"v":"' + `${node.text}`.replace('&#x', '\\u').replace(';', '') + '"}');
      const rText = jpv.v;
      const textR = canvasContext.measureText(rText);

      node.width = textR.width;
      node.height = tFontSize;
      if (node.width > width - node.css.left - rpx2px(40)) {
        const num = getWidthByTextNum(canvasContext, rText, width - node.css.left - rpx2px(40));
        canvasContext.fillText(rText.substring(0, num) + getTextOverflowString(node.css.textOverflow), node.css.left, node.css.top);
      } else {
        canvasContext.fillText(rText, node.css.left, node.css.top);
      }
    }

    if (isNaN(node.css.width) || isNaN(node.css.height) || node.css.width < 0 || node.css.height < 0) {
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

      let lineHeight = tFontSize;

      const lineSpacing = node.css.lineSpacing || 0;

      let top = node.css.top + lineIndex * (lineHeight + lineSpacing);
      let left = node.css.left;
      let myNodeWidth = textR.width;

      if (node.css.textAlign === 'center') {
        left = node.css.left + (node.css.width - myNodeWidth/*自己的宽度*/) / 2
      } else if (node.css.textAlign === 'right') {
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
      if (node.css.textAlign === 'center') {
        left = node.css.left + (node.css.width - myNodeWidth/*自己的宽度*/) / 2
      } else if (node.css.textAlign === 'right') {
        left = node.css.left + node.css.width - myNodeWidth;
      }


      //超出全部高度
      if ((lineHeight + lineSpacing) * (lineIndex + 1) >= height - node.css.top - rpx2px(20) && textNum < text.length) {
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
      canvasContext.setShadow(node.css.shadowOffsetX, node.css.shadowOffsetY, 0, 'transparent');
    }
    node.width = node.css.width;
    node.height = node.css.height;
  })();
}

async function drawImage(node: NodeElement) {
  if (!node.url) {
    console.warn('图片地址为空,跳出图片渲染流程');
    return;
  }
  const image = await loadImage(node.url);
  canvasContext.drawImage(image.path, node.css.left, node.css.top, node.css.width, node.css.height);
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
  if (node.css.borderWidth > 0) {
    canvasContext.strokeStyle = node.css.borderColor;
    canvasContext.lineWidth = node.css.borderWidth;
    roundRect(canvasContext, node.css.left, node.css.top, node.css.width, node.css.height, node.css.borderRadius);
  }
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
    canvasContext.setShadow(node.css.shadowOffsetX, node.css.shadowOffsetY, 0, 'transparent');
  }
}

async function drawImageNode(node: NodeElement) {
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
  await drawImage(node);

  //填充边框
  darwBorder(node);

  //解锁区域
  canvasContext.restore();
}

let zoom = 1;

const nodesConversion = (nodeElements: NodeElement[]) => {
  const nodeCopy = JSON.parse(JSON.stringify(nodeElements))
  nodeCopy.sort((a, b) => {
    const aZIndex = a.css.zIndex || 0;
    const bZIndex = b.css.zIndex || 0;
    return aZIndex - bZIndex;
  })
  nodes.value = nodeCopy.map(v => {

    const vCopy = {
      ...v,
      css: {
        ...v.css,
        maxLine: v.css.maxLine || 1,
        top: rpx2px(v.css.top || 0),
        left: rpx2px(v.css.left || 0),
        width: rpx2px(v.css.width || 0),
        height: rpx2px(v.css.height || 0),
        borderWidth: rpx2px(v.css.borderWidth || 0),
        borderRadius: rpx2px(v.css.borderRadius || 0),
        lineSpacing: rpx2px(v.css.lineSpacing || 0),
        font: v.css.font || "32rpx Arial",
        shadowBlur: v.css.shadowBlur || 0,
        textAlign: v.css.textAlign || 'left'
      }
    }
    return vCopy;
  });
}

const init = async () => {
  nodesConversion(props.drawData.nodeElements);

  width = rpx2px(props.drawData.width);
  height = rpx2px(props.drawData.height);

  canvasContext = uni.createCanvasContext(canvasId, currentInstance);

  reDraw();
  uni.createSelectorQuery().in(currentInstance).select(`#${id}`).boundingClientRect((res) => {
    imageRect = res;
    zoom = imageRect.width / width;
  }).exec()
}

function pointInRect({x1, y1}, {x, y, width, height}) {
  const max = x + width;
  const min = x;
  const max2 = y + height;
  const min2 = y;
  return x1 >= min && x1 <= max && y1 >= y && y1 <= max2;

}

const imageClick = async (e: any) => {
  let {x, y} = e.detail;
  x = x - imageRect.left;
  y = y - imageRect.top;
  const zoom = imageRect.width / width;
  for (let i = nodes.value.length - 1; i >= 0; i--) {
    const item = nodes.value[i];
    const isClick = pointInRect({x1: x, y1: y}, {
      x: item.css.left * zoom,
      y: item.css.top * zoom,
      width: item.width * zoom,
      height: item.height * zoom
    });
    if (isClick) {
      emit('nodeClick', item);
      if (item.clickStop) {
        break;
      }
    }
  }
}

async function imageChangeColor(imageUrl: string, color: string): Promise<string> {
  return new Promise(async resolve => {
    let systemInfo = uni.getSystemInfoSync();
    if (systemInfo.platform === 'windows' && systemInfo.uniPlatform === 'mp-weixin') {
      let image = await loadImage(imageUrl);
      resolve(image.path);
      return;
    }
    if (systemInfo.platform === 'devtools') {
      let image = await loadImage(imageUrl);
      resolve(image.path);
      return;
    }
    //先加载图片到canvas
    if (!canvasTempContext) {
      canvasTempContext = uni.createCanvasContext(canvasTempId, currentInstance);
    }

    let image = await loadImage(imageUrl);
    const colors = colorStringToRGBA(color);
    canvasTempContext.drawImage(image.path, 0, 0, image.width, image.height);

    canvasTempContext.draw(false, () => {

      setTimeout(()=>{
        uni.canvasGetImageData({
          canvasId: canvasTempId,
          x: 0,
          y: 0,
          width: image.width,
          height: image.height,
          success: (res) => {
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

            uni.canvasPutImageData({
              canvasId: canvasTempId,
              data: imageData,
              x: 0,
              y: 0,
              width: image.width,
              height: image.height,
              success: () => {
                uni.canvasToTempFilePath({
                  canvasId: canvasTempId,
                  x: 0,
                  y: 0,
                  width: image.width,
                  height: image.height,
                  destWidth: image.width,
                  destHeight: image.height,
                  success: (res) => {
                    resolve(res.tempFilePath)
                  }
                }, currentInstance)

              }
            }, currentInstance)
          }
        }, currentInstance);
      }, 0)
    })
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

    <image :class="{ 'image-opacity': image }" :src="image" mode="widthFix" @click="imageClick" id="showImage"></image>
    <!--    <view class="load-image" :class="{ 'load-opacity': image }" :style="{width:width + 'px',height:height + 'px'}">-->
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
    transform: translateX(-200%);
    border-radius: 20rpx;
  }

  image {
    width: 100%;
    border-radius: 20rpx;
    opacity: 0;
  }

  .image-opacity {
    opacity: 1;
    /* 设置动画持续时间 */
    transition: opacity 0.5s;
  }

  .load-opacity {
    opacity: 0;
    /* 设置动画持续时间 */
    transition: opacity 0.5s;
  }

  .load-image {
    background: #ffffff;
    color: #000;
    border-radius: 20rpx;
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

      animation: circle infinite 1s linear;
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
