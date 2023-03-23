package cn.itcast_02;

import java.util.Scanner;

/*
 * �жϹ���
 * String��ķ�����
 * 		public boolean matches(String regex)
 */
public class RegexDemo {
    public static void main(String[] args) {
        /*
         * ����У��绰����
         *
         * ������
         * 		�绰��������
         *		13812345678
         *		13999998888
         *		13123456789
         *		18912345678
         *		18811112222
         */
        //�������
        String regex = "1[38][0-9]{9}";

        //����¼���ֻ�����
        Scanner sc = new Scanner(System.in);
        System.out.println("�������ֻ����룺");
        String phone = sc.nextLine();

        //�����жϹ���
        boolean flag = phone.matches(regex);
        System.out.println(flag);
    }
}
