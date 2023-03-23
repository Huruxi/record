package cn.itcast_02;

import java.io.FileInputStream;
import java.io.IOException;

/*
 * �ֽ������������ݲ��裺
 * A:�����ֽ�����������
 * B:���÷�������ȡ����
 * C:�ͷ���Դ
 *
 * �ֽ���������ȡ���������ַ�ʽ:
 * A:һ�ζ�ȡһ���ֽ�
 * B:һ�ζ�ȡһ���ֽ�����
 *
 * һ�ζ�ȡһ���ֽڣ�public int read()
 */
public class FileInputStreamDemo {
    public static void main(String[] args) throws IOException {
        // �����ֽ�����������
        // FileInputStream fis = new FileInputStream("fis.txt");
        FileInputStream fis = new FileInputStream("FileOutputStreamDemo.java");

        // ���÷�������ȡ����
        // ��һ�ζ�ȡ
        // int by = fis.read();
        // System.out.println(by);
        // System.out.println((char) by);
        //
        // // �ڶ��ζ�ȡ
        // by = fis.read();
        // System.out.println(by);
        // System.out.println((char) by);
        //
        // // �����ζ�ȡ
        // by = fis.read();
        // System.out.println(by);
        // System.out.println((char) by);
        // ���Ƿ�������Ĵ�����һ���ģ����ԣ����ǿ���Ҫ��ѭ���Ľ�
        // �����ѭ���Ľ���?
        // �ص�����
        // ��������ж�ѭ��ʲôʱ�����
        // by = fis.read();
        // System.out.println(by);
        // by = fis.read();
        // System.out.println(by);
        // ͨ���������Ƿ��֣�����ж�����ֵ��-1

        // int by = fis.read();
        // while (by != -1) {
        // System.out.print((char) by);
        // by = fis.read();
        // }

        // ���մ���
        int by = 0;
        // ��ȡ���ݣ���ֵ���ж�
        while ((by = fis.read()) != -1) {
            System.out.print((char) by);
        }

        // �ͷ���Դ
        fis.close();
    }
}
