package cn.itcast_02;

import java.util.Date;

public class DateToolTest {
    public static void main(String[] args) {
        Date d = new Date();

        // ������Ҫ��ȡ������ʱ����
        System.out.println(DateTool.getRiQi(d));
        System.out.println(DateTool.getNYR(d));
        System.out.println(DateTool.getSFM(d));
    }
}