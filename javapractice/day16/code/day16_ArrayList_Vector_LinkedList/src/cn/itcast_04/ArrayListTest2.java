package cn.itcast_04;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * ȥ���������ַ������ظ�ֵ(�ַ�����������ͬ)
 * ������
 * 		hello,world,java,android,world,java,javaee,java,java,java,android
 * �����
 * 		hello,world,java,android,javaee
 *
 * �����������ѡ������˼��һ����
 */
public class ArrayListTest2 {
    public static void main(String[] args) {
        // ���弯�ϣ��洢���ظ���Ԫ��
        ArrayList array = new ArrayList();
        array.add("hello");
        array.add("world");
        array.add("java");
        array.add("android");
        array.add("world");
        array.add("java");
        array.add("javaee");
        array.add("java");
        array.add("java");
        array.add("java");
        array.add("android");

        for (int x = 0; x < array.size() - 1; x++) {
            for (int y = x + 1; y < array.size(); y++) {
                if (array.get(y).equals(array.get(x))) {
                    array.remove(y);
                    y--; // ��Ԫ��ɾ���󣬻�Ҫ�͵�ǰλ�õıȽ�һ��
                }
            }
        }

        // ��������
        Iterator it = array.iterator();
        while (it.hasNext()) {
            String s = (String) it.next();
            System.out.println(s);
        }
    }
}
