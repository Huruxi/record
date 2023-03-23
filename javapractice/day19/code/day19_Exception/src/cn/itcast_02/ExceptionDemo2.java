package cn.itcast_02;

/*
 * ����쳣�������
 * A:���ÿ���쳣������һ������
 * B:try...catch...catch...catch...
 * 		ע�⣺
 * 			a:һ��try����Ĵ��������⣬�Ͳ���ִ��try��������ݣ���catch������������ε�ƥ�䣬һ����һ��ƥ�䣬�����Ĳ�ִ�С�
 * 			b:����쳣��ƽ����ϵ��˭��˭������ν��
 *            ����쳣����ƽ����ϵ�����ȸ���
 *
 * JDK7�������ԣ����ƽ����ϵ��
 * 		catch(�쳣1 | �쳣2 | �쳣3 ... e) {}
 */
public class ExceptionDemo2 {
    public static void main(String[] args) {
        // method1();

        // method2();

        method3();
    }

    public static void method3() {
        int a = 10;
        int b = 0;
        int[] arr = {1, 2, 3};

        try {
            System.out.println(a / b);
            System.out.println(arr[3]);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("�����������");
        }
        System.out.println("over");
    }

    public static void method2() {
        int a = 10;
        int b = 0;
        int[] arr = {1, 2, 3};

        try {
            System.out.println(a / b);
            System.out.println(arr[3]);
        } catch (ArithmeticException e) {
            System.out.println("��������Ϊ0");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("����Խ���쳣");
        } catch (Exception e) {
            System.out.println("�����������");
        }

        System.out.println("over");
    }

    public static void method1() {
        int a = 10;
        int b = 0;
        try {
            System.out.println(a / b); // ArithmeticException: / by zero
        } catch (ArithmeticException e) {
            System.out.println("��������Ϊ0");
        }

        int[] arr = {1, 2, 3};
        try {
            System.out.println(arr[3]); // ArrayIndexOutOfBoundsException: 3
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("����Խ���쳣");
        }

        System.out.println("over");
    }
}
