package cn.itcast_05;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * ��ȡ����
 * 		Pattern��Matcher���ʹ��
 *
 */
public class RegexDemo {
    public static void main(String[] args) {
        // ģʽ�����ƥ��������Ļ���ʹ��
        // // �ѹ���ת��Ϊģʽ����
        // Pattern p = Pattern.compile("a*b");
        // // ͨ��ģʽ����õ�ƥ��������
        // Matcher m = p.matcher("aaaaab");
        // // ͨ��ƥ����������ù���
        // boolean b = m.matches();
        // System.out.println(b);

        // ��Ϊ�ж���˵
        // String s = "aaaaab";
        // String regex = "a*b";
        // boolean flag = s.matches(regex);
        // System.out.println(flag);

        // ���󣺻�ȡ����
        // ��ȡ�������ַ���ɵĵ���
        String s = "da jia hao,wo men dou hen ai java.";
        // �������
        String regex = "\\b[a-z]{3}\\b";

        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);

        // public boolean find():���Ƿ���ƥ���
        // boolean b = m.find();
        // System.out.println(b);
        // ���ǵ��ó���
        // public String group()
        // String ss = m.group();
        // System.out.println(ss);

        // b = m.find();
        // System.out.println(b);
        // // ���ǵ��ó���
        // // public String group()
        // ss = m.group();
        // System.out.println(ss);

        while (m.find()) {
            System.out.println(m.group());
        }
    }
}
