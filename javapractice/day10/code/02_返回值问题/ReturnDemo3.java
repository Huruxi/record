//����ֵ�����ǽӿڣ���ʵ���ص��ǽӿڵ�ʵ�������
interface Person {
    public abstract void study();
}

class PersonDemo {
    public Person getPerson() {
        return new Student();
    }
}

class Student implements Person {
    public void study() {
        System.out.println("�ú�ѧϰ����������");
    }
}

class ReturnDemo3 {
    public static void main(String[] args) {
        //PersonDemo pd = new PersonDemo();
        //Person p = pd.getPerson();
        //p.study();

        //��ʽ���
        new PersonDemo().getPerson().study();
    }
}