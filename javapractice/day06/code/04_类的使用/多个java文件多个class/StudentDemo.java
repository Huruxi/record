//������
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