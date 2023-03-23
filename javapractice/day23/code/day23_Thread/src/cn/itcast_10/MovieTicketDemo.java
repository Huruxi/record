package cn.itcast_10;

/*
 * ���һ������һ��ȥ�ͼ�����������ʵ����һ��ͬ���ķ�������ͬ��������
 * ��ʽ�����ǰ�ͬ���ؼ��ּӵ�������
 *
 * ͬ����������������ʲô��?
 * 		ͬ����������������this
 *
 * ��̬ͬ����������������ʲô��?
 * 		��ǰ����ֽ����ļ�����
 * 			Class c = MovieTicket.class;
 * 			Class c = obj.getClass();
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
