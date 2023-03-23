package cn.itcast_01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * ���������Ŀ·���µı����߻�.bmp���Ƶ���Ŀ·���µ�����ϼ.bmp��
 * ����Դ��
 * 		�����߻�.bmp	--	FileInputStream
 * Ŀ�ĵأ�
 * 		����ϼ.bmp	--	FileOutputStream
 */
public class CopyImageDemo {
    public static void main(String[] args) throws IOException {
        // ��װ����Դ
        FileInputStream fis = new FileInputStream("�����߻�.bmp");
        // ��װĿ�ĵ�
        FileOutputStream fos = new FileOutputStream("����ϼ.bmp");

        // ��ʽ1
        // int by = 0;
        // while ((by = fis.read()) != -1) {
        // fos.write(by);
        // }

        // ��ʽ2
        byte[] bys = new byte[1024];
        int len = 0;
        while ((len = fis.read(bys)) != -1) {
            fos.write(bys, 0, len);
        }

        // �ͷ���Դ
        fos.close();
        fis.close();
    }
}
