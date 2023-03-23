package cn.itcast_02;

/*
 * ��ӹ��ܣ�
 * public StringBuffer append(String str)��׷�����ݣ����������ݵĺ��档
 * public StringBuffer insert(int offset,String str):�������ݣ���ָ��λ��������ݡ�
 */
public class StringBufferDemo {
    public static void main(String[] args) {
        // �����ַ�������������
        StringBuffer sb = new StringBuffer();

        // ����
        // public StringBuffer append(String str)��׷�����ݣ����������ݵĺ��档
        // StringBuffer sb2 = sb.append("hello");
        // System.out.println(sb == sb2); // true
        // System.out.println("sb:" + sb);
        // System.out.println("sb2:" + sb2);

        // sb.append("hello");
        // sb.append("world");
        // sb.append("java");

        // ��ʽ���
        sb.append("hello").append("world").append("java");

        // public StringBuffer insert(int offset,String str):�������ݣ���ָ��λ��������ݡ�
        sb.insert(5, "ak47");

        System.out.println("sb:" + sb);
    }
}
