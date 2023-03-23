package cn.itcast_03;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarTest {
    public static void main(String[] args) {
        // ��ȡ����һ��Ķ����ж�����?
        Calendar c = Calendar.getInstance();

        // ����������
        Scanner sc = new Scanner(System.in);
        System.out.println("��������Ҫ��ȡ��һ���2�·ݣ�");
        int year = sc.nextInt();

        c.set(year, 2, 1); // ����һ���3��1��
        c.add(Calendar.DATE, -1); // ����һ���2�����һ��

        System.out.println(c.get(Calendar.DATE));
    }
}
