package cn.itcast_02;

/*
 * java��������δ����쳣��?
 * A:try��catch��finally
 * B:throws
 *
 * try��catch��finally��ʽ
 * try {
 * 		���ܳ�������Ĵ���
 * }catch(�쳣���� ����) {
 * 		�������Ĵ���
 * }finally {
 * 		�ͷ���Դ�Ĵ���
 * }
 *
 * finally�Ȼ��ڽ������ԣ����ʱ��������ʹ�ü򵥵ĸ�ʽ��
 * try {
 * 		���ܳ�������Ĵ���
 * }catch(�쳣���� ����) {
 * 		�������Ĵ���
 * }
 *
 * �����ܵİѿ��ܳ�������Ĵ�����try������������жϲ�����Щ�����⣬���Զ����һЩ��
 */
public class ExceptionDemo {
    public static void main(String[] args) {
        System.out.println("hello");

        int a = 10;
        int b = 0;
        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("��������Ϊ0");
            // ʵ�ʿ�����ʱ��Ӧ�ø�������ҳ����ʽ����ʾ
        }

        System.out.println("world");
    }
}
