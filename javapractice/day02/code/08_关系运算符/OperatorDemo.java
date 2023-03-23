/*
	��ϵ�������
		==,!=,>,>=,<,<=

	�ص㣺
		���۱��ʽ�Ǽ򵥻��Ǹ��ӣ�����϶���boolean���͡�
	
	ע�����
		��ϵ�������==��������д�ɡ�=�� ��
*/
class OperatorDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        int c = 20;
        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println((a + b * c) == (a * b + c));
        System.out.println("----------------");

        System.out.println(a = b); //��b��ֵ��ֵ��a����a��ֵ��Ϊ���������
        System.out.println(a = c);
    }
}
