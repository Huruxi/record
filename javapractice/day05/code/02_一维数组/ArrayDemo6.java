/*
	�����������������С����:
		A:��������Խ��
			ArrayIndexOutOfBoundsException
			��Ϊ���Ƿ����˲����ڵ�������
		B:��ָ���쳣
			NullPointerException
			��Ϊ�����Ѿ�����ָ����ڴ棬���ԾͲ�����ȥ���ʶ��ڴ��Ԫ���ˡ�
*/
class ArrayDemo6 {
    public static void main(String[] args) {
        //��������
        int[] arr = {1, 2, 3};

        //System.out.println(arr[3]);

        arr = null; //��arrָ����ڴ��ȥ���ˣ�arrû��ָ���ˡ�
        System.out.println(arr[0]);
    }
}