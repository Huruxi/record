/*
	static��ע�����
		A:�ھ�̬��������û��this�ؼ��ֵ�
			��Ϊ��̬��������ļ��ض����أ������ڶ�������ڡ���this�����Ŷ���Ĵ��������ڡ�
			�Ƚ��ڴ�ģ� ���ܷ��ʺ���ڴ�ģ�������ڴ�ģ����Է����Ƚ��ڴ�ġ�
		B:��ֻ̬�ܷ��ʾ�̬��
			�Ǿ�̬�ĳ�Ա������
				���Է��ʾ�̬��Ա�������Ǿ�̬��Ա��������̬��Ա�������Ǿ�̬��Ա����
			��̬�ĳ�Ա������
				ֻ�ܷ��ʾ�̬�ĳ�Ա��������̬�ĳ�Ա����
*/
/*
class Student {
	private String name;

	public static void setName(String name) {
		this.name = name;
	}

	public void show() {
		System.out.println(name);
	}
}*/

class Demo {
    int x = 10;
    static int y = 20;

    public void show() {
        System.out.println(x);
        System.out.println(y);
    }

    public static void show2() {
        //System.out.println(x);
        System.out.println(y);
    }

    public void show3() {
        show();
        show2();
    }

    public static void show4() {
        //show();
        show2();
    }
}

class StudentDemo3 {
    public static void main(String[] args) {
        //Student.setName("����ϼ");
    }
}
