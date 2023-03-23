/*
	����¼���������ݣ������������е����ֵ
*/

import java.util.Scanner;

class MethodTest3 {
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

        //���ù���
        int max = getMax(a, b, c);
        System.out.println(max);
    }

    /*
        �����������е����ֵ
        ������ȷ��
            ����ֵ���ͣ�int
            �����б�int a,int b,int c
    */
    public static int getMax(int a, int b, int c) {
		/*
		if(a>b){
			if(a>c) {
				return a;
			}else {
				return c;
			}
		}else{
			if(b>c) {
				return b;
			}else {
				return c;
			}
		}
		*/

        //��Ԫ
        //return a>b?a>c?a:c:b>c?b:c;

        int temp = a > b ? a : b;
        int max = temp > c ? temp : c;
        return max;
    }
}
