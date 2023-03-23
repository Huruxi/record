package cn.itcast_01;

/*
 * StringBuffer:�̰߳�ȫ�Ŀɱ��ַ�����
 * ͨ���鿴API������֪���ˣ����ǿ��Ըı����ݺͳ��ȵġ�
 *
 * StringBuffer��String������?
 * A:StringBuffer�ĳ��ȿɱ�
 * B:String�ĳ��ȹ̶�
 *
 * ���췽����
 * 		StringBuffer()�� ����һ�����в����ַ����ַ��������������ʼ����Ϊ 16 ���ַ���
 * 		StringBuffer(int capacity)������һ�������ַ���������ָ����ʼ�������ַ�����������
 * 		StringBuffer(String str):����һ���ַ��������������������ݳ�ʼ��Ϊָ�����ַ������ݡ�
 *
 * ��Ա������
 * 		public int length():���س��ȣ��ַ�����ʵ��ֵ
 * 		public int capacity():���ص�ǰ����	����ֵ
 */
public class StringBufferDemo {
    public static void main(String[] args) {
        // StringBuffer()�� ����һ�����в����ַ����ַ��������������ʼ����Ϊ 16 ���ַ���
        StringBuffer sb = new StringBuffer();
        System.out.println("sb:" + sb);
        System.out.println("sb.length():" + sb.length());
        System.out.println("sb.capacity():" + sb.capacity());
        System.out.println("----------------------------");

        // StringBuffer(int capacity)������һ�������ַ���������ָ����ʼ�������ַ�����������
        StringBuffer sb2 = new StringBuffer(20);
        System.out.println("sb2:" + sb2);
        System.out.println("sb2.length():" + sb2.length());
        System.out.println("sb2.capacity():" + sb2.capacity());
        System.out.println("----------------------------");

        // StringBuffer(String str):����һ���ַ��������������������ݳ�ʼ��Ϊָ�����ַ������ݡ�
        StringBuffer sb3 = new StringBuffer("helloworld");
        System.out.println("sb3:" + sb3);
        System.out.println("sb3.length():" + sb3.length());
        System.out.println("sb3.capacity():" + sb3.capacity());
    }
}
