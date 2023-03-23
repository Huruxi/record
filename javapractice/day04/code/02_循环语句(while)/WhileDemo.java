/*
	whileѭ���ĸ�ʽ��
		while(�������ʽ) {
			�����;
		}

	���θ�ʽ��
		��ʼ�����;
		while(�ж��������) {
			ѭ�������;
			�����������;
		}

		for(��ʼ�����;�ж��������;�����������) {
			 ѭ�������;
		}
	�ɴ˿ɼ�whileѭ����forѭ���ǿ��Եȼ�ת���ġ�
*/
class WhileDemo {
    public static void main(String[] args) {
        //for
		/*
		for(int x=0; x<10; x++) {
			System.out.println("HelloWorld");
		}
		System.out.println("--------------");
		*/

        //while
		/*
		int x=0;
		while(x<10) {
			System.out.println("HelloWorld");
			x++;
		}
		*/

        //���
        //for
		/*
		int sum = 0;
		for(int x=1; x<=100; x++) {
			sum+=x;
		}
		System.out.println("1-100֮���ǣ�"+sum);
		*/

        //while
		/*
		int sum = 0;
		int x = 1;
		while(x<=100) {
			sum += x;
			x++;
		}
		System.out.println("1-100֮���ǣ�"+sum);
		*/

        //ˮ�ɻ�
        //for
		/*
		for(int x=100; x<1000; x++) {
			int ge = x%10;
			int shi = x/10%10;
			int bai = x/10/10%10;

			if(x == (ge*ge*ge + shi*shi*shi + bai*bai*bai)) {
				System.out.println(x);
			}
		}
		*/

        //while
        int x = 100;
        while (x < 1000) {
            int ge = x % 10;
            int shi = x / 10 % 10;
            int bai = x / 10 / 10 % 10;

            if (x == (ge * ge * ge + shi * shi * shi + bai * bai * bai)) {
                System.out.println(x);
            }

            x++;
        }
    }
}