package cn.itcast_04;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * �ѵ�ǰ��ĿĿ¼�µ�a.txt���ݸ��Ƶ���ǰ��ĿĿ¼�µ�b.txt��
 *
 * �����ļ���
 * ����Դ��
 * 		a.txt	--	InputStream	--	FileInputStream	--	һ�ζ�һ���ֽ�����
 * Ŀ�ĵأ�
 * 		b.txt	--	OutputStream -- FileOutputStream -- һ��дһ���ֽ�����һ����
 */
public class CopyFileDemo {
    public static void main(String[] args) throws IOException {
        // ��װ����Դ
        FileInputStream fis = new FileInputStream("a.txt");
        // ��װĿ�ĵ�
        FileOutputStream fos = new FileOutputStream("b.txt");

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
