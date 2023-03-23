package cn.itcast_01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * ����ͼƬ(4��)
 * A:�����ֽ���һ�ζ�дһ���ֽ�
 * B:�����ֽ���һ�ζ�дһ���ֽ�����
 * C:��Ч�ֽ���һ�ζ�дһ���ֽ�
 * D:��Ч�ֽ���һ�ζ�дһ���ֽ�����
 */
public class CopyBmpDemo {
    public static void main(String[] args) throws IOException {
        File srcFile = new File("c:\\����ϼ.bmp");
        File destFile = new File("d:\\mn.bmp");

        // method1(srcFile, destFile);
        // method2(srcFile, destFile);
        // method3(srcFile, destFile);
        method4(srcFile, destFile);
    }

    // ��Ч�ֽ���һ�ζ�дһ���ֽ�����
    public static void method4(File srcFile, File destFile) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(
                srcFile));
        BufferedOutputStream bos = new BufferedOutputStream(
                new FileOutputStream(destFile));

        byte[] bys = new byte[1024];
        int len = 0;
        while ((len = bis.read(bys)) != -1) {
            bos.write(bys, 0, len);
        }

        bos.close();
        bis.close();
    }

    // ��Ч�ֽ���һ�ζ�дһ���ֽ�
    public static void method3(File srcFile, File destFile) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(
                srcFile));
        BufferedOutputStream bos = new BufferedOutputStream(
                new FileOutputStream(destFile));

        int by = 0;
        while ((by = bis.read()) != -1) {
            bos.write(by);
        }

        bos.close();
        bis.close();
    }

    // �����ֽ���һ�ζ�дһ���ֽ�����
    public static void method2(File srcFile, File destFile) throws IOException {
        FileInputStream fis = new FileInputStream(srcFile);
        FileOutputStream fos = new FileOutputStream(destFile);

        byte[] bys = new byte[1024];
        int len = 0;
        while ((len = fis.read(bys)) != -1) {
            fos.write(bys, 0, len);
        }

        fos.close();
        fis.close();
    }

    // �����ֽ���һ�ζ�дһ���ֽ�
    public static void method1(File srcFile, File destFile) throws IOException {
        FileInputStream fis = new FileInputStream(srcFile);
        FileOutputStream fos = new FileOutputStream(destFile);

        int by = 0;
        while ((by = fis.read()) != -1) {
            fos.write(by);
        }

        fos.close();
        fis.close();
    }
}
