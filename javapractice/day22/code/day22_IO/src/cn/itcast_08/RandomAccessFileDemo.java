package cn.itcast_08;

import java.io.IOException;
import java.io.RandomAccessFile;

/*
 * RandomAccessFile:�����ʵ��֧�ֶ���������ļ��Ķ�ȡ��д�롣
 * RandomAccessFile(String name, String mode)
 *
 * public long getFilePointer():����ƫ���������ֽ�Ϊ��λ
 * public void seek(long pos):���õ����ļ���ͷ���������ļ�ָ��ƫ�������ڸ�λ�÷�����һ����ȡ��д�������
 */
public class RandomAccessFileDemo {
    public static void main(String[] args) throws IOException {
        write();
        read();
    }

    private static void read() throws IOException {
        // ��������
        RandomAccessFile raf = new RandomAccessFile("raf.txt", "rw");

        // ������
        System.out.println(raf.getFilePointer());
        System.out.println(raf.readInt());
        System.out.println(raf.getFilePointer());
        System.out.println(raf.readChar());
        System.out.println(raf.getFilePointer());
        System.out.println(raf.readUTF());
        System.out.println(raf.getFilePointer());
        System.out.println("------------------");

        // System.out.println(raf.read());
        // raf.seek(0);
        // System.out.println(raf.readInt());
        raf.seek(4);
        System.out.println(raf.readChar());

        raf.seek(1000);
        System.out.println(raf.readUTF());

        // �ͷ���Դ
        raf.close();
    }

    private static void write() throws IOException {
        // ��������
        RandomAccessFile raf = new RandomAccessFile("raf.txt", "rw");

        // д����
        raf.writeInt(100);
        raf.writeChar('a');
        // raf.writeUTF("hello");
        raf.writeUTF("����ϼ");

        raf.seek(1000);
        raf.writeUTF("����");

        // �ͷ���Դ
        raf.close();
    }
}
