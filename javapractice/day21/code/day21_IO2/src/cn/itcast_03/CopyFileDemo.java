package cn.itcast_03;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * Writer:
 * 		OutputStreamWriter ���ֽ���ת��Ϊ�ַ���,������ָ������
 * 			FileWriter
 * Reader:
 * 		InputStreamReader ���ֽ���ת��Ϊ�ַ���,������ָ������
 * 			FileReader
 *
 * ����Դ��
 * 		a.txt
 * Ŀ�ĵأ�
 * 		b.txt
 */
public class CopyFileDemo {
    public static void main(String[] args) throws IOException {
        // ��װ����Դ
        FileReader fr = new FileReader("a.txt");
        // ��װĿ�ĵ�
        FileWriter fw = new FileWriter("b.txt");

        // ��д
        // ��ʽ1
        // int ch = 0;
        // while ((ch = fr.read()) != -1) {
        // fw.write(ch);
        // }

        // ��ʽ2
        char[] chs = new char[1024];
        int len = 0;
        while ((len = fr.read(chs)) != -1) {
            fw.write(chs, 0, len);
        }

        // �ͷ���Դ
        fw.close();
        fr.close();
    }
}
