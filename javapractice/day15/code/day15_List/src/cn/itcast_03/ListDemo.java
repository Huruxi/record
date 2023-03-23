package cn.itcast_03;

import java.util.ArrayList;
import java.util.List;

/*
 * ��ϰ����List���ϴ洢�Զ��岢������
 * Student:name,age
 * ����ʹ����ͨforѭ��
 */
public class ListDemo {
    public static void main(String[] args) {
        // �������϶���
        List list = new ArrayList();

        // ����ѧ������
        Student s1 = new Student("���Ѿ�", 18);
        Student s2 = new Student("��ʩ", 19);
        Student s3 = new Student("����", 20);
        Student s4 = new Student("����", 17);

        // ��Ԫ����ӵ�����
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);

        // ����
        for (int x = 0; x < list.size(); x++) {
            Student s = (Student) list.get(x);
            System.out.println(s.getName() + "---" + s.getAge());
        }
    }
}
