package cn.itcast_01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * IO���еı���������⣺Ҫ����IO���ж����ݽ��б������⣬����ʹ��ת������
 */
public class IOEncodeDemo {
    public static void main(String[] args) throws IOException {
        // д����
        // Ĭ��GBK
        // OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(
        // "osw.txt"));
        // ָ��GBK
        // OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(
        // "osw.txt"), "GBK");
        // OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(
        // "osw.txt"), "UTF-8");
        // osw.write("�й�");
        // osw.close();

        // ������
        // InputStreamReader isr = new InputStreamReader(new FileInputStream(
        // "osw.txt"));
        // InputStreamReader isr = new InputStreamReader(new FileInputStream(
        // "osw.txt"), "GBK");
        InputStreamReader isr = new InputStreamReader(new FileInputStream(
                "osw.txt"), "UTF-8");
        char[] chs = new char[1024];
        int len = 0;
        while ((len = isr.read(chs)) != -1) {
            System.out.print(new String(chs, 0, len));
        }

        isr.close();
    }
}
