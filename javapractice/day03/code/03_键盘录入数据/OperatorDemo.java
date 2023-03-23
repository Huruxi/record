/*
	Ϊ�˳�������ݸ��ӵ������Ǿ����������¼�����ݡ�

	���ʹ�ü���¼��������?Ŀǰ��͸��Ҽ�ס�ˡ�
	A:����
		import java.util.Scanner;

		��class������
	B:��������
		Scanner sc = new Scanner(System.in);
	C:��ȡ����
		int i = sc.nextInt();
*/

import java.util.Scanner;

class OperatorDemo {
    public static void main(String[] args) {
        //��������¼�����
        Scanner sc = new Scanner(System.in);

        System.out.println("������һ��������");
        //��ȡ����
        int i = sc.nextInt();

        System.out.println("i:" + i);
    }
}