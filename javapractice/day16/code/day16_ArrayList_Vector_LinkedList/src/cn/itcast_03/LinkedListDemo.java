package cn.itcast_03;

import java.util.LinkedList;

/*
 * LinkedList�����й��ܣ�
 * 		A:��ӹ���
 * 			void addFirst()
 * 			void addLast()
 * 		B:�Ƴ�����
 * 			Object removeFirst()
 * 			Object removeLast()
 * 		C:��ȡ����
 * 			Object getFirst()
 * 			Object getLast()
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        // �������϶���
        LinkedList link = new LinkedList();

        // ���Ԫ��
        link.add("hello");
        link.add("world");
        link.add("java");

        // void addFirst()
        // void addLast()
        // link.addFirst("android");
        // link.addLast("javaee");

        // Object removeFirst()
        // Object removeLast()
        // System.out.println("removeFirst:" + link.removeFirst());
        // System.out.println("removeLast:" + link.removeLast());

        // Object getFirst()
        // Object getLast()
        System.out.println("getFirst:" + link.getFirst());
        System.out.println("getLast:" + link.getLast());

        System.out.println("link:" + link);
    }
}
