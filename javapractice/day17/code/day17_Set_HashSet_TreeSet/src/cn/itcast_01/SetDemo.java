package cn.itcast_01;

import java.util.HashSet;
import java.util.Set;

/*
 * Collection:
 * 		List:Ԫ������(�洢��ȡ��˳��һ��)�����ظ�
 * 		Set:Ԫ������,Ψһ
 */
public class SetDemo {
    public static void main(String[] args) {
        // �������϶���
        Set<String> set = new HashSet<String>();

        set.add("hello");
        set.add("aaaa");
        set.add("java");
        set.add("world");
        set.add("bbbb");
        set.add("aaaa");

        for (String s : set) {
            System.out.println(s);
        }
    }
}
