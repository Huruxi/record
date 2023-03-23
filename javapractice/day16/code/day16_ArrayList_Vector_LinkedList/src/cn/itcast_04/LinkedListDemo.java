package cn.itcast_04;


/*
 * LinkedList
 *		����LinkedListģ��ջ���ݽṹ�ļ��ϣ�������
 *		��Ŀ����˼�ǣ���Ҫ�Լ���һ�������࣬��������ṩ���Ԫ�غͻ�ȡԪ�صĹ��ܣ�Ȼ�������ļ����ࡣ�ṩ��LinkedList����ʹ�á�
 * ջ���Ƚ����
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        // �������϶���
        // LinkedList link = new LinkedList();
        //
        // // ���Ԫ��
        // link.addFirst("hello");
        // link.addFirst("world");
        // link.addFirst("java");
        //
        // Iterator it = link.iterator();
        // while (it.hasNext()) {
        // String s = (String) it.next();
        // System.out.println(s);
        // }

        //��������
        MyStack my = new MyStack();

        //���Ԫ��
        my.add("hello");
        my.add("world");
        my.add("java");

        //��ȡ
        // System.out.println(my.get());
        // System.out.println(my.get());
        // System.out.println(my.get());
        // System.out.println(my.get());

        while (!my.isEmpty()) {
            System.out.println(my.get());
        }
    }
}
