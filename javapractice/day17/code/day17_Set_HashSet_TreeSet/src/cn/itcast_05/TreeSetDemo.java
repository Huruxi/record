package cn.itcast_05;

import java.util.TreeSet;

/*
 * TreeSet����α�֤Ԫ���������?������α�֤Ԫ��Ψһ����?
 *
 * ������TreeSet�洢�Զ�����󣬲�����Ҫ�������ȥ���ظ�ֵ��
 * a:�����Ա����ֵ����ͬ���Ҿ���Ϊ���ظ�Ԫ��
 * b:�밴�������ĳ��Ƚ�������
 */
public class TreeSetDemo {
    public static void main(String[] args) {
        // �������϶���
        TreeSet<Person> ts = new TreeSet<Person>();

        // �����˶���
        Person p1 = new Person("tangseng", 30);
        Person p2 = new Person("jiapingwa", 25);
        Person p3 = new Person("zhangyimou", 25);
        Person p4 = new Person("xijinping", 26);
        Person p5 = new Person("yanni", 27);
        Person p6 = new Person("wenzhang", 30);
        Person p7 = new Person("tianliang", 28);
        Person p8 = new Person("xijinping", 26);
        Person p9 = new Person("tianliang", 24);

        // ���Ԫ��
        ts.add(p1);
        ts.add(p2);
        ts.add(p3);
        ts.add(p4);
        ts.add(p5);
        ts.add(p6);
        ts.add(p7);
        ts.add(p8);
        ts.add(p9);

        // ��������
        for (Person p : ts) {
            System.out.println(p.getName() + "---" + p.getAge());
        }

    }
}
