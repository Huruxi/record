package cn.itcast_06;

public class MovieTicket extends Thread {
    // �����Ա����
    private static int tickets = 100;

    @Override
    public void run() {
        // ����100��Ʊ
        // int tickets = 100;

        while (true) {
            if (tickets > 0) {
                System.out.println(getName() + "���ڳ��۵�" + (tickets--) + "��Ʊ");
            }
        }
    }
}
