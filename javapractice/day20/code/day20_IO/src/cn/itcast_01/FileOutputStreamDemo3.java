package cn.itcast_01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * FileOutputStremaд���ݵ��쳣����
 */
public class FileOutputStreamDemo3 {
    public static void main(String[] args) {
        // method1();
        method2();
    }

    public static void method2() {
        // �������⣬������finally���濴����
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("fos.txt");
            fos.write("hello".getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // ���жϲ�Ϊnull����ȥ�ر�
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void method1() {
        FileOutputStream fos = null;
        try {
            // System.out.println(10 / 0);
            fos = new FileOutputStream("fos.txt");
        } catch (FileNotFoundException e) {
            // e.printStackTrace();
            System.out.println("�����ļ�ʧ��");
        }

        try {
            fos.write("hello".getBytes());
        } catch (IOException e) {
            // e.printStackTrace();
            System.out.println("д������ʧ��");
        }

        try {
            fos.close();
        } catch (IOException e) {
            // e.printStackTrace();
            System.out.println("�ͷ���Դʧ��");
        }
    }
}
