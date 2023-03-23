package cn.itcast_01;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * List:
 * 		ArrayList:
 * 			�ײ����ݽṹ�����飬��ѯ�죬��ɾ��
 * 			�̲߳���ȫ��Ч�ʸ�
 * 		Vector:
 * 			�ײ����ݽṹ�����飬��ѯ�죬��ɾ��
 * 			�̰߳�ȫ��Ч�ʵ�
 * 		LinkedList:
 * 			�ײ����ݽṹ��������ѯ������ɾ��
 * 			�̲߳���ȫ��Ч�ʸ�
 *
 * �����⣺ArrayList��Vector��LinkedList�ĸ����ص�?
 *
 * ˼���⣺ArrayList��Vector��LinkedList���ǵ���ʹ��˭��?
 * 			�����
 *
 * 			Ҫ��ȫ��?
 * 				Ҫ��Vector(�������Ҳ�����ã���Collections�������µķ�ʽ)
 * 				��Ҫ��ArrayList��LinkedList
 * 					��ѯ�ࣺArrayList
 * 					��ɾ�ࣺLinkedList
 *
 * 		��֪�����ĸ�������ArrayList��
 *
 * ������ArrayList�洢�ַ���������
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList array = new ArrayList();

        array.add("hello");
        array.add("world");
        array.add("java");

        // ������
        Iterator it = array.iterator();
        while (it.hasNext()) {
            String s = (String) it.next();
            System.out.println(s);
        }
        System.out.println("--------------");

        // ��ͨfor
        for (int x = 0; x < array.size(); x++) {
            String s = (String) array.get(x);
            System.out.println(s);
        }

    }
}
