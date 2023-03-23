package cn.itcast_01;

import java.util.Date;

/*
 * �� Date ��ʾ�ض���˲�䣬��ȷ�����롣
 *
 * ���췽����
 * 		public Date():Ĭ�Ͼ��ǵ�ǰʱ��
 *		public Date(long date):�Ѹ����ĺ���ֵ��ֵ�����ڶ���
 *
 * ��Ա������
 * 		public long getTime()����ȡ����ֵ
 *		public void setTime(long time):�Ѻ���ֵ��Ϊ��������
 */
public class DateDemo {
    public static void main(String[] args) {
        // ��������
        Date d = new Date();
        System.out.println("d:" + d);

        // try {
        // Thread.sleep(1000);
        // } catch (InterruptedException e) {
        // e.printStackTrace();
        // }

        long time = System.currentTimeMillis(); // ��ȡ��ǰʱ��ĺ���ֵ
        Date d2 = new Date(time);// �Ѻ���ֵת��Ϊ���ڱ�ʾ
        System.out.println("d2:" + d2);

        Date d3 = new Date(3600000);
        // 3600000/1000/60/60 = 1��Сʱ
        System.out.println("d3:" + d3);
        System.out.println("--------------------");

        Date d4 = new Date();
        // long t = d4.getTime();
        // long t2 = System.currentTimeMillis();
        // System.out.println(t);
        // System.out.println(t2);

        d4.setTime(36000000);
        System.out.println("d4:" + d4);

    }
}
