package cn.itcast_04;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * ��e:\\DOS����.avi���Ƶ���ǰ��ĿĿ¼�µ�copy.avi��
 * ����Դ��
 * 		e:\\DOS����.avi
 * Ŀ�ĵأ�
 * 		copy.avi
 */
public class CopyAviDemo {
    public static void main(String[] args) throws IOException {
        // ��װ����Դ
        FileInputStream fis = new FileInputStream("e:\\DOS����.avi");
        // ��װĿ�ĵ�
        FileOutputStream fos = new FileOutputStream("copy.avi");

        // ��д����
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
