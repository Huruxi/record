import {systemInfo} from "@/utils/systemInfo";

/**
 *
 * @param image {{width: number, height: number}}
 * @param node {{css: {mode: string, left: number, top: number, width: number, height: number}}}
 * @returns {number[4]}
 */
export function getImageModeLeftTopWidthHeight(image, node) {
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
    return [showBox.left + (showBox.width - image.width)/2, showBox.top,image.width, image.height];
  }
  if (showBox.mode === 'bottom') {
    return [showBox.left + (showBox.width - image.width)/2, showBox.top + (showBox.height - image.height),image.width, image.height];
  }
  if (showBox.mode === 'left') {
    return [showBox.left,showBox.top + (showBox.height - image.height)/2,image.width, image.height];
  }
  if (showBox.mode === 'right') {
    return [showBox.left + (showBox.width - image.width), showBox.top + (showBox.height - image.height)/2,image.width, image.height];
  }
  if(showBox.mode === 'top Left'){
    return [showBox.left, showBox.top,image.width, image.height];
  }
  if(showBox.mode === 'top Right'){
    return [showBox.left + (showBox.width - image.width), showBox.top,image.width, image.height];
  }
  if(showBox.mode === 'bottom Left'){
    return [showBox.left, showBox.top + (showBox.height - image.height),image.width, image.height];
  }
  if(showBox.mode === 'bottom Right'){
    return [showBox.left + (showBox.width - image.width), showBox.top + (showBox.height - image.height),image.width, image.height];
  }

  return [showBox.left, showBox.top,showBox.width, showBox.height];
}


export function wxSaveBase64ImageToFile(base64) {
  return new Promise((resolve, reject) => {
    const fs = wx.getFileSystemManager();
    //随机定义路径名称
    var times = new Date().getTime();

    var codeimg = wx.env.USER_DATA_PATH + "/" + times + ".png";

    //将base64图片写入
    fs.writeFile({
      filePath: codeimg,
      data: base64.substring(base64.indexOf(",") + 1),
      encoding: "base64",
      success: (res) => {
        //写入成功了的话，新的图片路径就能用了
        resolve(codeimg);
      },
      fail: reject,
    });
  });
}

/**
 *
 * @param rpx
 * @returns {number}
 */
export function rpx2px(rpx) {
    if (systemInfo.deviceType === "pc") {
        return Math.ceil((rpx / 750) * 540 * 2 * systemInfo.devicePixelRatio);
    }

    return Math.ceil(rpx * systemInfo.devicePixelRatio);
}

/**
/**
 * 锁定canvas绘画圆角矩形区域
 * @param ctx
 * @param x
 * @param y
 * @param width
 * @param height
 * @param radius
 */
export function clipRoundRect(ctx, x, y, width, height, radius) {
  if(radius === 0){
    clipRect(ctx, x, y, width, height);
    return;
  }
  ctx.beginPath();
  ctx.moveTo(x + radius, y);
  ctx.arcTo(x + width, y, x + width, y + height, radius);
  ctx.arcTo(x + width, y + height, x, y + height, radius);
  ctx.arcTo(x, y + height, x, y, radius);
  ctx.arcTo(x, y, x + width, y, radius);
  ctx.closePath();
  ctx.clip();
}

/**
 * 锁定canvas绘画圆角矩形区域
 * @param ctx
 * @param x
 * @param y
 * @param width
 * @param height
 */
export function clipRect(ctx, x, y, width, height) {
  ctx.beginPath();
  ctx.rect(x, y, width, height);
  ctx.closePath();
  ctx.clip();
}

/**
 * 填充圆角矩形
 * @param ctx
 * @param x
 * @param y
 * @param width
 * @param height
 * @param radius
 */
export function fillRoundRect(ctx, x, y, width, height, radius) {
  ctx.beginPath();
  ctx.moveTo(x + radius, y);
  ctx.arcTo(x + width, y, x + width, y + height, radius);
  ctx.arcTo(x + width, y + height, x, y + height, radius);
  ctx.arcTo(x, y + height, x, y, radius);
  ctx.arcTo(x, y, x + width, y, radius);
  ctx.closePath();
  ctx.fill();
}

/**
 * 加载一张图片
 * @param url
 * @param width
 * @param height
 * @returns {Promise<unknown>}
 */
export function loadImage2d(url, width = 100,height = 100) {
  function createLoadErrorImage(width, height) {
    return new Promise(resolve => {
      let htmlCanvasElement = document.createElement('canvas');
      htmlCanvasElement.width = width;
      htmlCanvasElement.height = height;
      const ctx = htmlCanvasElement.getContext('2d');
      ctx.fillStyle = '#000000';
      ctx.font = '30px Arial';
      ctx.textBaseline = 'top';
      ctx.fillText("图片加载失败",0,(height - 30)/2,width);
      const imageData = htmlCanvasElement.toDataURL('image/png');
      const image = new Image();
      image.onload = ()=>{
        resolve(image);
      }
      image.src = imageData;
    })

  }




  let image = new Image()
  image.crossOrigin = 'anonymous';
  return new Promise((resolve, reject) => {
    image.onload = () => {
      resolve(image);
    };
    image.onerror = async (err,msg) => {
      console.warn({msg:`图片加载失败：${url}`,err});
      const image = await createLoadErrorImage(width,height);
      resolve(image);
    };
    image.src = url;
  });
}


/**
 * 加载一张图片
 * @param url
 */
export function loadImage(url) {
  return uni.getImageInfo({
    src: url
  });
}

/**
 * 获取宽度对应的字符数
 * @param ctx
 * @param text
 * @param width
 * @returns {number}
 */
export function getWidthByTextNum(ctx, text, width) {
  const length = text.length;
  let len = 0;
  for (let i = 0; i < length; i++) {
    const tText = text.substring(0, i + 1);
    let measureRes = ctx.measureText(tText);
    len = i;
    if(measureRes.width > width){
      break;
    }
  }
  return len;

  // let end = length;
  //
  // let stringWidth = ctx.measureText(text);
  // if (stringWidth.width <= width) {
  //   return length;
  // }
  // //至少一个字符
  // for (let i = length; i > 1; ) {
  //   const testText = text.substring(0, i);
  //   const textR = ctx.measureText(testText);
  //   if (textR.width <= width) {
  //     end = i;
  //     break;
  //   }
  //   i = Math.round(testText.length / 2);
  // }
  // for (let i = end; i < length; i++) {
  //   const testText = text.substring(0, i + 1);
  //   const textR = ctx.measureText(testText);
  //   if (textR.width > width) {
  //     end = i;
  //     return end;
  //   }
  // }
  // return 0;
}


/**
 * 获取宽度对应的字符数
 * @param ctx
 * @param text
 * @param width
 * @returns {number}
 */
export function getWidthByTextNum1(ctx, text, width) {
  const length = text.length;
  let len = 0;
  for (let i = 0; i < length; i++) {
    const tText = text.substring(0, i + 1);
    let measureRes = ctx.measureText(tText);
    len = i;
    if(measureRes.width > width){
      len += 1;
      break;
    }
  }
  return len;
}

export function loadFace(name, url) {
  return new Promise((resolve, reject) => {
    uni.loadFontFace({
      global: true,
      family: name,
      source: `url("${url}")`,
      success: resolve,
      fail: reject,
      scopes: ["webview", "native"],
    });
  });
}

export function roundRect(ctx, x, y, width, height, r) {
  if (width < 2 * r) {
    r = width / 2;
  }
  if (height < 2 * r) {
    r = height / 2;
  }
  ctx.beginPath();
  ctx.moveTo(x + r, y);
  ctx.arcTo(x + width, y, x + width, y + height, r);
  ctx.arcTo(x + width, y + height, x, y + height, r);
  ctx.arcTo(x, y + height, x, y, r);
  ctx.arcTo(x, y, x + width, y, r);
  ctx.closePath();
  ctx.stroke();
  return ctx;
}
