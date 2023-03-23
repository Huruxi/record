package cn.itcast_03;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * ���Ƶ����ļ�����ָ���ļ����޸��ļ�����
 * ���󣺰�d:\\java�ļ����µ�����java�ļ����Ƶ�d:\\jadĿ¼�£����޸ĺ�׺��Ϊjad��
 *
 * ������
 * 		A:��װ����ԴĿ¼
 * 		B:��װĿ�ĵ�Ŀ¼
 * 		C:��ȡ����ԴĿ¼�µ������ļ���File����
 * 		D:����File����,�õ�ÿһ��File����
 * 		E:���Ƽ���
 * 			����Դ��d:\\java\\ForDemo.java
 * 			Ŀ�ĵأ�d:\\jad\\ForDemo.jad
 */
public class ChangeNameDemo {
    public static void main(String[] args) throws IOException {
        // ��װ����ԴĿ¼
        File srcFolder = new File("d:\\java");

        // ��װĿ�ĵ�Ŀ¼
        File destFolder = new File("d:\\jad");
        if (!destFolder.exists()) {
            destFolder.mkdir();
        }

        // ��ȡ����ԴĿ¼�µ������ļ���File����
        File[] fileArray = srcFolder.listFiles();

        // ����File����,�õ�ÿһ��File����
        for (File file : fileArray) {
            // System.out.println(file); // d:\java\ForDemo.java
            String name = file.getName(); // ForDemo.java
            name = name.replace(".java", ".jad"); // ForDemo.jad
            File newFile = new File(destFolder, name); // d:\\jad\\ForDemo.jad

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
