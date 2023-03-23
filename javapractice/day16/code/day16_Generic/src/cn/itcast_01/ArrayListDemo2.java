package cn.itcast_01;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * ��������ڶ��弯�ϵ�ʱ��ȥ��ȷ���ϵ�Ԫ��������?
 * ���ʱ�򣬴�JDK5�Ժ󣬾��ṩ��һ���µļ���������
 * ���ͣ�����ȷ�������͵Ĺ����Ƴٵ��˴���������ߵ��÷�����ʱ��ȥ���ġ�
 * ��ʽ��
 * 		<> �������͡�
 * ��������Щ�ط�ʹ�÷�����?
 * 		һ������ڼ����г������鿴API������࣬�����࣬�ӿں��������<?>��˵��Ҫ�÷��͡�
 *
 * ���͵ĺô���
 * 		A:����˳���İ�ȫ��
 * 		B:������������������ת�Ƶ��˱�����
 * 		C:ʡȥ������ǿת���鷳
 *
 * ��ϰ��
 * 		��ArrayList�洢�Զ�����󣬲����������뷺�͡�
 */
public class ArrayListDemo2 {
    public static void main(String[] args) {
        // �洢�ַ���������
        ArrayList<String> array = new ArrayList<String>();

        // ��Ӽ���
        array.add("hello");
        array.add("world");
        array.add("java");
        // array.add(100);

        // ����
        Iterator<String> it = array.iterator();
        while (it.hasNext()) {
            // String s = (String) it.next();
            String s = it.next();
            System.out.println(s);
        }
        System.out.println("-----------------");

        for (int x = 0; x < array.size(); x++) {
            String s = array.get(x);
            System.out.println(s);
        }
    }
}
