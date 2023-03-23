package cn.itcast_07;

import java.io.IOException;
import java.io.PrintStream;

/*
 * public static final PrintStream out:��׼�����	����̨���
 *
 * ����¼�룺BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 * ����̨�����BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
 */
public class SystemOutDemo {
    public static void main(String[] args) throws IOException {
        // ��׼������
        // PrintStream ps = System.out;
        // OutputStream os = ps;
        // OutputStream os = System.out; // PrintStream,��̬
        // System.out.println(os);

        // os.write("hello\r\n".getBytes());
        // os.write("world\r\n".getBytes());
        // os.write("java\r\n".getBytes());

        // д���ݵ�ʱ��ÿ�β���дһ���ַ������Ƚ��鷳���������ǿ��ǸĽ�
        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
        // System.out));
        // bw.write("hello");
        // bw.newLine();
        // bw.flush();
        // bw.write("world");
        // bw.newLine();
        // bw.flush();

        // bw.close();

        // ��׼�����
        // PrintStream ps = System.out;
        // ps.print(100);
        // ps.print(true);
        // ps.println(100);
        // ps.println(true);

        System.out.println(100);
        System.out.println(true);
        System.out.println();
        // System.out.print();
    }
}
