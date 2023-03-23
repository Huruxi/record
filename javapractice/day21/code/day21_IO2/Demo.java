package cn.itcast_01;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * InputStreamReader(InputStream in)
 * InputStreamReader(InputStream in, String charsetName)
 */
public class InputStreamReaderDemo {
    public static void main(String[] args) throws IOException {
        // ��������
        InputStreamReader isr = new InputStreamReader(new FileInputStream(
                "isr.txt"));

        // һ�ζ�ȡһ���ַ�
        // int ch = 0;
        // while ((ch = isr.read()) != -1) {
        // System.out.print((char) ch);
        // }

        // һ�ζ�ȡһ���ַ�����
        char[] chs = new char[1024];
        int len = 0;
        while ((len = isr.read(chs)) != -1) {
            System.out.print(new String(chs, 0, len));
        }

        // �ͷ���Դ
        isr.close();
    }
}
