/*
	����֪ʶ��
		A:����������Ϊ��Ա����
			class Demo {
				int x = 10; //�������ͳ�Ա����
				Student s = new Student(); //�������ͳ�Ա����
			}
		B:һ����ĳ�ʼ������
			��Ա����
				Ĭ��
				��ʾ
				����
		C:����м̳й�ϵ����ĳ�ʼ������ִ�е��Ƿֲ��ʼ����
			�ȳ�ʼ�������ٳ�ʼ���ӡ�

			super������ʾ���ȳ�ʼ�����ڳ�ʼ����ʱ�򣬰��շֲ��ʼ��ִ�С�

	���⣺
		super������ִ�С�
*/
class X {
    Y b = new Y();

    X() {
        System.out.print("X");
    }
}

class Y {
    Y() {
        System.out.print("Y");
    }
}

public class Z extends X {
    Y y = new Y();

    Z() {
        //super();//Ĭ�ϣ���ϵͳ�ײ�����ã���������ִ��class Z�Ĺ��췽��
        System.out.print("Z");
    }

    public static void main(String[] args) {
        new Z();
    }
}