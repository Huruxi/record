/*
	��������һ��������Ƶ�ʱ����Ӿ���Ŀ�ʼ������������Щ���Ե����ݣ����ϵ����ϳ�ȡ��
	�����Ĺ��̣��Ӿ��嵽����
	ʵ�ֵĹ��̣��ӳ��󵽾��塣
	ʹ�õ�ʱ��ʹ�õ��Ǿ���Ķ���

	è������,�������ߵĶ��⹦��

	�˶�Ա��(�ӿ�)
		��Ա���������ߡ�

	è��(������)
		��Ա����������������
		���췽�����޲Σ�����
		��Ա������getXxx()/setXxx���Է���˯��

	����(������)
		��Ա����������������
		���췽�����޲Σ�����
		��Ա������getXxx()/setXxx���Է���˯��

	è���кܶ๲�Ե����ݣ���������Ҫ������ȡ��
	
	���(������)
		��Ա����������������
		���췽�����޲Σ�����
		��Ա������getXxx()/setXxx���Է�()��˯��(){}

	�����ࣺ
		����(������)
			è(������)
				�߱����߹��ܵ�è(������)
			��(������)
				�߱����߹��ܵĹ�(������)
		�˶�Ա(�ӿ�)


	��̬��ǰ�᣺
		A:�м̳л���ʵ�ֹ�ϵ
		B:�з�������д
		C:�и�����߸��ӿ�����ָ���������

	��̬�ı�����ʽ��
		�������̬
		�������̬
		�ӿڶ�̬

	����Ŀǰ��õ��Ǿ����ഴ������ʹ�á�
*/
//�˶�Ա�ӿ�
interface Sport {
    //���߹���
    public abstract void jump();
}

//���������
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

    //˯��
    public void sleep() {
        System.out.println("������Ҫ˯��");
    }

    //�Է�
    public abstract void eat();
}

//è
class Cat extends Animal {
    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    public void eat() {
        System.out.println("è����");
    }
}

//�߱����߹��ܵ�è
class JumpCat extends Cat implements Sport {
    public JumpCat() {
    }

    public JumpCat(String name, int age) {
        super(name, age);
    }

    public void jump() {
        System.out.println("è����һ����շ�����������");
    }
}

//��
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

//�߱����߹��ܵĹ�
class JumpDog extends Dog implements Sport {
    public JumpDog() {
    }

    public JumpDog(String name, int age) {
        super(name, age);
    }

    public void jump() {
        System.out.println("���ڿն���Խ����Χǽ");
    }
}

class AnimalDemo {
    public static void main(String[] args) {
        //����è
        //�޲�
        JumpCat jc = new JumpCat();
        jc.setName("����è");
        jc.setAge(5);
        System.out.println(jc.getName() + "---" + jc.getAge());
        jc.sleep();
        jc.eat();
        jc.jump();
        //����...

        //��̬
        Animal a = new JumpCat();
        a.setName("��è");
        a.setAge(6);
        System.out.println(a.getName() + "---" + a.getAge());
        a.sleep();
        a.eat();
        //a.jump();

        //��̬
        Sport s = new JumpCat();
        s.jump();
        //s.eat();
        //s.sleep();
    }
}