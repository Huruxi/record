package cn.itcast_04;

/*
 * public final void join():�ȴ����߳���ֹ��
 */
public class ThreadJoinDemo {
    public static void main(String[] args) {
        ThreadJoin tj1 = new ThreadJoin();
        ThreadJoin tj2 = new ThreadJoin();
        ThreadJoin tj3 = new ThreadJoin();

        tj1.setName("��Ԩ");
        tj2.setName("������");
        tj3.setName("��Ԫ��");

        tj1.start();
        try {
            tj1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        tj2.start();
        tj3.start();
    }
}
