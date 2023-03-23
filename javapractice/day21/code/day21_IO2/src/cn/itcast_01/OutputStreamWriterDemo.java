package cn.itcast_01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/*
 * �ַ��� = �ֽ��� +�����
 * OutputStreamWriter:���ֽ���ת�����ַ�����
 * OutputStreamWriter(OutputStream out):Ĭ���ַ���
 * OutputStreamWriter(OutputStream out, String charsetName):ָ���ַ���
 *
 * flush()��close()������?
 * A:flush ˢ�����������󻹿��Լ���ʹ��
 * B:close �ر����������󲻿��Լ���ʹ��
 */
public class OutputStreamWriterDemo {
    public static void main(String[] args) throws IOException {
        // ��������
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(
                "osw.txt"));

        // д���ݵķ���
        // дһ���ַ�
        // osw.write('��');
        /*
         * ���ʱ��Ϊʲôû��������? �ַ� = 2�ֽ�
         */
        // дһ���ַ�����
        // char[] chs = { 'a', 'b', 'c', '��', '��', 'ϼ' };
        // osw.write(chs);

        // дһ���ַ������һ����
        // osw.write(chs, 0, 3);

        // дһ���ַ���
        // osw.write("helloworld");

        // дһ���ַ�����һ����
        String s = "hello";
        osw.write(s, 0, s.length());

        osw.flush();
        // 10M-20M

        // �ͷ���Դ
        osw.close();// �رմ�������Ҫ��ˢ����
        // osw.write("haha"); //java.io.IOException: Stream closed
    }
}
