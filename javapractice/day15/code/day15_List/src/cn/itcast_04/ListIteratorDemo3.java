package cn.itcast_04;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/*
 * ��������һ�����ϣ�����������Ԫ��"hello","world","java",��д����ʵ�����²���
 * 	         �ж������������û��Ԫ��Ϊworld�ģ�����У������һ��Ԫ��Android��
 *
 * ������
 * 		A:����һ�����ϣ�����Ӷ��Ԫ��
 * 		B:�������ϣ���ȡ��ÿһ��Ԫ��
 * 		C:�ж�Ԫ����û����"world"�ģ�����У��������������һ����Ԫ��android
 * 		D:ֱ�������������
 *
 * ConcurrentModificationException:�����޸��쳣��
 *
 * ԭ��
 * 		�������������ڼ��϶����ڵģ������õ������������ϵ�ʱ����������������ģ�
 * 		���Ǿ�ͨ�����ϵ���add()���������һ��Ԫ�أ�Ҳ����˵���ʱ�򣬼��Ϸ����˸ı䣬
 * 		����������û�з����ı䣬�����Ͳ�����������⡣
 * 		����������Ҫԭ��ͨ��������ȥ�������ϵ�ʱ�򣬲�����ͨ������ȥ������
 *
 * ���������
 * 		A:�����õ���������������ͨforѭ������
 * 			Ԫ����ӵ��˼��ϵ�ĩβ��
 * 		B:ʹ���б������������ʹ�õ����������Ҳʹ�õ�����
 * 			���������Ԫ�ؾ���ӵ�����
 */
public class ListIteratorDemo3 {
    public static void main(String[] args) {
        // ����һ�����ϣ�����Ӷ��Ԫ��
        List list = new ArrayList();
        list.add("hello");
        list.add("world");
        list.add("java");

        // �������ϣ���ȡ��ÿһ��Ԫ��
        // Iterator it = list.iterator();
        // while (it.hasNext()) {
        // String s = (String) it.next();
        // // �ж�Ԫ����û����"world"�ģ�����У��������������һ����Ԫ��android
        // if ("world".equals(s)) {
        // list.add("android");
        // // it = list.iterator();
        // }
        // }

        // ��ͨfor
        // for (int x = 0; x < list.size(); x++) {
        // String s = (String) list.get(x);
        // if ("world".equals(s)) {
        // list.add("android");
        // }
        // }

        // ʹ���б������
        ListIterator lit = list.listIterator();
        while (lit.hasNext()) {
            String s = (String) lit.next();
            if ("world".equals(s)) {
                lit.add("android");
            }
        }

        // ֱ�������������
        System.out.println("list:" + list);
    }
}
