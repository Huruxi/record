package cn.itcast_10;

import java.io.Serializable;

/*
 * NotSerializableException:δʵ�����л��ӿ��쳣��
 * Serializable����ͨ��ʵ�� java.io.Serializable �ӿ������������л����ܡ�δʵ�ִ˽ӿڵ��ཫ�޷�ʹ���κ�״̬���л������л���
 *
 * ����Ժ����ٿ����ӿ�û�з������������ʸýӿ���ʲô����?
 * �С����ֽӿڱ���Ϊ��ǽӿڡ�
 *
 * Exception in thread "main" java.io.InvalidClassException:
 * cn.itcast_10.Person; local class incompatible:
 * stream classdesc serialVersionUID = -1509474945256457713,
 * local class serialVersionUID = -8199609520215381056
 *
 * A:�����л��������Ķ��������������ʵ�����л��ӿڡ�
 * B:һ��java�ļ���������class�ļ���ʱ��Ҳ����һ�����л�idֵ�������л����ļ���ʱ����������idֵд���ļ���
 * 		Person.java		id=100
 * 		Person.class	id=100
 * 		oos.txt			id=100
 * C:һ�����java�ļ������޸ģ����idֵ�ͻ���Ӧ�ķ����ı�
 * 		Person.java		id=200
 * 		Person.class 	id=200
 * 		oos.txt			id=100
 * ��Щʱ����������һЩ�򵥵��޸ģ�����������д���ݣ���û�а취��֤��ȡ���ݲ�������?
 * �С���ÿ�β�����idֵ�ǹ̶��ľͿ����ˡ�
 * �����ǣ���θ������idֵ��?������ô��ʾ����?
 * ��֪��?�͵����꼴�ɡ�
 * ���ʱ�����Ǿ�֪�����idֵ�ı�����ʽ�ˣ����һ�����˻�ɫ�����ߵ����⡣
 *
 * ���л���
 * 		�Ѷ�������һ������ʽд���ļ������������д���
 * �����л���
 * 		�������ݻ�ԭ�ɶ���
 * �����ʵ�����л�?
 * 		�ñ����л��Ķ�����������ʵ�����л��ӿ�
 * �����С�ĸĶ���Ӱ����ǰ���л��������Լ���ʵ�����л����ֵĻ�ɫ������?
 * 		�����꣬����һ���̶������л�idֵ����
 */
public class Person implements Serializable {
    private static final long serialVersionUID = 8535379254621922917L;

    private String name;

    // private int age;

    int age;

    public Person(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public Person() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }

}
