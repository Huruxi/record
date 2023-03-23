package cn.itcast_04;

/*
 * ���õĻ�������ת��
 *		public static String toBinaryString(int i)
 *		public static String toOctalString(int i)
 *		public static String toHexString(int i)
 * ʮ���Ƶ���������
 *		public static String toString(int i,int radix)
 *�������Ƶ�ʮ����
 *		public static int parseInt(String s,int radix)
 */
public class IntegerDemo {
    public static void main(String[] args) {
        // public static String toString(int i,int radix):
        // ͨ���򵥵Ĳ��ԣ�����֪���˽��Ƶķ�Χ��2-36
        System.out.println(Integer.toString(100, 2));
        System.out.println(Integer.toString(100, 8));
        System.out.println(Integer.toString(100, 16));
        System.out.println(Integer.toString(100, 1));
        System.out.println(Integer.toString(100, 100));
        System.out.println(Integer.toString(100, 50));
        System.out.println(Integer.toString(100, 25));
        System.out.println(Integer.toString(100, 37));
        System.out.println(Integer.toString(100, 32));
        System.out.println(Integer.toString(100, 35));
        System.out.println(Integer.toString(100, 36));
        System.out.println(Integer.toString(100, 7));
        System.out.println("----------------------");

        // �������Ƶ�ʮ����
        // public static int parseInt(String s,int radix)
        System.out.println(Integer.parseInt("100", 2));
        System.out.println(Integer.parseInt("100", 8));
        System.out.println(Integer.parseInt("100", 16));
        System.out.println(Integer.parseInt("300", 12));

    }
}
