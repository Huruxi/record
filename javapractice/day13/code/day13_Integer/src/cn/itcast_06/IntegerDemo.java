package cn.itcast_06;

//������д���:byte��Χ�Ļ����
public class IntegerDemo {
    public static void main(String[] args) {
        Integer i1 = new Integer(127);
        Integer i2 = new Integer(127);
        System.out.println(i1 == i2);// false
        System.out.println(i1.equals(i2));// true

        Integer i3 = new Integer(128);
        Integer i4 = new Integer(128);
        System.out.println(i3 == i4);// false
        System.out.println(i3.equals(i4));// true

        Integer i5 = 127;
        Integer i6 = 127;
        System.out.println(i5 == i6);// true
        System.out.println(i5.equals(i6));// true

        Integer i7 = 128;
        Integer i8 = 128;
        System.out.println(i7 == i8);// false
        System.out.println(i7.equals(i8));// true

        // Ҫ��֪��Ϊʲô���ͱ��뿴Դ�롣
        // public static Integer valueOf(int i)
        //char ch = 127;
        //Integer i = Integer.valueOf(ch);
        // ͨ���鿴Դ������֪�����������-128��127֮�䣬�Ǵ�һ�����������з��صġ�
        // ������������Χ�ڣ��������´�����new�����Ķ���
    }
}
