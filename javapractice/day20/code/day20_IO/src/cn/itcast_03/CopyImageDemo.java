package cn.itcast_03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * ��e:\\����ϼ.jpg���ݸ��Ƶ���ǰ��ĿĿ¼�µ�mn.jpg��
 *
 * ����Դ��
 * 		e:\\����ϼ.jpg	--	FileInputStream
 * Ŀ�ĵأ�
 * 		mn.jpg			--	FileOutputStream
 */
public class CopyImageDemo {
    public static void main(String[] args) throws IOException {
        // ��װ����Դ
        FileInputStream fis = new FileInputStream("e:\\����ϼ.jpg");
        // ��װĿ�ĵ�
        FileOutputStream fos = new FileOutputStream("mn.jpg");

        // ��д����
        int by = 0;
        while ((by = fis.read()) != -1) {
            fos.write(by);
        }

        // �ͷ���Դ
        fos.close();
        fis.close();
    }
}
