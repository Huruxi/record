/*
	break:�ж�

	break��ʹ�ó�����
		A:��ѡ��ṹswitch�����
		B:��ѭ�������
		�뿪ʹ�ó����Ĵ�����û�������

	break:
		A:��������ѭ��
		B:�������ѭ��(�˽�)
			����ǩ���÷�
*/
class BreakDemo {
    public static void main(String[] args) {
        for (int x = 0; x < 10; x++) {
            //System.out.println(x);
            if (x % 2 == 0) {
                break;
                //break�����ǲ����ж�����
                //System.out.println(x);
            }

            System.out.println(x);
        }
        System.out.println("-------------");

        wc:
        for (int x = 0; x < 3; x++) {
            nc:
            for (int y = 0; y < 4; y++) {
                System.out.print("*");
                break;
            }
            System.out.println();
        }
    }
}