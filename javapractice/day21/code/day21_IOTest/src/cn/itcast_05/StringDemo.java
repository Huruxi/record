package cn.itcast_05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

/*
 *��֪s.txt�ļ�����������һ���ַ�������hcexfgijkamdnoqrzstuvwybpl��
 *���д�����ȡ�������ݣ������������д��ss.txt�С�
 *
 *������
 *	A:��ȡ�ļ����ݣ���һ�Σ����ַ������ܡ�
 *	B:���ַ���ת�����ַ�����
 *	C:���ַ������������
 *	D:���ַ�����ת���ַ���
 *	E:���ַ���д���ı��ļ�
 */
public class StringDemo {
    public static void main(String[] args) throws IOException {
        // ��ȡ�ļ����ݣ���һ�Σ����ַ������ܡ�
        BufferedReader br = new BufferedReader(new FileReader("s.txt"));
        String line = br.readLine();
        br.close();

        // ���ַ���ת�����ַ�����
        char[] chs = line.toCharArray();

        // ���ַ������������
        Arrays.sort(chs);

        // ���ַ�����ת���ַ���
        String s = String.valueOf(chs);

        // ���ַ���д���ı��ļ�
        BufferedWriter bw = new BufferedWriter(new FileWriter("ss.txt"));
        bw.write(s);
        bw.newLine();
        bw.flush();
        bw.close();

    }
}
