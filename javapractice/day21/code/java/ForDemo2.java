/*
	forѭ���ĸ�ʽ��
		for(��ʼ�����;�ж��������;�����������) {
			ѭ�������;
		}

		ִ�����̣�
		A:����ִ�г�ʼ�����
		B:���ִ���ж�������䣬���䷵��ֵ
			�����true���ͼ���
			�����false��ѭ������
		C:ִ��ѭ�������
		D:ִ�п����������
		E:�ص�B
*/
class ForDemo2 {
    public static void main(String[] args) {
        //�ڿ���̨���10��HelloWorld
        for (int x = 0; x < 10; x++) {
            System.out.println("HelloWorld");
        }
        System.out.println("--------------");

        //��ʼ������0��ʼ
        for (int x = 1; x <= 10; x++) {
            System.out.println("HelloWorld");
        }

        for (int x = 1; x < 11; x++) {
            System.out.println("HelloWorld");
        }

        for (int x = 10; x > 0; x--) {
            System.out.println("HelloWorld");
        }
    }
}
