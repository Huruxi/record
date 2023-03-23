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

class PhoneDemo3 {
    public static void main(String[] args) {
        Phone p = new Phone();
        //��Ա������ֵ��ʹ�ò�����
        //�������ò�����

        Phone p2 = new Phone();
        //��Ա������ֵ��ʹ�ò�����
        //�������ò�����

        Phone p3 = p;
        p3.brand = "����";
        p3.price = 1999;
        p3.color = "��ɫ";
        System.out.println("Ʒ���ǣ�" + p.brand);
        System.out.println("�۸��ǣ�" + p.price);
        System.out.println("��ɫ�ǣ�" + p.color);
    }
}
