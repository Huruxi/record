package cn.itcast_03;

import java.util.Calendar;

/*
 * Calendar:��ʱ��ָ����һ�������꣬�£��գ�ʱ���֣���ȡ������Ҫ�õ�һ��������������ʱ���룬��Ҫ�����Լ�ƴ���ݡ�
 *
 * ��������	---		�꣬�£��գ�ʱ���֣���
 *
 * public int get(int field):���ظ��������ֶε�ֵ��
 */
public class CalendarDemo {
    public static void main(String[] args) {
        // ��������
        // �����ֶ����ɵ�ǰ���ں�ʱ���ʼ����
        Calendar rightNow = Calendar.getInstance(); // ��̬

        // ��ȡ��
        int year = rightNow.get(Calendar.YEAR);
        System.out.println(year);
        // ��ȡ��
        int month = rightNow.get(Calendar.MONTH);
        System.out.println(month + 1);
        // ��ȡ��
        int date = rightNow.get(Calendar.DATE);
        System.out.println(date);
        // ��ȡʱ
        int hour = rightNow.get(Calendar.HOUR);
        System.out.println(hour);
        // ��ȡ��
        int minute = rightNow.get(Calendar.MINUTE);
        System.out.println(minute);
        // ��ȡ��
        int second = rightNow.get(Calendar.SECOND);
        System.out.println(second);
    }
}
