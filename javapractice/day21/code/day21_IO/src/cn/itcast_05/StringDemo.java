package cn.itcast_05;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/*
 * String s = "���";
 *
 * ���룺
 * 		�����ܹ������ı���㿴����
 * ���룺
 * 		���㿴����������ܿ�����
 *
 * ��սƬ��Ǳ��,�ؼҿ���ȥ
 * 		���������ϵط��� -- 1011110000111  -- ʮ���� -- �Ҹ�С���� -- ���ַ�
 */
public class StringDemo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s = "���";

        // public byte[] getBytes()
        // byte[] bys = s.getBytes();
        // [-60, -29, -70, -61]
        // public byte[] getBytes(String charsetName)
        byte[] bys = s.getBytes("GBK");
        // [-60, -29, -70, -61]
        // byte[] bys = s.getBytes("UTF-8");
        // [-28, -67, -96, -27, -91, -67]
        System.out.println(Arrays.toString(bys));

        // String(byte[] bytes)
        // String ss = new String(bys);
        // public String(byte[] bytes, String charsetName)
        String ss = new String(bys, "GBK");
        // String ss = new String(bys, "UTF-8");
        System.out.println(ss);
    }
}
