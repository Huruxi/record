//��̬�������Ǳ����ж�����ģ��Ǿ�̬����ÿ���������еġ�
class Student {
    String name;
    int age;
    static String classNumber;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name, int age, String classNumber) {
        this.name = name;
        this.age = age;
        this.classNumber = classNumber;
    }

    public void show() {
        System.out.println(name + "---" + age + "---" + classNumber);
    }
}

class StudentDemo4 {
    public static void main(String[] args) {
        Student s1 = new Student("����", 28, "sgyy001");
        Student s2 = new Student("С��", 20);
        Student s3 = new Student("����", 18);

        s1.show();
        s2.show();
        s3.show();

        s2.name = "�ܲ�";
        s2.classNumber = "sgyy007";

        s1.show();
        s2.show();
        s3.show();
    }
}