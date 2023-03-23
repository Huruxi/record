package cn.itcast_01;

import java.util.ArrayList;

/*
 * ��ArrayList�洢�Զ�����󲢱�����Ҫ����뷺�ͣ�����ʹ�����ַ�ʽ
 */
public class ArrayListTest {
    public static void main(String[] args) {
        // �������϶���
        ArrayList<Student> array = new ArrayList<Student>();

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

        for (Student s : array) {
            System.out.println(s.getName() + "---" + s.getAge());
        }
    }
}
