/*
	�����ȡ��ֵ(��ȡ�����е����ֵ��Сֵ)

	��ѧ����Сֵ��
*/
class ArrayTest2 {
    public static void main(String[] args) {
        //��������
        int[] arr = {12, 86, 79, 43, 50};

        //�������?
		/*
		int max = arr[0];

		for(int x=1; x<arr.length; x++) {
			if(arr[x] > max) {
				max = arr[x];
			}
		}

		System.out.println(max);
		*/

        //Ϊ�˽������÷��㣬����дһ������ʵ�ֻ�ȡ��ֵ
        int max = getMax(arr);
        System.out.println("���ֵ�ǣ�" + max);
    }

    /*
        ����ֵ���ͣ�int
        �����б�int[] arr
    */
    public static int getMax(int[] arr) {
        //���������
        int max = arr[0];

        //ѭ��������1��ʼԪ��
        for (int x = 1; x < arr.length; x++) {
            //�Ƚϣ��Ѵ��������
            if (arr[x] > max) {
                max = arr[x];
            }
        }

        //�������ֵ
        return max;
    }
}
