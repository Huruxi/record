/*
	��ʦ����
		���������������ʦ����ҵ����ʦ
		���ԣ����������䣬���Ρ�
*/
abstract class Teacher {
    private String name;
    private int age;

    public Teacher() {
    }

    public Teacher(String name, int age) {
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

    //���󷽷�
    public abstract void teach();
}

class BasicTeacher extends Teacher {
    public BasicTeacher() {
    }

    public BasicTeacher(String name, int age) {
        super(name, age);
    }

    public void teach() {
        System.out.println("��������ʦ����JavaSE");
    }
}

//��ϰ1����ҵ����ʦ�Ĵ���

class TeacherDemo {
    public static void main(String[] args) {
        //���Ի�������ʦ
        BasicTeacher bt = new BasicTeacher();
        bt.setName("����ϼ");
        bt.setAge(28);
        System.out.println(bt.getName() + "---" + bt.getAge());
        bt.teach();
        System.out.println("----------------------------");

        BasicTeacher bt2 = new BasicTeacher("����ϼ", 28);
        System.out.println(bt2.getName() + "---" + bt2.getAge());
        bt2.teach();
        System.out.println("----------------------------");

        //��̬����
        Teacher t = new BasicTeacher();
        t.setName("����ϼ");
        t.setAge(28);
        System.out.println(t.getName() + "---" + t.getAge());
        t.teach();
        System.out.println("----------------------------");

        Teacher t2 = new BasicTeacher("����ϼ", 28);
        System.out.println(t2.getName() + "---" + t2.getAge());
        t2.teach();
        System.out.println("----------------------------");

        //��ϰ2����ҵ����ʦ���ԣ���̬����
    }
}

//��ϰ3��ѧ������
//�������񣺻�����ѧԱ����ҵ��ѧԱ
//���ԣ����������䣬�༶��ѧϰ���Է�
//�Լ��������Լ�д���룬�Լ�����