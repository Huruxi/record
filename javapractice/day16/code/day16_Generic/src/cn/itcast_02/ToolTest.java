package cn.itcast_02;

/*
 * ��Object���������ǵĳ��������չ�ԡ�
 * ���������ǣ�����������ת���쳣��
 * ���ԣ����ֽ�����������ر�ĺá�
 * ���ʱ��java���ṩ�˷��ͼ�����
 */
public class ToolTest {
    public static void main(String[] args) {
        Student s = new Student();
        Teacher t = new Teacher();

        // Tool t = new Tool();
        // t.setStudent(s);
        // Student ss = t.getStudent();
        // ss.love();

        Tool tool = new Tool();
        // ����ΪStudent
        tool.setObj(s);
        Student ss = (Student) tool.getObj();
        ss.love();

        // ����ΪTeacher
        tool.setObj(t);
        Teacher tt = (Teacher) tool.getObj();
        tt.love();

        Student sss = (Student) tool.getObj();
        sss.love();
    }
}
