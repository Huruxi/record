package cn.itcast_07;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/*
 * ����¼��5��ѧ����Ϣ(����,���ĳɼ�,��ѧ�ɼ�,Ӣ��ɼ�),�����ִܷӸߵ������������̨
 *
 * ������
 * 		A:����һ��ѧ���࣬�����г�Ա����������,���ĳɼ�,��ѧ�ɼ�,Ӣ��ɼ�
 * 		B:��Ϊ��������Ҫ�����ֽܷ�������˵������Ҫ�������ԣ�ѡ��TreeSet����
 * 		C:���ַ�ʽʵ�֣�����ѡ��һ�֣��ñȽ���ʵ��
 * 		D:����¼��ѧ�����洢��TreeSet����
 * 		E:��������
 */
public class StudentDemo {
    public static void main(String[] args) {
        // ��������
        TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                // ��Ҫ����
                int num = s2.getSum() - s1.getSum();
                // ��Ҫ������һ�αȽ����ĳɼ�����ѧ�ɼ���Ӣ��ɼ�������
                int num2 = num == 0 ? s1.getName().compareTo(s2.getName())
                        : num;
                return num2;
            }
        });
        System.out.println("ѧ��¼�뿪ʼ");
        Scanner sc = new Scanner(System.in);
        // 5��
        for (int x = 1; x <= 5; x++) {
            // ¼��ѧ����Ϣ
            System.out.println("�������" + x + "��ѧ����������");
            String name = sc.nextLine();
            System.out.println("�������" + x + "��ѧ�������ĳɼ���");
            int chinese = Integer.parseInt(sc.nextLine());
            System.out.println("�������" + x + "��ѧ������ѧ�ɼ���");
            int math = Integer.parseInt(sc.nextLine());
            System.out.println("�������" + x + "��ѧ����Ӣ��ɼ���");
            int english = Integer.parseInt(sc.nextLine());

            // ����ѧ������
            Student s = new Student();
            s.setName(name);
            s.setChinese(chinese);
            s.setMath(math);
            s.setEnglish(english);

            // ��ӵ�����
            ts.add(s);
        }

        // ���һ�仰
        System.out.println("ѧ��¼�����");

        // ��������
        for (Student s : ts) {
            System.out.println(s.getName() + "---" + s.getChinese() + "---"
                    + s.getMath() + "---" + s.getEnglish());
        }
    }
}
