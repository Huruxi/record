package cn.itcast_02;

/*
 * ɾ�����ܣ�
 * public StringBuffer deleteCharAt(int index)��ɾ��ָ��λ�õ��ַ�
 * public StringBuffer delete(int start,int end):ɾ����ָ��λ�ÿ�ʼ��ָ��λ�ý���������
 */
public class StringBufferDemo2 {
    public static void main(String[] args) {
        // ��������
        StringBuffer buffer = new StringBuffer();

        // �������
        buffer.append("hello");
        buffer.append("world");
        buffer.append("java");

        // public StringBuffer deleteCharAt(int index)��ɾ��ָ��λ�õ��ַ�
        // buffer.deleteCharAt(5);

        // public StringBuffer delete(int start,int end):ɾ����ָ��λ�ÿ�ʼ��ָ��λ�ý���������
        // buffer.delete(5, 10);
        buffer.delete(0, buffer.length());

        System.out.println("buffer:" + buffer);
    }
}
