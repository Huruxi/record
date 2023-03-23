//�ֻ���Ķ���
class Phone {
    //Ʒ��
    String brand;
    //�۸�
    int price;
    //��ɫ
    String color;

    //��绰�ķ���
    public void call(String name) {
        System.out.println("��" + name + "��绰");
    }

    //������
    public void sendMessage() {
        System.out.println("Ⱥ������");
    }
}

class PhoneDemo2 {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.brand = "ŵ����";
        p.price = 299;
        p.color = "������";
        //ʹ�ó�Ա����
        System.out.println("Ʒ���ǣ�" + p.brand);
        System.out.println("�۸��ǣ�" + p.price);
        System.out.println("��ɫ�ǣ�" + p.color);
        p.call("����ϼ");
        p.sendMessage();

        Phone p2 = new Phone();
        p2.brand = "С��";
        p2.price = 699;
        p2.color = "�ڰ�";
        //ʹ�ó�Ա����
        System.out.println("Ʒ���ǣ�" + p2.brand);
        System.out.println("�۸��ǣ�" + p2.price);
        System.out.println("��ɫ�ǣ�" + p2.color);
        p2.call("�����");
        p2.sendMessage();
    }
}
