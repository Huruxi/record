/*
	�����������飬�ֱ������������Ԫ�ء�Ȼ��ֱ�������е�Ԫ�ظ�ֵ���ֱ��ٴ������������Ԫ�ء�
*/
class ArrayDemo3 {
    public static void main(String[] args) {
        //����һ������
        int[] arr = new int[3];

        //����������Ƽ�Ԫ��
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        //��ֵ�����
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        //�ٶ���һ���µ�����
        int[] arr2 = new int[2];
        System.out.println(arr2);
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);

        //��ֵ�����
        arr2[0] = 100;
        arr2[1] = 200;
        System.out.println(arr2);
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
    }
}
