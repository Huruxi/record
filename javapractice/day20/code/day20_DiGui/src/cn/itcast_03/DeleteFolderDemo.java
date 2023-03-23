package cn.itcast_03;

import java.io.File;

/*
 /*
 * ɾ�������ݵ�Ŀ¼
 * D:\demo
 * 
 * ������
 * 		A:��װָ��Ŀ¼
 * 		B:��ȡָ��Ŀ¼�µ������ļ������ļ��е�File����
 * 		C:������File���飬��ȡ�õ�ÿһ��File����
 * 		D:�жϸ�File����
 * 			���ļ��У��ص�B(�ݹ�)
 * 			���ļ���	
 * 				ֱ��ɾ��
 * 		E:ɾ���ļ���
 */
public class DeleteFolderDemo {
    public static void main(String[] args) {
        // ��װָ��Ŀ¼
        File srcFolder = new File("d:\\demo");
        // �ݹ鷽��
        deleteFolder(srcFolder);
    }

    public static void deleteFolder(File srcFolder) {
        // ��ȡָ��Ŀ¼�µ������ļ������ļ��е�File����
        File[] fileArray = srcFolder.listFiles();

        // ɾ������ϵͳ�ļ���������ݣ������ǿ���ʵ��
        if (fileArray != null) {
            // ������File���飬��ȡ�õ�ÿһ��File����
            for (File file : fileArray) {
                if (file.isDirectory()) {
                    deleteFolder(file);
                } else {
                    System.out.println(file.getName() + "---" + file.delete());
                }
            }

            System.out
                    .println(srcFolder.getName() + "---" + srcFolder.delete());
        }
    }
}
