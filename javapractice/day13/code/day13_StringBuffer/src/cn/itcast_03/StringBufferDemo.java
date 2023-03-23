package cn.itcast_03;

/*
 * ��ת��StringBuffer�����й��ܣ�Stringû�С�
 * ��StringҪ����ת����΢�鷳һ�㡣����ܹ�ʹ��StringBuffer�Ĺ��ܾͺ��ˡ�
 * ��ô�����ǵ����ܲ�����һ����ȥʹ����һ����Ĺ�����?���ԡ�
 * ǰ�᣺��������֮�����ʵ���໥ת����
 */
public class StringBufferDemo {
    public static void main(String[] args) {
        //String -- StringBuffer;
        //StringBuffer sb = "hello";
        //StringBuffer(String str)
        String s = "hello";
        StringBuffer sb = new StringBuffer(s);

        //StringBuffer -- String
        //String(StringBuffer buffer)
        String ss = new String(sb);
    }
}
