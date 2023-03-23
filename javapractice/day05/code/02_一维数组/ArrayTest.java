/*
	�������:
		������������е�ÿһ��Ԫ��

	������
		A:����һ�����飬����ֵ��
		B:��������е�Ԫ��
*/
class ArrayTest {
    public static void main(String[] args) {
        //����һ�����飬����ֵ
        int[] arr = {11, 22, 33, 44, 55};

        //��ʽ1
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        System.out.println("---------------");

        //��ʽ2
        //ͨ���۲죬���ǿ���ͨ��forѭ��ʵ��ȡ��0~4��OK��
        for (int x = 0; x < 5; x++) {
            System.out.println(arr[x]);
        }
        System.out.println("---------------");

        //��ʽ3
        //���Ԫ�ض࣬������̫�鷳�ˡ�
        //�����أ�����Ϊ�˷������ǵĲ��������Լ��ṩ��һ�����ԣ��������� length
        //������ȡ����ĳ��ȡ�
        //��ʽ�ǣ�������.length;
        //System.out.println(arr.length);

        for (int x = 0; x < arr.length; x++) {
            System.out.println(arr[x]);
        }
    }
}