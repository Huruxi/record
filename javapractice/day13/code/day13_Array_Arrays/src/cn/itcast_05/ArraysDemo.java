package cn.itcast_05;

import java.util.Arrays;

/*
 * Arrays:���������в����Ĺ����ࡣ�ṩ�����򣬲��ҵȹ��ܡ�
 *
 * ��Ա������
 * 		public static String toString(int[] a):������ת���ַ���
 *		public static void sort(int[] a):����(��������)
 *		public static int binarySearch(int[] a,int key):���ֲ���
 *
 * ע�⣺
 * 		������鱾��������ģ�����ֱ��ʹ�ö��ֲ��ҡ�
 * 		���ң��������ٶ���Ҳ��������ģ���Ϊ�����͸ı���������Ԫ��ԭʼ������λ�á�
 */
public class ArraysDemo {
    public static void main(String[] args) {
        int[] arr = {24, 13, 69, 80, 57};

        // System.out.println(arr);// [I@a0834e7

        // public static String toString(int[] a):������ת���ַ���
        System.out.println(Arrays.toString(arr)); // [24, 13, 69, 80, 57]

        // public static void sort(int[] a):����(��������)
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); // [13, 24, 57, 69, 80]

        // public static int binarySearch(int[] a,int key):���ֲ���
        // [13, 24, 57, 69, 80]
        System.out.println(Arrays.binarySearch(arr, 24));
        System.out.println(Arrays.binarySearch(arr, 244)); // ??? -6
    }
}
