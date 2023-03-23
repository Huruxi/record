package cn.itcast_04;

/*
 * public static void yield():�����߳�,��ͣ��ǰ����ִ�е��̶߳��󣬲�ִ�������̡߳�
 */
public class ThreadYieldDemo {
    public static void main(String[] args) {
        ThreadYield ty1 = new ThreadYield();
        ThreadYield ty2 = new ThreadYield();

        ty1.setName("����");
        ty2.setName("��");

        ty1.start();
        ty2.start();
    }
}
