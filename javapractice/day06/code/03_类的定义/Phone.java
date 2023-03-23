/*
	��һ������������
		�ֻ����
			���ԣ�Ʒ�ƣ��۸���ɫ
			��Ϊ����绰��������

	�ڶ�����������ת��Ϊ��
		�ֻ��ࣺ
			��Ա������Ʒ�ƣ��۸���ɫ
			��Ա��������绰��������

	��������������Ӣ������
		Phone:
			��Ա������brand��price��color
			��Ա������call(String name)��sendMessage()

	���Ĳ���д��������
		��Ա��������ʵ����һ��������ֻ�������������з����⣬����Ҳ���Բ�����ʼ��ֵ��
		��Ա��������ʵ����һ��������ֻ��������Ҫstatic�ˡ�
*/
//�����ҵ��ֻ���
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

    //�����ŵķ���
    public void sendMessage() {
        System.out.println("Ⱥ������");
    }
}