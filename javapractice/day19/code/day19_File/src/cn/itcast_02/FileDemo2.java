package cn.itcast_02;

import java.io.File;
import java.io.IOException;

/*
 * ɾ�����ܣ�public boolean delete() �ȿ���ɾ���ļ���Ҳ����ɾ���ļ��С�
 *
 * ���·���������̷���ʼ��·��
 * ����·�������̷���ʼ��·��
 *
 * ע�����
 * 		A:���һ���ļ����������ݣ��ǲ���ֱ��ɾ���ġ�
 * 		B:Java�����ɾ�����߻���վ��ֱ��ɾ����
 */
public class FileDemo2 {
    public static void main(String[] args) throws IOException {
        // ����File����
        File file = new File("a.txt");
        System.out.println("createNewFile:" + file.createNewFile());

        File file2 = new File("aaa\\bbb");
        System.out.println("mkdirs:" + file2.mkdirs());

        File file3 = new File(file2, "b.txt");
        System.out.println("createNewFile:" + file3.createNewFile());

        // ɾ���ļ�
        System.out.println("delete:" + file.delete());

        // ɾ���ļ���
        File file4 = new File("aaa\\bbb\\ccc");
        System.out.println("delete:" + file4.delete());

        File file5 = new File("aaa");
        System.out.println("delete:" + file5.delete());
    }
}
