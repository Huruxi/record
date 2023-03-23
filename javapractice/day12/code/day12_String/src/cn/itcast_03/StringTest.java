package cn.itcast_03;

import java.util.Scanner;

/*
 * ģ���¼,�����λ���,����ʾ���м��Ρ�
 *
 * ������
 * 		A:�����̶����û���������
 * 		B:����¼���û���������
 * 		C:�Ƚ��û���������
 * 		D:�������λ���
 */
public class StringTest {
    public static void main(String[] args) {
        // �����̶����û���������
        // String username = "admin";
        // String password = "admin";

        for (int x = 0; x < 3; x++) {
            // x=0,1,2

            // ����¼���û���������
            Scanner sc = new Scanner(System.in);
            System.out.println("�������û�����");
            String name = sc.nextLine();
            System.out.println("���������룺");
            String pwd = sc.nextLine();

            // �Ƚ��û���������
            if ("admin".equals(name) && "admin".equals(pwd)) {
                System.out.println("��¼�ɹ�");
                break;
            } else {
                if (2 - x == 0) {
                    System.out.println("�ʺű�����������೤��ϵ");
                } else {
                    // 2,1,0
                    System.out.println("��¼ʧ�ܣ��㻹��" + (2 - x) + "�λ���");
                }
            }
        }
    }
}