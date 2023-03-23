/*
	�����ʽ2��
		��������[][] ������ = new ��������[m][];
		
		m:m��ʾ�����ά�����ж��ٸ�һά����
*/
class Array2Demo2 {
    public static void main(String[] args) {
        //����һ������
        int[][] arr = new int[3][];
        //�������ǽ���֪�������ά������3��һά����
        //���ǣ�ÿ��һά�����м���Ԫ�أ������ǲ�֪����

        System.out.println(arr); //[[I@7d3598c3
        System.out.println(arr[0]); //null
        System.out.println(arr[1]); //null
        System.out.println(arr[2]); //null


        arr[0] = new int[3];
        arr[1] = new int[1];
        arr[2] = new int[2];
        System.out.println(arr[0]); //
        System.out.println(arr[1]); //
        System.out.println(arr[2]); //


        arr[2][1] = 100;
        arr[1][3] = 200;
    }
}