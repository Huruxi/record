/*
	++,--�������Լ��������
	�����һ������i,
		i++�ͱ�ʾ���ֵ��1
		i--�ͱ�ʾ���ֵ��1

	�÷���
		A:����ʹ��
			���ڲ������ݵ�ǰ��Ч��һ����
		B:�������ʹ��
			���ڲ�����ǰ�棬�����������Լ���Ȼ���ٲ�������
			���ڲ��������棬�Ȳ������㣬Ȼ�������������Լ�
*/
class OperatorDemo3 {
    public static void main(String[] args) {
        int a = 10;
        int b = a++;
        System.out.println(a);//11
        System.out.println(b);//10
        System.out.println("------------");

        int c = 10;
        int d = ++c;
        System.out.println(c);//11
        System.out.println(d);//11

        System.out.println("------------");
        int e = 10;
        //e++;
        ++e;
        System.out.println(e);
    }
}
