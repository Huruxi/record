/*
	�������������ͼ��
			*
			**
			***
			****
			*****
*/
class ForForDemo2 {
    public static void main(String[] args) {
        //���������һ��5��5�е�����
		/*
		for(int x=0; x<5; x++) {
			for(int y=0; y<5; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/

        //������������Ҫ�����°벿��
        //ͨ���۲�ͼ�Σ�����֪����û�б仯�������ڱ仯
        //��һ�У�1��
        //�ڶ��У�2��
        //�����У�3��
        //�����У�4��
        //�����У�5��
        //��Ȼ��һ���仯��������ô���ǾͶ���һ������
		/*
		int z = 0;
		for(int x=0; x<5; x++) {
			for(int y=0; y<=z; y++) {
				System.out.print("*");
			}
			System.out.println();
			z++;
		}
		*/

        //���Ƿ���z�ı仯��x�ı仯��ʵ��һ�µ�
        //�������Ǹ�����û�б�Ҫ����z������ֱ�Ӱ�z��x�滻
        for (int x = 0; x < 5; x++) {
            for (int y = 0; y <= x; y++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("---------");

        for (int x = 1; x <= 5; x++) {
            for (int y = 1; y <= x; y++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}