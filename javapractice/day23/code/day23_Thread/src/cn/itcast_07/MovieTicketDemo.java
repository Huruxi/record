package cn.itcast_07;

/*
 * ʵ��Runnable�ӿ�
 */
public class MovieTicketDemo {
    public static void main(String[] args) {
        // ����һ��Ʊ��Դ
        MovieTicket mt = new MovieTicket();

        // ���������߳�
        Thread t1 = new Thread(mt, "����1");
        Thread t2 = new Thread(mt, "����2");
        Thread t3 = new Thread(mt, "����3");

        t1.start();
        t2.start();
        t3.start();
    }
}
