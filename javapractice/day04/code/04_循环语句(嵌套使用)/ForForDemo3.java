/*
	�����ڿ���̨����žų˷���

		1*1=1
		1*2=2	2*2=4
		1*3=3	2*3=6	3*3=9
		...
		1*9=9	2*9=18	3*9=27	4*9=36	...

	ת���ַ���
		\t	tab����λ��
*/
class ForForDemo3 {
    public static void main(String[] args) {
        //������ǰ�ÿһ�п���һ��*
        //��ô����ʵ�������Ǹղŵ�������
		/*
		for(int x=1; x<=9; x++) {
			for(int y=1; y<=x; y++) {
				System.out.print("*"+"\t");
			}
			System.out.println();
		}
		*/

        //������������Ҫ��*�滻Ϊ���ʽ
        for (int x = 1; x <= 9; x++) {
            for (int y = 1; y <= x; y++) {
                System.out.print(y + "*" + x + "=" + (x * y) + "\t");
            }
            System.out.println();
        }
    }
}
