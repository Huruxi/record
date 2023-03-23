package cn.itcast_02;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 *public String getAbsolutePath():��ȡ����·��
 *public String getPath():��ȡ���·��
 *public String getName():��ȡ����
 *public long length():��ȡ�ļ��Ĵ�С
 *public long lastModified():��ȡ���һ���޸�ʱ��ĺ���ֵ
 */
public class FileDemo5 {
    public static void main(String[] args) {
        File file = new File("aaa\\bbb\\b.txt");

        System.out.println("getAbsolutePath:" + file.getAbsolutePath());
        System.out.println("getPath:" + file.getPath());
        System.out.println("getName:" + file.getName());
        System.out.println("length:" + file.length());
        System.out.println("lastModified:" + file.lastModified());

        // 1428044959288
        Date d = new Date(1428044959288L);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String s = sdf.format(d);
        System.out.println(s);
    }
}
