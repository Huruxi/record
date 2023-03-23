package cn.itcast_02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

/*
 * ����names.txt�д洢�������ǰ�����ͬѧ�����ơ�
 * ��дһ�����ܣ�ÿ�����г����������һ�����Ƴ�����
 *
 * ������
 * 		A:�����������ı��ļ�,��������Ҫ��ȡ����
 * 		B:�Ѷ�ȡ�������ݴ洢��������
 * 		C:�������һ������
 * 		D:�Ӽ����и������������������ȡһ��ֵ�Ϳ�����
 */
public class GetNameDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("names.txt"));
        ArrayList<String> array = new ArrayList<String>();

        String line = null;
        while ((line = br.readLine()) != null) {
            array.add(line);
        }

        br.close();

        // �������һ������
        // int index = (int) (Math.random() * array.size()); //
        // [0,array.size()-1)

        Random r = new Random();
        int index = r.nextInt(array.size());
        System.out.println("�������ǣ�" + array.get(index));

        // ����Ϊ��չ����
        array.remove(index);
        BufferedWriter bw = new BufferedWriter(new FileWriter("names.txt"));
        for (String name : array) {
            bw.write(name);
            bw.newLine();
            bw.flush();
        }
        bw.close();
    }
}
