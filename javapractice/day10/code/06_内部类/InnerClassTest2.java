//�����ڲ����ڿ����е�ʹ��
interface Person {
    public abstract void show();
}

class PersonDemo {
    public void method(Person p) {
        p.show();
    }
}

/*
class Student implements Person {
	public void show() {
		System.out.println("show student");
	}
}
*/

class InnerClassTest2 {
    public static void main(String[] args) {
        //���������PersonDemo���method����
		/*
		PersonDemo pd = new PersonDemo();
		Person p = new Student();
		pd.method(p);
		*/

        //������������
        //new PersonDemo().method(new Student());

        //�����ڲ�������
        new PersonDemo().method(new Person() {
            public void show() {
                System.out.println("show student");
            }
        });

        new PersonDemo().method(new Person() {
            public void show() {
                System.out.println("show teacher");
            }
        });
    }
}