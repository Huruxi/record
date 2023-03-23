/*
	���󣺼���¼���·ݵ�ֵ�������Ӧ�ļ��ڡ�
		�� 3,4,5
		�� 6,7,8
		�� 9,10,11
		�� 12,1,2

	������
		A:����¼���·ݣ���Scannerʵ�֡�
		B:��if���ʵ���ж�
*/

import java.util.Scanner;

class IfTest4 {
    public static void main(String[] args) {
        //��������¼�����
        Scanner sc = new Scanner(System.in);

        //����¼���·�
        System.out.println("�������·ݣ�");
        int month = sc.nextInt();
		
		/*
		if(month<1 || month>12) {
			System.out.println("�·���������");
		}else if(month == 1) {
			System.out.println("����");
		}else if(month == 2) {
			System.out.println("����");
		}else if(month == 3) {
			System.out.println("����");
		}else if(month == 4) {
			System.out.println("����");
		}else if(month == 5) {
			System.out.println("����");
		}else if(month == 6) {
			System.out.println("�ļ�");
		}else if(month == 7) {
			System.out.println("�ļ�");
		}else if(month == 8) {
			System.out.println("�ļ�");
		}else if(month == 9) {
			System.out.println("�＾");
		}else if(month == 10) {
			System.out.println("�＾");
		}else if(month == 11) {
			System.out.println("�＾");
		}else {
			System.out.println("����");
		}
		*/

        //��Ȼ���ڿ���ʵ�֣����Ǹо���Щ�鷳
        //��������Ҫ�Գ�����иĽ�
        //��θ���?
        //month==3 || month==4 || month==5
		/*
		if(month<1 || month>12) {
			System.out.println("�·���������");
		}else if(month==3 || month==4 || month==5) {
			System.out.println("����");
		}else if(month==6 || month==7 || month==8) {
			System.out.println("�ļ�");
		}else if(month==9 || month==10 || month==11) {
			System.out.println("�＾");
		}else {
			System.out.println("����");
		}
		*/

        //���ʱ���Ѿ������ˡ�
        //���ǣ������жϵ������϶࣬����˵���ϰ�����°��ꡣ
        //�жϵ������Ƚ϶�Ļ���������ʵ�����Կ���ͨ�������һ����ʽ���б��
        //(month>=3 && month<=5)
        //���һ����Χ���ж�
        if (month < 1 || month > 12) {
            System.out.println("�·���������");
        } else if (month >= 3 && month <= 5) {
            System.out.println("����");
        } else if (month >= 6 && month <= 8) {
            System.out.println("�ļ�");
        } else if (month >= 9 && month <= 11) {
            System.out.println("�＾");
        } else {
            System.out.println("����");
        }
    }
}
