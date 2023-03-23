/*
	���㣺�Գ����ͱ������в����Ĺ��̳�Ϊ���㡣
	��������Գ����ͱ������в����ķ��ų�Ϊ�����
	���ʽ����������ѳ����ͱ�������������ʽ��
			a + b
			ע�⣺���ʽ�����н��

	�������������
		���������
		��ֵ�����
		�Ƚ������
		�߼������
		λ�����
		��Ŀ�����

	�����������
		+��-��*��/��%��++��--
*/
class OperatorDemo {
    public static void main(String[] args) {
        System.out.println(10 + 20);
        System.out.println(10 - 20);
        System.out.println(10 * 20);
        //���������ֻ�ܵõ�����
        System.out.println(10 / 20);
        //Ҫ��õ�С�������Գ��Ի��߳���1.0
        System.out.println(10 / 1.0 / 20);

        //�ӷ����÷�:����,�ӷ�,�ַ������ӷ�
        System.out.println(+5);
        System.out.println(1 + 2);
        System.out.println("1" + "2");
    }
}