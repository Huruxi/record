package cn.itcast_09;

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
 * 		���ǰ��ж����������������ݵĵط�����Χ������Ȼ�������һ�������ˡ�
 * 		Ȼ��������������������Ϳ��Խ����������ˡ�
 *
 * �ؼ��������������?
 * 		���ʱ��java���ṩ��һ��������ͬ������顣
 *
 * 		��ʽ��
 * 			synchronized(����){
 * 				��Ҫͬ���Ĵ���;
 * 			}
 *
 * 		���󵽵���ʲô������?
 * 			��������
 * 			����̵߳����������һ�¡�
 *
 * 		ͬ�������Ķ����������Щ��?
 * 			����������Ķ���
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
