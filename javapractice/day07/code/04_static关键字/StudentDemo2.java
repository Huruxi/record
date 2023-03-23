/*
	static:��̬�ؼ��֡�

	���ã�
		�������γ�Ա�����ͳ�Ա����

	�ص㣺
		A:������ļ��ض�����	
		B:�����ڶ������
		C:��������ж�����
			��Ҳ�������ж��Ƿ�ʹ�þ�̬�ؼ��ֵ�����

			��ˮ�������Ա���̬����
			ˮ���������Ա���̬����
		D:����ͨ����������
			���ǵĵ��üȿ����Ƕ��󣬻�����������
*/
class Student {
    public void show() {
        System.out.println("show");
    }

    public static void show2() {
        System.out.println("show2");
    }
}

class StudentDemo2 {
    public static void main(String[] args) {
        Student s = new Student();
        s.show();
        s.show2();

        Student.show2();
        //Student.show();
    }
}
