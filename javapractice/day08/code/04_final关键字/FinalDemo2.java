/*
	final���ξֲ�����
		�������ͣ��������͵�ֵ���ܱ���
		�������ͣ��������͵ĵ�ֵַ���ܸı�
*/
class Person {
    public void show() {
        //�ֲ�����
        int num = 10;
        System.out.println(num);
        num = 100;
        System.out.println(num);

        //final���ξֲ�����
        final int num2 = 20;
        System.out.println(num2);
        //num2 = 200;
        System.out.println(num2);
    }

    public void method() {
        //�ֲ�����
        Student s1 = new Student();
        System.out.println(s1.age);
        s1.age = 100;
        System.out.println(s1.age);

        //s1 = new Student();

        //final���ξֲ�����
        final Student s2 = new Student();
        System.out.println(s2.age);
        s2.age = 100;
        System.out.println(s2.age);

        //s2 = new Student();
    }
}

class Student {
    int age = 10;
}

class FinalDemo2 {
    public static void main(String[] args) {
        Person p = new Person();
        //p.show();
        p.method();
    }
}
