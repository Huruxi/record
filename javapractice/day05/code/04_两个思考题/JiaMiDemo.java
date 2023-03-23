/*
	ĳ����˾���ù��õ绰����������Ϣ��������С��8λ��������Ϊ��ȷ����ȫ��
	�ڴ��ݹ�������Ҫ���ܣ����ܹ������£�
		���Ƚ����ݵ���Ȼ��ÿλ���ֶ�����5�����úͳ���10��������������֣�
		��󽫵�һλ�����һλ���ֽ����� ���������һ��С��8λ��������
		Ȼ�󣬰Ѽ��ܺ�Ľ���ڿ���̨��ӡ������

	������
		A:������С��8λ������
			�����Ǳ仯�ġ�(����0��ͷ)
		B:���ܹ���
			��������Ϊ��123456

			���Ƚ����ݵ���
				654321
			Ȼ��ÿλ���ֶ�����5�����úͳ���10���������������
				109876
			��󽫵�һλ�����һλ���ֽ���
				609871
		C:������
			609871
*/
class JiaMiDemo {
    public static void main(String[] args) {
        //123456
        //int[] arr = {1,2,3,4,5,6};

        //��������
        int number = 123456;

        //��������
        int[] arr = new int[8];

        //ȡ��һ�����ݵ�����λ�ϵ�ֵ
        //6,5,4,3,2,1
		/*
		arr[0] = number%10;
		arr[1] = number/10%10;
		arr[2] = number/10/10%10;
		...
		*/

        //��һ��
        //����һ����������
        int index = 0;

        while (number > 0) {
            arr[index] = number % 10; //arr[0]=6,arr[1]=5,arr[2]=4,arr[3]=3,arr[4]=2,arr[5]=1
            number /= 10; //number=12345,number=1234,number=123,number=12,number=1,number=0
            index++; //index=1,index=2,index=3,index=4,index=5,index=6
        }

        for (int x = 0; x < index; x++) {
            System.out.print(arr[x]);
        }
        System.out.println();

        //�ڶ���
        for (int x = 0; x < index; x++) {
            arr[x] += 5;
            arr[x] %= 10;
        }

        for (int x = 0; x < index; x++) {
            System.out.print(arr[x]);
        }
        System.out.println();

        //������
        int temp = arr[0];
        arr[0] = arr[index - 1];
        arr[index - 1] = temp;

        for (int x = 0; x < index; x++) {
            System.out.print(arr[x]);
        }
        System.out.println();
    }
}