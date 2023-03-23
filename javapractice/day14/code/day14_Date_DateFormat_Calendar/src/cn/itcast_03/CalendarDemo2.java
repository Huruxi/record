package cn.itcast_03;

import java.util.Calendar;

/*
 * public void add(int field,int amount):���ݸ����������Զ���ֵ���ı�ʱ��
 * public final void set(int year,int month,int date):����������
 */
public class CalendarDemo2 {
    public static void main(String[] args) {
        // ��ȡ���������
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.YEAR) + "---"
                + (c.get(Calendar.MONTH) + 1) + "---" + c.get(Calendar.DATE));
        c.add(Calendar.YEAR, -3);
        c.add(Calendar.MONTH, 2);
        c.add(Calendar.DATE, -12);
        System.out.println(c.get(Calendar.YEAR) + "---"
                + (c.get(Calendar.MONTH) + 1) + "---" + c.get(Calendar.DATE));

        // ��д��c����ֵ
        c.set(2012, 3, 4);
        System.out.println(c.get(Calendar.YEAR) + "---"
                + (c.get(Calendar.MONTH) + 1) + "---" + c.get(Calendar.DATE));
    }
}
