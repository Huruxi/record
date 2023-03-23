package cn.itcast_01;

/*
 * Math��������ѧ�������ࡣ�������Ǿ�̬��
 */
public class MathDemo {
    public static void main(String[] args) {
        // public static int abs(int a):����ֵ
        System.out.println("abs:" + Math.abs(12));
        System.out.println("abs:" + Math.abs(-12));
        System.out.println("--------------------");

        // public static double ceil(double a):���ڵ��ڲ�������С����ֵ
        System.out.println("ceil:" + Math.ceil(12.34));
        System.out.println("ceil:" + Math.ceil(12.56));
        System.out.println("--------------------");

        // public static double floor(double a):С�ڵ��ڲ������������ֵ
        System.out.println("floor:" + Math.floor(12.34));
        System.out.println("floor:" + Math.floor(12.56));
        System.out.println("--------------------");

        // public static int max(int a,int b) min��ѧ
        System.out.println("max:" + Math.max(12, 23));
        // ������Ƕ�׵���
        System.out.println("max:" + Math.max(Math.max(24, 47), 23));
        System.out.println("--------------------");

        // public static double pow(double a,double b)
        System.out.println("pow:" + Math.pow(2, 3));
        System.out.println("pow:" + Math.pow(5, 5));
        System.out.println("--------------------");

        // public static double random():�����������[0.0,1.0)

        // public static int round(float a) ����Ϊdouble����ѧ
        System.out.println("round:" + Math.round(12.34f));
        System.out.println("round:" + Math.round(12.56f));
        System.out.println("--------------------");

        // public static double sqrt(double a):��ƽ����
        System.out.println("sqrt:" + Math.sqrt(16));
    }
}
