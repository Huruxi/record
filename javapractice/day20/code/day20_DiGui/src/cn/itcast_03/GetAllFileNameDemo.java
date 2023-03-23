package cn.itcast_03;

import java.io.File;

/*
 * �ݹ����Ŀ¼��ָ����׺����β���ļ�����·�� .java
 * D:\itcast\20150306
 *
 * ������
 * 		A:��װָ��Ŀ¼
 * 		B:��ȡָ��Ŀ¼�µ������ļ������ļ��е�File����
 * 		C:������File���飬��ȡ�õ�ÿһ��File����
 * 		D:�жϸ�File����
 * 			���ļ��У��ص�B(�ݹ�)
 * 			���ļ���
 * 				�ж��Ƿ���ָ���ĺ�׺��β
 * 					�ǣ���������ļ��ľ���·��
 */
public class GetAllFileNameDemo {
    public static int count1 = 0;
    public static int count2 = 0;

    public static void main(String[] args) {
        // ��װָ��Ŀ¼
        File srcFolder = new File("E:\\work\\record\\javapractice");
        // �ݹ�ʵ��
        getAllJavaFilePath(srcFolder);
        System.out.println("��ѧϰ��" + count1 + "��java�ļ�");
        System.out.println("��ѧϰ��" + count2 + "��avi�ļ�");
    }

    public static void getAllJavaFilePath(File srcFolder) {
        // ��ȡָ��Ŀ¼�µ������ļ������ļ��е�File����
        File[] fileArray = srcFolder.listFiles();
        // ������File���飬��ȡ�õ�ÿһ��File����
        for (File file : fileArray) {
            if (file.isDirectory()) {
                // ���ļ��У��ص�B(�ݹ�)
                getAllJavaFilePath(file);
            } else {
                // �ж��Ƿ���ָ���ĺ�׺��β
                if (file.getName().endsWith(".java")) {
                    count1++;
                    // ��������ļ��ľ���·��
                    System.out.println(file.getAbsolutePath());
                } else if (file.getName().endsWith(".avi")) {
                    count2++;
                    System.out.println(file.getName());
                }
            }
        }
    }
}