/*
	if����ʽ3��
		if(��ϵ���ʽ1) {
		     �����1;
		}else  if (��ϵ���ʽ2) {
			 �����2;
		}
		��
		else {
			 �����n+1;
		}

	ִ�����̣�
		�����жϹ�ϵ���ʽ1��������true����false
		�����true��ִ�������1
		�����false�ͼ����жϹ�ϵ���ʽ2��������true����false
		�����true��ִ�������2
		�����false�ͼ����жϹ�ϵ���ʽ����������true����false
		��
		���û���κι�ϵ���ʽΪtrue����ִ�������n+1��

	����
		����¼��ѧ���ɼ������ݳɼ�������ڵ����ۡ�
			90-100	����
			80-90	��
			70-80	��
			60-70	����
			60����	������
*/

import java.util.Scanner;

class IfDemo5 {
    public static void main(String[] args) {
        //��������¼�����
        Scanner sc = new Scanner(System.in);

        //����¼��ѧ���ɼ�
        System.out.println("������ɼ���");
        int score = sc.nextInt();

        //У�����ݵ�ʱ��һ��Ҫע�⣺
        //��ȷ����
        //��������
        //�߽�����

		/*
		if(score>=90 && score<=100) {
			System.out.println("����");
		}else if(score>=80 && score<90) {
			System.out.println("��");
		}else if(score>=70 && score<80) {
			System.out.println("��");
		}else if(score>=60 && score<70) {
			System.out.println("����");
		}else {
			System.out.println("������");
		}
		*/

        //���ʱ����Ȼ��������Ҫ���ˡ�����û�п��ǵ��������ݵ������
        //���ԣ�������Ҫ��һ���ж�
		/*
		if(score>=90 && score<=100) {
			System.out.println("����");
		}else if(score>=80 && score<90) {
			System.out.println("��");
		}else if(score>=70 && score<80) {
			System.out.println("��");
		}else if(score>=60 && score<70) {
			System.out.println("����");
		}else if(score>=0 && score<60) {
			System.out.println("������");
		}else {
			System.out.println("����ĳɼ�����");
		}
		*/

        //����Ҳ�������жϳɼ��Ƿ�����
        if (score < 0 || score > 100) {
            System.out.println("����ĳɼ�����");
        } else if (score >= 90 && score <= 100) {
            System.out.println("����");
        } else if (score >= 80 && score < 90) {
            System.out.println("��");
        } else if (score >= 70 && score < 80) {
            System.out.println("��");
        } else if (score >= 60 && score < 70) {
            System.out.println("����");
        } else {
            System.out.println("������");
        }
    }
}
