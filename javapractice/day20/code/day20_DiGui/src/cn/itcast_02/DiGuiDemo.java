package cn.itcast_02;

/*
 * ������5�Ľ׳�
 */
public class DiGuiDemo {
    public static void main(String[] args) {
        // ��ѭ��ʵ�ֽ׳�
        int jc = 1;
        for (int x = 1; x <= 5; x++) {
            jc *= x;
        }
        System.out.println("5�Ľ׳��ǣ�" + jc);

        // �õݹ�ʵ����׳�
        System.out.println("5�Ľ׳��ǣ�" + jc(5));

    }

    /*����һ������jc(int n),
     *����jc(n)��ʾn�Ľ׳ˣ�����
     *n-1�Ľ׳���α�ʾ��?
     *jc(n-1)
     *
     *������1��= 1
     */
    public static int jc(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * jc(n - 1);
        }
    }
}
