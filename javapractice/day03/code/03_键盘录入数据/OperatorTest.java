/*
	���󣺼���¼���������ݣ�����������������ͣ��������
	
	������
		A:����¼�����ݣ�ͨ��Scannerʵ�֡�
			����	import java.util.Scanner;
			��������	Scanner sc = new Scanner(System.in);
			��ȡ����	int i = sc.nextInt();

		B:¼����������
			���Ծ���int i = sc.nextInt();�����Ρ��ֱ��ò�ͬ�ı�������
				int i = sc.nextInt();
				int j = sc.nextInt();

		C:���������ݵĺ�
			int sum = i + j;

		D:������
			System.out.println(sum);
*/

import java.util.Scanner;

class OperatorTest {
    public static void main(String[] args) {
        //��������¼�����
        Scanner sc = new Scanner(System.in);

        //¼������
        System.out.println("�������һ�����ݣ�");
        int firstNumber = sc.nextInt();
        System.out.println("������ڶ������ݣ�");
        int secondNumber = sc.nextInt();

        //���ӷ�
        int sum = firstNumber + secondNumber;

        //������
        System.out.println("���ݺ��ǣ�" + sum);
    }
}
