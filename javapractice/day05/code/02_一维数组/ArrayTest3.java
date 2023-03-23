/*
	����Ԫ�ط�ת (���ǰ�Ԫ�ضԵ�)

	������
		�������ת��?
			�ѵ�һ�������һ������
			�ѵڶ����͵����ڶ�������
			...
*/
class ArrayTest3 {
    public static void main(String[] args) {
        //��������
        int[] arr = {12, 86, 79, 43, 50};

		/*
		for(int x=0; x<arr.length; x++) {
			System.out.println(arr[x]);
		}
		*/

        //дһ�����ܱ�������
        printArray(arr);

        //�����{50,43,79,86,12}
        //����д���ˣ���ε�����?
        reverse(arr);
        printArray(arr);
    }

	/*
		����ֵ���ͣ�void
		�����б�int[] arr
	*/
	/*
	public static void printArray(int[] arr) {
		for(int x=0; x<arr.length; x++) {
			System.out.println(arr[x]);
		}
	}
	*/

    //Ч�����ÿ�
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

    /*
        д����ʵ�֣�
            ����ֵ���ͣ�void
            �����б�int[]
    */
    public static void reverse(int[] arr) {
        for (int start = 0, end = arr.length - 1; start <= end; start++, end--) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
    }
}
