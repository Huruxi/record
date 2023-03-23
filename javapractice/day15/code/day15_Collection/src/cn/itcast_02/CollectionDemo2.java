package cn.itcast_02;

import java.util.ArrayList;
import java.util.Collection;

/*
 * boolean addAll(Collection c)
 * boolean removeAll(Collection c):ɾ��һ��������ɾ��������true
 * boolean containsAll(Collection c):ȫ�����������ǰ�����
 * boolean retainAll(Collection c)
 */
public class CollectionDemo2 {
    public static void main(String[] args) {
        // ��������
        Collection c1 = new ArrayList();
        c1.add("abc1");
        c1.add("abc2");
        c1.add("abc3");
        c1.add("abc4");

        // ��������
        Collection c2 = new ArrayList();
        // c2.add("abc1");
        // c2.add("abc2");
        // c2.add("abc3");
        // c2.add("abc4");
        c2.add("abc5");
        c2.add("abc6");
        c2.add("abc7");

        // boolean addAll(Collection c)
        // System.out.println("addAll:" + c1.addAll(c2));

        // boolean removeAll(Collection c)
        // System.out.println("removeAll:" + c1.removeAll(c2));

        // boolean containsAll(Collection c)
        // System.out.println("containsAll:" + c1.containsAll(c2));

        // boolean retainAll(Collection c)
        System.out.println("retainAll:" + c1.retainAll(c2));
        /*
         * ���������������A��B����A��B������ ����Ԫ�ش洢��A���ϣ�B���ϲ������ı䡣 ����ֵ�����A�����Ƿ������ı䡣
         */

        System.out.println("c1:" + c1);
        System.out.println("c2:" + c2);
    }
}
