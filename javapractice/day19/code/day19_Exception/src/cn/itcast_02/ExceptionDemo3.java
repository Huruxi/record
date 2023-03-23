package cn.itcast_02;

/*
 * throws���������ڷ����������쳣�������㣬��������������⡣��ʹ�õ�ʱ��Ҫע���ˡ�
 */
public class ExceptionDemo3 {
    public static void main(String[] args) {
        // try {
        // method();
        // } catch (ArithmeticException e) {
        // System.out.println("��������Ϊ0");
        // }
        method();

        System.out.println("haha");
    }

    public static void method() throws ArithmeticException {
        System.out.println("hello");

        int a = 10;
        int b = 0;
        System.out.println(a / b);

        System.out.println("world");
    }

}
