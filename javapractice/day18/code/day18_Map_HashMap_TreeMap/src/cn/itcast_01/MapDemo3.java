package cn.itcast_01;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * Map���ϵı�����(��Map����ϰ�߿��ɷ��޶�)
 * 		˼·��
 * 			A:���ɷ�����������ȡ���еļ���keySet()
 * 			B:�����ɷ򣬵õ�ÿһ���ɷ���ǿfor
 * 			C:���ɷ�ȥ���Լ������ӡ�V get(key key)
 *
 * 		��Ӧ��������
 * 			A:��ȡMap���ϵ����еļ���Set����
 * 			B:��������Set���ϣ���ȡ��ÿһ����
 * 			C:���ݼ���Map�������Ҷ�Ӧ��ֵ
 */
public class MapDemo3 {
    public static void main(String[] args) {
        // �������϶���
        Map<String, String> map = new HashMap<String, String>();

        // ���������Ԫ��
        map.put("����", "������");
        map.put("л����", "�Ű�֥");
        map.put("����", "Ҷһ��");
        map.put("����", "������");

        // ����
        // ��ȡMap���ϵ����еļ���Set����
        Set<String> set = map.keySet();
        // ��������Set���ϣ���ȡ��ÿһ����
        for (String key : set) {
            // ���ݼ���Map�������Ҷ�Ӧ��ֵ
            String value = map.get(key);
            System.out.println(key + "---" + value);
        }
    }
}
