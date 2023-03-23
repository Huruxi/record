package cn.itcast_04;

/*
 * �����������������Ȼ�������Ǿ�Ӧ���ö�����������ʵ����Ȼ����ӿ�Comparable
 */
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
        // ��������Ŀ���ѵ����Լ�Ҫ��ȷ�ȽϵĴ�Ҫ����
        // ��Ҫ��������������Ƚ�
        // ��Ҫ��������������ͬ���Ƚ�����������Ҫ�Լ��ܹ�����������

        // this
        // p
        // ����
        int num = this.age - p.age;
        // ����
        // int num = p.age - this.age;

        int num2 = (num == 0) ? (this.name.compareTo(p.name)) : num;

        return num2;
    }
}
