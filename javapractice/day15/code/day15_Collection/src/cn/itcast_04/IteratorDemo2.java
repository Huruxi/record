package cn.itcast_04;

import java.util.ArrayList;
import java.util.Collection;

public class IteratorDemo2 {
    public static void main(String[] args) {
        // �������϶���
        Collection c = new ArrayList();

        // ����Ԫ�ز����Ԫ��
        c.add("hello");
        c.add("world");
        c.add("java");

        // ����
        // Iterator it = c.iterator();
        // while (it.hasNext()) {
        // String s = (String) it.next();
        // System.out.println(s);
        // }

        // forѭ���Ľ�
        // for (Iterator it = c.iterator(); it.hasNext();) {
        // String s = (String) it.next();
        // System.out.println(s);
        // }
    }
}
