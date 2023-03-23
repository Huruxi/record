package cn.itcast_05;

/*
 * 1:String,StringBuffer,StringBuilder������?
 * A:String���ȹ̶���StringBuffer��StringBuilder�ĳ��ȿɱ䡣
 * B:StringBuffer�̰߳�ȫ��Ч�ʵ͡�StringBuilder�̲߳���ȫ��Ч�ʸߡ�
 *
 * 2:StringBuffer�����������
 * A:StringBuffer�ĳ��ȿɱ䣬���Դ洢�����������ͣ����ս����ʵ��һ���ַ�����
 * B:���鳤�ȹ̶����洢ͬһ���������͵�Ԫ�ء�
 *
 * 3:������д�����
 * 		String��Ϊ�������ݣ�StringBuffer��Ϊ��������
 *
 * 		String��һ��������������ͣ�����Ϊ�������ݵ�ʱ�򣬿��Ե�������������������Ϊ�����ݵ�Ҳ�ǳ���ֵ��
 *
 */
public class StringBufferDemo {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "world";
        System.out.println(s1 + "---" + s2); // hello---world
        change(s1, s2);
        System.out.println(s1 + "---" + s2);// world---worldworld???

        StringBuffer sb1 = new StringBuffer("hello");
        StringBuffer sb2 = new StringBuffer("world");
        System.out.println(sb1 + "---" + sb2);// hello---world
        change(sb1, sb2);
        System.out.println(sb1 + "---" + sb2); // world---worldworld???
    }

    public static void change(StringBuffer sb1, StringBuffer sb2) {
        System.out.println(sb1 + "---" + sb2);// hello---world
        sb1 = sb2;// sb1="world"
        sb2 = sb1.append(sb2); // sb2=worldworld
        System.out.println(sb1 + "---" + sb2);// world---worldworld ???
    }

    public static void change(String s1, String s2) {
        System.out.println(s1 + "---" + s2);// hello---world
        s1 = s2; // s1=world
        s2 = s1 + s2; // s2=worldworld
        System.out.println(s1 + "---" + s2); // world---worldworld
    }
}
