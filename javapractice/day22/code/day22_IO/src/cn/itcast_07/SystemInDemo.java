package cn.itcast_07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * ��׼�����������
 * System:
 * 		public static final InputStream in:��׼������	��������
 * 		public static final PrintStream out:��׼�����	����̨���
 *
 * ����¼�����ݣ�
 * 		A:main���ܼ���¼������
 * 		B:IO��ʵ�ּ���¼������
 * 		C:Scannerʵ�ּ���¼������
 */
public class SystemInDemo {
    public static void main(String[] args) throws IOException {
        // // ����¼��
        // InputStream is = System.in; // BufferedInputStream,��̬
        // // System.out.println(is);
        //
        // // ��������һ�ζ�ȡһ������,�������������ǿ���ʵ�ֵģ�����ԭ���BufferedReader��һ����,ֻ������΢�鷳��
        // // ��θĽ���?
        // // ����������ģ����ܲ���ֱ��ʹ��readLine()��?
        // // ����ܣ��Ҿ��ܹ�ֱ��һ�ζ�ȡһ��,��readLine()������BufferedReader��
        // // ���ԣ�����Ҫ����BufferedReader�Ķ���
        // // �����ʱ��ֱ�Ӱ�is��Ϊ����������ݣ�����Ϊʲô��?
        // // ��ΪBufferedReader���ַ�����������ֻ�ܶ��ַ����������л���
        // // ��is�����������ֽ��������ԣ�������Ҫ���ǰ��ֽ���ת��Ϊ�ַ�����Ȼ���ٶ��ַ������л���
        // // ����ǰ��ѧϰ��һ��ת���������ֽ�ת��Ϊ�ַ�
        // InputStreamReader isr = new InputStreamReader(is);
        // BufferedReader br = new BufferedReader(isr);

        // ��װ����¼�룬��IOʵ��
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("������һ���ַ�����");
        String line = br.readLine();
        System.out.println(line);

        System.out.println("������һ��int���͵�ֵ��");
        line = br.readLine();
        int number = Integer.parseInt(line);
        System.out.println(number);

        // �ͷ���Դ
        // br.close();

        System.out.println("������һ��int���͵�ֵ��");
        line = br.readLine();
        number = Integer.parseInt(line);
        System.out.println(number);
        System.out.println("-------------------------");

        // Scanner sc = new Scanner(System.in);
        // // ...
        // sc.close();
    }

}
