/*
	do...while��ʽ��
		do {
			�����;
		}while(�������ʽ);

	���θ�ʽ��
		��ʼ�����;
		do {
			ѭ�������;
			�����������;
		}while(�ж��������);
		
		
		for(��ʼ�����;�ж��������;�����������) {
			 ѭ�������;
		}
*/
class DoWhileDemo {
    public static void main(String[] args) {
		/*
		int sum = 0;
		for(int x=1; x<=100; x++) {
			sum+=x;
		}
		System.out.println(sum);
		*/

        //do...while
        int sum = 0;
        int x = 1;
        do {
            sum += x;
            x++;
        } while (x <= 100);
        System.out.println(sum);
    }
}