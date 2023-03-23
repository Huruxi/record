package cn.itcast_04;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * ȥ���������Զ��������ظ�ֵ(����ĳ�Ա����ֵ����ͬ)
 * Student:name,age
 * ͨ���򵥵ķ���������֪����Ӧ�������ж�������������⡣
 * ���ԣ�����Ӧ������������ν����жϵġ�
 * Ҫ��֪��������жϵģ��ͱ��뿴�жϵķ�����Դ��
 * ͨ���鿴Դ�룬����֪�����ϵ�contains()�����ײ�Դ����������Ԫ�ض����equals()����
 * ��Ĭ������£�Ԫ����������̳���Object���equals()�������Ƚϵ��ǵ�ֵַ��
 * ���ԣ�������Ҫ�Ƚ϶���ĳ�Ա����ֵ��ͬ���ͱ�����дequals()������
 */
public class ArrayListTest3 {
    public static void main(String[] args) {
        // �������϶���
        ArrayList array = new ArrayList();

        // ����ѧ������
        Student s1 = new Student("����ϼ", 28);
        Student s2 = new Student("������", 27);
        Student s3 = new Student("����", 27);
        Student s4 = new Student("����ͮ", 25);
        Student s5 = new Student("�Ż���", 40);
        Student s6 = new Student("����֥", 60);
        Student s7 = new Student("����ϼ", 20);
        Student s8 = new Student("����ϼ", 28);

        // ��ѧ��������ӵ�������
        array.add(s1);
        array.add(s2);
        array.add(s3);
        array.add(s4);
        array.add(s5);
        array.add(s6);
        array.add(s7);
        array.add(s8);

        // �����¼���
        ArrayList newArrayList = new ArrayList();

        // �����ɼ��ϣ���ȡ���ɼ����е�ÿһ��Ԫ��
        for (int x = 0; x < array.size(); x++) {
            Student s = (Student) array.get(x);
            // �Ǿɼ��ϵ�ÿһ��Ԫ�ص��¼�����ȥ�ң�����û��
            if (!newArrayList.contains(s)) {
                // ľ�У������
                newArrayList.add(s);
            }
        }

        // �����¼���
        Iterator it = newArrayList.iterator();
        while (it.hasNext()) {
            Student s = (Student) it.next();
            System.out.println(s.getName() + "---" + s.getAge());
        }
    }
}
