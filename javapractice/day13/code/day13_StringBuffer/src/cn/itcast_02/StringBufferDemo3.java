package cn.itcast_02;

/*
 * public StringBuffer replace(int start,int end,String str):�ø������ַ����滻��ָ��λ�ÿ�ʼ��ָ��λ�ý���������
 */
public class StringBufferDemo3 {
    public static void main(String[] args) {
        // ��������
        StringBuffer buffer = new StringBuffer();

        buffer.append("hello").append("world").append("java");

        // public StringBuffer replace(int start,int end,String
        // str):�ø������ַ����滻��ָ��λ�ÿ�ʼ��ָ��λ�ý���������
        buffer.replace(3, 8, "haha");

        System.out.println("buffer:" + buffer);
    }
}
