package cn.itcast_01;

/*
 * ����1���Ҹ�����һ�����ݣ���Ҫ�ж���������ǲ�����int��Χ��?��ô����?
 * ����2���Ҹ���һ������100����Ҫ�õ����Ķ����ƣ��˽��ƣ�ʮ������? �����ƣ�����ƣ��߽���???
 * ��ô����û�бȽϼ򵥵ķ�ʽ��������ʵ��������������?�С�
 * �������������������ģ���Ϊ��������û�й��ܿ���ʹ�á����ԣ����ֵĲ�����������й���ʵ�֡�
 * Ȼ�����ǵ��ù��ܼ��ɡ�
 * Ϊ�˼�������Ի����������ݵĸ����ӵĲ�����java�����ÿ�ֻ��������ṩ��һ����װ�����ͣ��������Ͱ�װ�ࡣ
 * byte		Byte
 * short	Short
 * int		Integer
 * long		Long
 * float	Float
 * double	Double
 * char		Character
 * boolean	Boolean
 */
public class IntegerDemo {
    public static void main(String[] args) {
        // public static final int MAX_VALUE
        // public static final int MIN_VALUE
        // if(����>=Integer.MIN_VALUE && ����<=Integer.MAX_VALUE){}

        // public static String toBinaryString(int i)
        System.out.println(Integer.toBinaryString(100));
        // public static String toOctalString(int i)
        System.out.println(Integer.toOctalString(100));
        // public static String toHexString(int i)
        System.out.println(Integer.toHexString(100));
    }
}
