/*
	����¼��һ������n(1<=n<=9)�������Ӧ��nn�˷���
*/

import java.util.Scanner;

class MethodTest4 {
    public static void main(String[] args) {
        //��������¼�����
        Scanner sc = new Scanner(System.in);

        //����¼������
        System.out.println("������һ��������(1~9)");
        int n = sc.nextInt();

        //���ù��ܣ����nn�˷���
        printNN(n);
    }

    /*
        �����Ӧ��nn�˷���

        ����ֵ���ͣ�
            void
        �����б�
            int n
    */
    public static void printNN(int n) {
        for (int x = 1; x <= n; x++) {
            for (int y = 1; y <= x; y++) {
                System.out.print(y + "*" + x + "=" + x * y + "\t");
            }
            System.out.println();
        }
    }
}