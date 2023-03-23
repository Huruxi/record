package cn.itcast_06;

import java.util.Hashtable;

/*
 * �����⣺
 * 1:HashMap��Hashtable������?
 * A:HashMap���̲߳���ȫ�ģ�Ч�ʸߡ�����ʹ�� null ֵ�� null ����
 * B:Hashtable���̰߳�ȫ�ģ�Ч�ʵ͡�������ʹ�� null ֵ�� null ����
 *
 * 2:List,Set,Map�Ƚӿ��Ƿ񶼼̳���Map�ӿ�
 * List,Set���̳���Collection�ӿڡ�
 * Map������Ƕ���ӿ�
 *
 * 3:�㳣���ļ���������Щ������ʲô����?
 * 		Collection
 * 			|--List
 * 				|--ArrayList
 * 				|--Vector
 * 				|--LinkedList
 * 			|--Set
 * 				|--HashSet
 * 					|--LinkedHashSet
 * 				|--TreeSet
 * 		Map
 * 			|--HashMap
 * 				|--LinkedHashMap
 * 			|--Hashtable
 * 			|--TreeMap
 *
 * 		ArrayList
 * 			��ӹ��ܣ��Ƴ����ܣ��жϹ��ܣ���ȡ������
 * 		HashSet
 * 			��ӹ��ܣ��Ƴ����ܣ��жϹ��ܣ���ȡ������
 * 		HashMap
 * 			��ӹ��ܣ��Ƴ����ܣ��жϹ��ܣ���ȡ������
 */
public class HashtableDemo {
    public static void main(String[] args) {
        // HashMap<String, String> hm = new HashMap<String, String>();
        Hashtable<String, String> hm = new Hashtable<String, String>();

        hm.put("007", "���ǳ�");
        // hm.put(null, "����"); // NullPointerException
        // hm.put(null, "����");
        // hm.put("9527", null); // NullPointerException

        System.out.println(hm);
    }
}
