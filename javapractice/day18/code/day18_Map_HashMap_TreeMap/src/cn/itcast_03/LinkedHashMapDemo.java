package cn.itcast_03;

import java.util.LinkedHashMap;
import java.util.Set;

/*
 * Map �ӿڵĹ�ϣ��������б�ʵ�֣����п�Ԥ֪�ĵ���˳��
 */
public class LinkedHashMapDemo {
    public static void main(String[] args) {
        // �������϶���
        LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();

        // ���Ԫ��
        map.put("����", "������");
        map.put("л����", "�Ű�֥");
        map.put("����", "Ҷһ��");
        map.put("����", "������");

        // ����
        Set<String> set = map.keySet();
        for (String key : set) {
            String value = map.get(key);
            System.out.println(key + "---" + value);
        }
    }
}
