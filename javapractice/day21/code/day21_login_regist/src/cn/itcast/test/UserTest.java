package cn.itcast.test;

import java.util.Scanner;

import cn.itcast.dao.UserDao;
import cn.itcast.dao.impl.UserDaoImpl;
import cn.itcast.game.GuessNumber;
import cn.itcast.pojo.User;

/*
 * ���ǲ�����
 */
public class UserTest {
    public static void main(String[] args) {
        wc:
        while (true) {
            // ��ӭ����
            System.out.println("-----------��ӭ����------------");
            System.out.println("1 ��¼");
            System.out.println("2 ע��");
            System.out.println("3 �˳�");
            System.out.println("��ѡ��");
            // ����¼������
            Scanner sc = new Scanner(System.in);
            String choiceString = sc.nextLine();

            // �ദʹ��
            UserDao ud = new UserDaoImpl();

            switch (choiceString) {
                case "1":
                    System.out.println("-----------��¼����------------");
                    // ����¼���û���������
                    System.out.println("�������û�����");
                    String username = sc.nextLine();
                    System.out.println("���������룺");
                    String password = sc.nextLine();
                    // ���ù���
                    // UserDao ud = new UserDaoImpl();
                    boolean flag = ud.isLogin(username, password);
                    if (flag) {
                        System.out.println("��¼�ɹ�");

                        String yn;
                        do {
                            // ������Ϸ
                            GuessNumber.start();
                            System.out.println("�㻹Ҫ����?��������y:");
                            yn = sc.nextLine();
                        } while ("y".equals(yn));

                        // break wc;
                    } else {
                        System.out.println("��¼ʧ��,�ص�ѡ�����");
                    }
                    break;
                case "2":
                    System.out.println("-----------ע�����------------");
                    // ����¼���û���������
                    System.out.println("�������û�����");
                    String newUsername = sc.nextLine();
                    System.out.println("���������룺");
                    String newPassword = sc.nextLine();
                    // ���ù���
                    // UserDao ud = new UserDaoImpl();
                    // �����ݷ�װ��������
                    // User user = new User(newUsername, newPassword);
                    User user = new User();
                    user.setUsername(newUsername);
                    user.setPassword(newPassword);

                    ud.regist(user);
                    System.out.println("ע��ɹ�,�ص�ѡ�����");
                    break;
                case "3":
                default:
                    System.out.println("лл���٣���ӭ����");
                    System.exit(0);
                    break;
            }
        }
    }
}
