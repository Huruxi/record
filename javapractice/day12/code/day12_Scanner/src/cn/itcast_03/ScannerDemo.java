package cn.itcast_03;

import java.util.Scanner;

/*
 * public int nextInt():��ȡһ��int���͵�����
 * public String nextLine():��ȡһ���ַ������͵�����
 */
public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s);
    }
}
