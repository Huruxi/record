package cn.itcast_01;

public class MyThread extends Thread {
    @Override
    public void run() {
        // System.out.println("hello");
        // Ҫ���߳�ִ�еĴ��룬һ����˵Ӧ���ǱȽϺ�ʱ��
        for (int x = 0; x < 100; x++) {
            System.out.println("hello" + x);
        }
    }
}
