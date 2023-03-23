package cn.itcast_03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * ��c:\\a.txt���ݸ��Ƶ�d:\\b.txt��
 * ����Դ��
 * 		c:\\a.txt	--	FileInputStream
 * Ŀ�ĵأ�
 * 		d:\\b.txt	--	FileOutputStream
 */
public class CopyFileDemo2 {
    public static void main(String[] args) throws IOException {
        // ��װ����Դ
        // java.io.FileNotFoundException: c:\a.txt (ϵͳ�Ҳ���ָ�����ļ���)
        FileInputStream fis = new FileInputStream("c:\\a.txt");
        // ��װĿ�ĵ�
        FileOutputStream fos = new FileOutputStream("d:\\b.txt");

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
