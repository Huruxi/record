package cn.itcast_03;

/*
 * System:System �����һЩ���õ����ֶκͷ����������ܱ�ʵ������
 * 	public static void gc():����������������
 * 	public static void exit(int status):��ֹ��ǰ�������е� Java ���������������״̬�룻���ݹ������� 0 ��״̬���ʾ�쳣��ֹ��
 * 	public static long currentTimeMillis():�����Ժ���Ϊ��λ�ĵ�ǰʱ��
 *
 * 	public static void arraycopy(Object src,int srcPos,Object dest,int destPos,int length)
 */
public class SystemDemo {
    public static void main(String[] args) {
        // System.out.println("hello");
        // System.exit(0);
        // System.out.println("world");

        // System.out.println(System.currentTimeMillis()); // 1427427569016

        long start = System.currentTimeMillis();
        for (int x = 0; x < 1000000; x++) {
            System.out.println(x);
        }
        long end = System.currentTimeMillis();
        System.out.println("����ʱ��" + (end - start) + "����");
    }
}
