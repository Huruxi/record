package cn.itcast_02;

import java.io.File;
import java.io.IOException;

/*
 * �������ܣ�
 * A:�����ļ�,����ļ������ڣ��ʹ��������ڣ��Ͳ�������
 * 		public boolean createNewFile() throws IOException
 *
 * B:�����ļ��У�����ļ��в����ڣ��ʹ��������ڣ��Ͳ�������
 * 	 public boolean mkdir() �����ļ���
 *   public boolean mkdirs() �༶�ļ���
 *
 * ���״��������ļ������ļ��У�ȡ������ʹ�õķ�������ȡ���ں�׺����
 * �����Ĳ�һ���ǰ೤���������鳤��
 */
public class FileDemo {
    public static void main(String[] args) throws IOException {
        // ����File�ļ�
        File file = new File("d:\\a.txt");

        // public boolean createNewFile() throws IOException
        System.out.println("createNewFile:" + file.createNewFile());

        // �����ļ���
        File file2 = new File("d:\\demo");
        System.out.println("mkdir:" + file2.mkdir());

        // �����༶�ļ���
        // File file3 = new File("d:\\aaa\\bbb");
        // System.out.println("mkdir:" + file3.mkdir());

        File file4 = new File("d:\\aaa");
        File file5 = new File("d:\\aaa\\bbb");
        // File file5 = new File(file4,"bbb");
        System.out.println("mkdir:" + file4.mkdir());
        System.out.println("mkdir:" + file5.mkdir());
        // ���ַ�ʽ��Ȼ���ԣ����ǱȽ��鷳
        // ��ô����,��һ�ָ��򵥵ķ�ʽ
        File file6 = new File("d:\\ccc\\dddd\\eee\\fff");
        System.out.println("mkdirs:" + file6.mkdirs());

        // ��������ҵ��״�������ʲô��?
        File file7 = new File("d:\\aaa\\bbb\\ccc.txt");
        System.out.println("mkdir:" + file7.mkdir());
    }
}
