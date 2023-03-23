package cn.itcast_01;

import java.util.Scanner;

/*
 * ������ʽ������һ��������ַ�����
 *
 * ��ϰ��
 * 		У��qq����.
 *			1:Ҫ�������5-15λ����
 *			2:0���ܿ�ͷ
 */
public class RegexDemo {
    public static void main(String[] args) {
        //����¼�����
        Scanner sc = new Scanner(System.in);

        System.out.println("���������qq���룺");
        String qq = sc.nextLine();

        boolean flag = checkQQ(qq);
        System.out.println("flag:" + flag);

        //ʹ��������ʽ��ʵ��
        boolean flag2 = checkQQ2(qq);
        System.out.println("flag2:" + flag2);
    }

    public static boolean checkQQ2(String qq) {
        //������ʽ
        // String regex = "[1-9][0-9]{4,14}";
        // //public boolean matches(String regex)
        // boolean flag = qq.matches(regex);
        // return flag;

        return qq.matches("[1-9][0-9]{4,14}");
    }

    /*
     * ����ֵ���ͣ�boolean �����б�String qq
     */
    public static boolean checkQQ(String qq) {
        boolean flag = true;

        // У�鳤��
        if (qq.length() >= 5 && qq.length() <= 15) {
            // 0���ܿ�ͷ
            if (!qq.startsWith("0")) {
                // �Ƿ��������ַ�
                char[] chs = qq.toCharArray();
                for (int x = 0; x < chs.length; x++) {
                    char ch = chs[x];
                    if (!Character.isDigit(ch)) {
                        flag = false;
                        break;
                    }
                }
            } else {
                flag = false;
            }
        } else {
            flag = false;
        }

        return flag;
    }
}
