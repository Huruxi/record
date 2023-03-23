package cn.itcast_04;

/*
 * �ж��߳�
 *		public final void stop():ֱ����
 *		public void interrupt():���󻹿���д����
 */
public class ThreadKillDemo {
    public static void main(String[] args) {
        ThreadKill tk = new ThreadKill();
        tk.start();

        // ����������Ͳ���������ִ���ˣ�����������ȥ
        try {
            Thread.sleep(3000);
//			 tk.stop();
            tk.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
