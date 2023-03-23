/*
	����¼���������ݣ���ȡ�����������е����ֵ

	������
		A:����¼������
		B:�жϣ���if���ʵ��
		C:������

	��ϰ��
		����¼���������ݣ��Ƚ������������Ƿ����
		��if���ʵ�֡�
*/

import java.util.Scanner;

class IfTest {
    public static void main(String[] args) {
        //��������¼�����
        Scanner sc = new Scanner(System.in);

        //����¼������
        System.out.println("�������һ�����ݣ�");
        int firstNumber = sc.nextInt();
        System.out.println("������ڶ������ݣ�");
        int secondNumber = sc.nextInt();

        //��if���ʵ��

        //��ʽ1��ֱ�Ӱѽ�����
        if (firstNumber > secondNumber) {
            System.out.println("�ϴ��ֵ�ǣ�" + firstNumber);
        } else {
            System.out.println("�ϴ��ֵ�ǣ�" + secondNumber);
        }
        System.out.println("-----------------------------");

        //��ʽ2���ѽ����������
		/*
		������������������,����������
		if(firstNumber > secondNumber) {
			int max = firstNumber;
		}else {
			int max = secondNumber;
		}
		*/

        int max;
        if (firstNumber > secondNumber) {
            max = firstNumber;
        } else {
            max = secondNumber;
        }
        System.out.println("�ϴ��ֵ�ǣ�" + max);
    }
}
