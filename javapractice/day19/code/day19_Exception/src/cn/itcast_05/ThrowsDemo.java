package cn.itcast_05;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * throws:���ڷ����ϣ��׳��쳣���õ�����ȥ����
 */
public class ThrowsDemo {
    public static void main(String[] args) {
        // show();
        try {
            show2();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public static void show() throws ArithmeticException {
        int a = 10;
        int b = 0;
        System.out.println(a / b);
    }

    public static void show2() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date d = sdf.parse("2012-03-04");
        System.out.println(d);
    }
}
