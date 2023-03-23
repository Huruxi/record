package cn.itcast_04;

import java.util.Scanner;

/*
 * ͳ��һ���ַ����д�д��ĸ�ַ���Сд��ĸ�ַ��������ַ����ֵĴ�����(�����������ַ�)
 * ������Hello123World
 * �����
 * 		��д��2
 * 		Сд��8
 * 		���֣�3
 *
 * ������
 * 		A:����¼��һ���ַ���
 * 		B:��������ͳ�Ʊ���
 * 			int bigCount = 0;
 * 			int smallCount = 0;
 * 			int numberCount = 0;
 * 		C:�����ַ������õ�ÿһ���ַ�
 * 		D:����ж��ַ��Ǵ�д��Сд����������?
 * 			char ch = ???;
 *
 * 			ASCII���
 * 				a	97	z=122
 * 				A	65  Z=90
 * 				0	48	9=57
 *
 * 				ch>=97 && ch<=122
 * 				...
 *
 * 			ch>='a' && ch<='z'
 * 			ch>='A'	&& ch<='Z'
 * 			ch>='0'	&& ch<='9'
 * 		E:������
 */
public class StringTest2 {
    public static void main(String[] args) {
        // ����¼��һ���ַ���
        Scanner sc = new Scanner(System.in);
        System.out.println("������һ���ַ�����");
        String s = sc.nextLine();

        // ��������ͳ�Ʊ���
        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;

        // �����ַ������õ�ÿһ���ַ�
        for (int x = 0; x < s.length(); x++) {
            char ch = s.charAt(x);

            // ����ж��ַ��Ǵ�д��Сд����������?
            if (ch >= 'A' && ch <= 'Z') {
                bigCount++;
            } else if (ch >= 'a' && ch <= 'z') {
                smallCount++;
            } else if (ch >= '0' && ch <= '9') {
                numberCount++;
            }
        }

        // ������
        System.out.println("��д��" + bigCount);
        System.out.println("Сд��" + smallCount);
        System.out.println("���֣�" + numberCount);
    }
}
