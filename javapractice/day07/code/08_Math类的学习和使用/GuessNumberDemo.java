/*
	���󣺲�����С��Ϸ
	
	������
		A:ϵͳ����һ��1-100֮����������
			int number = (int)(Math.random()*100)+1;
		B:����¼������,��Scannerʵ��
		C:�����������ݽ��бȽ�
			��	��ʾ����
			С	��ʾС��
			��	��ϲ�㣬������
		D:Ϊ�˱�֤�����ܹ����У����Ǿͼ���ѭ����ʵ�ֶ�β¡�ֱ�����С�
*/

import java.util.Scanner;

class GuessNumberDemo {
    public static void main(String[] args) {
        //ϵͳ����һ��1-100֮����������
        int number = (int) (Math.random() * 100) + 1;

        while (true) {
            //����¼������,��Scannerʵ��
            Scanner sc = new Scanner(System.in);
            System.out.println("������һ�����ݣ�(1-100)");
            int guessNumber = sc.nextInt();

            //�����������ݽ��бȽ�
            if (guessNumber > number) {
                System.out.println("��µ�����" + guessNumber + "����");
            } else if (guessNumber < number) {
                System.out.println("��µ�����" + guessNumber + "С��");
            } else {
                System.out.println("��ϲ�㣬������");
                break;
            }
        }

    }
}
