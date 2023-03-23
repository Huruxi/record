package cn.itcast_03;

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
        int by = 0;
        while ((by = fis.read()) != -1) {
            fos.write(by);
        }

        // �ͷ���Դ
        fos.close();
        fis.close();
    }
}
