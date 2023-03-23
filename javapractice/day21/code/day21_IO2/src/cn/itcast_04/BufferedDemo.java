package cn.itcast_04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 * ���й��ܣ�
 * BufferedReader:
 * 		public String readLine()�������������ݵ��ַ������������κ�����ֹ��������ѵ�����ĩβ���򷵻� null
 * BufferedWriter:
 * 		public void newLine()��дһ�����з�
 */
public class BufferedDemo {
    public static void main(String[] args) throws IOException {
        // д����
        // BufferedWriter bw = new BufferedWriter(new FileWriter("bw.txt"));
        // for (int x = 0; x < 10; x++) {
        // bw.write("hello" + x);
        // bw.newLine();
        // bw.flush();
        // }
        // bw.close();

        // ��ȡ����
        BufferedReader br = new BufferedReader(new FileReader("bw.txt"));

        // String s = br.readLine();
        // System.out.println(s);
        // s = br.readLine();
        // System.out.println(s);

        String line = null;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        br.close();
    }
}
