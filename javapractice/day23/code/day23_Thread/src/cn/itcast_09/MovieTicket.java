package cn.itcast_09;

class Demo {
}

public class MovieTicket implements Runnable {
    // ����100��Ʊ
    private int tickets = 100;

    // private Object obj = new Object();
    private Demo d = new Demo();

    @Override
    public void run() {
        while (true) {
            // t1,t2,t3
            // t1�����ˣ�������ͬ������������ǣ���ɫ���(���ϲ���������·�ĺ��̵�)
            // t2,t3��ֻ��������ɵɵ�ĵȴ�
            synchronized (this) {
                // t1�ͽ����ˣ������޸ı��Ϊ��ɫ���
                if (tickets > 0) {
                    // ��������ʵ���
                    try {
                        Thread.sleep(100); // t1��Ϣ��
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread().getName()
                            + "���ڳ��۵�" + (tickets--) + "��Ʊ");
                }
            }
            // t1�����ˣ������޸ı��Ϊ��ɫ���
        }
    }
}
