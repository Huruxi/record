/*
	java�еļ̳�ע�����
		A:����ֻ�ܼ̳и������з�˽�еĳ�Ա(��Ա�����ͳ�Ա����)
		B:���಻�ܼ̳и���Ĺ��췽�������ǿ���ͨ��super(���潲)�ؼ���ȥ���ʸ��๹�췽����
		C:��ҪΪ�˲��ֹ��ܶ�ȥ�̳�
			class A {
				public void show(){}
				public void show2(){}
			}

			class B extends A {
				//public void show(){}
				public void show3(){}
			}

	��ô������ʲôʱ����ʹ�ü̳���?
		�̳�����֮�����ֵ��ǣ���is a���Ĺ�ϵ��
		������������������ϵ��xxx is a yyy����ô���ǾͿ���ʹ�ü̳С�
		��������A����B�������A is a ��B������B is a ��A ����ͨ�����Ϳ��Կ���ʹ�ü̳С�
		      ���򲻿��ԡ�

		Student,Person
		Dog,Animal
		Dog,Pig
*/
class Fu {
    private int num = 100;
    public int num2 = 200;

    private void show() {
        System.out.println("show");
    }

    public void show2() {
        System.out.println("show2");
    }
}

class Zi extends Fu {
}

class ExtendsDemo2 {
    public static void main(String[] args) {
        //�����������
        Zi z = new Zi();
        //System.out.println(z.num);
        System.out.println(z.num2);
        //z.show();
        z.show2();

        //��Fu�в���
        //Fu f = new Fu();
        //System.out.println(f.num);
        //System.out.println(f.num2);
    }
}