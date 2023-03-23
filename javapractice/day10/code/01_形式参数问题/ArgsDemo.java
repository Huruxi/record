//��ʽ��������ǻ������ͣ�ֻ��Ҫ���ݸû������͵�ֵ���ɡ�
class Demo {
    public int sum(int a, int b) {
        return a + b;
    }
}

class ArgsDemo {
    public static void main(String[] args) {
        Demo d = new Demo();

        //����
        int x = 10;
        int y = 20;
        int z = d.sum(x, y);

        //����
        int a = d.sum(10, 20);

        System.out.println(z);
        System.out.println(a);
    }
}