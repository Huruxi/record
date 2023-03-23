/*
	�ӿڵĳ�Ա�ص㣺
		A:��Ա����
			�ǳ����������Ǿ�̬�����εġ�
			Ĭ�ϵ����η���public static final
		B:���췽��
			û�й��췽��
		C:��Ա����
			ֻ���ǳ��󷽷���
			Ĭ�ϵ����η���public abstract

		���飺
			�Լ�д�ӿڵ����ݵ�ʱ�򣬰���ЩĬ�����η����ϡ�
*/
interface Animal {
    //int num = 10;
    //final int num2 = 20;
    public static final int num = 10;

    //public Animal() {}

    public abstract void show();

    //public void method() {}

    //void method();
}

class Dog implements Animal {
	/*
	public void show() {
		//num = 100;
		System.out.println(num);
		//num2 = 200;
		System.out.println(num2);
		System.out.println(Animal.num);
		System.out.println(Animal.num2);

	}
	*/

    public void show() {
    }
}

class InterfaceDemo2 {
    public static void main(String[] args) {
        Dog d = new Dog();
        //d.show();
    }
}
