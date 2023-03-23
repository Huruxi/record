/*
	if����ʽ2��
		if(��ϵ���ʽ) {
		     �����1;
		}else {
			 �����2;
		}

	ִ�����̣�
		A:�����ϵ���ʽ��ֵ��
		B:�����true����ִ�������1
		  �����false����ִ�������2
		C:��������ִ��
*/
class IfDemo3 {
    public static void main(String[] args) {
        int x = 3;

        if (x == 3) {
            System.out.println("x����3");
        } else {
            System.out.println("x������3");
        }

        if (x > 5) {
            System.out.println("x����3");
        } else {
            System.out.println("x������5");
        }
    }
}