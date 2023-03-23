/*
	���󣺼���¼���������ݣ���ȡ�����������е����ֵ

	������
		A:����¼������
		B:��ȡ���ֵ������Ԫ�����ʵ��
		C:������ֵ
*/

import java.util.Scanner;

class OperatorTest2 {
    public static void main(String[] args) {
        //��������¼�����
        Scanner sc = new Scanner(System.in);

        //��ȡ����¼������
        System.out.println("�������һ�����ݣ�");
        int a = sc.nextInt();
        System.out.println("������ڶ������ݣ�");
        int b = sc.nextInt();

        //��ȡ�������ֵ
        int max = (a > b) ? a : b;

        //������
        System.out.println("���ֵ�ǣ�" + max);
    }
}