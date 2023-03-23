package cn.itcast_04;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadKill extends Thread {
    @Override
    public void run() {
        System.out.println("��ʼִ�У�"
                + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
                .format(new Date()));

        try {
            // �ף���Ҫ�����ң���Ҫ��Ϣ10��
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            // e.printStackTrace();
            System.out.println("�ұ�ɱ����");
        }

        System.out.println("����ִ�У�"
                + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
                .format(new Date()));
    }
}
