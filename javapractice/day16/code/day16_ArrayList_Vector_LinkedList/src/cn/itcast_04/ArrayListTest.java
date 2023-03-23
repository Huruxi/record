package cn.itcast_04;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * ȥ���������ַ������ظ�ֵ(�ַ�����������ͬ)
 * ������
 * 		hello,world,java,android,world,java,javaee,java,java,java,android
 * �����
 * 		hello,world,java,android,javaee
 *
 * �����¼��ϵķ�ʽ��
 * 		A:���弯�ϣ��洢���ظ���Ԫ��
 * 		B:�����¼���
 * 		C:�����ɼ��ϣ���ȡ���ɼ����е�ÿһ��Ԫ��
 * 		D:�Ǿɼ��ϵ�ÿһ��Ԫ�ص��¼�����ȥ�ң�����û��
 * 			�У��Ͳ����(��������)
 * 			ľ�У������
 * 		E:�����¼���
 */
public class ArrayListTest {
    public static void main(String[] args) {
        // ���弯�ϣ��洢���ظ���Ԫ��
        ArrayList array = new ArrayList();
        array.add("hello");
        array.add("world");
        array.add("java");
        array.add("android");
        array.add("world");
        array.add("java");
        array.add("javaee");
        array.add("java");
        array.add("java");
        array.add("java");
        array.add("android");

        // �����¼���
        ArrayList newArrayList = new ArrayList();

        // �����ɼ��ϣ���ȡ���ɼ����е�ÿһ��Ԫ��
        for (int x = 0; x < array.size(); x++) {
            String s = (String) array.get(x);
            // �Ǿɼ��ϵ�ÿһ��Ԫ�ص��¼�����ȥ�ң�����û��
            if (!newArrayList.contains(s)) {
                // ľ�У������
                newArrayList.add(s);
            }
        }

        // �����¼���
        Iterator it = newArrayList.iterator();
        while (it.hasNext()) {
            String s = (String) it.next();
            System.out.println(s);
        }
    }
}
