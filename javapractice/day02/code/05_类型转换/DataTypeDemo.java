/*
	+��һ�������, ����Ӧ���ܹ������������ݵļӷ���

	������������ݣ�Ҫ������һ�¡�

	boolean���Ͳ���ת��Ϊ�������������͡�

	��ʽת����
		A:byte,short,char-->int-->long-->float-->double
		B:byte,short,char�໥֮�䲻ת�������ǲ�����������ת��Ϊint����
*/
class DataTypeDemo {
    public static void main(String[] args) {
        //����һ��������
        int a = 10;
        int b = 20;
        System.out.println(a + b);
        int c = a + b;
        System.out.println(c);
        System.out.println("--------------");

        //�������
        byte by = 3;
        int i = 4;
        System.out.println(by + i);
        int j = by + i;
        System.out.println(j);
    }
}