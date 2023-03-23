package cn.itcast_04;

/*
 * �ַ����ı���:������ȡ�ַ����е�ÿһ���ַ�
 */
public class StringTest {
    public static void main(String[] args) {
        String s = "java";

        // ͨ��charAt()�������λ�ȡ�ַ�
        // System.out.println(s.charAt(0));
        // System.out.println(s.charAt(1));
        // System.out.println(s.charAt(2));
        // System.out.println(s.charAt(3));

        // ���ǣ�����ַ����ĸ����Ƚ϶࣬����ͻ���鷳�������ظ��Ⱥܸ�
        // for (int x = 0; x < 4; x++) {
        // System.out.println(s.charAt(x));
        // }

        // ����ַ����ݽ϶࣬�������������ԣ�����Ҫ��һ����ȡ�ַ������ķ���
        // length();
        for (int x = 0; x < s.length(); x++) {
            // System.out.println(s.charAt(x));

            char ch = s.charAt(x);
            System.out.println(ch);
        }
    }
}
