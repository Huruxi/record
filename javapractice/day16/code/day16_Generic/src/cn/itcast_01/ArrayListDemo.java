package cn.itcast_01;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * ���⣺
 * 		1:�л�ɫ�����ߣ�̫�ѿ���
 * 		2:��ʵ��ɫ�����߾��Ǹ����㣬�ü���������һ������
 * 		3:����㿴������������������˻������͵�Ԫ�أ���ʵ�����������Զ�װ�䣬��ӵ�Ҳ��һ������
 *
 * �����������Ǿ�Ҫ�����ɫ���������⣬��ʵ���ǽ�����ϵİ�ȫ����?
 * ��ν����?
 * 		���ǿ��Բ��������������
 * 		String[] strArray = new String[3];
 *		strArray[0] = "hello";
 *		strArray[1] = "world";
 * 		strArray[2] = 100;
 * 		�ڶ��������ʱ���Ҿ���ȷ��������Ԫ�ص����ͣ������Ժ�����ӵ�ʱ�򣬾Ͳ�������κ����⡣
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        // �洢�ַ���������
        ArrayList array = new ArrayList();

        array.add("hello");
        array.add("world");
        array.add("java");
        // array.add(new Integer(100));
        // array.add(100); // �Զ�װ��

        Iterator it = array.iterator();
        while (it.hasNext()) {
            String s = (String) it.next();
            System.out.println(s);
            // Object obj = it.next();
            // // if (obj instanceof String) {
            // // String s = (String) obj;
            // // System.out.println(s);
            // // } else if (obj instanceof Integer) {
            // // Integer i = (Integer) obj;
            // // System.out.println(i);
            // // }
            // System.out.println(obj);
        }

//		String[] strArray = new String[3];
//		strArray[0] = "hello";
//		strArray[1] = "world";
//		strArray[2] = 100;
    }
}
