package cn.itcast_01;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * V get(Object key)
 * Set<K> keySet()
 * Collection<V> values()
 */
public class MapDemo2 {
    public static void main(String[] args) {
        // �������϶���
        Map<String, String> map = new HashMap<String, String>();

        // ���������Ԫ��
        map.put("����", "������");
        map.put("л����", "�Ű�֥");
        map.put("����", "Ҷһ��");
        map.put("����", "������");

        // V get(Object key)
        System.out.println("get:" + map.get("����"));
        System.out.println("get:" + map.get("����"));
        System.out.println("---------------------");

        // Set<K> keySet()
        Set<String> set = map.keySet();
        for (String key : set) {
            System.out.println(key);
        }
        System.out.println("---------------------");

        // Collection<V> values()
        Collection<String> cons = map.values();
        for (String value : cons) {
            System.out.println(value);
        }
    }
}
