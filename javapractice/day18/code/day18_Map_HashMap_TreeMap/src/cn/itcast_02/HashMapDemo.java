package cn.itcast_02;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * HashMap<String,String>
 * ����ѧ������
 * ֵ����ַ
 * �洢����Ԫ�أ�Ȼ�������
 */
public class HashMapDemo {
    public static void main(String[] args) {
        // �������϶���
        HashMap<String, String> hm = new HashMap<String, String>();

        // ���������Ԫ��
        hm.put("��ޱ", "����");
        hm.put("�����", "������");
        hm.put("������", "ɽ��");

        // ����
        // ��ʽ1
        Set<String> keySet = hm.keySet();
        for (String key : keySet) {
            String value = hm.get(key);
            System.out.println(key + "---" + value);
        }
        System.out.println("---------------------");

        // ��ʽ2
        // Set<Map.Entry<String, String>> entrySet = hm.entrySet();
        // for (Map.Entry<String, String> me : entrySet) {
        // String key = me.getKey();
        // String value = me.getValue();
        // System.out.println(key + "---" + value);
        // }

//		Set<Entry<String, String>> entrySet = hm.entrySet();
//		for (Entry<String, String> me : entrySet) {
//			String key = me.getKey();
//			String value = me.getValue();
//			System.out.println(key + "---" + value);
//		}
    }
}
