package cn.itcast_11;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Properties;
import java.util.Set;

/*
 * ����һ���ı��ļ�user.txt����֪�������Ǽ�ֵ����ʽ�ģ����ǲ�֪��������ʲô��
 * ��дһ�������ж��Ƿ��С�lisi�������ļ����ڣ�����о͸ı���ֵΪ100
 *
 * ������
 * 		A:���ı��ļ������ݼ��ص�������
 * 		B:�������ϣ���ȡ��ÿһ����
 * 		C:�жϼ���ֵ�Ƿ���Ϊlisi��
 * 			�ǣ����޸���ֵΪ100
 * 			�񣺲�������
 * 		D:�Ѽ����е����ݴ洢���ı��ļ�
 */
public class PropertiesTest {
    public static void main(String[] args) throws IOException {
        // ���ı��ļ������ݼ��ص�������
        Properties prop = new Properties();
        Reader r = new FileReader("user.txt");
        prop.load(r);
        r.close();

        // �������ϣ���ȡ��ÿһ����
        Set<String> set = prop.stringPropertyNames();
        for (String key : set) {
            // �жϼ���ֵ�Ƿ���Ϊlisi��
            if ("lisi".equals(key)) {
                // ���޸���ֵΪ100
                prop.setProperty(key, "100");
                break;
            }
        }

        // �Ѽ����е����ݴ洢���ı��ļ�
        Writer w = new FileWriter("user.txt");
        prop.store(w, null);
        w.close();
    }
}
