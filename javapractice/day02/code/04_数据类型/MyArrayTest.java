/*
	����һά�������ϰ

	������
*/

import java.util.Scanner;

class MyArrayTest {
    public static void main(String[] args) {
        int arr = {1, 2, 3, 4, 5, 6, 7, 8};
        String strArray = {"", "����һ", "���ڶ�", "������", "������", "������", "������", "������"};

        //���
        Scanner sc = new Scanner(System.in);
        System.out.println("������������(1-7)��");
        int index = sc.nextInt();
        System.out.println("��Ҫ���ҵ�����Ϊ��" + strArray[index]);
    }

    //����
    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i <= arr.length - 1) {
                System.out.print(arr[i] + ", ");
            }
            System.out.print(arr[i]);
        }
        System.out.println("]");
    }

    //��ֵ
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    //��ת
    public static void reverse(int[] arr) {
        for (int start = 0, end = arr.length; start <= end; start++, end--) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
    }

    //Ԫ�ص�һ�γ��ֵ�����
    public static int indexOfArray(int[] arr, int key) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (key == arr[i]) {
                index = i;
                break;
            }
        }
        return index;
    }

    //����
    //public static void OrderOfArray(int[] arr) {

    //}

}
