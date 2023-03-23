package cn.itcast_03;

/*
 * �̵߳ĵ��ȣ�����
 * ��ʱ����ģ��   ƽ������
 * ��ռʽ����ģ��   ˭���ȼ���˭��ִ��
 * java���õ�����ռʽ����ģ�͡�
 *
 * java����λ�ȡ�������̵߳����ȼ���?
 * �������ڲ�û�и���ÿ���̵߳����ȼ������ǣ���һ�������ܡ�˵���ˣ���Ӧ������Ĭ�����ȼ���
 * public final int getPriority():�����̵߳����ȼ��� ͨ�����ԣ�����֪���̵߳�Ĭ�����ȼ���5
 *
 * public final void setPriority(int newPriority):�����̵߳����ȼ��� ͨ���鿴Դ�룬����֪���̵߳����ȼ���Χ�ǣ�1-10��Ĭ����5
 *
 * �̵߳����ȼ��ߣ�������һ������ִ����ϡ�ֻ���ڴ����ر�������£��������ֳ�����
 */
public class ThreadPriorityDemo {
    public static void main(String[] args) {
        // ���������̶߳���
        ThreadPriority tp1 = new ThreadPriority();
        ThreadPriority tp2 = new ThreadPriority();
        ThreadPriority tp3 = new ThreadPriority();

        // ͨ��setName()����
        tp1.setName("��������");
        tp2.setName("����Ⱥ");
        tp3.setName("��ƽ֮");

        // ��ȡĬ�����ȼ�
        // System.out.println(tp1.getPriority());
        // System.out.println(tp2.getPriority());
        // System.out.println(tp3.getPriority());

        // �����߳����ȼ�
        // IllegalArgumentException
        // tp1.setPriority(1000);
        System.out.println(tp1.getPriority());
        System.out.println(tp2.getPriority());
        System.out.println(tp3.getPriority());

        tp1.setPriority(10);
        tp2.setPriority(1);

        // �����߳�
        tp1.start();
        tp2.start();
        tp3.start();
    }
}
