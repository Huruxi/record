//����������Ϊ�������ݣ���Ҫ�����Ƕ���(��ֵַ)
//����ѧ���࣬������ѧϰ����
class Student {
    public void study() {
        System.out.println("ѧ����ѧϰ");
    }
}

class StudentDemo {
    //Student���࣬���������������͡�
    public void test(Student s) {
        s.study();
    }
}

class StudentTest {
    public static void main(String[] args) {
        //��ε�����?
        StudentDemo sd = new StudentDemo();
        Student s = new Student();
        sd.test(s);
    }
}