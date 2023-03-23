package cn.itcast_04;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/*
 * ListIterator listIterator()
 * ��Ȼ����������������������й��ܣ�����ûʲô���壬��Ϊ������Ҫ������������������������
 */
public class ListIteratorDemo2 {
    public static void main(String[] args) {
        // �������϶���
        List list = new ArrayList();

        // ���Թ���
        list.add("hello");
        list.add("world");
        list.add("java");

        // �������
        ListIterator lit = list.listIterator();
        // while (lit.hasNext()) {
        // String s = (String) lit.next();
        // System.out.println(s);
        // }
        System.out.println("---------------");

        // �������
        while (lit.hasPrevious()) {
            String s = (String) lit.previous();
            System.out.println(s);
        }
    }
}
