package cn.itcast_02;

import java.io.File;

/*
 *public boolean isDirectory():�Ƿ����ļ���
 *public boolean isFile():�Ƿ����ļ�
 *public boolean exists():�Ƿ����
 *public boolean canRead():�Ƿ�ɶ�
 *public boolean canWrite():�Ƿ��д
 *public boolean isHidden():�Ƿ�����
 */
public class FileDemo4 {
    public static void main(String[] args) {
        File file = new File("demo.txt");

        System.out.println("isDirectory:" + file.isDirectory());
        System.out.println("isFile:" + file.isFile());
        System.out.println("exists:" + file.exists());
        System.out.println("canRead:" + file.canRead());
        System.out.println("canWrite:" + file.canWrite());
        System.out.println("isHidden:" + file.isHidden());
    }
}
