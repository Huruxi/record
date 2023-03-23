package cn.itcast_06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * ����Դ��
 * 		MyBufferedReader.java	--	Reader	--	FileReader --	BufferedReader
 * Ŀ�ĵأ�
 * 		Copy.java	--	Writer -- FileWriter -- BufferedWriter -- PrintWriter
 */
public class CopyFileDemo {
    public static void main(String[] args) throws IOException {
        // // ��װ����Դ
        // BufferedReader br = new BufferedReader(new FileReader(
        // "MyBufferedReader.java"));
        // // ��װĿ�ĵ�
        // BufferedWriter bw = new BufferedWriter(new FileWriter("Copy.java"));
        // // ��д����
        // String line = null;
        // while ((line = br.readLine()) != null) {
        // bw.write(line);
        // bw.newLine();
        // bw.flush();
        // }
        // // �ͷ���Դ
        // bw.close();
        // br.close();

        // ��PrintWriter�Ľ���
        BufferedReader br = new BufferedReader(new FileReader(
                "MyBufferedReader.java"));
        PrintWriter pw = new PrintWriter(new FileWriter("Copy.java"), true);

        String line = null;
        while ((line = br.readLine()) != null) {
            pw.println(line);
        }

        pw.close();
        br.close();
    }
}
