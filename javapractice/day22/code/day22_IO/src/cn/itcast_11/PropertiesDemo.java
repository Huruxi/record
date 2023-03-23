package cn.itcast_11;

import java.util.Properties;
import java.util.Set;

/*
 * Properties ���ʾ��һ���־õ����Լ���Properties �ɱ��������л�����м��ء������б���ÿ���������Ӧֵ����һ���ַ�����
 *
 * Properties��ΪMap���ϵ�ʹ��
 */
public class PropertiesDemo {
    public static void main(String[] args) {
        // �������϶���
        Properties prop = new Properties();

        // �������
        prop.put(1, "java");
        prop.put(2, "c#");
        prop.put(3, "php");

        // ��������
        Set<Object> set = prop.keySet();
        for (Object key : set) {
            Object value = prop.get(key);
            System.out.println(key + "---" + value);
        }
    }
}
