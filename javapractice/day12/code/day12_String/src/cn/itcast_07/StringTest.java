package cn.itcast_07;

/*
 * �������е����ݰ���ָ����ʽƴ�ӳ�һ���ַ���
 * ������int[] arr = {1,2,3};
 * ��������[1, 2, 3]
 */
public class StringTest {
    public static void main(String[] args) {
        // ����һ������
        int[] arr = {1, 2, 3};

        String result = arrayToString(arr);
        System.out.println(result);
    }

    // д����ʵ��
    // ��ʽ����������
    // ����ֵ���ͣ�String
    public static String arrayToString(int[] arr) {
        String s = "";

        s += "[";
        for (int x = 0; x < arr.length; x++) {
            if (x == arr.length - 1) {
                s += arr[x];
            } else {
                s += arr[x];
                s += ", ";
            }
        }
        s += "]";

        return s;
    }
}
