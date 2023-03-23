package cn.itcast_02;

/*
 * ��ȡ����:����ֵ������String���ͣ�����û�з����ı�
 * public String substring(int start):��ָ��λ�ÿ�ʼ��ĩβ
 * public String substring(int start,int end):��ָ��λ�ÿ�ʼ��ָ��λ�ý���
 */
public class StringBufferDemo5 {
    public static void main(String[] args) {
        // ��������
        StringBuffer buffer = new StringBuffer();
        buffer.append("helloworldjava");

        // public String substring(int start):��ָ��λ�ÿ�ʼ��ĩβ
        String s = buffer.substring(5);

        System.out.println("s:" + s);
        System.out.println("buffer:" + buffer);
    }
}
