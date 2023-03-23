package cn.itcast_04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * ����Դ��
 * 		InputStreamReaderDemo.java
 * Ŀ�ĵأ�
 * 		Deom.java
 */
public class CopyFileDemo {
    public static void main(String[] args) throws IOException {
        // ���ַ������������й���ʵ��

        // һ�ζ�ȡһ��

        // ��װ����Դ
        BufferedReader br = new BufferedReader(new FileReader(
                "InputStreamReaderDemo.java"));
        // ��װĿ�ĵ�
        BufferedWriter bw = new BufferedWriter(new FileWriter("Demo.java"));

        // ��дһ��
        String line = null;
        while ((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        // �ͷ���Դ
        bw.close();
        br.close();
    }
}
