package cn.itcast_04;

/*
 * String��Ļ�ȡ���ܣ�
 * int length():�����ַ����ĳ��ȡ��ַ��ĸ�����
 * char charAt(int index):�����ַ�����ָ��λ�õ��ַ���
 * int indexOf(int ch):����ָ���ַ����ַ����е�һ�γ��ֵ�λ��
 * 		97,'a'
 * int indexOf(String str):����ָ���ַ������ַ����е�һ�γ��ֵ�λ��
 * int indexOf(int ch,int fromIndex):����ָ���ַ���ָ��λ�ÿ�ʼ���ַ����е�һ�γ��ֵ�λ��
 * int indexOf(String str,int fromIndex):����ָ���ַ�����ָ��λ�ÿ�ʼ���ַ����е�һ�γ��ֵ�λ��
 * String substring(int start):���ش�ָ��λ�ÿ�ʼ��ĩβ���Ӵ�
 * String substring(int start,int end):���ش�ָ��λ�ÿ�ʼ��ָ��λ�ý������Ӵ�----ע������Ҳ���
 */
public class StringDemo {
    public static void main(String[] args) {
        String s = "helloworld";

        // int length():�����ַ����ĳ��ȡ��ַ��ĸ�����
        System.out.println("length():" + s.length());
        System.out.println("----------------------");

        // char charAt(int index):�����ַ�����ָ��λ�õ��ַ���
        System.out.println("charAt():" + s.charAt(0));
        System.out.println("charAt():" + s.charAt(3));
        // System.out.println("charAt():" + s.charAt(13)); //
        // StringIndexOutOfBoundsException
        System.out.println("----------------------");

        // int indexOf(int ch):����ָ���ַ����ַ����е�һ�γ��ֵ�λ��
        System.out.println("indexOf():" + s.indexOf('l'));
        // int indexOf(int ch,int fromIndex):����ָ���ַ���ָ��λ�ÿ�ʼ���ַ����е�һ�γ��ֵ�λ��
        System.out.println("indexOf():" + s.indexOf('l', 4));

        // �Լ�ѧϰ
        // int indexOf(String str):����ָ���ַ������ַ����е�һ�γ��ֵ�λ��
        // int indexOf(String str,int fromIndex):����ָ���ַ�����ָ��λ�ÿ�ʼ���ַ����е�һ�γ��ֵ�λ��
        System.out.println("----------------------");

        // String substring(int start):���ش�ָ��λ�ÿ�ʼ��ĩβ���Ӵ�
        System.out.println("substring():" + s.substring(0));
        System.out.println("substring():" + s.substring(5));
        // String substring(int start,int end):���ش�ָ��λ�ÿ�ʼ��ָ��λ�ý������Ӵ�
        // ������Ҫ�õ�owo����д
        System.out.println("substring():" + s.substring(4, 7)); // ������ߣ��������ұ�
    }
}
