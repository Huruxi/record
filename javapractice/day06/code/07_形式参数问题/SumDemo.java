//����������Ϊ��ʽ�������ݣ�ֱ�Ӵ��ݻ������͵�ֵ���ɡ�

//����Demo�࣬дһ������ʵ�����
class Demo {
    public int sum(int a, int b) {
        return a + b;
    }
}

//������
class SumDemo {
    public static void main(String[] args) {
        //�������
        int a = 10;
        int b = 20;

        //��������
        Demo d = new Demo();
        int result = d.sum(a, b);
        System.out.println("����ǣ�" + result);
    }
}