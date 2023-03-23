package cn.itcast_02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
 * ��ArrayList�洢�Զ�����󣬲����������������
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        // �������϶���
        ArrayList<Person> array = new ArrayList<Person>();

        // ����Ԫ�ض���(���ɵ���)
        Person p1 = new Person("�ܲ�", 35);// ��֪���
        Person p2 = new Person("����", 33);// ��֪����
        Person p3 = new Person("�����", 34); // ��֪�Ⱦ�

        // ���Ԫ��
        array.add(p1);
        array.add(p2);
        array.add(p3);

        // ����
        // Collections.sort(array);
        Collections.sort(array, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p2.getAge() - p1.getAge();
            }

        });

        // ��������
        for (Person p : array) {
            System.out.println(p.getName() + "---" + p.getAge());
        }
    }
}
