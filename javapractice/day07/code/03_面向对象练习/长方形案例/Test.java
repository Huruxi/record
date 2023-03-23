/*
	����һ����������,�������ܳ�������ķ�����Ȼ����һ��������Test�����в��ԡ�
*/
class ChangFangXing {
    private int length;
    private int width;

    public ChangFangXing() {
    }

    public ChangFangXing(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    public int zhouChang() {
        return (length + width) * 2;
    }

    public int area() {
        return length * width;
    }
}

class Test {
    public static void main(String[] args) {
        //�޲�
        ChangFangXing cfx = new ChangFangXing();
        cfx.setLength(100);
        cfx.setWidth(50);
        System.out.println("�ܳ��ǣ�" + cfx.zhouChang());
        System.out.println("����ǣ�" + cfx.area());

        //����
        ChangFangXing cfx2 = new ChangFangXing(100, 50);
        System.out.println("�ܳ��ǣ�" + cfx2.zhouChang());
        System.out.println("����ǣ�" + cfx2.area());
    }
}