package cn.itcast_03;

import java.util.LinkedHashSet;

/*
 * LinkedHashSet���ײ����ݽṹ�ǹ�ϣ�������
 * ��ϣ���ܹ���֤Ԫ�ص�Ψһ��
 * �����ܹ���֤Ԫ������
 */
public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> link = new LinkedHashSet<String>();

        link.add("ccc");
        link.add("hello");
        link.add("bbb");
        link.add("world");
        link.add("aaa");
        link.add("java");
        link.add("aaa");
        link.add("java");

        System.out.println("link:" + link);
    }
}
