/*
	è��
		��Ա����������������
		���췽�����޲Σ�����
		��Ա������getXxx()/setXxx()��show()��catchMouse()
	����
		��Ա����������������
		���췽�����޲Σ�����
		��Ա������getXxx()/setXxx()��show()��lookDoor()
	�����ࣺ
		main(String[] args):
*/
//è��
class Cat {
    private String name;
    private int age;

    public Cat() {
    }

    public Cat(String name, int age) {
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

    public void catchMouse() {
        System.out.println("è׽����");
    }
}

//����
class Dog {
    private String name;
    private int age;

    public Dog() {
    }

    public Dog(String name, int age) {
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

    public void lookDoor() {
        System.out.println("�����Կ���");
    }
}

//������
class Test {
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

        //��ϰ1���Լ�д�����Ĳ���
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

//��ϰ2�����è��������Ϊ�̳еİ汾���Լ��������Լ����ԡ��Ȼὲ