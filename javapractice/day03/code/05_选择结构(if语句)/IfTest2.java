/*
	���󣺼���¼���������ݣ��Ƚ������������Ƿ����

	������
		A:����¼�룬��Scanner
		B:�Ƚ����������ݣ���if���
		C:������ʽչʾ���
*/

import java.util.Scanner;

class IfTest2 {
    public static void main(String[] args) {
        //��������¼�����
        Scanner sc = new Scanner(System.in);

        //����¼������
        System.out.println("�������һ�����ݣ�");
        int a = sc.nextInt();
        System.out.println("������ڶ������ݣ�");
        int b = sc.nextInt();

        //�Ƚ�����
        //��ʽ1:�ѽ��ֱ�����
        if (a == b) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        System.out.println("------------------");

        //��ʽ2:�ѽ����������
        boolean flag;
        if (a == b) {
            flag = true;
        } else {
            flag = false;
        }
        System.out.println(flag);
    }
}
