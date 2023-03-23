/*
	+:���ӷ�����
		A:������ݲ���
		B:����ַ�������+
			ASCII���
				'0'	48
				'A'	65
				'a'	97
		C:����ַ���������+
			���ַ����Ĳ����У����ַ������ӷ�
*/
class DataTypeDemo3 {
    public static void main(String[] args) {
        System.out.println('a');
        System.out.println('a' + 1);
        System.out.println('A' + 0);
        System.out.println('0' + 0);
        System.out.println("-----------");


        System.out.println('a' + 'b');
        System.out.println("a" + "b");

        System.out.println("hello" + 'a' + 1); //����ַ���������ƴ�Ķ����ַ���
        System.out.println('a' + 1 + "hello");
        System.out.println("5+5=" + 5 + 5);
        System.out.println(5 + 5 + "=5+5");
    }
}
