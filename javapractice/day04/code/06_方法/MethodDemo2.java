/*
	������ע�����
		A:���������ò�ִ��
		B:�����뷽����ƽ����ϵ������Ƕ�׶���
		C:���������ʱ�����֮���ö��Ÿ���
		D:�������õ�ʱ�����ڴ�����������
			���Դ��ݱ�����Ҳ���Գ��������ǲ��ܼ���������
		E:�����������ȷ�ķ���ֵ��һ��Ҫ��return����һ��ֵ
*/
class MethodDemo2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        int c = sum(a, b);
        System.out.println(c);

        int d = sum(10, 20);
        System.out.println(d);
    }

    public static int sum(int a, int b) {
        //return a + b;
        int c = a + b;
        return c;
    }
}
