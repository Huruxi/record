# coding=UTF-8

import cv2
import sys
import base64
import numpy as np
def show(name):
    # 展示圈出来的位置
    cv2.imshow('Show', name)
    cv2.waitKey(0)
    cv2.destroyAllWindows()

def _tran_canny(image):
    # 消除噪声
    image = cv2.GaussianBlur(image, (3, 3), 0)
    return cv2.Canny(image, 50, 150)

def base64_to_cv2(base64_code):
    img_data = base64.b64decode(base64_code)
    img_array = np.fromstring(img_data, np.uint8)
    img = cv2.imdecode(img_array, cv2.COLOR_RGB2BGR)
    return img

def detect_displacement(bgUrl,img):
    # detect displacement
    # # 参数0是灰度模式

    image = cv2.imread(bgUrl, 0)
    template = cv2.imread(img, 0)

    # 寻找最佳匹配
    res = cv2.matchTemplate(_tran_canny(image), _tran_canny(template), cv2.TM_CCOEFF_NORMED)
    # 最小值，最大值，并得到最小值, 最大值的索引
    min_val, max_val, min_loc, max_loc = cv2.minMaxLoc(res)
    print(min_val, max_val, min_loc, max_loc)
    top_left = max_loc[0]  # 横坐标
    # 展示圈出来的区域
    x, y = max_loc  # 获取x,y位置坐标

    w, h = image.shape[::-1]  # 宽高
    cv2.rectangle(template, (x, y), (x + w, y + h), (7, 249, 151), 2)
    # show(template)
    return top_left

if __name__ == '__main__':

    print(detect_displacement("2.jpeg","1.png"))

