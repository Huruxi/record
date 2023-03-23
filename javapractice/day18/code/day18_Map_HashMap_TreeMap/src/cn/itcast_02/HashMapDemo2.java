package cn.itcast_02;

import java.util.HashMap;
import java.util.Set;

/*
 * HashMap<Integer,String>
 * ����Integer	ѧ��
 * ֵ��String		����
 */
public class HashMapDemo2 {
    public static void main(String[] args) {
        // �������϶���
        HashMap<Integer, String> hm = new HashMap<Integer, String>();

        // ���������Ԫ��
        // Integer i1 = 1;
        // String s1 = "����";
        // hm.put(i1, s1);

        hm.put(1, "����");
        hm.put(2, "����");
        hm.put(3, "����");

        // ����
        Set<Integer> set = hm.keySet();
        for (Integer key : set) {
            String value = hm.get(key);
            System.out.println(key + "---" + value);
        }
    }
}
