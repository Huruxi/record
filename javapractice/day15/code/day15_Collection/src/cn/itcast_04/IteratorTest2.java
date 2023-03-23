package cn.itcast_04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * ע�⣺next()ûһ�ε��ã������ȡһ�����󣬲��ƶ�����һ��λ�õȴ���
 */
public class IteratorTest2 {
    public static void main(String[] args) {
        // �������϶���
        Collection c = new ArrayList();

        // ����Ԫ�ض���
        Student s1 = new Student("�����", 30);
        Student s2 = new Student("��ϼ����", 26);
        Student s3 = new Student("�϶�", 22);
        Student s4 = new Student("��˽�", 18);

        // ��Ԫ����ӵ�����
        c.add(s1); // Object obj = s1; ����ת��
        c.add(s2);
        c.add(s3);
        c.add(s4);

        Iterator it = c.iterator();
        while (it.hasNext()) {
            // System.out.println(((Student) (it.next())).getName() + "---"
            // + ((Student) (it.next())).getAge());
            Student s = (Student) it.next();
            System.out.println(s.getName() + "---" + s.getAge());
        }
    }
}
