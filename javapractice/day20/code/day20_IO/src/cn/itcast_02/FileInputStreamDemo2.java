package cn.itcast_02;

import java.io.FileInputStream;
import java.io.IOException;

/*
 * Ϊ����߶�ȡ���ݵ�Ч�ʣ������˵ڶ��ַ�����
 * һ�ζ�ȡһ���ֽ����飺public int read(byte[] b):���ص���ʵ�ʵĶ�ȡ���ȣ������ݶ�ȡ���ֽ�������
 */
public class FileInputStreamDemo2 {
    public static void main(String[] args) throws IOException {
        // �����ֽ�����������
        FileInputStream fis = new FileInputStream("a.txt");

        // ��ȡ����
        // public int read(byte[] b)
        // byte[] bys = new byte[5];

        // // ��һ�ζ�ȡ
        // int len = fis.read(bys);
        // System.out.println(len);
        // // System.out.println(new String(bys));
        // System.out.println(new String(bys, 0, len));
        //
        // // �ڶ��ζ�ȡ
        // len = fis.read(bys);
        // System.out.println(len);
        // // System.out.println(new String(bys));
        // System.out.println(new String(bys, 0, len));
        //
        // // �����ζ�ȡ
        // len = fis.read(bys);
        // System.out.println(len);
        // // System.out.println(new String(bys));
        // System.out.println(new String(bys, 0, len));
        //
        // // ���Ĵζ�ȡ
        // len = fis.read(bys);
        // System.out.println(len);
        // // System.out.println(new String(bys));
        // System.out.println(new String(bys, 0, len));
        //
        // // ��ѭ���ģ���Ӧ��֪���жϽ���������
        // len = fis.read(bys);
        // len = fis.read(bys);
        // System.out.println(len);
        // System.out.println(len);

        // byte[] bys = new byte[5];
        byte[] bys = new byte[1024 * 1024]; // ���������һ����1024������������
        int len = 0;
        while ((len = fis.read(bys)) != -1) {
            System.out.print(new String(bys, 0, len));
        }

        // �ͷ���Դ
        fis.close();
    }
}
