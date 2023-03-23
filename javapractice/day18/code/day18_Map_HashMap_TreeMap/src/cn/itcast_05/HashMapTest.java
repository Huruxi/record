package cn.itcast_05;

import java.util.HashMap;
import java.util.Set;

/*
 * HashMapǶ��HashMap
 *
 * ����У����
 * 	jc	������
 * 			������	31
 * 			ɳʫ��	18
 * 	jy	��ҵ��
 * 			���ȷ�	30
 * 			������	29
 * 	dsj	������
 * 			������	30
 * 			���		22
 */
public class HashMapTest {
    public static void main(String[] args) {
        // �������϶���
        HashMap<String, HashMap<String, Integer>> xaxq = new HashMap<String, HashMap<String, Integer>>();

        // ����������
        HashMap<String, Integer> jc = new HashMap<String, Integer>();
        jc.put("������", 31);
        jc.put("ɳʫ��", 18);
        // ��������ӵ�����
        xaxq.put("������", jc);

        // ��ҵ������
        HashMap<String, Integer> jy = new HashMap<String, Integer>();
        jy.put("���ȷ�", 30);
        jy.put("������", 29);
        // ��������ӵ�����
        xaxq.put("��ҵ��", jy);

        // �����ݰ�
        HashMap<String, Integer> dsj = new HashMap<String, Integer>();
        dsj.put("������", 30);
        dsj.put("���", 22);
        // ��������ӵ�����
        xaxq.put("�����ݰ�", dsj);

        // ����xaxq
        Set<String> xaxqSet = xaxq.keySet();
        for (String xaxqKey : xaxqSet) {
            System.out.println(xaxqKey);
            HashMap<String, Integer> xaxqValue = xaxq.get(xaxqKey);
            Set<String> xaxqValueSet = xaxqValue.keySet();
            for (String xaxqValuekey : xaxqValueSet) {
                Integer xaxqValueValue = xaxqValue.get(xaxqValuekey);
                System.out
                        .println("\t" + xaxqValuekey + "---" + xaxqValueValue);
            }
        }
    }
}
