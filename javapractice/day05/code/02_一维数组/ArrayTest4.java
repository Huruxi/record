/*
	������(���ݼ���¼������,���Ҷ�Ӧ����)
*/

import java.util.Scanner;

class ArrayTest4 {
    public static void main(String[] args) {
        //1,2,3,4,5,6,7
        //����һ������
        String[] strArray = {"", "����һ", "���ڶ�", "������", "������", "������", "������", "������"};

        //��������¼�����
        Scanner sc = new Scanner(System.in);

        System.out.println("������һ������(1~7)��");
        int week = sc.nextInt();

        //��εõ�������?
        System.out.println("����õ����ǣ�" + strArray[week]);
    }
}
