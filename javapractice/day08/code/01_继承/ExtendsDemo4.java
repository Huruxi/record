/*
	�̳��еĹ��췽����ϵ��
		���������еĹ��췽��Ĭ�϶�����ʸ����пղ����Ĺ��췽��

		Ϊʲô��?
			��Ϊ�����̳и����е����ݣ����ܻ���ʹ�ø�������ݡ�
			���ԣ������ʼ��֮ǰ��һ��Ҫ����ɸ������ݵĳ�ʼ����


	��ô���ҿɲ����Է��ʸ��׵Ĵ��ι��췽����?
		���ԡ�ͨ��super(...)

	ע�����
		A:ÿһ�����췽���ĵ�һ�����Ĭ�϶��ǣ�super()
		B:super(...)��������ʽ�ڹ��췽����ֻ�ܳ���һ�Ρ�
		C:�������û���޲ι��췽������ô������ֻ��
			a:ͨ��superȥ���ʸ���Ĵ��ι��췽����
			b:ͨ��thisȥ���ʱ�����������췽����
*/
class Fu {
	/*
	public Fu() {
		System.out.println("Fu()");
	}
	*/

    public Fu(String name) {
        System.out.println("hello");
    }
}

class Zi extends Fu {
    public Zi() {
        //super();
        //super("aaa");
        //this("aaa");
        System.out.println("zi()");
    }

    public Zi(String name) {
        //super();
        //super(name);
        //this();
        System.out.println("world");
    }
}

class ExtendsDemo4 {
    public static void main(String[] args) {
        //�����������
        Zi z = new Zi();
        System.out.println("-------------");
        Zi z2 = new Zi("java");
    }
}
