package cn.itcast_05;

/*
 * ʵ��Runnable�ӿڵĲ��裺
 * A:������MyRunnableʵ�ֽӿ�Runnable
 * B:��дrun()����
 * C:����MyRunnable�Ķ���
 * D:����Thread��Ķ��󣬲���C����Ķ�����Ϊ�����������
 * E:�����߳�
 *
 * ���˼̳�Thread��ķ�ʽ��Ϊʲô��Ҫ��ʵ��Runnable�ӿڵķ�ʽ?
 * ԭ������Ϊ���ǵ��̳С�
 */
public class MyRunnableDemo {
    public static void main(String[] args) {
        // ����MyRunnable�Ķ���
        MyRunnable my = new MyRunnable();

        // ����Thread��Ķ��󣬲���C����Ķ�����Ϊ�����������
        // Thread(Runnable target)
        // Thread(Runnable target, String name)
        Thread t1 = new Thread(my, "�Ϸ�");
        Thread t2 = new Thread(my, "�ּ�");

        // �����߳�
        t1.start();
        t2.start();
    }
}
