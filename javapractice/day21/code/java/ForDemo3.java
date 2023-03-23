/*
	������5�Ľ׳�

	�׳ˣ�
		n! = n*(n-1)*(n-2)*...*3*2*1

		n! = n*(n-1)!
*/
class ForDemo3 {
    public static void main(String[] args) {
        //�����۳˱���
        int jc = 1;

        for (int x = 1; x <= 5; x++) {
            jc *= x;
        }

        System.out.println("5�Ľ׳��ǣ�" + jc);
    }
}