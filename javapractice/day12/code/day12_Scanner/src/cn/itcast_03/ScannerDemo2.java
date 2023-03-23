package cn.itcast_03;

import java.util.Scanner;

/*
 * ���⣺
 * 		int--int
 * 		String--String
 * 		String--int
 *
 * 		int--String�����⣬��ѻس����и���String��
 *
 * ��ν����?
 * 		A:���´���һ���µļ���¼�����
 * 		B:�Ѽ�������¼������ȫ������String���ͽ��ܡ�
 * 		      ��Ҫʲô���ͣ��Ͱ�Stringת��Ϊ�����͡�
 * 		      ������ôת�����콲��
 */
public class ScannerDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int x = sc.nextInt();
        // int y = sc.nextInt();
        // System.out.println(x);
        // System.out.println(y);

        // String x = sc.nextLine();
        // String y = sc.nextLine();
        // System.out.println(x);
        // System.out.println(y);

        // String x = sc.nextLine();
        // int y = sc.nextInt();
        // System.out.println(x);
        // System.out.println(y);

        int x = sc.nextInt();

        sc = new Scanner(System.in);

        String y = sc.nextLine(); // �ѻس����и�������
        System.out.println(x);
        System.out.println(y);
    }
}
