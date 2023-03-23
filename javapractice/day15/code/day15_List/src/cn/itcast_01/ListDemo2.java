package cn.itcast_01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * ��ϰ����List���ϴ洢�Զ��岢������
 * Student:name,age
 */
public class ListDemo2 {
    public static void main(String[] args) {
        // �������϶���
        List list = new ArrayList();

        // ����ѧ������
        Student s1 = new Student("�˽���", 18);
        Student s2 = new Student("�����", 19);
        Student s3 = new Student("������", 20);
        Student s4 = new Student("��ʦʦ", 21);

        // ��Ԫ����ӵ�����
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);

        // ��������
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Student s = (Student) it.next();
            System.out.println(s.getName() + "---" + s.getAge());
        }
    }
}
