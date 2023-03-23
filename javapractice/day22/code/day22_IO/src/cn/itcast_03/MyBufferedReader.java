package cn.itcast_03;

import java.io.IOException;
import java.io.Reader;

public class MyBufferedReader {
    private Reader r;

    public MyBufferedReader(Reader r) { // Reader r = new FileReader("my.txt");
        this.r = r;
    }

    public String readLine() throws IOException {
        /*
         * ����������֪����r����r�����ȡ���������ַ�ʽ��һ�ζ�ȡһ���ַ���һ�ζ�ȡһ���ַ�����
         * ����׼�����ĸ���?���������ķ�ʽ�����Ȳ���ȷ�������ԣ�����ȷ��һ�ζ�ȡһ���ַ���
         * ����ÿ�ζ�ȡһ���ַ�������ȡ�ڶ����ַ���ʱ��ǰһ���ͻᶪʧ�����ԣ�����Ҫ��취�Ѷ�ȡ�����ַ�����������
         * ��ʲô��?ͨ���򵥵ķ�������������ȷ����StringBuilder
         */
        StringBuilder sb = new StringBuilder();

        // while (true) {
        // // һ�ζ�ȡһ���ַ�
        // int ch = r.read();
        // if (ch == '\r') {
        // continue;
        // }
        // if (ch == '\n') {
        // // return sb.toString();
        // break;
        // } else {
        // sb.append((char) ch);
        // }
        // }
        // return sb.toString();

        // ��ν����ѭ��������?

        int ch = 0;
        while ((ch = r.read()) != -1) {
            if (ch == '\r') {
                continue;
            }
            if (ch == '\n') {
                return sb.toString();
            } else {
                sb.append((char) ch);
            }
        }

        // ��ֹ���ݶ�ʧ
        if (sb.length() > 0) {
            return sb.toString();
        }

        return null;

    }

    public void close() throws IOException {
        r.close();
    }
}
