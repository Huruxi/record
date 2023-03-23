/**
 * �������������в����Ĺ�����
 *
 * @author fqy
 * @version V1.0
 */
public class ArrayTool {

    //�ѹ��췽��˽��

    /**
     * ����˽�й��췽��
     */
    private ArrayTool() {
    }

    /**
     * �������飬��ʽ�ǣ�[Ԫ��1, Ԫ��2, ...]
     *
     * @param arr ��Ҫ������������
     */
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

    /**
     * ��ȡ�����е����ֵ
     *
     * @param arr ����ȡ���ֵ������
     * @return int ���������е����ֵ
     */
    public static int getMax(int[] arr) {
        int max = arr[0];

        for (int x = 1; x < arr.length; x++) {
            if (arr[x] > max) {
                max = arr[x];
            }
        }

        return max;
    }
}