export const colorStringToRGBA = (colorString) =>{
    // 判断颜色字符串格式
    var isHex = /^#([0-9A-F]{3}){1,2}|#[0-9A-F]{6,8}$/i.test(colorString);
    var isRGB = /^rgb\((\d{1,3}), (\d{1,3}), (\d{1,3})\)$/i.test(colorString);
    var isRGBA = /^rgba\((\d{1,3}), (\d{1,3}), (\d{1,3}), ([0-1]{0,1}(\.\d{1,2})?)\)$/i.test(colorString);

    if (isHex) {
        // 处理十六进制颜色值
        return hexToRGBA(colorString);
    } else if (isRGB) {
        // 处理RGB颜色值
        return rgbToRGBA(colorString);
    } else if (isRGBA) {
        // 处理RGBA颜色值
        return rgbaToRGBA(colorString);
    } else {
        // 非法或未知格式的颜色字符串
        throw new Error('Invalid color string format');
    }
}

// 十六进制转换为RGBA
function hexToRGBA(hexColor) {
    // 去除 # 号
    hexColor = hexColor.replace('#', '');

    if (hexColor.length === 3) {
        // 将3位缩写形式扩展为6位
        hexColor = hexColor.replace(/(.)/g, '$1$1');
    }

    var r = parseInt(hexColor.slice(0, 2), 16);
    var g = parseInt(hexColor.slice(2, 4), 16);
    var b = parseInt(hexColor.slice(4, 6), 16);
    if(hexColor.length === 8) {
        var a = parseInt(hexColor.slice(6, 8), 16);
        return [r, g, b, a/255];
    }
    return [r, g, b, 1];
}

// RGB转换为RGBA
function rgbToRGBA(rgbColor) {
    var values = rgbColor.match(/\d+/g);
    var r = parseInt(values[0], 10);
    var g = parseInt(values[1], 10);
    var b = parseInt(values[2], 10);

    return [r, g, b, 1];
}

// RGBA转换为RGBA（保留透明度值）
function rgbaToRGBA(rgbaColor) {
    var values = rgbaColor.match(/[.\d]+/g);
    var r = parseInt(values[0], 10);
    var g = parseInt(values[1], 10);
    var b = parseInt(values[2], 10);
    var a = parseFloat(values[3]);

    return [r, g, b, a];
}
