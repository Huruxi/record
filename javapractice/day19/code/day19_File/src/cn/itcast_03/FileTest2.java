package cn.itcast_03;

import java.io.File;
import java.io.FilenameFilter;

/*
 * �������d��Ŀ¼�����е�.jpg��β���ļ����Ƹ��������
 * A����˼·:
 *		�Ȼ�ȡ���е��ļ������ļ��е�File���飬�ڱ�����ʱ�������жϣ���������������������
 * B����˼·��
 * 		���ж�����������?������㣬�����������淽�������ֱ�ӱ������ɡ�
 *
 * Ҫ��ʵ��B�������ͱ���֪��һ��������FilenameFilter �ļ����ƹ�������
 */
public class FileTest2 {
    public static void main(String[] args) {
        File folder = new File("d:\\");

        // public String[] list(FilenameFilter filter)
        // public File[] listFiles(FilenameFilter filter)

        // String[] strArray = folder.list(new FilenameFilter() {
        // @Override
        // public boolean accept(File dir, String name) {
        // // return false;
        // // return true;
        // // System.out.println(dir + "---" + name);
        // // File file = new File(dir, name);
        // // boolean flag = file.isFile();
        // // boolean flag2 = name.endsWith(".jpg");
        // // return flag && flag2;
        //
        // return new File(dir, name).isFile() && name.endsWith(".jpg");
        // }
        // });
        //
        // for (String str : strArray) {
        // System.out.println(str);
        // }

        // public File[] listFiles(FilenameFilter filter)
        File[] fileArray = folder.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return new File(dir, name).isFile() && name.endsWith(".jpg");
            }
        });

        for (File file : fileArray) {
            System.out.println(file.getName());
        }
    }
}
