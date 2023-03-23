package cn.itcast_02;

import java.io.File;

/*
 * ����������:public boolean renameTo(File dest)
 * ·����ͬ������
 * ·����ͬ�����в�����
 */
public class FileDemo3 {
    public static void main(String[] args) {
        // ������Ҫ��a.txt���ļ����Ƹ�Ϊb.txt
        // ��������
        // File file = new File("a.txt");
        // // Ŀ��
        // File dest = new File("b.txt");
        // // ���÷���
        // System.out.println("renameTo:" + file.renameTo(dest));

        File file = new File("b.txt");
        File dest = new File("e:\\a.txt");
        System.out.println("renameTo:" + file.renameTo(dest));
    }
}
