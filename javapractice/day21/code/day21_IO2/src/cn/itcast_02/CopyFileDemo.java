package cn.itcast_02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * ��OutputStreamWriter��InputStreamReader����java�ļ�
 * ����Դ��
 * 		InputStreamReaderDemo.java
 * Ŀ�ĵأ�
 * 		Copy.java
 */
public class CopyFileDemo {
    public static void main(String[] args) throws IOException {
        // ��װ����Դ
        InputStreamReader isr = new InputStreamReader(new FileInputStream(
                "InputStreamReaderDemo.java"));
        // ��װĿ�ĵ�
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(
                "Copy.java"));

        // ��ʽ1
        // int ch = 0;
        // while ((ch = isr.read()) != -1) {
        // osw.write(ch);
        // }

        // ��ʽ2
        char[] chs = new char[1024];
        int len = 0;
        while ((len = isr.read(chs)) != -1) {
            osw.write(chs, 0, len);
        }

        // �ͷ���Դ
        osw.close();
        isr.close();
    }
}