package cn.itcast_05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/*
 ����
 ����HashMap���ϵ�Ԫ��ֵ��ArrayList����3����
 ÿһ��ArrayList���ϵ�ֵ���ַ�����

 Ԫ�����Ѿ���ɣ��������
 �����
 ��������
 ����
 ���
 Ц������
 �����
 ��ƽ֮
 �������
 ����
 ���  
 */
public class HashMapAndArrayListTest {
    public static void main(String[] args) {
        // �������϶���
        HashMap<String, ArrayList<String>> hm = new HashMap<String, ArrayList<String>>();

        // ����Ԫ��
        ArrayList<String> sgyy = new ArrayList<String>();
        sgyy.add("����");
        sgyy.add("���");

        // ����Ԫ��
        ArrayList<String> xajh = new ArrayList<String>();
        xajh.add("�����");
        xajh.add("��ƽ֮");

        // ����Ԫ��
        ArrayList<String> sdxl = new ArrayList<String>();
        sdxl.add("����");
        sdxl.add("���");

        // ���Ԫ��
        hm.put("��������", sgyy);
        hm.put("Ц������", xajh);
        hm.put("�������", sdxl);

        // ��������
        Set<String> hmSet = hm.keySet();
        for (String key : hmSet) {
            System.out.println(key);
            ArrayList<String> value = hm.get(key);
            for (String s : value) {
                System.out.println("\t" + s);
            }
        }
    }
}
