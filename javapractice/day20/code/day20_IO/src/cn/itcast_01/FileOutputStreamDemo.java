package cn.itcast_01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/*
 * IO�����ࣺ
 * 		A:��������
 * 			������	������
 * 			�����	д����
 * 		B:��������
 * 			�ֽ���
 * 			�ַ���
 * 		Ĭ������£�IO������˵���ǰ����������ͷ֡�
 *
 * IO�����ĸ����ࣺ
 * 		�ֽ���
 * 			�ֽ�������	InputStream
 * 			�ֽ������	OutputStream
 * 		�ַ���
 * 			�ַ�������	Reader
 * 			�ַ������	Writer
 *
 * �������һ�仰��"helloworld"д��һ���ı��ļ���
 * ͨ���򵥵ķ����������ҵ���OutputStream��
 * ����OutputStream��һ�������࣬��������Ӧ������������ѧϰ��
 * ѧϰǰ�������Ȼ���һ�����⣬����Ӳ���ϵ��ļ���java�ṩ���ĸ����ʾ��?File
 * �ٽ�����ڵ��ֽ������OutputStream������ƴ��һ�¾�����һ���µ����֣�FileOutputStream
 *
 * FileOutputStream�Ĺ��췽����
 * 		FileOutputStream(File file)
 * 		FileOutputStream(String name)
 *
 * �ֽ�������������裺
 * 		A:�����ֽ����������
 * 		B:����д���ݹ���д����
 * 		C:�ͷ���Դ
 *
 * ��ϰ������ֽڵ�����д��һ���ı��ļ�
 */
public class FileOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        // �����ֽ����������
        // FileOutputStream fos = new FileOutputStream("a.txt");

        // ������ݵĲ���String������File���������?
        // File file = new File("a.txt");
        // FileOutputStream fos = new FileOutputStream(file);

        FileOutputStream fos = new FileOutputStream("a.txt");
        // OutputStream os = new FileOutputStream("a.txt");
        /*
         * �����ֽ�����������������Щ������? A:����ϵͳ���ܴ�����һ���ļ�a.txt B:������һ������fos
         * C:��fos����ָ����a.txt�ļ�
         */

        // д����
        // public void write(int b):һ��дһ���ֽڵ�����
        // fos.write(57);
        // fos.write(55);
        // fos.write(97);

        // public void write(byte[] b):һ��дһ���ֽ����������
        // byte[] bys = {97,98,99,100,101};
        // fos.write(bys);
        // �������ǽ����������ͨ��String�õ�byte[]
        // byte[] bys = "abcde".getBytes();
        // fos.write(bys);
        fos.write("helloworld".getBytes());

        // public void write(byte[] b,int off,int len):һ��дһ���ֽ������һ����
        // fos.write("helloworld".getBytes(), 0, 5);
        // fos.write("helloworld".getBytes(), 0, "helloworld".length());

        //�ͷ���Դ
        fos.close();
        //�رմ��ļ���������ͷ�������йص�����ϵͳ��Դ��
        /*
         * �������飺
         * A:�ر�������(�����󲻿��Լ�����д������)
         * B:�ͷ��������ص���Դ(֪ͨϵͳȥ�ͷ��������ص���Դ)
         */

        //java.io.IOException: Stream Closed
        //fos.write("haha".getBytes());


        // while(true){}
    }
}
