/*
	��������û�����ֵĶ���

	ʹ�ó�����
		A:���÷���,�÷���������ʹ��һ�ε�ʱ�����á�
		B:��Ϊʵ�ʲ�������
*/

//����ѧ���࣬дһ��love����
class Student {
    public void love() {
        System.out.println("ѧ��ϲ���ż�");
    }
}

class StudentDemo {
    public void test(Student s) {
        s.love();
    }
}

//������
class NoNameObject {
    public static void main(String[] args) {
		/*
		//��������
		Student s = new Student();
		s.love();
		s.love();

		//��������
		new Student().love();
		new Student().love();
		*/

        //�����ֵ����
        //StudentDemo sd = new StudentDemo();
        //Student s = new Student();
        //sd.test(s);

        //û�����ֵ����
        //StudentDemo sd = new StudentDemo();
        //sd.test(new Student());

        //��������һ��
        new StudentDemo().test(new Student());
    }
}