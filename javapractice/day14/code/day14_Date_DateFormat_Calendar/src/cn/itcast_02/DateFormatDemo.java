package cn.itcast_02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * DateFormat:��������ڽ��и�ʽ���ͽ����ĳ����ࡣ
 * ���ԣ�����ѧϰ�����ಢʹ�á�
 * SimpleDateForamt��
 * ��ʽ�������� -> �ı���
 * 		Date	--	String
 * 				public final String format(Date date)
 * 				ģʽ��������Ҫʲô��дʲô��
 * �������ı� -> ���ڣ�
 * 		String 	-- 	Date
 * 				public Date parse(String source)
 * 				ģʽ�������͸������ַ���ƥ�䡣
 */
public class DateFormatDemo {
    public static void main(String[] args) throws ParseException {
        // Date -- String
        Date d = new Date();
        // public SimpleDateFormat()
        // SimpleDateFormat sdf = new SimpleDateFormat();
        // SimpleDateFormat(String pattern)
        // SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss");
        // SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd��");
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        // public final String format(Date date)
        String result = sdf.format(d);
        System.out.println(result);
        System.out.println("-------------------------------------------------");

        String s = "2008-08-08 12:23:34";
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        // public Date parse(String source)
        Date dd = sdf2.parse(s);
        System.out.println(dd);
    }
}
