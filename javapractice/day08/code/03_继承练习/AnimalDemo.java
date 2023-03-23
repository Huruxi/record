/*
	��ϰ2�����è��������Ϊ�̳еİ汾���Լ��������Լ����ԡ��Ȼὲ

	è��
		��Ա����������������
		���췽�����޲Σ�����
		��Ա������getXxx()/setXxx()��show()��catchMouse()
	����
		��Ա����������������
		���췽�����޲Σ�����
		��Ա������getXxx()/setXxx()��show()��lookDoor()

	���
		��Ա����������������
		���췽�����޲Σ�����
		��Ա������getXxx()/setXxx()��show()

	è�����췽�����޲Σ�����
		catchMouse()
	�������췽�����޲Σ�����
		lookDoor()

	�����ࣺ
		main(String[] args):
*/
class Animal {
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

    public void show() {
        System.out.println(name + "---" + age);
    }
}

class Cat extends Animal {
    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    public void catchMouse() {
        System.out.println("è׽����");
    }
}

class Dog extends Animal {
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    public void lookDoor() {
        System.out.println("�����Կ���");
    }
}

class AnimalDemo {
    public static void main(String[] args) {
        //è�����
        Cat c = new Cat();
        c.setName("�ӷ�è");
        c.setAge(3);
        c.show();
        c.catchMouse();
        System.out.println("------------");
        Cat cc = new Cat("tomè", 6);
        cc.show();
        cc.catchMouse();
        System.out.println("------------");

        Dog d = new Dog();
        d.setName("Х��");
        d.setAge(5);
        d.show();
        d.lookDoor();
        System.out.println("------------");

        Dog dd = new Dog("����", 8);
        dd.show();
        dd.lookDoor();
    }
}