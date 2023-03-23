package cn.itcast_03;

/*
 * ����Ԫ�أ�
 * 		��������  ����Ԫ������
 *		���ֲ���  ����Ԫ������(�۰����)
 */
public class ArrayDemo {
    public static void main(String[] args) {
        // int[] arr = { 24, 69, 80, 57, 13 };
        // ������Ҫ����80����������е�����

        // �µ�����
        int[] arr = {13, 24, 57, 69, 80};
        // ������Ҫ����80����������е�����
        int index = getIndex(arr, 57);
        System.out.println(index);

        index = getIndex(arr, 88);
        System.out.println(index);

    }

    public static int getIndex(int[] arr, int value) {
        int minIndex = 0;
        int maxIndex = arr.length - 1;
        int middleIndex = (minIndex + maxIndex) / 2;

        while (value != arr[middleIndex]) {
            if (value > arr[middleIndex]) {
                minIndex = middleIndex + 1;
            } else if (value < arr[middleIndex]) {
                maxIndex = middleIndex - 1;
            }

            // ��һ���ж�
            if (maxIndex < minIndex) {
                return -1;
            }

            // ��д�����м�����ֵ
            middleIndex = (minIndex + maxIndex) / 2;
        }

        return middleIndex;
    }

    // ��ͨ����
    // public static int getIndex(int[] arr, int value) {
    // int index = -1;
    //
    // for (int x = 0; x < arr.length; x++) {
    // if (arr[x] == value) {
    // index = x;
    // break;
    // }
    // }
    //
    // return index;
    // }
}
