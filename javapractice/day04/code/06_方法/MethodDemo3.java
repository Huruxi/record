/*
	û����ȷ����ֵ�ķ������ã�void���εķ���
		��������
*/
class MethodDemo3 {
    public static void main(String[] args) {
		/*
		//�������ڿ���̨���һ��3��4�е�����
		for(int x=0; x<3; x++){
			for(int y=0; y<4; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("--------");
		//�������ڿ���̨���һ��5��6�е�����
		for(int x=0; x<5; x++){
			for(int y=0; y<6; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("--------");
		//�������ڿ���̨���һ��7��8�е�����
		for(int x=0; x<7; x++){
			for(int y=0; y<8; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("--------");
		*/

        //��������
        //printXing(3,4);
        //printXing(7,8);

        //�������
        //System.out.println(printXing(7,8));

        //��ֵ����
        //void v = printXing(7,8);
        //System.out.println(v);
    }

    public static void printXing(int a, int b) {
        for (int x = 0; x < a; x++) {
            for (int y = 0; y < b; y++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
