/*
	����ѧ���ࣺ����������

	�������Ǵ����˶����������ǿ���ͨ������ȥʹ�����еĳ�Ա��
	�����ڵ�����ǣ����ǲ������ֱ��ȥʹ����ĳ�Ա������
	��ô����?
	java���������������ṩ��һ���ؼ��֣�private��

	private:
		A:��һ��Ȩ�����η���
		B:�������γ�Ա(��Ա�����ͳ�Ա����)
		C:��private���εĳ�Աֻ�ڱ����в��ܷ��ʡ�

*/
//����ѧ����
class Student {
    String name;
    private int age;

    //��Ϊ��������˸�������������ʵ���
    //���ԣ�����Ҫ�����������ж�
    //��Ҫ���жϣ���Ӧ��д�ж����
    //��д����Ӧ���ڷ�����
    public void checkAge(int a) {
        if (a < 0 || a > 100) {
            System.out.println("��������");
        } else {
            age = a;
        }
    }

    public int getAge() {
        return age;
    }
}

//������
class StudentDemo {
    public static void main(String[] args) {
        //����ѧ������
        Student s = new Student();

        //��name��age��ֵ
        s.name = "����ϼ";
        //s.age = 28;
        //s.age = -28;
        //ͨ��������ֵ
        s.checkAge(-28);
        //s.age = -28;

        //���
        //System.out.println(s.name+"***"+s.age);
        System.out.println(s.name);
        System.out.println(s.getAge());
    }
}