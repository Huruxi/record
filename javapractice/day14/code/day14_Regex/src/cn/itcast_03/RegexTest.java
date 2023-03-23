package cn.itcast_03;

import java.util.Arrays;

/*
 * ��������һ���ַ���:��91 27 46 38 50��
 * ��д����ʵ�������������ǣ���27 38 46 50 91��
 *
 * ������
 * 		A:����һ���ַ���
 * 		B:���տո���зָ��ַ������õ�һ���ַ�������
 * 		C:���ַ�������ת��Ϊ��������
 * 		D:�����������������
 * 		E:����������������ת�����ַ���
 */
public class RegexTest {
    public static void main(String[] args) {
        // ����һ���ַ���
        String s = "91 27 46 38 50";

        // ���տո���зָ��ַ������õ�һ���ַ�������
        String[] strArray = s.split(" ");

        // ���ַ�������ת��Ϊ��������
        int[] arr = new int[strArray.length];
        for (int x = 0; x < arr.length; x++) {
            arr[x] = Integer.parseInt(strArray[x]);
        }

        // �����������������
        Arrays.sort(arr);

        // ����������������ת�����ַ���
        StringBuilder sb = new StringBuilder();
        for (int x = 0; x < arr.length; x++) {
            if (x == arr.length - 1) {
                sb.append(arr[x]);
            } else {
                sb.append(arr[x]).append(" ");
            }
        }
        String result = sb.toString();

        System.out.println(result);
    }
}
