package cn.itcast_05;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/*
 * "dabcdababcabcea",��ȡ�ַ�����ÿһ����ĸ���ֵĴ���Ҫ����:a(5)b(4)c(3)d(2)e(1)
 *
 * ��ҵ���Լ��ϵ�һ��
 */
public class TreeMapTest {
    public static void main(String[] args) {
        // ��������¼��һ���ַ���
        Scanner sc = new Scanner(System.in);
        System.out.println("������һ���ַ�����");
        String s = sc.nextLine();

        // ����һ��Map���ϣ�����Character��ֵ��Integer��������TreeMap
        TreeMap<Character, Integer> tm = new TreeMap<Character, Integer>();

        // ���ַ���ת���ַ�����
        char[] chs = s.toCharArray();

        // �����ַ������õ�ÿһ���ַ�
        for (char ch : chs) {
            // ������ַ���Ϊ����map������ֵ
            Integer i = tm.get(ch);
            // ����null
            if (i == null) {
                // �洢
                tm.put(ch, 1);
            } else {
                // ��ֵ++�����´洢
                i++;
                tm.put(ch, i);
            }
        }

        // ����һ��StringBuilder�ַ���
        StringBuilder sb = new StringBuilder();

        // ����TreeMap����
        Set<Character> set = tm.keySet();
        for (Character key : set) {
            Integer value = tm.get(key);
            sb.append(key).append("(").append(value).append(")");
        }

        // ��StringBuilderת��Ϊ�ַ���
        String result = sb.toString();

        System.out.println(result);
    }
}
