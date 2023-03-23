/*
	switch����ʽ��
		switch(���ʽ) {
			case ֵ1��
				�����1;
				break;
		    case ֵ2��
				�����2;
				break;
				��
		    default��	
				�����n+1;
				break;
		}

		��ʽ���ͣ�
			A:switch��ʾ����switch���
			B:���ʽ��ȡֵ
				byte,short,int,char
				JDK5�Ժ������ö�����͡�(enum)
				JDK7�Ժ�������ַ�����(String)
			C:case���������Ҫ�ͱ��ʽ���бȽϵ�ֵ
			D:���������Ƕ������
			E:break��ʾ�жϣ���������˼�����Խ���switch���
			F:default����ʾ�����������ƥ���ʱ�򣬾�ִ�иô������ݣ���if����else���ơ�
		
		�����⣺
			switch�ı��ʽ������byte������?������long������?������String������?
				���ԡ�
				�����ԡ�
				JDK7�Ժ���ԡ�

		ִ�����̣�
			A:���ȼ�������ʽ��ֵ
			B:��Σ���case���αȽϣ�һ���ж�Ӧ��ֵ���ͻ�ִ����Ӧ����䣬
			  ��ִ�еĹ����У�����break�ͻ������
			C:���������е�case���ͱ��ʽ��ֵ��ƥ�䣬�ͻ�ִ��default����岿�֣�Ȼ������������

		���󣺸��ݼ���¼�����ֵ1��2��3����7�����Ӧ������һ�����ڶ����������������ա�

		������
			A:����¼�����ݣ���Scannerʵ��
			B:��¼������ݽ����жϣ���switchʵ��
			C:�����Ӧ�Ľ��
*/

import java.util.Scanner;

class SwitchDemo {
    public static void main(String[] args) {
        //��������¼�����
        Scanner sc = new Scanner(System.in);

        //����¼������
        System.out.println("������һ������(1-7)��");
        int week = sc.nextInt();

        //��switch���ʵ��
        switch (week) {
            case 1:
                System.out.println("����һ");
                break;
            case 2:
                System.out.println("���ڶ�");
                break;
            case 3:
                System.out.println("������");
                break;
            case 4:
                System.out.println("������");
                break;
            case 5:
                System.out.println("������");
                break;
            case 6:
                System.out.println("������");
                break;
            case 7:
                System.out.println("������");
                break;
            default:
                System.out.println("���������������");
                break;
        }
    }
}