/*
	�����������飬�ȶ���һ�����飬��ֵ�������
	Ȼ����ڶ��������ʱ��ѵ�һ������ĵ�ַ��ֵ���ڶ������顣
	Ȼ����ڶ������鸳ֵ���ٴ�����������������Ԫ�ء�
*/
class ArrayDemo4 {
    public static void main(String[] args) {
        //����һ������
        int[] arr = new int[3];

        //��ֵ�������
        arr[0] = 11;
        arr[1] = 22;
        arr[2] = 33;
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        //����ڶ�������
        int[] arr2 = arr;

        arr2[1] = 100;

        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]); //???
        System.out.println(arr[2]);

        System.out.println(arr2);
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);
    }
}
