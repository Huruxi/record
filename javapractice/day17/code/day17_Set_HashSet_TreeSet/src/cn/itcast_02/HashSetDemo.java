package cn.itcast_02;

import java.util.HashSet;

/*
 * HashSet������֤ set �ĵ���˳���ر���������֤��˳���ò��䡣
 */
public class HashSetDemo {
    public static void main(String[] args) {
        // HashSet�洢�ַ���Ԫ��
        HashSet<String> hs = new HashSet<String>();

        System.out.println(hs.add("hello"));
        System.out.println(hs.add("world"));
        System.out.println(hs.add("java"));
        System.out.println(hs.add("hello"));

        System.out.println("hs:" + hs);
    }
}
