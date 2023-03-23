package cn.itcast_02;

import java.util.ArrayList;
import java.util.Collection;

/*
 * Ϊʲô���ּ�����?
 * 		����������Զ���������ֶ����Զ������ʽ������Ϊ�˷���Զ������Ĳ�������ǰ����ѧ֪ʶ������ֻ�ܲ��ö�������ʵ�֡�
 * 		���ǣ���������ĳ������ǹ̶��ģ���Ӧ���˱仯���������ԣ�java���ṩ�˼����๩����ʹ�á�
 *
 * ��������ص㣺
 * 		A:���ȿɱ�
 * 		B:ֻ�ܴ洢����
 * 		C:���Դ洢��ͬ���͵Ķ���
 *
 * �����⣺����ͼ��ϵ�����?
 * 		A:���ϳ��ȿɱ䣻����ֻ�ܴ洢�����������ͣ����Ͽ��Դ洢��ͬ�������͵�Ԫ��
 * 		B:���鳤�ȹ̶���������Դ洢�����������ͣ�Ҳ���Դ洢�����������ͣ�����洢����ͬһ���������͵�Ԫ��
 *
 * �������ǵĹ�������̫һ�������ԣ�java���ṩ�˶��ּ����๩����ʹ�á���Щ������ı���������ʵ�ǵײ�����ݽṹ��ͬ��
 * ���ݽṹ�����ݵĴ洢��ʽ��
 *
 * Collection�Ĺ��ܣ�
 * A:��ӹ���
 * 		boolean add(Object obj):�����������һ��Ԫ��
 * 		boolean addAll(Collection c):����������Ӷ��Ԫ�ء�
 * B:��ȡ����
 * 		Iterator iterator():������
 * 		int size():���ϵ�Ԫ�ظ���������
 * C:ɾ������
 * 		void clear():��ռ��ϵ�����Ԫ��
 * 		boolean remove(Object obj):�Ӽ������Ƴ�һ��Ԫ��
 * 		boolean removeAll(Collection c):�Ӽ������Ƴ����Ԫ��
 * D:�жϹ���
 * 		boolean contains(Object obj):�жϼ������Ƿ����ָ����Ԫ��
 * 		boolean containsAll(Collection c):�жϼ������Ƿ����ָ���Ķ��Ԫ��
 * 		boolean isEmpty():�жϼ����Ƿ�Ϊ��
 * E:����Ԫ��
 * 		boolean retainAll(Collection c)
 * F:ת����
 * 		Object[] toArray():�Ѽ���ת�ɶ�������
 */
public class CollectionDemo {
    public static void main(String[] args) {
        // �������϶���
        Collection c = new ArrayList();

        // boolean add(Object obj):�����������һ��Ԫ��
        // System.out.println("add:" + c.add("hello"));
        // System.out.println("add:" + c.add("world"));
        c.add("hello");
        c.add("world");
        c.add("java");

        // void clear():��ռ��ϵ�����Ԫ��
        // c.clear();

        // boolean remove(Object obj):�Ӽ������Ƴ�һ��Ԫ��
        // System.out.println("remove:" + c.remove("world"));
        // System.out.println("remove:" + c.remove("javaee"));

        // boolean contains(Object obj):�жϼ������Ƿ����ָ����Ԫ��
        // System.out.println("contains:" + c.contains("hello"));
        // System.out.println("contains:" + c.contains("javaee"));

        // boolean isEmpty():�жϼ����Ƿ�Ϊ��
        // System.out.println("isEmpty:" + c.isEmpty());

        // int size():���ϵ�Ԫ�ظ���������
        System.out.println("size:" + c.size());

        System.out.println("c:" + c);
    }
}