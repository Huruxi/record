package cn.itcast_03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * �ַ���������
 * BufferedReader
 * BufferedWriter
 *
 *
 * ����Դ��
 * 		a.txt
 * Ŀ�ĵأ�
 * 		b.txt
 *
 * ĿǰΪֹ��
 * 		�����ı��ļ���
 * 			8��
 * 				�ֽ���	4��
 * 					�����ֽ���
 * 					�ֽڻ�����
 * 				�ַ���	4��
 * 					�����ַ���
 * 					�ַ�������
 *
 * 		����ͼƬ����Ƶ����Ƶ�ȣ�
 * 			4��
 * 				�ֽ���	4��
 * 					�����ֽ���
 * 					�ֽڻ�����
 */
public class CopyFileDemo2 {
    public static void main(String[] args) throws IOException {
        // ��װ����Դ
        BufferedReader br = new BufferedReader(new FileReader("a.txt"));
        // ��װĿ�ĵ�
        BufferedWriter bw = new BufferedWriter(new FileWriter("c.txt"));

        // ���ַ�ʽ
        char[] chs = new char[1024];
        int len = 0;
        while ((len = br.read(chs)) != -1) {
            bw.write(chs, 0, len);
        }

        bw.close();
        br.close();
    }
}
