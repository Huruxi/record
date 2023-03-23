//��ʽ����������������ͣ�
//�����ࣺ����Ķ���
//�����ࣺ������������
//�ӿڣ��ýӿڵ�ʵ�������
//���飺����ĵ�ֵַ����ʵ����һ���������

/*
class Student {
	public void study() {
		System.out.println("�ú�ѧϰ,��������");
	}
}

class StudentDemo {
	public void method(Student s) {
		s.study();
	}
}

class ArgsDemo2 {
	public static void main(String[] args) {
		StudentDemo sd = new StudentDemo();
		Student s = new Student();
		sd.method(s);
	}
}
*/

/*
abstract class Person {
	public abstract void study();
}

class PersonDemo {
	public void method(Person p) {
		p.study();
	}
}

class Student extends Person {
	public void study() {
		System.out.println("�ú�ѧϰ,��������");
	}
}

class ArgsDemo2 {
	public static void main(String[] args) {
		PersonDemo pd = new PersonDemo();
		Person p = new Student();
		pd.method(p);
	}
}
*/
interface Person {
    public abstract void study();
}

class PersonDemo {
    public void method(Person p) {
        p.study();
    }
}

class Student implements Person {
    public void study() {
        System.out.println("�ú�ѧϰ,��������");
    }
}

class ArgsDemo2 {
    public static void main(String[] args) {
        PersonDemo pd = new PersonDemo();
        Person p = new Student();
        pd.method(p);
    }
}