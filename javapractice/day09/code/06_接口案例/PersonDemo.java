/*
	��ʦ��ѧ������,������̵Ķ��⹦��

	Smoking:
		���̵Ĺ���

	��ʦ��
		��Ա����������������
		���췽�����޲Σ�����
		��Ա������getXxx()/setXxx(),ѧϰ��˯��
	ѧ����
		��Ա����������������
		���췽�����޲Σ�����
		��Ա������getXxx()/setXxx(),ѧϰ��˯��

	ͨ����ʦ��ѧ�����ǿ��Է��������ࣺ
		
	�ˣ�
		��Ա����������������
		���췽�����޲Σ�����
		��Ա������getXxx()/setXxx(),ѧϰ()��˯��(){}

	���յķ�����
	�ˣ�������
		��Ա����������������
		���췽�����޲Σ�����
		��Ա������getXxx()/setXxx(),ѧϰ()��˯��(){}
			��ʦ
				������ʦ����
			ѧ��
				����ѧ������
	Smoking:�ӿ�
		���̵Ĺ���
*/
//���̽ӿ�
interface Smoking {
    public abstract void smoke();
}

//�˳�����
abstract class Person {
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

    //˯��
    public void sleep() {
        System.out.println("˯��");
    }

    //ѧϰ
    public abstract void study();
}

//��ʦ
class Teacher extends Person {
    public Teacher() {
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    public void study() {
        System.out.println("��ʦҪѧϰ��ΰ�֪ʶ������");
    }
}

//���ֳ�����ʦ
class SmokeTeacher extends Teacher implements Smoking {
    public SmokeTeacher() {
    }

    public SmokeTeacher(String name, int age) {
        super(name, age);
    }

    public void smoke() {
        System.out.println("�����̵���ʦ");
    }
}

//ѧ��
class Student extends Person {
    public Student() {
    }

    public Student(String name, int age) {
        super(name, age);
    }

    public void study() {
        System.out.println("ѧ��Ҫ�ú�ѧϰ����������");
    }
}

//���ֳ���ѧ��
class SmokeStudent extends Student implements Smoking {
    public SmokeStudent() {
    }

    public SmokeStudent(String name, int age) {
        super(name, age);
    }

    public void smoke() {
        System.out.println("�����̵�ѧ��");
    }
}

//������
class PersonDemo {
    public static void main(String[] args) {
        //SmokeTeacher
        SmokeTeacher st = new SmokeTeacher();
        st.setName("����ү");
        st.setAge(35);
        System.out.println(st.getName() + "---" + st.getAge());
        st.sleep();
        st.study();
        st.smoke();
        System.out.println("--------------------------");

        SmokeTeacher st2 = new SmokeTeacher("���Ǽ��ȷ�", 30);
        System.out.println(st2.getName() + "---" + st2.getAge());
        st2.sleep();
        st2.study();
        st2.smoke();
    }
}