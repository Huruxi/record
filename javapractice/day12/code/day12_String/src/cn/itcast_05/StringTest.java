package cn.itcast_05;

import java.util.Scanner;

/*
 * ��һ���ַ���������ĸת�ɴ�д������ΪСд��(ֻ����Ӣ�Ĵ�Сд��ĸ�ַ�)
 * ������helloWorldAbCde
 * �����Helloworldabcde
 *
 * ������
 * 		A:����¼��һ���ַ���
 * 		B:��ȡ����ĸ�õ�s1
 * 		C:��ȡ������ĸ����������ַ����õ�s2
 * 		D:s1ת��д+s2תСд
 */
public class StringTest {
    public static void main(String[] args) {
        // ����¼��һ���ַ���
        Scanner sc = new Scanner(System.in);
        System.out.println("������һ���ַ�����");
        String s = sc.nextLine();

        // ��ȡ����ĸ�õ�s1
        String s1 = s.substring(0, 1);
        // ��ȡ������ĸ����������ַ����õ�s2
        String s2 = s.substring(1);
        // s1ת��д+s2תСд
        String result = s1.toUpperCase().concat(s2.toLowerCase());
        System.out.println(result);

        // String result = s.substring(0, 1).toUpperCase()
        // .concat(s.substring(1).toLowerCase());
        // System.out.println(result);
    }
}
