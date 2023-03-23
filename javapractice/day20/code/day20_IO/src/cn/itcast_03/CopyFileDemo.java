package cn.itcast_03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * �ѵ�ǰ��ĿĿ¼�µ�a.txt���ݸ��Ƶ���ǰ��ĿĿ¼�µ�b.txt��
 *
 * �����ļ���
 * ����Դ��
 * 		a.txt	--	InputStream	--	FileInputStream	--	һ�ζ�һ���ֽ�
 * Ŀ�ĵأ�
 * 		b.txt	--	OutputStream -- FileOutputStream -- һ��дһ���ֽ���?
 */
public class CopyFileDemo {
    public static void main(String[] args) throws IOException {
        // ��װ����
        FileInputStream fis = new FileInputStream("a.txt");
        // ��װĿ�ĵ�
        FileOutputStream fos = new FileOutputStream("b.txt");

        // �����ݣ�д����
        int by = 0;
        while ((by = fis.read()) != -1) {
            fos.write(by);
        }

        // �ͷ���Դ
        fos.close();
        fis.close();
    }
}
