package cn.itcast_04;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/*
 * ListIterator listIterator()
 * ͨ���鿴API������֪���б�������̳��Ե����������ԣ����;���hasNext()������next()����
 */
public class ListIteratorDemo {
    public static void main(String[] args) {
        // �������϶���
        List list = new ArrayList();

        // ���Թ���
        list.add("hello");
        list.add("world");
        list.add("java");

        // ʹ�÷���
        // ListIterator listIterator()
        ListIterator lit = list.listIterator(); // ��̬
        while (lit.hasNext()) {
            String s = (String) lit.next();
            System.out.println(s);
        }
    }
}
