package cn.itcast_03;

/*
 * String����жϹ��ܣ�
 * boolean equals(Object obj):�Ƚ��ַ����������Ƿ���ͬ���ϸ����ִ�Сд
 * boolean equalsIgnoreCase(String str):�Ƚ��ַ����������Ƿ���ͬ�������Ǵ�Сд
 * boolean contains(String str):�ж��Ƿ����ָ����С��
 * boolean startsWith(String str):�ж��Ƿ���ָ�����ַ�����ͷ
 * boolean endsWith(String str):�ж��Ƿ���ָ�����ַ�����β
 * boolean isEmpty():�ж��ַ����������Ƿ�Ϊ��
 */
public class StringDemo {
    public static void main(String[] args) {
        String s = "helloworld";

        // boolean equals(Object obj):�Ƚ��ַ����������Ƿ���ͬ���ϸ����ִ�Сд
        System.out.println("equals():" + s.equals("helloworld"));
        System.out.println("equals():" + s.equals("HelloWorld"));
        System.out.println("----------------------------------");

        // boolean equalsIgnoreCase(String str):�Ƚ��ַ����������Ƿ���ͬ�������Ǵ�Сд
        System.out.println("equalsIgnoreCase():"
                + s.equalsIgnoreCase("helloworld"));
        System.out.println("equalsIgnoreCase():"
                + s.equalsIgnoreCase("HelloWorld"));
        System.out.println("----------------------------------");

        // boolean contains(String str):�ж��Ƿ����ָ����С��
        System.out.println("contains():" + s.contains("owo"));
        System.out.println("contains():" + s.contains("hw"));
        System.out.println("----------------------------------");

        // boolean startsWith(String str):�ж��Ƿ���ָ�����ַ�����ͷ
        System.out.println("startsWith():" + s.startsWith("hw"));
        System.out.println("startsWith():" + s.startsWith("owo"));
        System.out.println("startsWith():" + s.startsWith("h"));
        System.out.println("----------------------------------");

        // boolean endsWith(String str):�ж��Ƿ���ָ�����ַ�����β:�Լ���ϰ

        // boolean isEmpty():�ж��ַ����������Ƿ�Ϊ��
        System.out.println("isEmpty():" + s.isEmpty());
        // System.out.println("isEmpty():"+null.isEmpty());
        // //���󣬶���Ϊnull��˵�����󲻴��ڣ����󲻴��ڣ��Ͳ��ܵ��÷���
        System.out.println("isEmpty():" + "".isEmpty());
    }
}
