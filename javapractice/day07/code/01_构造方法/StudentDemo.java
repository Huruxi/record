/*
	���췽��������������ݽ��г�ʼ��

	�ص㣺
		A:��������������ͬ
		B:û�з���ֵ���ͣ���void��û��
		C:û�о���ķ���ֵ

	���췽���ĸ�ʽ��
		���η� ����(...) {
		
		}

	���췽����ע�����
		A:����㲻�ṩ���췽����ϵͳ�����Ĭ���޲ι��췽��
		B:������ṩ�˹��췽����ϵͳ�������ṩĬ���޲ι��췽��
			���ʱ������㻹�����ʹ���޲ι��췽����ֻ���Լ�������
			�Ƽ�����Զ�Լ������޲ι��췽����
		C:���췽��Ҳ�ǿ������ص�
		D:���췽���п�����return�����?
			���ԡ�ֻ������return;

*/
class Student {
    //��Ա����
    private String name;
    private int age;

    //���췽��
    public Student() {
        System.out.println("�����޲ι��췽��");
        //return;
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(int age) {
        this.age = age;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //getXxx()/setXxx()����
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

    //��ʾ���г�Ա�����ķ���
    public void show() {
        System.out.println("�����ǣ�" + name + ",�����ǣ�" + age);
    }
}

class StudentDemo {
    public static void main(String[] args) {
        //��������
        Student s = new Student();
        s.show();

        //��������
        Student s2 = new Student("����ϼ");
        s2.show();

        //��������
        Student s3 = new Student(28);
        s3.show();

        //��������
        Student s4 = new Student("����ϼ", 28);
        s4.show();
    }
}