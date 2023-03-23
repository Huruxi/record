/*
	è������
		�������è����
		���ԣ����������䣬�Է�
*/
abstract class Animal {
    private String name;
    private int age;

    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    //���󷽷�
    public abstract void eat();
}

//����ʵ��
class Dog extends Animal {
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    public void eat() {
        System.out.println("������");
    }
}

//��ϰ1��è��ʵ�֣��Լ���ϰ

class AnimalDemo {
    public static void main(String[] args) {
        //���Թ�
        Dog d = new Dog();
        d.setName("���");
        d.setAge(3);
        System.out.println(d.getName() + "---" + d.getAge());
        d.eat();
        System.out.println("--------------------------");

        Dog d2 = new Dog("���", 3);
        System.out.println(d2.getName() + "---" + d2.getAge());
        d2.eat();
        System.out.println("--------------------------");

        //��̬����
        Animal a = new Dog();
        a.setName("���");
        a.setAge(3);
        System.out.println(a.getName() + "---" + a.getAge());
        a.eat();
        System.out.println("--------------------------");

        Animal a2 = new Dog("���", 3);
        System.out.println(a2.getName() + "---" + a2.getAge());
        a2.eat();
        System.out.println("--------------------------");

        //��ϰ2��è�Ĳ��ԣ���̬�Ĳ���
    }
}