/*
	�̳м�ĳ�Ա������ϵ��
		��ͬ���ƣ��ǳ��򵥣�һ����֪������˭
		��ͬ���ƣ�
			����������
			���ڸ�����
			...
			�Ҳ����ͱ���
*/
class Fu {
    public void show() {
        System.out.println("show fu");
    }
}

class Zi extends Fu {
    public void method() {
        System.out.println("method zi");
    }

    public void show() {
        System.out.println("show zi");
    }
}

class ExtendsDemo6 {
    public static void main(String[] args) {
        Zi z = new Zi();
        z.show();
        z.method();
        //z.haha();
    }
}
