package cn.itcast_02;

import java.util.Scanner;

/*
 * У������
 *
 * liuyi@163.com
 * linqingxia@126.com
 * 123456@qq.com
 * zhangsan123@sina.cn
 * zhang456@sina.com.cn
 * fqy@itcast.cn
 */
public class RegexTest {
    public static void main(String[] args) {
        //�������
        //String regex = "[a-zA-Z_0-9]+@[a-zA-Z_0-9]{2,8}(\\.[a-z]{2,3})+";
        String regex = "\\w+@\\w{2,8}(\\.[a-z]{2,3})+";

        //����¼������
        Scanner sc = new Scanner(System.in);
        System.out.println("���������䣺");
        String email = sc.nextLine();

        //У��
        boolean flag = email.matches(regex);
        System.out.println(flag);
    }
}
