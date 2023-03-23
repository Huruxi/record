package cn.itcast_01;

import java.util.HashMap;
import java.util.Map;

/*
 * �������ǵ�ѧ������ѧ�ź���������Ϣ�ġ�
 * it001	����ϼ
 * it002	������
 * it003	������
 * ������Ŀǰ��ѧ��֪ʶ������ʵ�֡�
 * ����������Ϊһ����ĳ�Ա������Ȼ����Collection��ϵ�ļ��ϴ洢���󼴿ɡ�
 * �����أ��������ѧ��ֱ�Ӿ����ҵ��ˣ����ʵ����?Ҳ�ǿ���ʵ�ֵģ�������ʱ�����αȽ�ѧ�ż��ɡ�Ȼ��ѧ����ȷ�ģ���ȡ�ö��������������
 * ��Ȼ�ǿ��Եģ������е���鷳����Ϊ���ǲ�����ÿ��Ҫ��һ���ˣ�����ͷ����һ�顣
 * ������һ�ּ��ϣ��ܹ�ʵ��ѧ�ź������Ķ�Ӧ��ϵ�����Ǿ��ܼ򵥺ܶ��ˡ�
 * һ��ѧ�Ŷ�Ӧ��һ��������Ȼ�����ѧ�ž���֪����������Ϊ����������������java���ṩ��һ���µļ��ϣ�Map��
 *
 * Map��Ԫ���ǰ��ռ�ֵ����ʽ�洢�ġ�ÿһ��Ԫ������������ɡ��ֱ�м���ֵ
 * 	          ����Ψһ�ģ�ֵ�ǿ����ظ��ġ�
 * 	         ����Map���ϵĵײ����ݽṹ����Լ���Ч����ֵ�޹ء�
 *
 * Map�ӿں�Collection�ӿڵĲ�ͬ?(������)
 * 		A:Map������˫�м��ϣ�Map���ϵļ���Ψһ�ģ�ֵ�ǿ����ظ��ġ���ʵ����Ҳ���Լ򵥵����ΪMap���ϵļ���ֵ����Set��List��ɣ����ݽṹ��Լ���Ч��
 * 		B:Collection�����ǵ��м��ϣ�Collection���ϵĶ���Set��Ψһ�ģ�List�ǿ����ظ��ģ����ݽṹ���Ԫ����Ч��
 *
 * Map���ϵĹ��ܣ�
 * 		A:��ӹ���
 * 			V put(K key,V value):��ӣ��滻�����޸ġ�����ͬ����ӵ����ϡ�����ͬ��ֵ�滻��
 * 		B:�Ƴ�����
 * 			void clear():�Ƴ�����ӳ���ϵ
 * 			V remove(Object key):���ݼ��Ƴ���ֵ��Ԫ�أ����ص��Ǽ���Ӧ��ֵ
 * 		C:�жϹ���
 * 			boolean containsKey(Object key):�ж�Map�������Ƿ����ָ���ļ�
 * 			boolean containsValue(Object value):�ж�Map�������Ƿ����ָ����ֵ
 * 			boolean isEmpty():�жϼ����Ƿ�Ϊ��
 * 		D:��ȡ����
 * 			Set<Map.Entry<K,V>> entrySet():���ص��Ǽ�ֵ�Զ����Set���ϡ�
 * 			V get(Object key):���ݼ���ȡֵ
 * 			Set<K> keySet():���еļ��ļ���
 * 			Collection<V> values():����ֵ�ļ���
 * 			int size():���ϵĳ���
 */
public class MapDemo {
    public static void main(String[] args) {
        // �������϶���
        // ����Ԫ��
        // ���Ԫ��
        // ��������

        // �������϶���
        Map<String, String> map = new HashMap<String, String>();

        // ���Ԫ��
        // V put(K key,V value)
        // System.out.println("put:" + map.put("����", "������"));
        // System.out.println("put:" + map.put("����", "Ҧ��"));
        map.put("����", "������");
        map.put("л����", "�Ű�֥");
        map.put("����", "Ҷһ��");
        map.put("����", "������");

        // void clear():�Ƴ�����ӳ���ϵ
        // map.clear();

        // V remove(Object key):���ݼ��Ƴ���ֵ��Ԫ�أ����ص��Ǽ���Ӧ��ֵ
        // System.out.println("remove:" + map.remove("����"));
        // System.out.println("remove:" + map.remove("����2"));

        // boolean containsKey(Object key):�ж�Map�������Ƿ����ָ���ļ�
        // System.out.println("containsKey:" + map.containsKey("����"));
        // System.out.println("containsKey:" + map.containsKey("ɭ��"));

        // boolean isEmpty():�жϼ����Ƿ�Ϊ��
        // System.out.println("isEmpty:" + map.isEmpty());

        // int size():���ϵĳ���
        System.out.println("size:" + map.size());

        System.out.println("map:" + map);
    }
}
