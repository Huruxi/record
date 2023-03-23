/*
	���������һ��4��5�е�����(*)ͼ����

			*****
			*****
			*****
			*****

	����������⣺
		System.out.println("*");
			�ڵ�ǰ�����*�������С�

		System.out.print("*");
			�����ڵ�ǰ�����*

	ѭ��Ƕ���У�
		��ѭ����������
		��ѭ����������
*/
class ForForDemo {
    public static void main(String[] args) {
        //��ʽһ
		/*
		System.out.println("*****");
		System.out.println("*****");
		System.out.println("*****");
		System.out.println("*****");
		*/

        //��ʽ��
		/*
		System.out.println("*");
		System.out.println("*");
		System.out.println("*");
		System.out.println("*");
		System.out.println("*");
		*/

        //������
		/*
		System.out.println("*");
		System.out.println("*");

		System.out.print("*");
		System.out.print("*");
		System.out.println();
		*/

		/*
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		*/

        //��ѭ���Ľ�һ�����5��*
		/*
		//��һ��
		for(int x=0; x<5; x++) {
			System.out.print("*");
		}
		System.out.println();

		//�ڶ���
		for(int x=0; x<5; x++) {
			System.out.print("*");
		}
		System.out.println();

		//������
		for(int x=0; x<5; x++) {
			System.out.print("*");
		}
		System.out.println();

		//������
		for(int x=0; x<5; x++) {
			System.out.print("*");
		}
		System.out.println();
		*/

        //ͬ�����������˺ܶ��
        for (int y = 0; y < 4; y++) {
            for (int x = 0; x < 5; x++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
