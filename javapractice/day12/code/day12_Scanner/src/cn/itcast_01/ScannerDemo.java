package cn.itcast_01;

import java.io.InputStream;
import java.util.Scanner;

/*
 * Scanner:JDK5�Ժ����ڰ�������ʵ�ּ���¼�����ݵġ�
 *
 * ���췽����
 * 		public Scanner(InputStream source)
 */
public class ScannerDemo {
    public static void main(String[] args) {
        // ��������¼�����
        // Scanner sc = new Scanner(System.in);

        // public Scanner(InputStream source)

        // System������������һ����Ա����
        // public static final InputStream in;
        // InputStream is = System.in;

        // ����Demo������һ������
        // public static final int x;
        // public static final Student s;
        // int y = Demo.x;
        // Student student = Demo.s;

        // InputStream is = System.in; //�������
        // Scanner sc = new Scanner(is);

        Scanner sc = new Scanner(System.in);
    }
}
