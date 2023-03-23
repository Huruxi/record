package cn.itcast_02;

import java.util.Scanner;

/*
 * ��Ա������
 * 		hasNextXxx():�ж���һ���������ǲ���ָ������������
 * 		nextXxx():��ȡ�����͵�����
 *
 * ע�⣺
 * 		����¼�����ݣ���Ҫ����int���ͣ���ȴ����һ���ַ�����
 * 		�ڿ���̨����ʾ��InputMismatchException	���벻ƥ���쳣��
 *
 */
public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("������һ��������");

        if (sc.hasNextInt()) {
            int number = sc.nextInt();
            System.out.println(number);
        }

        System.out.println("over");
    }
}
