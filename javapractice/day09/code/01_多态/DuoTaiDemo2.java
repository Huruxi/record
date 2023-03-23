/*
	��η����������й�����?
		A:����������󼴿ɡ�
		B:��̬��ת������
			����ת��
				���ӵ���
				��������ָ���������
			����ת��
				�Ӹ�����
				��������תΪ�������

	����װ������

		���ӣ�����():������,����Ϸ():������,age:20
		���ӵ�������():JavaSE��age:40

		//��̬
		���ӵ� k�� = new ����(); //Android�ܻ𣬶�JavaSE��Android����������JavaSE�ܻ�
								 //��̫æ������װ��ȥ���Ρ�ճ��С���ӣ������۾�������ת��
		System.out.println(k��.age); //40
		k��.����(); //������
		//k��.����Ϸ(); //����

		//�ؼ���
		���� k = (����)k��; //ȥ��С���ӣ�ȥ���۾�������ת��
		System.out.println(k.age); //20
		k.����(); //������
		k.����Ϸ();
*/
class Animal {
    public void eat() {
    }
}

class Dog extends Animal {
    public void eat() {
        System.out.println("���Թ�ͷ");
    }

    public void help() {
        System.out.println("�����԰�����������ץС͵");
    }
}

class Cat extends Animal {
    public void eat() {
        System.out.println("è������");
    }
}

class DuoTaiDemo2 {
    public static void main(String[] args) {
        //��̬
        Animal a = new Dog();    //����ת��
        a.eat();
        //a.help(); //���뿴���

        //����ת��
        Dog d = (Dog) a;
        d.eat();
        d.help();
        System.out.println("-------------");

        //�ᱨ����?
        a = new Cat(); ////����ת��
        a.eat();

        Cat c = (Cat) a;
        c.eat();

        //Dog dd = (Dog)a; //ClassCastException
        //dd.eat();
        //dd.help();
    }
}