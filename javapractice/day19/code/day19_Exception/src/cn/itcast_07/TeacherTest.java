package cn.itcast_07;

import java.util.Scanner;

public class TeacherTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("�����뿼�Գɼ��� ");
        int score = sc.nextInt();

        Teacher t = new Teacher();
        try {
            t.check(score);
        } catch (MyException e) {
            // System.out.println(e.toString()); // cn.itcast_07.MyException:
            // ��������0-100֮��
            e.printStackTrace();
        }
    }
}
