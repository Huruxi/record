package cn.itcast_01;

/*
 * �ַ������ɶ���ַ���ɵ�һ�����ݡ�
 *
 * ���췽����
 * 		public String():����String����
 *		public String(byte[] bytes):���ֽ�����ת���ַ�����
 *		public String(byte[] bytes,int index,int length):���ֽ������е�һ����ת���ַ���
 *		public String(char[] value):���ַ�����ת���ַ���
 *		public String(char[] value,int index,int count):���ַ������һ����ת���ַ���
 * 		public String(String original):���ַ���ת���ַ���
 *
 * ���⣺
 * 		1:����������κζ������Ƶ�ʱ��Ĭ�ϵ��õ��Ǹö����toString()������
 * 		  ��toString()����Ĭ��������ǰ���...����@��ϣֵ��ʮ�����ơ�
 * 		 ������������������һ���������Ƶ�ʱ�򣬷��ֲ��������ʽ��˵���˸�����д��toString()������
 * 		2:���ش��ַ����ĳ���
 * 		public int length()
 *
 * �����⣺
 * 		������length()��?String��length()��
 * 		û�С�
 * 		�С�
 */
public class StringDemo {
    public static void main(String[] args) {
        // public String():����String����
        String s1 = new String();
        System.out.println("s1:" + s1);
        System.out.println("s1.length():" + s1.length());
        System.out.println("--------------------------");

        // public String(byte[] bytes):���ֽ�����ת���ַ�����
        byte[] bytes = {97, 98, 99, 100, 101};
        String s2 = new String(bytes); // ����ֵת�ɶ�Ӧ���ַ�ֵ
        System.out.println("s2:" + s2);
        System.out.println("s2.length():" + s2.length());
        System.out.println("--------------------------");

        // public String(byte[] bytes,int index,int length):���ֽ������е�һ����ת���ַ���
        // String s3 = new String(bytes, 1, 2);
        String s3 = new String(bytes, 0, bytes.length);
        System.out.println("s3:" + s3);
        System.out.println("s3.length():" + s3.length());
        System.out.println("--------------------------");

        // public String(char[] value):���ַ�����ת���ַ���
        char[] chs = {'a', 'b', 'c', 'd', 'e', '��', '��', 'ϼ'};
        String s4 = new String(chs);
        System.out.println("s4:" + s4);
        System.out.println("s4.length():" + s4.length());
        System.out.println("--------------------------");

        // public String(char[] value,int index,int count):���ַ������һ����ת���ַ���
        // ������Ҫ������ַ�����:de����
        String s5 = new String(chs, 3, 4);
        System.out.println("s5:" + s5);
        System.out.println("s5.length():" + s5.length());
        System.out.println("--------------------------");

        // public String(String original):���ַ���ת���ַ���
        String s6 = new String("helloworld");
        System.out.println("s6:" + s6);
        System.out.println("s6.length():" + s6.length());
        System.out.println("--------------------------");

        // Java �����е������ַ�������ֵ���� "abc" ������Ϊ�����ʵ��ʵ�֡�
        String s7 = "helloworld";
        System.out.println("s7:" + s7);
        System.out.println("s7.length():" + s7.length());
    }
}
