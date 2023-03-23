package cn.itcast_01;

/*
 * ð������
 */
public class ArrayDemo {
    public static void main(String[] args) {
        // ��������
        int[] arr = {24, 69, 80, 57, 13};

        /*
         * // ��һ�αȽ� // ��1��Ϊ�˷�ֹԽ�� for (int x = 0; x < arr.length - 1 - 0; x++) {
         * if (arr[x] > arr[x + 1]) { int temp = arr[x]; arr[x] = arr[x + 1];
         * arr[x + 1] = temp; } } // �������� System.out.println("��һ�������");
         * printArray(arr);
         *
         * // �ڶ��αȽ� // ��1��Ϊ�˷�ֹԽ�� for (int x = 0; x < arr.length - 1 - 1; x++) {
         * if (arr[x] > arr[x + 1]) { int temp = arr[x]; arr[x] = arr[x + 1];
         * arr[x + 1] = temp; } } // �������� System.out.println("�ڶ��������");
         * printArray(arr);
         *
         * // �����αȽ� // ��1��Ϊ�˷�ֹԽ�� for (int x = 0; x < arr.length - 1 - 2; x++) {
         * if (arr[x] > arr[x + 1]) { int temp = arr[x]; arr[x] = arr[x + 1];
         * arr[x + 1] = temp; } } // �������� System.out.println("�����������");
         * printArray(arr);
         *
         * // ���ĴαȽ� // ��1��Ϊ�˷�ֹԽ�� for (int x = 0; x < arr.length - 1 - 3; x++) {
         * if (arr[x] > arr[x + 1]) { int temp = arr[x]; arr[x] = arr[x + 1];
         * arr[x + 1] = temp; } } // �������� System.out.println("���Ĵ������");
         * printArray(arr);
         */

        // for (int y = 0; y < arr.length - 1; y++) {
        // // ? 0,1,2,3
        // for (int x = 0; x < arr.length - 1 - y; x++) {
        // if (arr[x] > arr[x + 1]) {
        // int temp = arr[x];
        // arr[x] = arr[x + 1];
        // arr[x + 1] = temp;
        // }
        // }
        // }

        // ð������
        bubbleSort(arr);
        // ��������
        printArray(arr);
    }

    // ��������
    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int x = 0; x < arr.length; x++) {
            if (x == arr.length - 1) {
                System.out.print(arr[x]);
            } else {
                System.out.print(arr[x] + ", ");
            }
        }
        System.out.println("]");
    }

    // ����
    public static void bubbleSort(int[] arr) {
        for (int x = 0; x < arr.length - 1; x++) {
            for (int y = 0; y < arr.length - 1 - x; y++) {
                if (arr[y] > arr[y + 1]) {
                    int temp = arr[y];
                    arr[y] = arr[y + 1];
                    arr[y + 1] = temp;
                }
            }
        }
    }
}
