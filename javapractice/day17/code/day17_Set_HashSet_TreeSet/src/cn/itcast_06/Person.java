package cn.itcast_06;

public class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person() {
        super();
    }

    public Person(String name, int age) {
        super();
        this.name = name;
        this.age = age;
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
    public int compareTo(Person p) {
        // ��Ҫ����
        // �����ĳ��Ƚ�������
        int num = this.name.length() - p.name.length();
        // ��Ҫ����
        // ����һ��������������һ�������ԣ���Ҫ����������
        int num2 = num == 0 ? this.name.compareTo(p.name) : num;
        // ����һ��������һ������Ӧ�ñȽ�����
        int num3 = num2 == 0 ? this.age - p.age : num2;
        return num3;
    }
}
