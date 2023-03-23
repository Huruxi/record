package cn.itcast_02;

/*
 * ��̬���룺
 * 		��ʽ��import static xxx.xxx.xxx.����.������;
 *
 * ע�⣺
 * 		A:���������Ǿ�̬��
 * 		B:����ж��ͬ���ľ�̬���������ײ�֪��ʹ��˭?���ʱ��Ҫʹ�ã������ǰ׺���ɴ˿ɼ������岻������һ�㲻�ã�����Ҫ�ܿ�����
 */

import static java.lang.Math.abs;
import static java.lang.Math.max;

public class StaticImportDemo {
    public static void main(String[] args) {
        // System.out.println(java.lang.Math.abs(-12));
        // System.out.println(java.lang.Math.max(12, 23));

        // System.out.println(Math.abs(-12));
        // System.out.println(Math.max(12, 23));

        System.out.println(abs(-12));
        System.out.println(java.lang.Math.max(12, 23));
    }

    public static boolean max(int a, int b) {
        return a == b;
    }
}
