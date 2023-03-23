/*
	����֪ʶ��
		A:������ִ��˳��
			��̬����� --> �������� --> ���췽��
		B:�����ִ���ص�
			��̬�����ִֻ��һ��
			��������ÿ�ε��ù��췽����ִ��
*/
class Fu {
    static {
        System.out.println("��̬�����Fu");
    }

    {
        System.out.println("��������Fu");
    }

    public Fu() {
        System.out.println("���췽��Fu");
    }
}

class Zi extends Fu {
    static {
        System.out.println("��̬�����Zi");
    }

    {
        System.out.println("��������Zi");
    }

    public Zi() {
        System.out.println("���췽��Zi");
    }
}

class Test3 {
    public static void main(String[] args) {
        Zi z = new Zi();
        Zi z2 = new Zi();
    }
}
