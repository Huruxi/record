/*
	����飺��Java�У�ʹ��{}�������Ĵ��뱻��Ϊ����顣

	������λ�ú������Ĳ�ͬ�����Է�Ϊ
		�ֲ�����飺�ڷ����г��֣��޶������������ڣ������ͷţ�����ڴ�������
		�������飺�����з�������֣�
					������췽����������ͬ�Ĵ����ŵ�һ��ÿ�ε��ù��춼ִ�У������ڹ��췽��ǰִ��
		��̬����飺�����з�������֣�����static���Ρ�
					���ڸ�����г�ʼ�����ڼ��ص�ʱ���ִ�У�����ִֻ��һ�Ρ�
*/
//�ֲ������
/*
class Code {
	public void show() {
		//�ֲ������
		{
			int x = 10;
			System.out.println(x);
		}

		//System.out.println(x);
		//... 1000��,x����1000�д�����û�б�ʹ��
		int y = 100;
		System.out.println(y);
	}
}
*/

//��������
/*
class Code {

	//��������
	{
		System.out.println("AAAAA"); 
	}

	public Code() {
		//System.out.println("AAAAA"); //���������������ݱȽ϶࣬������ÿ�������ж������
	}

	public Code(String s) {
		//System.out.println("AAAAA");
		System.out.println(s);
	}
}
*/

//��̬�����
class Code {
    //��̬�����
    static {
        System.out.println("AAAAA");
    }

	/*
	public Code() {
	}

	public Code(String s) {
		System.out.println(s);
	}
	*/
}

class CodeDemo {
    static {
        System.out.println("BBBBB");
    }

    public static void main(String[] args) {
        Code c = new Code();
        //c.show();

        //Code c2 = new Code("hello");
        System.out.println("CCCCC");
    }
}