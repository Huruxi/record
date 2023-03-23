package cn.itcast_01;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * Map���ϵı�����(��Map����ϰ�߿��ɷ��޶�)
 * 		��Ȼ�Ƿ��޶ԣ���ô��Ӧ���н��֤��
 * 		�����֤֤��Ӧ�����ɷ�����ӵ����֡�
 * 		���ԣ����ǿ��԰ѽ��֤����������һ���࣬���֤�࣬�������������Ա������һ�����ɷ�һ�������ӡ�
 * 		class ���֤ <�ɷ�,����>{
 * 			private �ɷ� zf;
 * 			private ���� qz;
 *
 * 			//���췽����setXxx()...ʡ����
 *
 * 			public �ɷ� getZf() {
 * 				return zf;
 * 			}
 *
 * 			public ���� getQz() {
 * 				return qz;
 * 			}
 * 		}
 *
 * 		˼·��
 * 			A:��ȡ���еĽ��֤�����Set���ϡ�
 * 			B:�������֤�����Set���ϣ��õ�ÿһ�����֤����
 * 			C:���Ž��֤�����ɷ�����ӵ����֡�
 *
 * 		��Ӧ��������
 * 			A:��ȡ���еļ�ֵ�Զ����Set���ϡ�	Set<��ֵ�Զ���>	--Set<���֤ <�ɷ�,����>>--Set<Map.Entry<K,V>> entrySet()
 * 			B:������ֵ�Զ����Set���ϣ��õ�ÿһ����ֵ�Զ���Map.Entry<K,V>
 * 			C:���ݼ�ֵ�Զ���ȥ��ȡ����ֵ��getKey(),getValue()
 */
public class MapDemo4 {
    public static void main(String[] args) {
        // �������϶���
        Map<String, String> map = new HashMap<String, String>();

        // ���������Ԫ��
        map.put("����", "������");
        map.put("л����", "�Ű�֥");
        map.put("����", "Ҷһ��");
        map.put("����", "������");

        // ����
        // ��ȡ���еļ�ֵ�Զ����Set���ϡ�
        Set<Map.Entry<String, String>> set = map.entrySet();
        // ������ֵ�Զ����Set���ϣ��õ�ÿһ����ֵ�Զ���
        for (Map.Entry<String, String> me : set) {
            // ���ݼ�ֵ�Զ���ȥ��ȡ����ֵ��getKey(),getValue()
            String key = me.getKey();
            String value = me.getValue();
            System.out.println(key + "---" + value);
        }
    }
}
