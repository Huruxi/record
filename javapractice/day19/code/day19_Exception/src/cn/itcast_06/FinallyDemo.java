package cn.itcast_06;

/*
 * finally:��finally���Ƶ������һ����ִ�С�
 * Ӧ�ã����ݿ�����ӣ�IO������ʱ��
 * ע�����
 * 		��ִ�е�finally֮ǰjvm�˳���
 */
public class FinallyDemo {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 0);
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.exit(0);
        } finally {
            // �ͷ���Դ�Ĳ���
            System.out.println("over");
        }
    }
}
