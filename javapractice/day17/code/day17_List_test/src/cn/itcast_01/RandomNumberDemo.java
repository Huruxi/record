package cn.itcast_01;

import java.util.ArrayList;

/*
 * ���󣺻�ȡ10��1-20֮����������Ҫ�����ظ�
 *
 * ������
 * 		A:����һ�����ϣ����ڴ洢�����������
 * 		B:����һ��ͳ�Ʊ�������ʼֵ��0
 * 		C:�ж�ͳ�Ʊ����Ƿ�С��10
 * 			�ǣ�
 * 				����һ�������Ȼ���ж����ڼ�����
 * 					�ǣ������
 * 					����ӵ�����
 * 			�񣺽���
 * 		D:��������
 */
public class RandomNumberDemo {
    public static void main(String[] args) {
        // ����һ�����ϣ����ڴ洢�����������
        ArrayList<Integer> array = new ArrayList<Integer>();

        // ����һ��ͳ�Ʊ�������ʼֵ��0
        int count = 0;

        // �ж�ͳ�Ʊ����Ƿ�С��10
        while (count < 10) {
            // ����һ�������Ȼ���ж����ڼ�����
            int randomNumber = (int) (Math.random() * 20) + 1;

            if (!array.contains(randomNumber)) {
                array.add(randomNumber);
                count++;
            }
        }

        // ��������
        for (Integer i : array) {
            System.out.println(i);
        }
    }
}
