package cn.itcast_04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * Iterator iterator()
 * 		boolean hasNext():�Ƿ�����һ��Ԫ��
 * 		Object next():��ȡ��һ��Ԫ��,���Զ��ƶ�����һ��λ�õȴ�
 *
 * 		NoSuchElementException:û��������Ԫ���쳣��
 * 		ԭ���ǣ����Ѿ���ȡ��Ԫ�ص�ĩβ�ˣ��㻹Ҫ��ȡԪ�أ��Ѿ�û��Ԫ���ˣ����Ա���
 */
public class IteratorDemo {
    public static void main(String[] args) {
        // �������϶���
        Collection c = new ArrayList();

        // ����Ԫ�ز����Ԫ��
        c.add("hello");
        c.add("world");
        c.add("java");

        // �����еķ�����Iterator iterator()
        Iterator it = c.iterator();// �ұ���ʵ�ǽӿڵ�ʵ����������Ƕ�̬��Ӧ��

        // System.out.println(it.next());
        // System.out.println(it.next());
        // System.out.println(it.next());
        // System.out.println(it.next());
        // ����һ������ѭ��ʵ��
        while (it.hasNext()) {
            // System.out.println(it.next());
            String s = (String) it.next();
            System.out.println(s);
        }
    }
}
