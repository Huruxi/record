package cn.itcast_01;

import java.util.ArrayList;

/*
 * ��ǿfor����forѭ����һ�ָ�ʽ��
 * ��ʽ��
 * 		for(Ԫ���������� ������ : ����������Collection����) {
 * 			ֱ��ʹ�ñ������Ϳ����ˣ�����ı�������ʵ����������߼����е�Ԫ�ء�
 * 		}
 * �ô���
 * 		���������Collection���ϵı�����
 *
 * ע�������ǿfor��Ŀ��Ҫ�ж��Ƿ�Ϊnull
 * ��ǿfor�������ϣ���ʵ�����������������
 *
 * Collection������������ǿfor
 * List�������ࣺ����������ǿfor����ͨfor
 */
public class ForDemo {
    public static void main(String[] args) {
        // int����
        int[] arr = {1, 2, 3, 4, 5};
        // ��ǿfor
        for (int x : arr) {
            System.out.println(x);
        }
        System.out.println("-----------------");

        String[] strArray = {"hello", "world", "java"};
        // ��ǿfor
        for (String str : strArray) {
            System.out.println(str);
        }
        System.out.println("-----------------");

        ArrayList<String> array = new ArrayList<String>();
        array.add("hello");
        array.add("world");
        array.add("java");
        // ��ǿfor
        for (String s : array) {
            System.out.println(s);
        }

        //NullPointerException
        // array = null;
        // for (String s : array) {
        // System.out.println(s);
        // }


        // for (String s : array) {
        // //ConcurrentModificationException
        // array.add("hello");
        // }
    }
}
