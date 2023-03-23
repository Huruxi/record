package cn.itcast_06;

/*
 * �滻����
 *	String replace(char old,char new)
 *	String replace(String old,String new)
 */
public class StringDemo {
    public static void main(String[] args) {
        // �����ַ���
        String s = "helloworld";

        String s2 = s.replace('l', 'b');
        System.out.println("s:" + s);
        System.out.println("s2:" + s2);

        String s3 = s.replace("owo", "ak47");
        System.out.println("s3:" + s3);
    }
}
