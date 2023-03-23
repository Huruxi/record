package cn.itcast_02;

import java.util.HashMap;
import java.util.Set;

/*
 * HashMap<String,Student>
 * ����String		ѧ�� 	eg:itcast001
 * ֵ��Student	ѧ������ (����ϼ,28)
 * 		name,age
 * Ҫ��洢����ѧ�����������������Ľ���ǣ�
 * 		itcast001--����ϼ---28
 * 		...
 */
public class HashMapDemo3 {
    public static void main(String[] args) {
        // �������϶���
        HashMap<String, Student> hm = new HashMap<String, Student>();

        // ��������
        Student s1 = new Student("����ϼ", 28);
        Student s2 = new Student("������", 31);
        Student s3 = new Student("������", 200);

        // ���Ԫ��
        hm.put("itcast001", s1);
        hm.put("itcast002", s2);
        hm.put("itcast003", s3);

        // ����
        Set<String> set = hm.keySet();
        for (String key : set) {
            Student value = hm.get(key);
            System.out.println(key + "---" + value.getName() + "---"
                    + value.getAge());
        }
    }
}
