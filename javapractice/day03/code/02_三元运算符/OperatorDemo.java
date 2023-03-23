/*
	��Ԫ�������
	��ʽ
		(��ϵ���ʽ)?���ʽ1�����ʽ2��

	ִ�����̣�
		�����ϵ���ʽ�����䷵��ֵ
			true:���ʽ1�����������ʽ��ֵ
			false:���ʽ2�����������ʽ��ֵ

*/
class OperatorDemo {
    public static void main(String[] args) {
        //��ȡ���������еĽϴ�ֵ
        int x = 3;
        int y = 4;
        int z = (x > y) ? x : y;
        System.out.println(z);

        //�Ƚ��������Ƿ����
        int a = 4;
        int b = 4;
        //boolean flag = (a==b)?true:false;
        boolean flag = (a == b);
        System.out.println(flag);

        //��ȡ���������еĽϴ�ֵ
        int c = 30;
        int d = 40;
        int e = 50;
        //int max = (c>d)?(c>e?c:e):(d>e?d:e);
        int temp = (c > d) ? c : d;
        int max = (temp > e) ? temp : e;
        System.out.println(max);
    }
}
