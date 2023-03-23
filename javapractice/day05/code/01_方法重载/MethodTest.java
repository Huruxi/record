/*
	�Ƚ����������Ƿ���ȡ��������ͷֱ�Ϊ����byte���ͣ�����short���ͣ�
	����int���ͣ�����long���ͣ�����main�����н��в���
*/
class MethodTest {
    public static void main(String[] args) {
        //����
        byte a = 10;
        byte b = 10;
        System.out.println(compare(a, b));

        System.out.println(compare(10, 10));
    }

    //byte
	/*
	public static boolean compare(byte a,byte b) {
		System.out.println("byte");
		return a == b;
	}

	//short
	public static boolean compare(short a,short b) {
		System.out.println("short");
		return a == b;
	}

	//int
	public static boolean compare(int a,int b) {
		System.out.println("int");
		return a == b;
	}
	*/

    //long
    public static boolean compare(long a, long b) {
        System.out.println("long");
        return a == b;
    }
}
