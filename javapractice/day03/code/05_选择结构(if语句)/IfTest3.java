/*
	���󣺼���¼��x��ֵ�������y�Ĳ������
			x>=3	y = 2x + 1;
			-1<=x<3	y = 2x;
			x<-1	y = 2x �C 1;


	������
		A:����¼�����ݡ�
		B:�ж�x��ȡֵ��Χ�����������Ӧ��y��ֵ
		C:������y��ֵ
*/

import java.util.Scanner;

class IfTest3 {
    public static void main(String[] args) {
        //��������¼�����
        Scanner sc = new Scanner(System.in);

        //����¼������
        System.out.println("������һ�����ݣ�");
        int x = sc.nextInt();

        int y;
        if (x >= 3) {
            y = 2 * x + 1;
        } else if (x >= -1 && x < 3) {
            y = 2 * x;
        } else {
            y = 2 * x - 1;
        }

        System.out.println("y��ֵ�ǣ�" + y);
    }
}