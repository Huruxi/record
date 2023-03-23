/*
	������д�������г����˺͸�����һģһ���ķ���������Ҳ����Ϊ�������ǣ�������д
*/
//�ֻ�
/*
class Phone {
	public void call(String name) {
		System.out.println("��"+name+"��绰");
	}
}

//�¿��ֻ�
class NewPhone {
	public void call(String name) {
		System.out.println("������");
		System.out.println("��"+name+"��绰");
	}
}

class PhoneDemo {
	public static void main(String[] args) {
		//�ֻ�
		Phone p = new Phone();
		p.call("����ϼ");
		System.out.println("-----------");
	
		//���ֻ�
		NewPhone np = new NewPhone();
		np.call("����ϼ");
	}
}
*/

class Phone {
    public void call(String name) {
        System.out.println("��" + name + "��绰");
    }
}

class NewPhone extends Phone {
    public void call(String name) {
        System.out.println("������");
        //System.out.println("��"+name+"��绰");
        super.call(name);
    }
}

class PhoneDemo {
    public static void main(String[] args) {
        //�ֻ�
        Phone p = new Phone();
        p.call("����ϼ");
        System.out.println("-----------");

        //���ֻ�
        NewPhone np = new NewPhone();
        np.call("����ϼ");
    }
}