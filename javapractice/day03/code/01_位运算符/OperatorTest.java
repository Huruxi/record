/*
	λ^������ţ����ͬһ������������Σ���ֵ����

	 �����⣺
		����������ݽ��н�����
		˵���������û��ָ�����ݵ����ͣ�Ĭ����int���͡��������ҽ��Ρ�
*/
class OperatorTest {
    public static void main(String[] args) {
		/*
		System.out.println(1 ^ 2 ^ 2);//1
		System.out.println(1 ^ 1 ^ 2);//2
		System.out.println(15 ^ 3 ^ 7 ^ 7 ^ 3);//15
		*/

        //������������
        int a = 10;
        int b = 20;

        //System.out.println(a+"---"+b);
        System.out.println("a=" + a + ",b=" + b);

        //��ô����?
        //��ʽ1��ʹ�õ����������������г��ô˷�����
		/*
		int temp = a;
		a = b;
		b = temp;
		System.out.println("a="+a+",b="+b);
		*/

        //��ʽ2�����ã�����a+b�Ѿ�������Χ�ˡ�
		/*
		a = a + b; //a=30
		b = a - b; //b=10
		a = a - b; //a=20
		System.out.println("a="+a+",b="+b);
		*/

        //��ʽ3�����ã�����a+b�Ѿ�������Χ�ˡ�
        //a = (a+b) - (b=a); //һ�仰�㶨
        //System.out.println("a="+a+",b="+b);

        //��ʽ4������
        a = a ^ b;
        b = a ^ b; //b = a ^ b = a ^ b ^ b = a;
        a = a ^ b; //a = a ^ b = a ^ b ^ a = b;
        System.out.println("a=" + a + ",b=" + b);
        //���䣺��ߣ�a,b,a���ұ�a^b
    }
}
