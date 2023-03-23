package cn.itcast_02;

import java.util.HashSet;

/*
 * ���󣺴洢�Զ�����󲢱�����(�������ĳ�Ա����ֵ����ͬ�����Ǿ���Ϊ������������ͬһ������Ҳ�����ظ���Ԫ��)
 * ���Ǵ洢��Ԫ�غ󣬷���û�дﵽ������Ҫ��Ч����
 * ����������д��equals()���������ֻ��ǲ��С�
 * ��ô����?���Ǿ�Ӧ��˼����������������?
 * ͨ���򵥵ķ���������֪���϶���add()�����������
 * ���ԣ�����Ҫ��֪����ʲô������,���Ǿ�Ӧ�ÿ�add()������Դ��
 * ͨ���鿴Դ�룬���ǿ��������µ�һ���жϣ�
 * 		if (e.hash == hash && ((k = e.key) == key || key.equals(k))){}
 * 			A:e.hash == hash
 * 				�Ƚϵ��Ƕ���Ĺ�ϣֵ�Ƿ���ͬ
 * 			B:((k = e.key) == key || key.equals(k))
 * 				��߱Ƚϵ��ǵ�ַ�Ƿ���ͬ
 * 				�ұ߱Ƚϵ��������Ƿ���ͬ
 * HashSet���ϵײ����ݽṹ�ǹ�ϣ����ϣ����hashCode()��equals()��������֤Ԫ�ص�Ψһ�ԡ�
 * 		�Ƚ϶����hashCode()ֵ�Ƿ���ͬ
 * 			�ǣ������Ƚ�equals()�������������Ƿ���ͬ
 * 				����true���Ͳ���ӵ�����
 * 				����false������ӵ�����
 * 			��ֱ����ӵ�����
 *
 * ѧϰ��Ϻ�����ֻҪ֪��HashSet����α�֤Ԫ�ص�Ψһ�Եġ�
 * ��ʵ�ʿ����У����ǿ������ֽṹ�ļ��ϣ���Ҫ��д����������hashCode()��equals()��
 * ���Ǵ�Ҳ��õ��ģ���Ϊ���������������Զ����ɡ�
 */
public class HashSetDemo2 {
    public static void main(String[] args) {
        // �������϶���
        HashSet<Person> hs = new HashSet<Person>();

        // ����Ԫ�ض���
        Person p1 = new Person("������", 30);
        Person p2 = new Person("���ɹ�", 22);
        Person p3 = new Person("�ܹ���", 25);
        Person p4 = new Person("������", 35);
        Person p5 = new Person("�Ź���", 33);
        Person p6 = new Person("���ɺ�", 22);
        Person p7 = new Person("���ɹ�", 22);
        Person p8 = new Person("������", 18);

        // ��Ԫ����ӵ�����
        hs.add(p1);
        // hs.add(p1);
        hs.add(p2);
        hs.add(p3);
        hs.add(p4);
        hs.add(p5);
        hs.add(p6);
        hs.add(p7);
        hs.add(p8);

        // ��������
        for (Person p : hs) {
            System.out.println(p.getName() + "---" + p.getAge());
        }
    }
}
