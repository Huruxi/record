package cn.itcast_10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
 * ΪʲôҪ�����л�����?
 * 		Ϊ���ö������ļ��г־ô洢�������������д��䡣
 *
 * ���л�����ObjectOutputStream
 * 		public final void writeObject(Object obj)
 * �����л�����ObjectInputStream	(�������ݵĶ���ԭ)
 * 		public final Object readObject()
 */
public class ObjectStreamDemo {
    public static void main(String[] args) throws IOException,
            ClassNotFoundException {
        // write();
        read();
    }

    private static void read() throws IOException, ClassNotFoundException {
        // ObjectInputStream(InputStream is)
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(
                "oos.txt"));
        Object obj = ois.readObject();
        ois.close();

        System.out.println(obj);
    }

    private static void write() throws IOException {
        // ObjectOutputStream(OutputStream out)
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(
                "oos.txt"));
        Person p = new Person("����ϼ", 28);
        oos.writeObject(p);
        oos.close();
    }
}
