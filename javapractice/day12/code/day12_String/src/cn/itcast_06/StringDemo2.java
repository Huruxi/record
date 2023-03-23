package cn.itcast_06;

/*
 * ȥ���ַ������ո�
 * String trim()
 */
public class StringDemo2 {
    public static void main(String[] args) {
        String s = "     hello  world           ";

        System.out.println("---" + s + "---");
        System.out.println("---" + s.trim() + "---");
    }
}