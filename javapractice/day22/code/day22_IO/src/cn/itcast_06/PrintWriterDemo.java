package cn.itcast_06;

import java.io.IOException;
import java.io.PrintWriter;

/*
 * ��ӡ����
 * 		�ֽ�����ӡ��	PrintStream
 * 		�ַ���ӡ��		PrintWriter
 *
 * �ص㣺
 * 		A:ֻ�ܲ���Ŀ�ĵأ����ܲ�������Դ��
 * 		B:���Բ����������͵����ݡ�
 * 		C:����������Զ�ˢ�£��ܹ��Զ�ˢ�¡�
 * 		D:���Բ����ļ�����
 * 			��Щ������ֱ�Ӳ����ļ���? FileInputStream,FileOutputStream,FileReader,FileWriter,PrintStream,PrintWriter
 * 			�����췽�������ͬʱ���Խ���File��String���͵Ĺ�����������ǿ��Եġ�
 */
public class PrintWriterDemo {
    public static void main(String[] args) throws IOException {
        // ��ӡ����ΪWriter�������ʹ��
        PrintWriter pw = new PrintWriter("pw.txt");

        pw.write("hello");
        pw.write("\r\n");
        pw.flush();
        pw.write("world");
        pw.write("\r\n");
        pw.flush();
        pw.write("java");
        pw.write("\r\n");
        pw.flush();

        // �ͷ���Դ
        pw.close();
    }
}
