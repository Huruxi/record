package cn.itcast_01;

import java.util.ArrayList;
import java.util.Collections;

/*
 * Collections������Լ��Ͻ��в����Ĺ����ࡣ�������������Ͳ��ҵȷ�����
 * ������?
 * 		Collections��Collection������?
 * 		Collections:����Լ��Ͻ��в����Ĺ����࣬����������Ͳ��ҵȹ��ܡ�
 * 		Collection:�ǵ��м��ϵĶ���ӿڣ������˵��м��ϵĹ��Թ��ܡ�
 *
 * ���յĹ��ܣ�
 * 		public static <T> void sort(List<T> list):����
 *		public static <T> int binarySearch(List<?> list,T key):���ֲ���
 *		public static <T> T max(Collection<?> coll):���ֵ
 *		public static void reverse(List<?> list):��ת
 *		public static void shuffle(List<?> list):����û�
 */
public class CollectionsDemo {
    public static void main(String[] args) {
        // �������϶���
        ArrayList<Integer> array = new ArrayList<Integer>();

        // ���Ԫ��
        array.add(30);
        array.add(20);
        array.add(50);
        array.add(10);
        array.add(40);

        System.out.println("array:" + array);

        // public static <T> void sort(List<T> list):����
        // Collections.sort(array);
        // System.out.println("array:" + array);
        // [10, 20, 30, 40, 50]

        // public static <T> int binarySearch(List<?> list,T key):���ֲ���
        // int index = Collections.binarySearch(array, 30);
        // System.out.println(index);

        // public static <T> T max(Collection<?> coll):���ֵ
        // Integer max = Collections.max(array);
        // System.out.println(max);

        // public static void reverse(List<?> list):��ת
        // Collections.reverse(array);
        // System.out.println("array:" + array);

        // public static void shuffle(List<?> list):����û�
        Collections.shuffle(array);
        System.out.println("array:" + array);
    }
}
