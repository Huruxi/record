package cn.itcast_03;

/*
 * �ɱ���������巽����ʱ��֪���ö�����ٸ�����
 * ��ʽ��
 * 		���η� ����ֵ���� ������(�������͡�  ������){
 *
 * 		}
 * ע�����
 * 		A:����ı�����ʵ��һ�����顣�����Զ��Ѳ�����װ��һ����������ȥ��
 * 		B:һ�������еĿɱ����ֻ�ܳ�������ʽ���������
 */
public class ArgsDemo {
    public static void main(String[] args) {
//		System.out.println(sum());

        int a = 10;
        int b = 20;
        int result = sum(a, b);
        System.out.println(result);

        int c = 30;
        result = sum(a, b, c);
        System.out.println(result);

        int d = 40;
        result = sum(a, b, c, d);
        System.out.println(result);

        // ������Ҫ�������͹��ܣ�������2-100����Ŀǰ��Ҳ��֪�����ٸ�?���õ�ʱ���Ҿ�֪���ˣ������ṩ����?
        // ��ô��?��2����ʼ��һֱ��100�������ԣ�����̫�鷳��
        // ��û�и��õķ�����?�С���Բ�����������ȷ�������java���ṩ��һ���������ɱ�������÷���
        result = sum(10, 20, 30, 40, 50);
        System.out.println(result);
        result = sum(10, 20, 30, 40, 50, 60, 70, 80, 90);
        System.out.println(result);
    }

    public static int sum(int b, int... a) {
        // [I@7821f46a
        // System.out.println(a);
        int result = 0;
        for (int i : a) {
            result += i;
        }
        return result;
    }

    // public static int sum(int a, int b) {
    // return a + b;
    // }
    //
    // public static int sum(int a, int b, int c) {
    // return a + b + c;
    // }
    //
    // public static int sum(int a, int b, int c, int d) {
    // return a + b + c + d;
    // }

}
