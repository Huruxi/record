/*
	�����ʽ2��
		��������[][] ������ = new ��������[][]{{Ԫ�ء�},{Ԫ�ء�},{Ԫ�ء�}};

		���θ�ʽ��
			��������[][] ������ = {{Ԫ�ء�},{Ԫ�ء�},{Ԫ�ء�}};
*/
class Array2Demo3 {
    public static void main(String[] args) {
        //��������
        //int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] arr = {{1, 2, 3}, {4, 5}, {8}};

        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);
        System.out.println(arr[1][1]);
        System.out.println(arr[2][1]);
    }
}
