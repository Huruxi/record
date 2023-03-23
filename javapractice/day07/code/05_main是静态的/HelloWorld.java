/*
	public static void main(String[] args):

	public:����Ȩ�����η�����ʾ���ķ���Ȩ�ޣ���jvm���ã�����Ȩ��Ҫ����
	static:��jvm���ã����ô�������ֱ����������
	void:��jvm���ã�����Ҫ��jvm����ֵ
	main:һ��ͨ�õ����ƣ���Ȼ���ǹؼ��֣����Ǳ�jvmʶ��

	String[] args:
		���ڳ�����Ϊ�˽��ռ���¼�����ݵġ�

		java HelloWorld aa bb cc
*/
class HelloWorld {
    public static void main(String[] args) {
        //System.out.println(args); //[Ljava.lang.String;@778b3fee

        for (int x = 0; x < args.length; x++) {
            System.out.println(args[x]);
        }
    }
}