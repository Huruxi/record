/*
	���󣺻�ȡ���������е����ֵ
*/

import java.util.Scanner;

class IfTest5 {
    public static void main(String[] args) {
        //��������¼�����
        Scanner sc = new Scanner(System.in);

        //����¼������
        System.out.println("�������һ�����ݣ�");
        int a = sc.nextInt();
        System.out.println("������ڶ������ݣ�");
        int b = sc.nextInt();
        System.out.println("��������������ݣ�");
        int c = sc.nextInt();

        //��Ԫ�����ʵ��
        //int max  = (a>b)?(a>c?a:c):(b>c?b:c);
        int temp = a > b ? a : b;
        int max = temp > c ? temp : c;
        System.out.println("���ֵ�ǣ�" + max);


        //if���ʵ��(if����Ƕ��ʹ��)
        int max2;
        if (a > b) {
            if (a > c) {
                max2 = a;
            } else {
                max2 = c;
            }
        } else {
            if (b > c) {
                max2 = b;
            } else {
                max2 = c;
            }
        }
        System.out.println("���ֵ�ǣ�" + max2);
    }
}
