package cn.itcast_04;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/*
 * ����¼��5��ѧ����Ϣ(����,���ĳɼ�,��ѧ�ɼ�,Ӣ��ɼ�),�����ִܷӸߵ��ʹ����ı��ļ�
 *
 * ������
 * 		A:����ѧ����
 * 		B:ʹ��TreeSet���ϴ洢ѧ����Ϣ���������ܷ������ñȽ���ʵ��
 * 		C:����¼��ѧ����Ϣ
 * 		D:����Set���ϣ���ѧ����Ϣ�洢���ı��ļ�
 */
public class StudentDemo {
    public static void main(String[] args) throws IOException {
        // ����Set����
        TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {

            @Override
            public int compare(Student s1, Student s2) {
                int num = s2.getSum() - s1.getSum();
                int num2 = num == 0 ? s1.getName().compareTo(s2.getName())
                        : num;
                return num2;
            }
        });

        System.out.println("ѧ��¼�뿪ʼ----------------------");
        // ����¼������
        for (int x = 1; x <= 5; x++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("�������" + x + "��ѧ����������");
            String name = sc.nextLine();
            System.out.println("�������" + x + "��ѧ�������ĳɼ���");
            int chinese = sc.nextInt();
            System.out.println("�������" + x + "��ѧ������ѧ�ɼ���");
            int math = sc.nextInt();
            System.out.println("�������" + x + "��ѧ����Ӣ��ɼ���");
            int english = sc.nextInt();

            // ����ѧ������
            Student s = new Student();
            s.setName(name);
            s.setChinese(chinese);
            s.setMath(math);
            s.setEnglish(english);

            // ��ѧ����ӵ�����
            ts.add(s);
        }
        System.out.println("ѧ��¼�����----------------------");

        // ��ѧ����Ϣ�洢���ı��ļ�
        BufferedWriter bw = new BufferedWriter(new FileWriter("students.txt"));
        bw.write("����,���ĳɼ�,��ѧ�ɼ�,Ӣ��ɼ�");
        bw.newLine();
        bw.flush();

        for (Student s : ts) {
            StringBuilder sb = new StringBuilder();
            sb.append(s.getName()).append(",").append(s.getChinese())
                    .append(",").append(s.getMath()).append(",")
                    .append(s.getEnglish());
            bw.write(sb.toString());
            bw.newLine();
            bw.flush();
        }

        bw.close();
        System.out.println("���ݳɹ�д���ļ�");
    }
}
