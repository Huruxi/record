package cn.itcast_06;

/*
 * ���ֵ�˳��Ƚ������ַ���  a-z
 * int compareTo(String str)
 * int compareToIgnoreCase(String str)
 */
public class StringDemo3 {
    public static void main(String[] args) {
        String s = "hello";

        System.out.println(s.compareTo("hello")); // 0
        System.out.println(s.compareTo("Hello")); // 32
        System.out.println(s.compareTo("mello")); // -5
        System.out.println(s.compareTo("hgllo"));//��һ����ͬ��ĸ֮��
    }
}
