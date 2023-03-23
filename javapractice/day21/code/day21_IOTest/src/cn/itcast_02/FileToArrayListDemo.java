package cn.itcast_02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/*
 * ���ı��ļ��ж�ȡ����(ÿһ��Ϊһ���ַ�������)�������У�����������
 *
 * ����Դ��
 * 		array.txt
 * Ŀ�ĵأ�
 * 		ArrayList
 */
public class FileToArrayListDemo {
    public static void main(String[] args) throws IOException {
        // ��װ����Դ
        BufferedReader br = new BufferedReader(new FileReader("array.txt"));

        // ��װĿ�ĵ�
        ArrayList<String> array = new ArrayList<String>();

        String line = null;
        while ((line = br.readLine()) != null) {
            array.add(line);
        }

        br.close();

        // ��������
        for (String s : array) {
            System.out.println(s);
        }
    }
}
