package cn.itcast_04;

/*
 *getMessage():��ȡ�쳣��Ϣ�������ַ�����
 *toString():��ȡ�쳣�������쳣��Ϣ�������ַ�����
 *printStackTrace():��ȡ�쳣�������쳣��Ϣ���Լ��쳣�����ڳ����е�λ�á�����ֵvoid��
 */
public class ExceptionDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            System.out.println(a / b); // ����������쳣���ͻ������ﴴ��һ���쳣�Ķ���new
            // ArithmeticException();
            // Ȼ�����Ÿ��쳣���󣬵�catch����ȥƥ�䡣

        } catch (ArithmeticException e) { // ArithmeticException e = new
            // ArithmeticException();
            // System.out.println(e.toString());
            // System.out.println("��������Ϊ0");

            // System.out.println(e.getMessage()); // by zero
            // System.out.println(e.toString());
            e.printStackTrace();
        }

        System.out.println("over");
    }
}
