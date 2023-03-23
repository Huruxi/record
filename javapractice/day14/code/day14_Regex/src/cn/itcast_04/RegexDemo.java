package cn.itcast_04;

/*
 * �滻����
 *		String��Ĺ��ܣ�
 *			public String replaceAll(String regex,String replacement)
 */
public class RegexDemo {
    public static void main(String[] args) {
        // ������̳�в��ܳ��������ַ�����*�滻
        String s = "hellowodekahaoshi62212934564347892nikyidaqiangeiwoxiexie13212345678gaowoyishen";

        // String ss = s.replaceAll("\\d", "*");
        // String ss = s.replaceAll("\\d", "");
        String ss = s.replaceAll("\\d+", "***");

        System.out.println(ss);
    }
}