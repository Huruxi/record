/*
	�ӿڸ����������ڶ���԰���棬��Щè�������Ȧ�������ߣ�������ȶ�����
			  ����Щ�����������Ƕ��������;;߱��ģ����ԣ����ʺ϶����ڶ������С�
			  ���ң�Ҳ�������е�è�����߹��߱���Щ���ܣ�����ֱ�Ӷ�����è���߹�����Ҳ�����ʡ�
			  ���������һ����չ���ܣ�java���ṩ�˽ӿ������֡�

	�ӿڵ��ص㣺
		A:�ӿ��ùؼ���interface��ʾ
			��ʽ��interface �ӿ��� {}
		B:��ʵ�ֽӿ���implements��ʾ
			��ʽ��class ���� implements �ӿ��� {}
		C:�ӿڲ���ʵ����
			�ӿڶ�̬��
		D:�ӿڵ�����
			a:Ҫô�ǳ�����
			b:Ҫô��д�ӿ��е����еĳ��󷽷�
*/
interface Animal {
    public abstract void show();
}

abstract class Dog implements Animal {
}

class Cat implements Animal {
    public void show() {
    }
}

class InterfaceDemo {
    public static void main(String[] args) {

    }
}