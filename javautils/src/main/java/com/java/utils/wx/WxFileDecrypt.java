package com.java.utils.wx;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *  微信图片解密
 * @author hrd <br/>
 * @date 2023/6/8
 */
public class WxFileDecrypt {


    public static void main(String[] args) {
        String path = "E:\\im\\wechat\\chat\\WeChat Files\\w843736012\\FileStorage\\Image\\2023-06\\c1298af61c386fe63d05213df863e656.dat";
        findDatFile(path);
    }

    // 图片字节头信息，
    // [0][1]为jpg头信息，
    // [2][3]为png头信息，
    // [4][5]为gif头信息
    private static final int[] picHead = {0xff, 0xd8, 0x89, 0x50, 0x47, 0x49};
    // 解密码
    private static int decodeCode = 0;

    private static int getCode(String filePath) {
        FileInputStream datFile = null;
        try {
            datFile = new FileInputStream(filePath);
            byte[] datRead = new byte[2];
            int headIndex = 0;
            while (headIndex < picHead.length) {
                // 使用第一个头信息字节来计算加密码
                // 第二个字节来验证解密码是否正确
                datFile.read(datRead);
                int code = datRead[0] ^ picHead[headIndex];
                int idfCode = datRead[1] ^ code;
                headIndex++;
                if (idfCode == picHead[headIndex]) {
                    datFile.close();
                    return code;
                }
                headIndex++;
            }
            System.out.println("not jpg, png, gif");
            return 0;
        } catch (IOException e) {
            e.printStackTrace();
            return 0;
        } finally {
            try {
                if (datFile != null) {
                    datFile.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void decodeDat(String filePath) {
        decodeCode = getCode(filePath);
        FileInputStream datFile = null;
        FileOutputStream picWrite = null;
        try {
            datFile = new FileInputStream(filePath);
            String picName = filePath + ".jpg";
            picWrite = new FileOutputStream(picName);
            int datData;
            while ((datData = datFile.read()) != -1) {
                int picData = datData ^ decodeCode;
                picWrite.write(picData);
            }
            System.out.println(picName + "完成");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (datFile != null) {
                    datFile.close();
                }
                if (picWrite != null) {
                    picWrite.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void findDatFile(String dirPath) {
//        File dir = new File(dirPath);
//        String[] filesList = dir.list();
//        for (String fileName : filesList) {
//            String filePath = dirPath + "\\" + fileName;
//            decodeDat(filePath);
//        }

        decodeDat(dirPath);
    }

}
