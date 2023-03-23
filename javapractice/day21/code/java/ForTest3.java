class ForTest3 {
    public static void main(String[] args) {
        //���1-100֮��ż����

		/*
		//������ͱ���
		int sum = 0;

		//ͨ��forѭ����ȡÿһ������
		for(int x=1; x<=100; x++) {
			//�������ۼ�
			sum += x;
		}

		//������
		System.out.println("1-100֮�ͣ�"+sum);
		System.out.println("---------------");
		*/

        //ż��:�ܱ�2����������
        //����ж������Ƿ��ܹ���������? x%2 == 0

		/*
		int sum = 0;

		for(int x=1; x<=100; x++) {
			if(x%2 == 0) {
				sum += x;
			}
		}

		System.out.println("1-100��ż���ͣ�"+sum);
		*/

        int sum = 0;

        for (int x = 0; x <= 100; x += 2) {
            sum += x;
        }

        System.out.println("1-100��ż���ͣ�" + sum);
    }
}
