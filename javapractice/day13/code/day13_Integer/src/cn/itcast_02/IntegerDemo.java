package cn.itcast_02;

/*
 * Integer�Ĺ��췽����
 * Integer(int value)�� ��int���͵�ֵ��װ��Integer����
 * Integer(String s): ���������͵��ַ���ת����Integer����
 */
public class IntegerDemo {
    public static void main(String[] args) {
        // ��ʽ1
        int number = 100;
        Integer i = new Integer(number);
        System.out.println("i:" + i);

        // ��ʽ2
        String s = "100";
        // String s = "abc"; // NumberFormatException:��Ϊ����������ݲ���������ʽ���ַ�������
        Integer i2 = new Integer(s);
        System.out.println("i2:" + i2);
    }
}