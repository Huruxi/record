package cn.itcast_07;

import java.util.Scanner;

/*
 * �ַ�����ת
 * ����������¼�롱abc��		����������cba��
 */
public class StringTest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("������һ���ַ�����");
        String s = sc.nextLine();

        String result = reverse(s);
        System.out.println(result);
    }

    // д����ʵ��
    public static String reverse(String s) {
        String result = "";

        char[] chs = s.toCharArray();
        for (int x = chs.length - 1; x >= 0; x--) {
            result += chs[x];
        }

        return result;
    }
}
