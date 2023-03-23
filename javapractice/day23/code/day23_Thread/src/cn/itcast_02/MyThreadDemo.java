package cn.itcast_02;

/*
 * ��λ�ȡ�������߳�����?
 * public final String getName()
 * 		�����û���������ƣ�����һ��Ĭ�����ơ�Thread-���
 * public final void setName(String name)
 *
 * ��ʵͨ�����췽��Ҳ���Ը��߳�������?
 *
 * ����main�������ĸ��߳�����?
 * 		���߳�
 * 		��λ�ȡ���̵߳�������?
 * 		public static Thread currentThread():�����Ϳ��Ի�ȡ���ⷽ�����ڵ��߳�����
 */
public class MyThreadDemo {
    public static void main(String[] args) {
        // �޲�+setXxx()
        // MyThread mt1 = new MyThread();
        // MyThread mt2 = new MyThread();
        // mt1.setName("����ϼ");
        // mt2.setName("����");

        // ����
        MyThread mt1 = new MyThread("������");
        MyThread mt2 = new MyThread("���");

        mt1.start();
        mt2.start();

        System.out
                .println(Thread.currentThread().getName() + "AAAAAAAAAAAAAAA");
    }
}
