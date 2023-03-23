package cn.itcast.game;

import java.util.Scanner;

/**
 * ������С��Ϸ
 *
 * @author fqy
 * @version V1.0
 */
public class GuessNumber {
    private GuessNumber() {
    }

    public static void start() {
        // ���������
        int number = (int) (Math.random() * 100) + 1;

        while (true) {
            // ����¼������
            Scanner sc = new Scanner(System.in);
            System.out.println("��������Ҫ�µ����ݣ�");
            int guessNumber = sc.nextInt();

            // �ж�
            if (guessNumber > number) {
                System.out.println("��µ�����" + guessNumber + "����");
            } else if (guessNumber < number) {
                System.out.println("��µ�����" + guessNumber + "С��");
            } else {
                System.out.println("��ϲ�㣬������");
                break;
            }
        }
    }
}