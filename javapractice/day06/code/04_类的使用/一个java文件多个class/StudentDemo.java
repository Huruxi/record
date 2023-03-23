/*
	һ��.java�ļ��п����ж������?
		���ԡ�
	
	�������public���κ���Ӧ�������ĸ�����?
		���δ�main�����ġ�����һ������ֻӦ����һ���౻public����
		Ŀǰ��дpublic���εġ�
	
	����ڲ�������ʹ��һ������?
		��������ʹ����ĳ�Ա
	��δ���������?
		��ʽ��
			���� ������ = new ����();
	���ʹ����ĳ�Ա��?
		��Ա����������.������;
		��Ա����������.������(...);

	ע�⣺
		�������͵�Ĭ��ֵ��null��
*/
class Student {
    //ѧ��
    String sid;
    //����
    String name;
    //����
    int age;

    //ѧϰ�ķ���
    //ѧϰ�ķ���
    public void study() {
        System.out.println("ѧ����ѧϰ");
    }

    //�Է��ķ���
    public void eat() {
        System.out.println("ѧ��Ҫ�Է�");
    }

    //˯���ķ���
    public void sleep() {
        System.out.println("ѧ����˯��");
    }
}

class StudentDemo {
    public static void main(String[] args) {
        //����ѧ������
        Student s = new Student();

        //���������
        System.out.println(s); //Student@1afb7ac7

        //�����Ա����
        System.out.println("ѧ���ǣ�" + s.sid); //null
        System.out.println("�����ǣ�" + s.name);//null
        System.out.println("�����ǣ�" + s.age); //0
        System.out.println("--------------");

        //����Ա������ֵ
        s.sid = "itcast001";
        s.name = "����ϼ";
        s.age = 28;

        //�ٴ������Ա����
        System.out.println("ѧ���ǣ�" + s.sid); //itcast001
        System.out.println("�����ǣ�" + s.name);//����ϼ
        System.out.println("�����ǣ�" + s.age); //28
        System.out.println("--------------");

        //ʹ�ó�Ա����
        s.study();
        s.eat();
        s.sleep();
    }
}