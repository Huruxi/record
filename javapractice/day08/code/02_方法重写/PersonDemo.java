/*
	������дע�����
		A:������˽�з������ܱ���д
		B:������д���෽��ʱ������Ȩ�޲��ܸ���
			����һ�����ɡ�
		C:���ྲ̬����������Ҳ����ͨ����̬����������д��
*/
class Person {
    public void show() {
        System.out.println("show person");
    }

    private void show2() {
        System.out.println("show2 person");
    }

    public void show3() {
        System.out.println("show3 person");
    }

    public static void show4() {
        System.out.println("show4 person");
    }
}

class Student extends Person {
    public void show() {
        System.out.println("show student");
    }

    private void show2() {
        System.out.println("show2 student");
    }

    public void show3() {
        System.out.println("show3 student");
    }

    public static void show4() {
        System.out.println("show4 student");
    }
}

class PersonDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.show();
        //s.show2();
        s.show3();
        s.show4();
    }
}
