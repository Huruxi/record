package cn.itcast_02;

import java.util.HashMap;
import java.util.Set;

/*
 * HashMap<Student,String>
 * ����Student	ѧ������ (����ϼ,28)
 * 		name,age
 * ֵ��String		ѧ�� 	eg:it001
 * Ҫ��洢����ѧ�����������������Ľ���ǣ�
 * 		����ϼ---28---it001
 * �����������ѧ������ĳ�Ա����ֵ����ͬ�����Ǿ���Ϊ����ͬһ������Ҳ����˵�����ظ��ļ���
 */
public class HashMapDemo4 {
    public static void main(String[] args) {
        // ��������
        HashMap<Student, String> hm = new HashMap<Student, String>();

        // ��������
        Student s1 = new Student("����ϼ", 28);
        Student s2 = new Student("������", 31);
        Student s3 = new Student("������", 200);
        Student s4 = new Student("����ϼ", 28);
        Student s5 = new Student("������", 20);
        Student s6 = new Student("����", 100);

        // ���Ԫ��
        hm.put(s1, "it001");
        hm.put(s2, "it002");
        hm.put(s3, "it003");
        hm.put(s4, "it004");
        hm.put(s5, "it005");
        hm.put(s6, "it006");

        // ��������
        Set<Student> set = hm.keySet();
        for (Student key : set) {
            String value = hm.get(key);
            System.out.println(key.getName() + "---" + key.getAge() + "---"
                    + value);
        }
    }
}
