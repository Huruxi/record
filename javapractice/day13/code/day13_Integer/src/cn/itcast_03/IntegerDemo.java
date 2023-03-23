package cn.itcast_03;

/*
 * int��String���͵��໥ת�����ɡ�
 *
 * int -- String
 * 		String.valueOf(number)
 * 		Integer.toString(number)
 *
 * String -- int
 * 		Integer.parseInt(s);
 */
public class IntegerDemo {
    public static void main(String[] args) {
        // int -- String
        int number = 100;
        // ����1
        String s1 = number + "";
        //��ʽ2
        String s2 = String.valueOf(number);
        //��ʽ3
        //int -- Integer -- String
        Integer i = new Integer(number);
        String s3 = i.toString();
        //��ʽ4
        String s4 = Integer.toString(number);
        System.out.println("--------------");

        String s = "100";
        //��ʽ1
        //String -- Integer -- int
        Integer ii = new Integer(s);
        //public int intValue()
        int num = ii.intValue();
        //��ʽ2
        //public static int parseInt(String s)
        int num2 = Integer.parseInt(s);
    }
}
