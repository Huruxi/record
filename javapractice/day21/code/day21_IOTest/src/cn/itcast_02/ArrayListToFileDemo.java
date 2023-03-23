package cn.itcast_02;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
 * ��ArrayList�����е��ַ������ݴ洢���ı��ļ�
 *
 * ����Դ��
 * 		ArrayList
 * Ŀ�ĵأ�
 * 		array.txt
 */
public class ArrayListToFileDemo {
    public static void main(String[] args) throws IOException {
        // �������϶���
        // ��װ����Դ
        ArrayList<String> array = new ArrayList<String>();
        array.add("hello");
        array.add("world");
        array.add("java");

        // ��װĿ�ĵ�
        BufferedWriter bw = new BufferedWriter(new FileWriter("array.txt"));

        for (String line : array) {
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        // �ͷ���Դ
        bw.close();
    }
}
