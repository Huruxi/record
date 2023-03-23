package cn.itcast_04;

/*
 * ���ַ�����ת
 */
public class StringBufferTest2 {
    public static void main(String[] args) {
        String s = "ϼ���ְ���";

        // ���Է�ʽ1
        // String s2 = reverse(s);
        // System.out.println(s2);

        // ���Է�ʽ2
        // String s3 = reverse(s);
        // System.out.println(s3);

        // ���Է�ʽ3
        String s4 = reverse(s);
        System.out.println(s4);
    }

    // ��ʽ1
    // public static String reverse(String str) {
    // String s = "";
    //
    // char[] chs = str.toCharArray();
    // for (int x = chs.length - 1; x >= 0; x--) {
    // s += chs[x];
    // }
    //
    // return s;
    // }

    // ��ʽ2
    // public static String reverse(String str) {
    // // ���ַ���ת������
    // char[] chs = str.toCharArray();
    // // �������Ԫ�ط�ת
    // for (int start = 0, end = chs.length - 1; start <= end; start++, end--) {
    // char temp = chs[start];
    // chs[start] = chs[end];
    // chs[end] = temp;
    // }
    // // ������ת���ַ�������
    // return String.valueOf(chs);
    // }

    // ��ʽ3
    public static String reverse(String str) {
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        return new String(sb);

        //return new String(new StringBuffer(str).reverse());
    }
}
