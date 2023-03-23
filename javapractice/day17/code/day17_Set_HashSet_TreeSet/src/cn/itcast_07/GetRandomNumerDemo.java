package cn.itcast_07;

import java.util.HashSet;

/*
 * Set�������ǽ������������ࡣһ������ʹ��˭��?
 * 		Ҫ������?
 * 			Ҫ��TreeSet
 * 			��Ҫ��HashSet
 * ����Ҳ��֪���ǲ���Ҫ������HashSet��
 *
 * ��дһ�����򣬻�ȡ10��1��20���������Ҫ������������ظ���
 *
 * ������
 * 		A:����HashSet���ϣ��洢Integer���͵�����
 * 		B:ֱ���жϼ��ϵĳ���
 * 			С��10������������������洢
 * 		C:��������
 */
public class GetRandomNumerDemo {
    public static void main(String[] args) {
        // ����HashSet���ϣ��洢Integer���͵�����
        HashSet<Integer> hs = new HashSet<Integer>();

        // ֱ���жϼ��ϵĳ���
        while (hs.size() < 10) {
            // ���������
            int number = (int) (Math.random() * 20) + 1;
            hs.add(number);
        }

        // ��������
        for (Integer i : hs) {
            System.out.println(i);
        }
    }
}
