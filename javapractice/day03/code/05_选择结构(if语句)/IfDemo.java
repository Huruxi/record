/*
	ѡ��ṹ��if��䣬switch��䡣

	if��������ָ�ʽ��

	if����ʽ1��
		if(��ϵ���ʽ) {
		     �����;
		}

	ִ�����̣�
		A:�����ϵ���ʽ��������
		B:�����true����ִ�������
		  �����false���Ͳ�ִ�������
		C:��������ִ��
*/
class IfDemo {
    public static void main(String[] args) {
        int x = 3;

        if (x == 3) {
            System.out.println("x����3");
            //x = 10;
        }

        if (x > 5) {
            System.out.println("x����5");
        }

        System.out.println("over");
    }
}