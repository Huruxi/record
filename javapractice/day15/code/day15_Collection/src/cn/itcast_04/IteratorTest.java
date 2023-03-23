package cn.itcast_04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * ��ϰ���ü��ϴ洢����ѧ�����󣬲�������ʹ�õ���������
 */
public class IteratorTest {
    public static void main(String[] args) {
        // �������϶���
        Collection c = new ArrayList();

        // ����Ԫ�ض���
        Student s1 = new Student("�����", 30);
        Student s2 = new Student("��ϼ����", 26);
        Student s3 = new Student("�϶�", 22);

        // ��Ԫ����ӵ�����
        c.add(s1);
        c.add(s2);
        c.add(s3);

        // ��������
        // ͨ�����϶������iterator()������ȡ����������
        Iterator it = c.iterator();
        // ͨ�������������hasNext()���������ж��Ƿ���Ԫ��
        while (it.hasNext()) {
            // ͨ�������������next()������ȡԪ��,��ת��Ϊ��洢��Ԫ������
            Student s = (Student) it.next();
            // ֱ�������������ƣ�������ǵ�ֵַ��û��ʲô���塣
            // ��ν����?A:��д�����������toString()������B:ͨ���������getXxx()����
            System.out.println(s.getName() + "---" + s.getAge());
        }
    }
}
