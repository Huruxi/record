package cn.itcast_04;

/*
 * public final void setDaemon(boolean on):���������е��̶߳����ػ��߳�ʱ��Java ������˳���
 *
 * ������̹�˴�ս
 */
public class ThreadDaemonDemo {
    public static void main(String[] args) {
        Thread.currentThread().setName("����");

        ThreadDaemon td1 = new ThreadDaemon();
        ThreadDaemon td2 = new ThreadDaemon();

        td1.setName("����");
        td2.setName("�ŷ�");

        // �����ػ��߳�
        td1.setDaemon(true);
        td2.setDaemon(false);

        td1.start();
        td2.start();

        for (int x = 0; x < 5; x++) {
            System.out.println(Thread.currentThread().getName() + ":" + x);
        }
    }
}
