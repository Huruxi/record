package cn.itcast_04;

import java.util.Arrays;

/*
 * �������Լ��������ֽ�ƴ��һ������
 * ��һ���ֽڿ϶��Ǹ������ڶ����������������󲿷��Ǹ�����
 */
public class StringDemo {
    public static void main(String[] args) {
        // hello���
        // String s = "hello";
        // byte[] bys = s.getBytes();
        // // [104, 101, 108, 108, 111]
        // System.out.println(Arrays.toString(bys));

        String ss = "�Ұ�������ϼ";
        byte[] bys = ss.getBytes();
        // [-50, -46, -80, -82, -60, -29, -63, -42, -57, -32, -49, -68]
        System.out.println(Arrays.toString(bys));
    }
}