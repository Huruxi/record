package cn.itcast_02;

import java.util.Enumeration;
import java.util.Vector;

/*
 * ���й��ܣ�
 * 		A:���Ԫ��
 * 			public void addElement(Object obj)		--		add(Object obj)
 * 		B:��ȡԪ��
 *			public Object elementAt(int index)		--		get(int index)
 *			public Enumeration elements()			--		Iterator iterator()
 *						hasMoreElements()							hasNext()
 *						nextElement()								next()
 *
 *		JDK�汾������
 *			A:��ȫ
 *			B:Ч��
 *			C:����д
 */
public class VectorDemo {
    public static void main(String[] args) {
        // �������϶���
        // Collection c = new Vector();
        // List list = new Vector();

        Vector v = new Vector();

        // public void addElement(Object obj)
        v.addElement("hello");
        v.addElement("world");
        v.addElement("java");

        // public Object elementAt(int index)
        // System.out.println(v.elementAt(0));
        // System.out.println(v.elementAt(1));
        // System.out.println(v.elementAt(2));
        // ��ͨfor
        // for (int x = 0; x < v.size(); x++) {
        // String s = (String) v.elementAt(x);
        // System.out.println(s);
        // }

        // ���Ƶ������ķ�ʽ
        Enumeration en = v.elements();
        while (en.hasMoreElements()) {
            String s = (String) en.nextElement();
            System.out.println(s);
        }

        System.out.println("v:" + v);
    }
}
