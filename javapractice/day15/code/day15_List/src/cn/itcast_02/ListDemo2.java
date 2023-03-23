package cn.itcast_02;

import java.util.ArrayList;
import java.util.List;

/*
 * List���ϵ����б�������ͨforѭ��
 * size()������get()�������ʹ��
 */
public class ListDemo2 {
    public static void main(String[] args) {
        // �������϶���
        List list = new ArrayList();

        // ���Թ���
        list.add("hello");
        list.add("world");
        list.add("java");

        // get(int index)
        // System.out.println(list.get(0));
        // System.out.println(list.get(1));
        // System.out.println(list.get(2));
        // System.out.println(list.get(3)); // IndexOutOfBoundsException

        for (int x = 0; x < list.size(); x++) {
            // System.out.println(list.get(x));
            String s = (String) list.get(x);
            System.out.println(s);
        }
    }
}
