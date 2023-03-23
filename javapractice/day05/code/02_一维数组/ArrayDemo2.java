/*
	����һ�����飬�����������Ԫ�ء�Ȼ��������е�Ԫ�ظ�ֵ���ٴ������������Ԫ�ء�
*/
class ArrayDemo2 {
    public static void main(String[] args) {
        //��������
        int[] arr = new int[3];

        //����������Ƽ�Ԫ��
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        //�������е�Ԫ�ظ�ֵ
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;

        //�ٴ�����������Ƽ�Ԫ��
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
    }
}
