package cn.itcast_04;

/*
 * �ж�һ���ַ����Ƿ��ǶԳ��ַ���
 * ����"abc"���ǶԳ��ַ�����"aba"��"abba"��"aaa"��"mnanm"�ǶԳ��ַ���
 */
public class StringBufferTest3 {
    public static void main(String[] args) {
        String s = "mnanm";
        // String s = "abcde";

        // ��ʽ1����
        // boolean b = isDuiCheng(s);
        // System.out.println(b);

        // ��ʽ2����
        boolean b2 = isDuiCheng(s);
        System.out.println(b2);

    }

    // ��ʽ1
    // public static boolean isDuiCheng(String s) {
    // // ���ַ���ת������
    // char[] chs = s.toCharArray();
    // // �������Ԫ�ط�ת
    // for (int start = 0, end = chs.length - 1; start <= end; start++, end--) {
    // if (chs[start] != chs[end]) {
    // return false;
    // }
    // }
    // return true;
    // }

    // public static boolean isDuiCheng(String s) {
    // boolean flag = true;
    // // ���ַ���ת������
    // char[] chs = s.toCharArray();
    // // �������Ԫ�ط�ת
    // for (int start = 0, end = chs.length - 1; start <= end; start++, end--) {
    // if (chs[start] != chs[end]) {
    // flag = false;
    // break;
    // }
    // }
    // return flag;
    // }

    // ��ʽ2
    public static boolean isDuiCheng(String s) {
        // ��ת
        StringBuffer sb = new StringBuffer(s);
        sb.reverse();
        String ss = new String(sb);
        // if (ss.equals(s)) {
        // return true;
        // } else {
        // return false;
        // }
        return ss.equals(s);

        // һ�仰�㶨
        // return new String(new StringBuffer(s).reverse()).equals(s);
    }
}
