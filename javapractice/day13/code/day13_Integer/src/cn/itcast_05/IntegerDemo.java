package cn.itcast_05;

/*
 * JDK5�������ԣ�
 * 		�Զ�װ��:int -- Integer
 * 				�ײ㷽����public static Integer valueOf(int i)
 * 		�Զ����䣺Integer -- int
 * 				�ײ㷽����public int intValue()
 *
 * ע�⣺������Ϊnull��
 * ����ԭ��ֻҪ�Ƕ������������϶����ж϶����Ƿ�Ϊnull�������Ϊnull���ż���������
 */
public class IntegerDemo {
    public static void main(String[] args) {
        // Integer i = new Integer(100);
        Integer i = 100; // �Զ�װ��
        // Integer i = Integer.valueOf(100);

        i += 200; // i = i + 200
        // i = Integer.valueOf(i.intValue() + 200);

        System.out.println(i);
    }
}
