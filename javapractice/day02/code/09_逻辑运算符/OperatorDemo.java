/*
	�߼��������
		&,|,!,^
		&&,||

	ע�⣺
		�߼���������ӵ�Ӧ����һ���������ʽ��
*/
class OperatorDemo {
    public static void main(String[] args) {
        //&,|,!,^
        int a = 10;
        int b = 20;
        int c = 30;

        //&:�߼���	��false��false
        System.out.println(a > b & a > c); //false & false = false
        System.out.println(a > b & a < c); //false & true = false
        System.out.println(a < b & a > c); //true & false = false
        System.out.println(a < b & a < c); //true & true = true
        System.out.println("--------");

        //|:�߼���	��true��true
        System.out.println(a > b | a > c); //false | false = false
        System.out.println(a > b | a < c); //false | true = true
        System.out.println(a < b | a > c); //true | false = true
        System.out.println(a < b | a < c); //true | true = true
        System.out.println("--------");

        //^:�߼���� ��ͬfalse����ͬtrue��
        //���£����У���Ů��Ů�У�ŮŮ
        System.out.println(a > b ^ a > c); //false ^ false = false
        System.out.println(a > b ^ a < c); //false ^ true = true
        System.out.println(a < b ^ a > c); //true ^ false = true
        System.out.println(a < b ^ a < c); //true ^ true = false
        System.out.println("--------");

        //!:�߼���
        System.out.println((a > b));//false
        System.out.println(!(a > b));//true
        System.out.println(!!(a > b));//false
        System.out.println(!!!(a > b));//true
        System.out.println(!!!!(a > b));//false
    }
}
