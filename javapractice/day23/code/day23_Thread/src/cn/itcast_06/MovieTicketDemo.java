package cn.itcast_06;

/*
 * ĳ��ӰԺĿǰ������ӳ�����Ƭ������100��Ʊ��������3����Ʊ������Ʊ�������һ������ģ��õ�ӰԺ��Ʊ��
 * ͨ�����ǵ�ѧϰ�����Ǵ���Ŀ��Է�����Ӧ���������߳�ִ����Ʊ�Ķ�����
 *
 * ʵ�ַ�����
 * 		A:�̳�Thread
 * 		B:ʵ��Runnable�ӿ�
 *
 * �̳�Thread
 */
public class MovieTicketDemo {
    public static void main(String[] args) {
        // ���������̶߳���
        MovieTicket mt1 = new MovieTicket();
        MovieTicket mt2 = new MovieTicket();
        MovieTicket mt3 = new MovieTicket();

        mt1.setName("����1");
        mt2.setName("����2");
        mt3.setName("����3");

        mt1.start();
        mt2.start();
        mt3.start();
    }
}
