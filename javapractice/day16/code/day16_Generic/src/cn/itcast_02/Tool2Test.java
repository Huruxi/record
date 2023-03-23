package cn.itcast_02;

/*
 * ������Ĭ������£���Object���͡�
 */
public class Tool2Test {
    public static void main(String[] args) {
        Student s = new Student();
        Teacher t = new Teacher();

        // Tool2 tool = new Tool2();
        // // ����ΪStudent
        // tool.setQq(s);
        // Student ss = (Student) tool.getQq();
        // ss.love();
        // // ����ΪTeacher
        // tool.setQq(t);
        // Teacher tt = (Teacher) tool.getQq();
        // tt.love();
        // Student sss = (Student) tool.getQq();
        // sss.love();

        Tool2<Student> tool = new Tool2<Student>();
        tool.setQq(s);
        Student ss = tool.getQq();
        ss.love();

        // tool.setQq(t); // �����ڼ�͸����㣬����ˣ����Ѿ���ȷ�ˣ�Student����

        Tool2<Teacher> tool2 = new Tool2<Teacher>();
        tool2.setQq(t);
        Teacher tt = tool2.getQq();
        tt.love();
    }
}
