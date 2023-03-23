/*
	��̬�ĺô���
		A:����˳����ά����(�ɼ̳б�֤)
		B:����˳������չ��(�ɶ�̬��֤)

	��̬�ı׶ˣ�
		���ܷ����������еĹ��ܡ�
*/
class Animal {
    public void eat() {
    }

    public void sport() {
    }

	/*
	public void sleep() {
		System.out.println("��˯��");
	}
	*/
}

class Dog extends Animal {
    public void eat() {
        System.out.println("������");
    }

    public void sport() {
        System.out.println("���ܲ�");
    }

    public void lookDoor() {
        System.out.println("����");
    }
}

class Cat extends Animal {
    public void eat() {
        System.out.println("è����");
    }

    public void sport() {
        System.out.println("è������׽�Բ�");
    }
}

class Pig extends Animal {
    public void eat() {
        System.out.println("�������");
    }

    public void sport() {
        System.out.println("��˯��");
    }
}

class DuoTaiDemo {
    public static void main(String[] args) {
		/*
		//��ϲ����������һֻ��
		Dog d = new Dog();
		d.eat();
		d.sport();

		//�Һ�ϲ������������һֻ��
		Dog d2 = new Dog();
		d2.eat();
		d2.sport();

		//���ر�ϲ������������һֻ��
		Dog d3 = new Dog();
		d3.eat();
		d3.sport();
		*/

        //��...
        //��Ҫ���ܶ�ֻ�������ң�ÿ��������Ҫ����һЩ���������߻�Ҫ��һЩ������
        //������Щ������һ���ġ������ǹ�����һ����
        //���һֱд��ȥ��������÷ǳ��鷳
        //���ԣ�����Ҫ���Ƕ������������Ż�
        //����Ż���?��Ϊ���ֲ�����һ���ģ����Ƕ���һ��
        //���ԣ����Ǿ�׼��ʹ�÷����Ľ����Ѷ�����Ϊ�������ݹ������ɡ�
        //���˷��������ǾͿ������µ���
        Dog d = new Dog();
        Dog d2 = new Dog();
        Dog d3 = new Dog();

        //printDog(d);
        //printDog(d2);
        //printDog(d3);
        printAnimal(d);
        printAnimal(d2);
        printAnimal(d3);
        System.out.println("-----------");

        //��ϲ��è����ϲ��è���ر�ϲ��è
        //...
        //дһ������ʵ�ְ�
        //����
        Cat c = new Cat();
        Cat c2 = new Cat();
        Cat c3 = new Cat();

        //printCat(c);
        //printCat(c2);
        //printCat(c3);
        printAnimal(c);
        printAnimal(c2);
        printAnimal(c3);
        System.out.println("-----------");

        //�Һ�������һֻ��������Ҫд��һ���Ĵ��룬�����ʵ����?
        //A:�ȴ�������̳��Զ�����
        //B:�ڲ���������д����ʵ��
        //C:�ڲ������д������󣬵��÷�������
        Pig p = new Pig();
        Pig p2 = new Pig();
        Pig p3 = new Pig();

        //printPig(p);
        //printPig(p2);
        //printPig(p3);
        printAnimal(p);
        printAnimal(p2);
        printAnimal(p3);

        //�һ�ϲ���ǣ�Ҫ����
        //�������ղ�һ��,�����Լ�Ҳ�ǿ�����ɵ�
        //�һ�ϲ�����ӣ�...
        //����������һ�£�
        //�������¶���һ���µ�����û���κ�����ģ����Ǽ����ڲ������е�main�����е���Ҳ��û�������
        //���ǲ�Ӧ��ȥ�ڲ�����������µĹ���
        //�Ժ�������дһ�������ʱ����һ�����������ԭ�򣺶���չ���ţ����޸Ĺرա�
        //���ǣ������������Ҫ���������򣬻��͵�ȥ�޸Ĳ�����
        //Ϊ�˲�ȥ�޸Ĳ������г���main�������������
        //������Ҫ������ļ�����������һ��������
    }

	/*
	public static void printDog(Dog d) {
		d.eat();
		//...
		d.sport();
	}

	public static void printCat(Cat c) {
		c.eat();
		//...
		c.sport();
	}

	public static void printPig(Pig p) {
		p.eat();
		//...
		p.sport();
	}
	*/

    public static void printAnimal(Animal a) {  //Animal a = new Dog(); a = new Cat(); a = new Pig();
        a.eat();
        //...
        //a.lookDoor();
        a.sport();
    }
}