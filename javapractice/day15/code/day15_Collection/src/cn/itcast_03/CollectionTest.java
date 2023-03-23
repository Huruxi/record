package cn.itcast_03;

import java.util.ArrayList;
import java.util.Collection;

/*
 * Object[] toArray():�Ѽ���ת�ɶ�������
 *
 * ��ϰ���ü��ϴ洢����ѧ�����󣬲�������
 *
 * �ܽ᣺���ϵ�ʹ�ò���
 * A:�������϶���
 * B:����Ԫ�ض���
 * C:��Ԫ����ӵ�����
 * D:��������
 */
public class CollectionTest {
    public static void main(String[] args) {
        // �������϶���
        Collection c = new ArrayList();

        // ����Ԫ�ض���
        Student s1 = new Student("������", 18);
        Student s2 = new Student("�ؿ���", 20);
        Student s3 = new Student("������", 22);

        // ��ѧ��������ӵ�����
        c.add(s1);
        c.add(s2);
        c.add(s3);
        // c.add(new Student("�ֱ���", 20));

        // ��������
        Object[] objs = c.toArray();
        for (int x = 0; x < objs.length; x++) {
            Student s = (Student) objs[x];
            System.out.println(s.getName() + "---" + s.getAge());
        }
    }
}
