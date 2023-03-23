package cn.itcast_04;

import java.util.TreeSet;

/*
 * TreeSet:�ײ����ݽṹ�Ƕ�������
 * ������Ԫ�����������ַ������ֱ��ǣ���Ȼ�����Լ�Comparator(�Ƚ���)��������,����ʹ�������������ʹ�õĹ��췽����
 */
public class TreeSetDemo {
    public static void main(String[] args) {
        // 20,18,23,22,17,24,19,18,24
        // ����һ���µĿ� set���� set ������Ԫ�ص���Ȼ˳���������
        TreeSet<Integer> ts = new TreeSet<Integer>();

        // �洢Ԫ��
        ts.add(20);
        ts.add(18);
        ts.add(23);
        ts.add(22);
        ts.add(17);
        ts.add(24);
        ts.add(19);
        ts.add(18);
        ts.add(24);

        // ��������
        for (Integer i : ts) {
            System.out.println(i);
        }
    }
}
