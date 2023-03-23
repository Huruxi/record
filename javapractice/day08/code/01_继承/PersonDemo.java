/*
	ѧ�������ʦ��������������(�Է���˯��)

	ѧ���ࣺ
		��Ա����������������
		��Ա������getXxx()/setXxx(),eat(),sleep()
	��ʦ�ࣺ
		��Ա����������������
		��Ա������getXxx()/setXxx(),eat(),sleep()

	��ȡ�����ԵĶ������嵽һ�����У�
	���ࣺ
		��Ա����������������
		��Ա������getXxx()/setXxx(),eat(),sleep()

	ѧ���� �̳� ����
	��ʦ�� �̳� ����

	�̳еĺô���
		A:����˴���ĸ�����
		B:����˴����ά����
		C:��������֮������˹�ϵ���Ƕ�̬��ǰ��

	�̳еı׶ˣ��������Ժ�ǿ
		���ԭ�򣺵���ϣ����ھۡ�
		��ϣ�������Ĺ�ϵ��
		�ھۣ��Լ���������������
*/
//����
class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void eat() {
        System.out.println("�Է�");
    }

    public void sleep() {
        System.out.println("˯��");
    }
}

//ѧ����
class Student extends Person {
    public Student() {
    }

	/*
	public Student(String name,int age) {
		this.name = name;
		this.age = age;
	}
	*/
}

//��ʦ��
class Teacher extends Person {
}

class PersonDemo {
    public static void main(String[] args) {
        //ѧ����
        Student s = new Student();
        s.setName("������");
        s.setAge(27);
        System.out.println(s.getName() + "---" + s.getAge());
        s.eat();
        s.sleep();
        System.out.println("--------------------------");

        //��ʦ��
        Teacher t = new Teacher();
        t.setName("������");
        t.setAge(25);
        System.out.println(t.getName() + "---" + t.getAge());
        t.eat();
        t.sleep();
    }
}