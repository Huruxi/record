package cn.itcast_03;

import java.io.File;

/*
 * �������d��Ŀ¼�����е�.jpg��β���ļ����Ƹ��������
 *
 * ������
 * 		A:��װĿ¼
 * 		B:��ȡ��Ŀ¼�����е��ļ������ļ��е�File����
 * 		C:������File���飬�õ�ÿһ��File����
 * 		D:�жϸ�File����
 * 			���ж��Ƿ����ļ�
 * 				�ǣ�
 * 					�����ж��Ƿ���.jpg��β
 * 						�ǣ��������
 */
public class FileTest {
    public static void main(String[] args) {
        // ��װĿ¼
        File folder = new File("d:\\");

        // ��ȡ��Ŀ¼�����е��ļ������ļ��е�File����
        File[] fileArray = folder.listFiles();

        // ������File���飬�õ�ÿһ��File����
        for (File file : fileArray) {
            // ���ж��Ƿ����ļ�
            if (file.isFile()) {
                // �����ж��Ƿ���.jpg��β
                if (file.getName().endsWith(".jpg")) {
                    System.out.println(file.getName());
                }
            }
        }
    }
}
