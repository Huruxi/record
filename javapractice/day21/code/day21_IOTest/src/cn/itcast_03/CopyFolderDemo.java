package cn.itcast_03;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * ���Ƶ����ļ���
 *
 * ����Դ��
 * 		d:\\demo
 * Ŀ�ĵأ�
 * 		demo
 *
 * ������
 * 		A:��Ŀ�ĵش����ļ���
 * 		B:��ȡ����Դ�ļ����µ������ļ���File����
 * 		C:����File���飬�õ�ÿһ��File����
 * 		D:���Ƹ�File
 * 			����Դ��d:\\demo\\a.txt
 * 			Ŀ�ĵأ�demo\\a.txt
 */
public class CopyFolderDemo {
    public static void main(String[] args) throws IOException {
        // ��װ����Դ�ļ���
        File srcFolder = new File("d:\\demo");

        // ��Ŀ�ĵش����ļ���
        // ��װ������Դһ�����ļ��У����ж��Ƿ���ڣ���������ڣ��ʹ���
        File destFolder = new File(srcFolder.getName());
        if (!destFolder.exists()) {
            destFolder.mkdir();
        }

        // ��ȡ����Դ�ļ����µ������ļ���File����
        File[] fileArray = srcFolder.listFiles();

        // ����File���飬�õ�ÿһ��File����
        for (File file : fileArray) {
            String name = file.getName(); // a.txt
            File newFile = new File(destFolder, name); // demo\\a.txt

            copy(file, newFile);
        }
    }

    private static void copy(File file, File newFile) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(
                file));
        BufferedOutputStream bos = new BufferedOutputStream(
                new FileOutputStream(newFile));

        byte[] bys = new byte[1024];
        int len = 0;
        while ((len = bis.read(bys)) != -1) {
            bos.write(bys, 0, len);
        }

        bos.close();
        bis.close();
    }

}
