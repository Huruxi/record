package cn.itcast_10;

class Demo {
}

public class MovieTicket implements Runnable {
    // ����100��Ʊ
    private static int tickets = 100;
    private Object obj = new Object();
    private int x = 0;

    // �Ľ�Ϊif...else��ʵ��
    // @Override
    // public void run() {
    // while (true) {
    // if (x % 2 == 0) {
    // synchronized (obj) {
    // if (tickets > 0) {
    // try {
    // Thread.sleep(100);
    // } catch (InterruptedException e) {
    // e.printStackTrace();
    // }
    //
    // System.out.println(Thread.currentThread().getName()
    // + "���ڳ��۵�" + (tickets--) + "��Ʊ");
    // }
    // }
    // } else {
    // synchronized (obj) {
    // if (tickets > 0) {
    // try {
    // Thread.sleep(100);
    // } catch (InterruptedException e) {
    // e.printStackTrace();
    // }
    //
    // System.out.println(Thread.currentThread().getName()
    // + "���ڳ��۵�" + (tickets--) + "��Ʊ");
    // }
    // }
    // }
    // x++;
    // }
    // }

    @Override
    public void run() {
        while (true) {
            if (x % 2 == 0) {
                synchronized (MovieTicket.class) {
                    if (tickets > 0) {
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        System.out.println(Thread.currentThread().getName()
                                + "���ڳ��۵�" + (tickets--) + "��Ʊ");
                    }
                }
            } else {
                sellTicket();
            }
            x++;
        }
    }

    // �Ľ�Ϊһ������ʵ�֡�
    // private void sellTicket() {
    // synchronized (obj) {
    // if (tickets > 0) {
    // try {
    // Thread.sleep(100);
    // } catch (InterruptedException e) {
    // e.printStackTrace();
    // }
    //
    // System.out.println(Thread.currentThread().getName() + "���ڳ��۵�"
    // + (tickets--) + "��Ʊ");
    // }
    // }
    // }

    // private synchronized void sellTicket() {
    // if (tickets > 0) {
    // try {
    // Thread.sleep(100);
    // } catch (InterruptedException e) {
    // e.printStackTrace();
    // }
    //
    // System.out.println(Thread.currentThread().getName() + "���ڳ��۵�"
    // + (tickets--) + "��Ʊ");
    // }
    // }

    private static synchronized void sellTicket() {
        if (tickets > 0) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() + "���ڳ��۵�"
                    + (tickets--) + "��Ʊ");
        }
    }
}
