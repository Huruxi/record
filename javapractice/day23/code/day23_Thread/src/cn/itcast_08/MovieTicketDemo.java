package cn.itcast_08;

/*
 * Ϊ�˸�������ʵ��������Ǽ�һЩ�ӳ١�
 * �����Ǽ�����һЩ��ʱ֮�󣬳������������⣺
 * A:��ͬ��Ʊ�����˶��
 * 		CPU��һ�β���������ԭ���Ե�
 * B:�������˸���Ʊ�����
 * 		����Ժ��ӳٵ��µ�
 *
 * Ϊʲô�������������������?ʲô����»�����̰߳�ȫ������?
 * A:���̻߳���
 * B:�й�������
 * C:������������������
 *
 * ��ô���Ǹ���ν����?
 */
public class MovieTicketDemo {
    public static void main(String[] args) {
        // ����һ��Ʊ��Դ
        MovieTicket mt = new MovieTicket();

        // ���������߳�
        Thread t1 = new Thread(mt, "����1");
        Thread t2 = new Thread(mt, "����2");
        Thread t3 = new Thread(mt, "����3");
        Thread t4 = new Thread(mt, "����4");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
