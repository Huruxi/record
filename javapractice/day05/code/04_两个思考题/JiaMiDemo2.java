/*
	A:��ʵ�ֵĴ���Ľ�Ϊ����ʵ��
	B:����¼���
*/

import java.util.Scanner;

class JiaMiDemo2 {
    public static void main(String[] args) {
        //��������¼�����
        Scanner sc = new Scanner(System.in);

        //����¼������
        System.out.println("����������(С��8λ������)��");
        int number = sc.nextInt();

        jiaMi(number);
    }

    public static void jiaMi(int number) {
        int[] arr = new int[8];

        //��һ��
        int index = 0;

        while (number > 0) {
            arr[index++] = number % 10;
            number /= 10;
        }

        //�ڶ���
        for (int x = 0; x < index; x++) {
            arr[x] += 5;
            arr[x] %= 10;
        }

        //������
        int temp = arr[0];
        arr[0] = arr[index - 1];
        arr[index - 1] = temp;

        //���
        for (int x = 0; x < index; x++) {
            System.out.print(arr[x]);
        }
        System.out.println();
    }
}
