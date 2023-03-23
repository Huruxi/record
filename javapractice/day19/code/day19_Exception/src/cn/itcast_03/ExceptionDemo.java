package cn.itcast_03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * Java�е��쳣����Ϊ�����ࣺ����ʱ�쳣������ʱ�쳣�����е�RuntimeException�༰�������ʵ������Ϊ����ʱ�쳣���������쳣���Ǳ���ʱ�쳣
 *	����ʱ�쳣
 *		Java���������ʾ�����������ͻᷢ�������޷�ͨ������
 *	����ʱ�쳣
 *		������ʾ����Ҳ���Ժͱ���ʱ�쳣һ������
 *
 * �����쳣�ķ�ʽ�ر�ļ򵥣�������꼴�ɡ�
 */
public class ExceptionDemo {
    public static void main(String[] args) {
        String s = "2015-04-03 10:37:45";
        // ��д����ʵ��
        Date d = null;
        try {
            // System.out.println(10/0);
            d = stringToDate(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(d);

        System.out.println("haha");

        // System.out.println(10/0);
    }

    public static Date stringToDate(String s) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d = sdf.parse(s);
        return d;
    }
}
