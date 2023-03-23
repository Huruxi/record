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

class PhoneDemo {
    public static void main(String[] args) {
        //��������
        Phone p = new Phone();

        //ʹ�ó�Ա����
        System.out.println("Ʒ���ǣ�" + p.brand);
        System.out.println("�۸��ǣ�" + p.price);
        System.out.println("��ɫ�ǣ�" + p.color);
        System.out.println("----------------");

        //����Ա������ֵ
        p.brand = "����";
        p.price = 2999;
        p.color = "��ɫ";

        //�ٴ�ʹ�ó�Ա����
        System.out.println("Ʒ���ǣ�" + p.brand);
        System.out.println("�۸��ǣ�" + p.price);
        System.out.println("��ɫ�ǣ�" + p.color);
        System.out.println("----------------");

        //���ó�Ա����
        //String name = "����ϼ";
        //p.call(name);
        p.call("����ϼ");
        p.sendMessage();
    }
}