package cn.itcast_06;

import java.util.Comparator;
import java.util.TreeSet;

/*
 * TreeSet����α�֤Ԫ���������?������α�֤Ԫ��Ψһ����?
 *
 * ������TreeSet�洢�Զ�����󣬲�����Ҫ�������ȥ���ظ�ֵ��
 * a:�����Ա����ֵ����ͬ���Ҿ���Ϊ���ظ�Ԫ��
 * b:�밴������Ĵ�С�����������
 *
 * �ܽ᣺TreeSet��֤Ԫ��Ψһ������
 * Ψһ�ԣ����ݱȽϵķ���ֵ�Ƿ���0���ж�Ԫ���Ƿ���Ψһ��
 * �������ַ�ʽ
 * 		A:��Ȼ����	(Ԫ�ؾ߱��Ƚ���)
 * 			�ö�����������ʵ��Comparable�ӿ�
 * 		B:�Ƚ������� (���Ͼ߱��Ƚ���)
 * 			�������϶����ʱ�򣬽���Comparator�ӿڵ�ʵ�������һ������ʹ�õ��������ڲ���ʵ�֡�
 */
public class TreeSetDemo {
    public static void main(String[] args) {
        // �������϶���
        // TreeSet<Person> ts = new TreeSet<Person>();
        // TreeSet(Comparator comparator)
        // ����һ���µĿ� TreeSet��������ָ���Ƚ�����������
        TreeSet<Person> ts = new TreeSet<Person>(new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                // this -- p1
                // p -- p2
                int num = p1.getAge() - p2.getAge();
                int num2 = num == 0 ? p1.getName().compareTo(p2.getName())
                        : num;
                return num2;
            }
        });

        // �����˶���
        Person p1 = new Person("tangseng", 30);
        Person p2 = new Person("jiapingwa", 25);
        Person p3 = new Person("zhangyimou", 25);
        Person p4 = new Person("xijinping", 26);
        Person p5 = new Person("yanni", 27);
        Person p6 = new Person("wenzhang", 30);
        Person p7 = new Person("tianliang", 28);
        Person p8 = new Person("xijinping", 26);

        // ���Ԫ��
        ts.add(p1);
        ts.add(p2);
        ts.add(p3);
        ts.add(p4);
        ts.add(p5);
        ts.add(p6);
        ts.add(p7);
        ts.add(p8);

        // ��������
        for (Person p : ts) {
            System.out.println(p.getName() + "---" + p.getAge());
        }

    }
}
