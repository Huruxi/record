//�������ֵ��һ�������������ͣ���ô�����صľ��Ǹû������͵�ֵ��
class Demo {
    public int sum(int a, int b) {
        return a + b;
    }
}

class ReturnDemo {
    public static void main(String[] args) {
        int x = new Demo().sum(10, 20);
        System.out.println(x);
    }
}