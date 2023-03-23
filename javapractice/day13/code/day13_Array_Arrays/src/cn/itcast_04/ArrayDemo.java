package cn.itcast_04;

/*
 * ���ַ����е��ַ���������
 *��������dacgebf��
 *�������abcdefg��
 */
public class ArrayDemo {
    public static void main(String[] args) {
        // �����ַ���
        String s = "dacgebf";

        // ���ַ���ת���ַ�����
        char[] chs = s.toCharArray();

        // ���ַ������������
        bubbleSort(chs);

        // ���������ַ�����ת���ַ���
        String result = String.valueOf(chs);

        System.out.println(result);
    }

    public static void bubbleSort(char[] chs) {
        for (int x = 0; x < chs.length - 1; x++) {
            for (int y = 0; y < chs.length - 1 - x; y++) {
                if (chs[y] > chs[y + 1]) {
                    char temp = chs[y];
                    chs[y] = chs[y + 1];
                    chs[y + 1] = temp;
                }
            }
        }
    }
}
