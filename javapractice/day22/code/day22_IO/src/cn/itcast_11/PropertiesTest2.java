package cn.itcast_11;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Properties;

/*
 * ����һ��������С��Ϸ�ĳ�����дһ������ʵ���ڲ�������ֻ����5�Σ�����5����ʾ���ף���Ϸ�����ѽ������븶�ѡ�
 *
 * ������
 * 		A:дһ��������С��Ϸ�ĳ���
 * 		B:�ڲ������п����棬���ǲ��ܳ���5��
 * 		C:��ο�����?
 * 			�Ϳ��԰���Ĵ���д��һ���ļ��У�ÿ����֮ǰ���ȶ�ȡ�ļ��еĴ��������ж�
 * 		  	���û�г���5�Σ��Ϳ��Լ����棬�����Ͳ������ˣ�������ʾ���ɡ�
 *
 * ����ȺӢ��2(�ȼ�)
 */
public class PropertiesTest2 {
    public static void main(String[] args) throws IOException {
        // �������϶���
        Properties prop = new Properties();
        Reader r = new FileReader("playCount.txt");
        prop.load(r);
        r.close();

        // ��ȡ����
        String value = prop.getProperty("count");
        // ���ַ���ת��int���͵�ֵ
        int count = Integer.parseInt(value);

        if (count >= 5) {
            System.out.println("�ף���Ϸ�����ѽ��������Ұ೤���ѡ�������:10086");
        } else {
            GuessNumberGame.start();
            count++;
            // �޸ļ���
            prop.setProperty("count", String.valueOf(count));

            // �Ѽ��ϵ�����д���ı��ļ�
            Writer w = new FileWriter("playCount.txt");
            prop.store(w, null);
            w.close();
        }
    }
}
