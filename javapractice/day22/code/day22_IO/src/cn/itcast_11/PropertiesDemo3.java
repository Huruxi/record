package cn.itcast_11;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Properties;

/*
 * Properties��IO���Ľ��ʹ�á�
 * A:���ı��ļ��е����ݶ�ȡ��������
 * 		����Դ���ı��ļ�
 * 		Ŀ�ĵأ�����
 *
 * 		public void load(InputStream inStream)
 *		public void load(Reader reader)
 * B:�Ѽ����е����ݴ洢���ı��ļ�
 * 		����Դ������
 * 		Ŀ�ĵأ��ı��ļ�
 *
 * 		public void store(OutputStream out,String comments)
 * 		public void store(Writer writer,String comments)
 */
public class PropertiesDemo3 {
    public static void main(String[] args) throws IOException {
        // �������϶���
        Properties prop = new Properties();
        // public void load(Reader reader)
        Reader r = new FileReader("prop.txt");
        prop.load(r);
        r.close();
        System.out.println("prop:" + prop);
        System.out.println("---------------------");

        // �������϶���
        Properties prop2 = new Properties();
        prop2.setProperty("001", "hello");
        prop2.setProperty("002", "world");
        prop2.setProperty("003", "java");

        // public void store(Writer writer,String comments)
        Writer w = new FileWriter("w.txt");
        prop2.store(w, null);
        w.close();
    }
}
