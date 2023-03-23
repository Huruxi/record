/*
	ִ�й��̣���̬����� --> �������� --> ���췽�� --> �ֲ������

	��̬����飺ִֻ��һ�Ρ�
	�������⣺ÿ�δ�������ִ�С�
*/
class Student {
    static {
        System.out.println("AAAAA");
    }

    {
        System.out.println("BBBBB");
    }

    public Student() {
        {
            System.out.println("CCCCC");
        }
    }

    static {
        System.out.println("DDDDD");
    }

    {
        System.out.println("EEEEE");
    }
}

class CodeTest {
    public static void main(String[] args) {
        Student s = new Student();
        Student ss = new Student();
    }
}