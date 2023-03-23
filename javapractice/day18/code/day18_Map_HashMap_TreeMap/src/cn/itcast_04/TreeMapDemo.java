package cn.itcast_04;

import java.util.Set;
import java.util.TreeMap;

/*
 * TreeMap<String,String>
 */
public class TreeMapDemo {
    public static void main(String[] args) {
        // �������϶���
        TreeMap<String, String> tm = new TreeMap<String, String>();

        // ���Ԫ��
        tm.put("zhangsan", "����");
        tm.put("lisi", "���");
        tm.put("wangwu", "�Ϻ�");
        tm.put("zhaoliu", "����");
        tm.put("tianqi", "����");
        tm.put("lisi", "�人");

        // ����
        Set<String> set = tm.keySet();
        for (String key : set) {
            String value = tm.get(key);
            System.out.println(key + "---" + value);
        }
    }
}
