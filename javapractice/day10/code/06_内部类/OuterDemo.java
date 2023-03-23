/*
����Ҫ�󣬲������
	interface Inter { void show(); }
	class Outer { //������� }
	class OuterDemo {
	    public static void main(String[] args) {
		      Outer.method().show();
		  }
	}
Ҫ���ڿ���̨�����HelloWorld��
*/
interface Inter {
    void show();
}

class Outer {
    //�������
    public static Inter method() {
        return new Inter() {
            public void show() {
                System.out.println("HelloWorld");
            }
        };
    }
}

class OuterDemo {
    public static void main(String[] args) {
        Outer.method().show();
		/*
			Outer.method():�����ܹ�ֱ�ӵ��÷�����˵���÷����Ǿ�̬�ġ�
			Outer.method().show():�����÷�����ʽ��̣�����show()����֮ǰ������Ӧ����һ������
		*/
    }
}