//��ʳ�Ļ�
class Person {
    public void eat() {
        System.out.println("person eat");
    }
}

class SouthPerson extends Person {
    public void eat() {
        System.out.println("�Ϸ���ϲ�����׷�");
    }
}

class NorthPerson extends Person {
    public void eat() {
        System.out.println("������ϲ����������");
    }
}

class PersonDemo {
    public static void main(String[] args) {
        Person p = new Person();
        p.eat();

        SouthPerson sp = new SouthPerson();
        sp.eat();

        //p = sp;
        //p.eat();
        Person pp = new SouthPerson();
        pp.eat();
    }
}
