package cn.itcast_09;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

/*
 * SequenceInputStream ��ʾ�������������߼����������������������򼯺Ͽ�ʼ�����ӵ�һ����������ʼ��ȡ��ֱ�������ļ�ĩβ��
 * ���Ŵӵڶ�����������ȡ���������ƣ�ֱ��������������һ�����������ļ�ĩβΪֹ��
 *
 * ���췽����
 * 		SequenceInputStream(InputStream s1, InputStream s2):�ϲ�����������
 * 		SequenceInputStream(Enumeration e):�ϲ����������
 */
public class SequenceInputStreamDemo {
    public static void main(String[] args) throws IOException {
        // mergeTwo();
        mergeMore();
    }

    private static void mergeMore() throws IOException {
        // SequenceInputStream(Enumeration e):�ϲ����������
        // public Enumeration<E> elements()
        // Vector

        // �������϶���
        Vector<InputStream> v = new Vector<InputStream>();
        // ����Ԫ�ض���
        InputStream s1 = new FileInputStream("MyBufferedReader.java");
        InputStream s2 = new FileInputStream("MyBufferedReaderDemo.java");
        InputStream s3 = new FileInputStream("MyLineNumberReader.java");
        InputStream s4 = new FileInputStream("MyMyLineNumberReaderDemo.java");
        // ��Ԫ����ӵ�����
        v.add(s1);
        v.add(s2);
        v.add(s3);
        v.add(s4);
        // ͨ�����ϵĵ�Enumeration
        Enumeration<InputStream> en = v.elements();

        // �����ϲ�������
        SequenceInputStream sis = new SequenceInputStream(en);
        BufferedOutputStream bos = new BufferedOutputStream(
                new FileOutputStream("Copy.java"));

        byte[] bys = new byte[1024];
        int len = 0;
        while ((len = sis.read(bys)) != -1) {
            bos.write(bys, 0, len);
        }

        bos.close();
        sis.close();
    }

    private static void mergeTwo() throws IOException {
        // SequenceInputStream(InputStream s1, InputStream s2)
        InputStream s1 = new FileInputStream("MyBufferedReader.java");
        InputStream s2 = new FileInputStream("MyBufferedReaderDemo.java");
        SequenceInputStream sis = new SequenceInputStream(s1, s2);

        BufferedOutputStream bos = new BufferedOutputStream(
                new FileOutputStream("Copy.java"));

        byte[] bys = new byte[1024];
        int len = 0;
        while ((len = sis.read(bys)) != -1) {
            bos.write(bys, 0, len);
        }

        bos.close();
        sis.close();
    }
}
