package cn.itcast_01;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * ���󣺴洢����ѧ�����󣬲������������ַ�ʽ����
 *
 * ��ϰ��
 * 		Vector��LinkedList��
 * 		�洢�ַ���������
 * 		�洢�Զ�����󲢱���
 */
public class ArrayListTest {
    public static void main(String[] args) {
        // �������϶���
        ArrayList array = new ArrayList();

        // ����Ԫ�ض���
        Student s1 = new Student("��Ԫ�", 50);

        Student s2 = new Student();
        s2.setName("������");
        s2.setAge(60);

        Student s3 = new Student("��ʼ��", 40);

        // ��Ԫ����ӵ�����
        array.add(s1);
        array.add(s2);
        array.add(s3);

        // ��������
        Iterator it = array.iterator();
        while (it.hasNext()) {
            Student s = (Student) it.next();
            System.out.println(s.getName() + "---" + s.getAge());
        }
        System.out.println("-----------------");

        for (int x = 0; x < array.size(); x++) {
            Student s = (Student) array.get(x);
            System.out.println(s.getName() + "---" + s.getAge());
        }
    }
}
