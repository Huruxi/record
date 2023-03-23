package cn.itcast_02;

import java.io.File;

/*
 * public String[] list():���ص��Ǹ���Ŀ¼�µ������ļ������ļ��е��������顣
 * public File[] listFiles():���ص��Ǹ���Ŀ¼�µ������ļ������ļ��е�File���顣
 */
public class FileDemo6 {
    public static void main(String[] args) {
        // ����һ��Ŀ¼��d:\\
        File file = new File("d:\\");

        // public String[] list():���ص��Ǹ���Ŀ¼�µ������ļ������ļ��е��������顣
        String[] strArray = file.list();
        for (String str : strArray) {
            System.out.println(str);
        }
        System.out.println("-----------------");

        // public File[] listFiles():���ص��Ǹ���Ŀ¼�µ������ļ������ļ��е�File���顣
        File[] fileArray = file.listFiles();
        for (File f : fileArray) {
            // System.out.println(f);
            System.out.println(f.getName());
        }
    }
}
