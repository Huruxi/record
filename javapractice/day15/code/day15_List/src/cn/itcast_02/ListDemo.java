package cn.itcast_02;

import java.util.ArrayList;
import java.util.List;

/*
 * List���ϵ����й��ܣ�
 * 		void add(int index,Object obj):��ָ������λ�����Ԫ��
 *		Object remove(int index):ɾ��ָ������λ�õ�Ԫ�أ�����ɾ������Ԫ��ֵ����
 *		Object get(int index):���ݸ�������������Ԫ��
 *		Object set(int index,E element):�޸�ָ����������Ԫ��Ϊ������Ԫ�أ������ر��޸ĵ�ֵ
 */
public class ListDemo {
    public static void main(String[] args) {
        // ��������
        // Collection c = new ArrayList();
        List list = new ArrayList();

        // ���Թ���
        list.add("hello");
        list.add("world");
        list.add("java");

        // void add(int index,Object obj):��ָ������λ�����Ԫ��
        // list.add(1, "android");
        // list.add(3, "android");
        // list.add(4, "android"); //������

        // Object remove(int index):ɾ��ָ������λ�õ�Ԫ�أ�����ɾ������Ԫ��ֵ����
        // System.out.println("remove:" + list.remove(1));

        // Object get(int index):���ݸ�������������Ԫ��
        // System.out.println("get:" + list.get(1));

        // Object set(int index,E element):�޸�ָ����������Ԫ��Ϊ������Ԫ�أ������ر��޸ĵ�ֵ
        System.out.println("set:" + list.set(1, "android"));

        System.out.println("list:" + list);
    }
}
