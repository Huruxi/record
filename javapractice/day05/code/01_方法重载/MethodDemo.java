/*
	�������أ�
		��ͬһ�����У��������һ�����ϵ�ͬ��������ֻҪ���ǵĲ����������߲������Ͳ�ͬ���ɡ�
		�ͷ���ֵ�����޹ء�
*/
class MethodDemo {
    public static void main(String[] args) {
        //������дһ�����ܣ�ʵ���������ݵ����
        System.out.println(sum(10, 20));

        //������дһ�����ܣ�ʵ���������ݵ����
        //System.out.println(sum2(10,20,30));
        System.out.println(sum(10, 20, 30));

        System.out.println(sum(1.5, 2.5));
    }

    public static int sum(int a, int b) {
        return a + b;
    }

	/*
	public static int sum2(int a,int b,int c) {
		return a + b + c;

		//������Ƕ�׵���
		//return sum(sum(a,b),c);
	}
	*/

    //���ڷ�����Ҫ������ʵ�Ǹ÷���������
    //���ԣ�sum2������ֲ��ã�����Ҫ��sum �ȽϺ�
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static double sum(double a, double b) {
        return a + b;
    }
}