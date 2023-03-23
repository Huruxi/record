/*
	����¼���������ݣ��Ƚ��������Ƿ����
*/

import java.util.Scanner;

class MethodTest2 {
    public static void main(String[] args) {
        //��������¼�����
        Scanner sc = new Scanner(System.in);

        //����¼������
        System.out.println("�������һ�����ݣ�");
        int a = sc.nextInt();
        System.out.println("������ڶ������ݣ�");
        int b = sc.nextInt();

        //���÷���
        boolean flag = compare(a, b);
        System.out.println(flag);
    }

    /*
        �Ƚ��������Ƿ����

        ������ȷ��
            ����ֵ���ͣ�boolean
            �����б�int a,int b
    */
    public static boolean compare(int a, int b) {
		/*
		if(a == b) {
			return true;
		}else {
			return false;
		}
		*/

        //��Ԫ��ʽ1
        //boolean flag = a==b?true:false;
        //return flag;

        //��Ԫ��ʽ2
        //return a==b?true:false;

        //���հ�
        return a == b;
    }
}
