/*
	if���ĵڶ��ָ�ʽ����Ԫ�����������
		��Ԫ�������
			��ϵ���ʽ?���ʽ1:���ʽ2;

		if����ʽ2��
			if(��ϵ���ʽ){
				�����1;
			}else {
				�����2;
			}

	�ܽ᣺
		��Ԫ������ܹ�ʵ�ֵģ�if���ĵڶ��ָ�ʽ������ʵ�֡���֮��������
		ʲôʱ�򲻳�����?
			��if�����������һ��������ʱ���Ͳ�������
			��Ϊ��Ԫ�������һ���������Ҫ���н�����أ��������䲻����Ϊһ��������ء�
*/

import java.util.Scanner;

class IfDemo4 {
    public static void main(String[] args) {
        //��������¼�����
        Scanner sc = new Scanner(System.in);

        //��ȡ����¼������
        System.out.println("�������һ�����ݣ�");
        int a = sc.nextInt();
        System.out.println("������ڶ������ݣ�");
        int b = sc.nextInt();

        //ʹ����Ԫ�����ʵ��
        int c = (a > b) ? a : b;
        System.out.println("c:" + c);

        //��if����ʽ2ʵ��
        int d;
        if (a > b) {
            d = a;
        } else {
            d = b;
        }
        System.out.println("d:" + d);
        System.out.println("------------------");

        //ֱ�Ӱѽ�����
        if (a > b) {
            System.out.println("a:" + a);
        } else {
            System.out.println("b:" + b);
        }

        //����Ԫ������Ľ�
        //(a>b)?System.out.println("a:"+a):System.out.println("b:"+b);
    }
}
