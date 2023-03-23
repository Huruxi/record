package cn.itcast_02;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/*
 * ��������ķ�ʽһ�α�һ���ֽڵķ�ʽ��ܶ࣬���ԣ�java��������Ƶ�ʱ��Ҳ���ǵ��ˡ�
 * ����Ƴ�����������Ļ���������
 * �ֽڻ���������
 * 		BufferedInputStream
 * �ֽڻ��������
 * 		BufferedOutputStream
 *
 * ͨ�������췽�������Ƿ��֣�����������ֱ�Ӳ����ļ���
 * �ǽ����ڻ����Ĳ�����֮�ϵġ�
 * ���ԣ�������Ҳ����֮Ϊ�߼�����
 */
public class BufferedDemo {
    public static void main(String[] args) throws IOException {
        // д����
        // BufferedOutputStream(OutputStream out)
        // OutputStream out = new FileOutputStream("bos.txt");
        // BufferedOutputStream bos = new BufferedOutputStream(out);
        // BufferedOutputStream bos = new BufferedOutputStream(
        // new FileOutputStream("bos.txt"));
        // bos.write("hello".getBytes());
        // bos.close();

        // ������
        // BufferedInputStream(InputStream is)
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(
                "bos.txt"));

        // ��ʽ1
        int by = 0;
        while ((by = bis.read()) != -1) {
            System.out.print((char) by);
        }
        System.out.println("-----------------------");

        // ��ʽ2
        bis = new BufferedInputStream(new FileInputStream("bos.txt"));
        byte[] bys = new byte[1024];
        int len = 0;
        while ((len = bis.read(bys)) != -1) {
            System.out.print(new String(bys, 0, len));
        }

        bis.close();
    }
}
