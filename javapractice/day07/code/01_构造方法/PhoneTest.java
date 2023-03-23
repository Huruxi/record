class Phone {
    private String brand;
    private int price;
    private String color;

    public Phone() {
    }

    public Phone(String brand, int price, String color) {
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void show() {
        System.out.println("�ҵ��ֻ��ǣ�" + brand + ",�۸��ǣ�" + price + ",��ɫ�ǣ�" + color);
    }
}

class PhoneTest {
    public static void main(String[] args) {
        //�޲�+setXxx()
        Phone p = new Phone();
        p.setBrand("����");
        p.setPrice(1000);
        p.setColor("��ɫ");
        p.show();

        //����
        Phone pp = new Phone("��Ϊ", 799, "��ɫ");
        pp.show();
    }
}
