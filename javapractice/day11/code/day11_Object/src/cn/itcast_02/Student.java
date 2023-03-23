package cn.itcast_02;

public class Student {
    private String name;
    private int age;

    public Student() {
        super();
    }

    public Student(String name, int age) {
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
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null)
            return false;

        if (getClass() != obj.getClass())
            return false;

        Student other = (Student) obj;
        if (age != other.age)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    // @Override
    // public boolean equals(Object obj) { // Object obj = s2;
    // // return true;
    // // obj -- s2
    // // this -- s1
    // // Student s = (Student) obj;
    // // if (this.name.equals(s.name) && this.age == s.age) {
    // // return true;
    // // } else {
    // // return false;
    // // }
    //
    // // ��Ϊ�Լ����Լ��ȣ���û�б�Ҫ����ת���ģ����ԣ�Ϊ����߳����Ч�ʣ����Ǽ���һ���ж�
    // if (this == obj) {
    // return true;
    // }
    //
    // // Ϊ���ó������׳һЩ������һ���ж�
    // // ����ж���ʵ�����ж�ĳ�������Ƿ���ĳ����Ķ���
    // // �õ���һ���жϷ��ţ�instanceof
    // // ��ʽ�������� instanceof ����
    // if (!(obj instanceof Student)) {
    // return false;
    // }
    //
    // // if���ĵڶ��ָ�ʽ����ʹ����Ԫ������滻
    // Student s = (Student) obj;
    // // System.out.println("AAAAAA");
    // return this.name.equals(s.name) && this.age == s.age;
    // }


}