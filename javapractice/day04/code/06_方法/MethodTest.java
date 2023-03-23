/*
	���󣺼���¼���������ݣ������������еĽϴ�ֵ

	������
		A:����¼�����ݣ���Scannerʵ�֡�
		B:дһ������ʵ�֣������������ݵĽϴ�ֵ
		C:���ù���
		D:������
*/

import java.util.Scanner;

class MethodTest {
    public static void main(String[] args) {
        //��������¼�����
        Scanner sc = new Scanner(System.in);

        //��ȡ����¼������
        System.out.println("�������һ�����ݣ�");
        int a = sc.nextInt();
        System.out.println("������ڶ������ݣ�");
        int b = sc.nextInt();

        //���÷���
        int max = getMax(a, b);
        System.out.println("���ֵ�ǣ�" + max);
    }

    /*
        �����������еĽϴ�ֵ
        ������ȷ��
            ����ֵ��int
            �����б�int a,int b
    */
    public static int getMax(int a, int b) {
		/*
		if(a > b) {
			return a;
		}else {
			return b;
		}
		*/

		/*
		int m = a>b?a:b;
		return m;
		*/

        return a > b ? a : b;
    }
}
