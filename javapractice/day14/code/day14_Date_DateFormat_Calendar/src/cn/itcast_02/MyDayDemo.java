package cn.itcast_02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
 * ��һ��������������������?
 * ������
 * 		A:����¼����ĳ���������
 * 		B:������ַ���ת��Ϊһ������
 * 		C:ͨ�����ڻ�ȡ��һ������ֵ
 * 		D:��ȡ��ǰʱ��ĺ���ֵ
 * 		E:��D-C�õ�һ������ֵ
 * 		F:��E�õ��ĺ���ֵ�����һ���켴��
 */

public class MyDayDemo {
    public static void main(String[] args) throws ParseException {
        // ����¼����ĳ���������
        Scanner sc = new Scanner(System.in);
        System.out.println("��������ĳ������ڣ�(yyyy-mm-dd)");
        String s = sc.nextLine();

        // ������ַ���ת��Ϊһ������
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
        Date d = sdf.parse(s);

        // ͨ�����ڻ�ȡ��һ������ֵ
        long myTime = d.getTime();

        // ��ȡ��ǰʱ��ĺ���ֵ
        long time = System.currentTimeMillis();

        // ��D-C�õ�һ������ֵ
        long dateTime = time - myTime;

        // �ѵõ��ĺ���ֵ�����һ���켴��
        System.out.println("��������������Ѿ���" + (dateTime / 1000 / 60 / 60 / 24)
                + "����");
    }
}
