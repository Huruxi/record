package cn.itcast_03;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * ����Դ��
 * 		d:\\��������.mp4
 * Ŀ�ĵأ�
 * 		��Ŀ·����copy.mp4
 *
 * ���ַ�ʽ��
 * A:�����ֽ���һ�ζ�дһ���ֽ�	67023����
 * B:�����ֽ���һ�ζ�дһ���ֽ�����	����ʱ��102����
 * C:��Ч�ֽ���һ�ζ�дһ���ֽ�	����ʱ��650����
 * D:��Ч�ֽ���һ�ζ�дһ���ֽ�����	����ʱ��36����
 */
public class CopyMP4Demo {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
        // method1();
        // method2();
        // method3();
        method4();
        long end = System.currentTimeMillis();
        System.out.println("����ʱ��" + (end - start) + "����");
    }

    // �����ֽ���һ�ζ�дһ���ֽ�
    public static void method1() throws IOException {
        FileInputStream fis = new FileInputStream("d:\\��������.mp4");
        FileOutputStream fos = new FileOutputStream("copy1.mp4");

        int by = 0;
        while ((by = fis.read()) != -1) {
            fos.write(by);
        }

        fos.close();
        fis.close();
    }

    // �����ֽ���һ�ζ�дһ���ֽ�����
    public static void method2() throws IOException {
        FileInputStream fis = new FileInputStream("d:\\��������.mp4");
        FileOutputStream fos = new FileOutputStream("copy2.mp4");

        byte[] bys = new byte[1024];
        int len = 0;
        while ((len = fis.read(bys)) != -1) {
            fos.write(bys, 0, len);
        }

        fos.close();
        fis.close();
    }

    // ��Ч�ֽ���һ�ζ�дһ���ֽ�
    public static void method3() throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(
                "d:\\��������.mp4"));
        BufferedOutputStream bos = new BufferedOutputStream(
                new FileOutputStream("copy3.mp4"));

        int by = 0;
        while ((by = bis.read()) != -1) {
            bos.write(by);
        }

        bos.close();
        bis.close();
    }

    // ��Ч�ֽ���һ�ζ�дһ���ֽ�����
    public static void method4() throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(
                "d:\\��������.mp4"));
        BufferedOutputStream bos = new BufferedOutputStream(
                new FileOutputStream("copy4.mp4"));

        byte[] bys = new byte[1024];
        int len = 0;
        while ((len = bis.read(bys)) != -1) {
            bos.write(bys, 0, len);
        }

        bos.close();
        bis.close();
    }
}
