/*
	������ĳ�Ա�ص㣺
		A:��Ա����
			�����Ǳ�����Ҳ�����ǳ���
		B:���췽��
			�й��췽�������ǲ���ʵ������
			���⣺���췽����ʲô����?
				����������ʸ������ݵĳ�ʼ��
		C:��Ա����
			�����г��󷽷���Ҳ�����зǳ��󷽷���
			���󷽷���ǿ��Ҫ��������ĳЩ���顣
			�ǳ��󷽷������ڸ�����ֱ��ʹ�ã�����˴���ĸ����ԡ�
*/
abstract class Animal {
    int num = 10;
    final int num2 = 20;

    public Animal() {
    }

    public void method() {
        System.out.println("method");
    }

    public abstract void function();
}

class Dog extends Animal {
    public void show() {
        num = 100;
        System.out.println(num);
        //num2 = 200;
        System.out.println(num2);
    }

    public void function() {
    }
}

class AbstractDemo2 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.show();
    }
}
