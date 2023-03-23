/*
	����¼���������ݣ���ȡ�����������е����ֵ
*/

import java.util.Scanner;

class OperatorTest3 {
    public static void main(String[] args) {
        //��������¼�����
        Scanner sc = new Scanner(System.in);

        //��ȡ����¼������
        System.out.println("�������һ�����ݣ�");
        int a = sc.nextInt();
        System.out.println("������ڶ������ݣ�");
        int b = sc.nextInt();
        System.out.println("��������������ݣ�");
        int c = sc.nextInt();

        //��ȡ�������ݵ����ֵ
        int temp = (a > b) ? a : b;
        int max = (temp > c) ? temp : c;

        //������
        System.out.println("���ֵ�ǣ�" + max);

    }
}
