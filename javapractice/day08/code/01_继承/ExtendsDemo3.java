/*
	�̳м�ĳ�Ա������ϵ��
		���ֲ�ͬ���ǳ��ļ򵥣�һ����֪��ʹ�õ���˭��
		������ͬ���ͽ�ԭ��

	ʹ�ñ�����ʱ�򣬻����Ҿֲ���Χ��
	�����ֱ��ʹ�ó�Ա�������ӹؼ��֣�this���ɡ�
	�����ֱ��ʹ�ø���ĳ�Ա�������ӹؼ��֣�super���ɡ�
*/
class Father {
    public int age = 40;
}

class Son extends Father {
    public int num = 100;
    public int age = 20;

    public void show() {
        int age = 60;
        System.out.println(age); //�ֲ���Χ
        System.out.println(this.age); //�����Ա��Χ
        System.out.println(super.age); //�����Ա��Χ
        System.out.println(num);
    }
}

class ExtendsDemo3 {
    public static void main(String[] args) {
        Son s = new Son();
        //System.out.println(s.age);
        //System.out.println(s.num);

        s.show();
    }
}
