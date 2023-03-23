package cn.itcast_01;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * ��ArrayList�洢�Զ�����󲢱�����Ҫ����뷺��
 */
public class ArrayListTest {
    public static void main(String[] args) {
        // �������϶���
        ArrayList<Student> array = new ArrayList<Student>();
        // JDK7���������ԣ����η��ͣ������ƶ�
        // ArrayList<Student> array = new ArrayList<>();

        // ����Ԫ��
        Student s1 = new Student("����", 18);
        Student s2 = new Student("١���", 20);
        Student s3 = new Student("����", 19);
        Student s4 = new Student("������", 21);

        // ���Ԫ��
        array.add(s1);
        array.add(s2);
        array.add(s3);
        array.add(s4);

        // ����
        Iterator<Student> it = array.iterator();
        while (it.hasNext()) {
            Student s = it.next();
            System.out.println(s.getName() + "---" + s.getAge());
        }
        System.out.println("------------------");

        for (int x = 0; x < array.size(); x++) {
            Student s = array.get(x);
            System.out.println(s.getName() + "---" + s.getAge());
        }
    }
}
