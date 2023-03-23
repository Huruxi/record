package cn.itcast_02;

/*
 * ѡ������
 */
public class ArrayDemo {
    public static void main(String[] args) {
        // ��������
        int[] arr = {24, 69, 80, 57, 13};

        /*
         * // ��һ�� int x = 0; for (int y = x + 1; y < arr.length; y++) { if
         * (arr[y] < arr[x]) { int temp = arr[x]; arr[x] = arr[y]; arr[y] =
         * temp; } } System.out.println("��һ�αȽϣ�"); // �������� printArray(arr);
         *
         * // �ڶ��� x = 1; for (int y = x + 1; y < arr.length; y++) { if (arr[y] <
         * arr[x]) { int temp = arr[x]; arr[x] = arr[y]; arr[y] = temp; } }
         * System.out.println("�ڶ��αȽϣ�"); // �������� printArray(arr);
         *
         * // ������ x = 2; for (int y = x + 1; y < arr.length; y++) { if (arr[y] <
         * arr[x]) { int temp = arr[x]; arr[x] = arr[y]; arr[y] = temp; } }
         * System.out.println("�����αȽϣ�"); // �������� printArray(arr);
         *
         * // ���Ĵ� x = 3; for (int y = x + 1; y < arr.length; y++) { if (arr[y] <
         * arr[x]) { int temp = arr[x]; arr[x] = arr[y]; arr[y] = temp; } }
         * System.out.println("���ĴαȽϣ�"); // �������� printArray(arr);
         */

        // for (int x = 0; x < arr.length - 1; x++) {
        // for (int y = x + 1; y < arr.length; y++) {
        // if (arr[y] < arr[x]) {
        // int temp = arr[x];
        // arr[x] = arr[y];
        // arr[y] = temp;
        // }
        // }
        // }

        // ѡ������
        selectSort(arr);
        // ��������
        printArray(arr);
    }

    // ѡ������
    public static void selectSort(int[] arr) {
        for (int x = 0; x < arr.length - 1; x++) {
            for (int y = x + 1; y < arr.length; y++) {
                if (arr[y] < arr[x]) {
                    int temp = arr[x];
                    arr[x] = arr[y];
                    arr[y] = temp;
                }
            }
        }
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
}
