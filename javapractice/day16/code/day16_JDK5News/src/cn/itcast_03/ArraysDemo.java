package cn.itcast_03;

import java.util.Arrays;
import java.util.List;

/*
 * public static <T> List<T> asList(T... a):����һ����ָ������֧�ֵĹ̶���С���б�
 */
public class ArraysDemo {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "world", "java");

        // list.add("haha"); // UnsupportedOperationException
        // list.remove(1);
        list.set(1, "haha");

        for (String s : list) {
            System.out.println(s);
        }
    }
}