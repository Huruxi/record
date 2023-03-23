/*
	��ά���飺Ԫ��Ϊһά��������顣

	�����ʽ1��
		��������[][] ������ = new ��������[m][n];
		
		m:m��ʾ�����ά�����ж��ٸ�һά����
		n:n��ʾÿһ��һά�����Ԫ�ظ���

		���Σ�
			�������� ������[][] = new ��������[m][n];
			��������[] ������[] = new ��������[m][n];

			int[] x,y[];
*/
class Array2Demo {
    public static void main(String[] args) {
        //����һ����ά����
        int[][] arr = new int[3][2];
        //��ʾarr�����ά����������Ԫ��
        //ÿ��Ԫ����һ��һά����
        //ÿһ��һά������2��Ԫ��

        System.out.println(arr); //[[I@778b3fee
        System.out.println(arr[0]); //[I@57125f92
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        //������Ԫ����?
        System.out.println(arr[0][1]);
        System.out.println(arr[2][2]);
    }
}