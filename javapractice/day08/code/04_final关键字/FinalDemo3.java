/*
	final�ĳ�ʼ��ʱ����
		A:�ڶ����ʱ��������ֵ���Ժ���Ҳ���ܸ��ˡ�
		B:�ڶ���󣬹��췽������ǰ��ֵ�����ԡ�
*/
class Demo {
    int num;
    //final int num2 = 0;
    final int num2 = 0;


    static {
        num2 = 10;
    }
	

	/*
	{
		num2 = 20;
	}
	*/

    public Demo() {
        //num2 = 100;
    }
}

class FinalDemo3 {
    public static void main(String[] args) {
        Demo d = new Demo();
        System.out.println(d.num);
        System.out.println(d.num2);
    }
}
