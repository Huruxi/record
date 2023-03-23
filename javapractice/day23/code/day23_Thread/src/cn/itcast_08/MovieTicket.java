package cn.itcast_08;

public class MovieTicket implements Runnable {
    // ����100��Ʊ
    private int tickets = 100;

    // @Override
    // public void run() {
    // while (true) {
    // // ����tickets = 50; t1,t2,t3�ֱ�����������
    // if (tickets > 0) {
    // // ��������ʵ���
    // try {
    // Thread.sleep(100); // t1˯����,t2˯����
    // } catch (InterruptedException e) {
    // e.printStackTrace();
    // }
    //
    // System.out.println(Thread.currentThread().getName() + "���ڳ��۵�"
    // + (tickets--) + "��Ʊ");
    // // �������
    // // ����1���ڳ��۵�50��Ʊ��tickets=49
    // // ����2���ڳ��۵�49��Ʊ��tickets=48
    // // һ��CPU��ʱ����ܹ�ִ�еĶ���������һ��ԭ���ԵĶ�����
    // // System.out.println(a+b*c);
    // // Thread.currentThread().getName() + "���ڳ��۵�"+ (tickets--) +
    // // "��Ʊ"
    // // ������ʵ�кܶ��������ִ�С�
    // // ���赱������ո���� ����1���ڳ��۵�50��Ʊ,�����ʱ��t1û����ִ��Ȩ��t2�����ˣ��������
    // // ����2���ڳ��۵�50��Ʊ
    //
    // }
    // }
    // }

    @Override
    public void run() {
        while (true) {
            // ����tickets = 1; t1,t2,t3�ֱ�����������
            if (tickets > 0) {
                // ��������ʵ���
                try {
                    Thread.sleep(100);// t1������,t2������,t3������
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                // �����ѹ���
                System.out.println(Thread.currentThread().getName() + "���ڳ��۵�"
                        + (tickets--) + "��Ʊ");
                // ����1���ڳ��۵�1��Ʊ��tickets=0
                // ����2���ڳ��۵�0��Ʊ��tickets=-1
                // ����3���ڳ��۵�-1��Ʊ��tickets=-2
            }
        }
    }
}
