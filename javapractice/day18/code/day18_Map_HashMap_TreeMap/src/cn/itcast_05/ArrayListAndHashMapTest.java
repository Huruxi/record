package cn.itcast_05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/*
 ����
 ����ArrayList���ϵ�Ԫ����HashMap����3����
 ÿһ��HashMap���ϵļ���ֵ�����ַ�����

 Ԫ�����Ѿ���ɣ��������
 �����
 ���---С��
 ����---����

 ����---����
 ���---С��Ů

 �����---��ӯӯ
 ��ƽ֮---����ɺ
 */
public class ArrayListAndHashMapTest {
    public static void main(String[] args) {
        // ��������
        ArrayList<HashMap<String, String>> array = new ArrayList<HashMap<String, String>>();

        // ����Ԫ��
        HashMap<String, String> sgyy = new HashMap<String, String>();
        sgyy.put("���", "С��");
        sgyy.put("����", "����");

        // ����Ԫ��
        HashMap<String, String> sdxl = new HashMap<String, String>();
        sdxl.put("����", "����");
        sdxl.put("���", "С��Ů");

        // ����Ԫ��
        HashMap<String, String> xajh = new HashMap<String, String>();
        xajh.put("�����", "��ӯӯ");
        xajh.put("��ƽ֮", "����ɺ");

        // ��Ԫ����ӵ�����
        array.add(sgyy);
        array.add(sdxl);
        array.add(xajh);

        // ��������
        for (HashMap<String, String> hm : array) {
            Set<String> set = hm.keySet();
            for (String key : set) {
                String value = hm.get(key);
                System.out.println(key + "---" + value);
            }
        }
    }
}
