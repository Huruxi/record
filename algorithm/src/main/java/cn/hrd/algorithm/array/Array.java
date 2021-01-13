package cn.hrd.algorithm.array;

/**
 * 1) ����Ĳ��롢ɾ���������±�������ʲ�����
 * 2�������е�������int���͵ģ�
 *
 * @author hrd <br/>
 * @date 2019/9/4
 */
public class Array {

    //������������data��������
    public int data[];

    //�������鳤��
    private int n;

    //������ʵ�ʸ���
    private int count;

    //���췽�������������С
    public Array(int capacity) {
        this.data = new int[capacity];
        this.n = capacity;
        this.count = 0;//һ��ʼһ������û�д�����Ϊ0
    }

    //�����������ҵ������е�Ԫ�ز�����
    public int find(int index) {
        if (index < 0 || index >= count) return -1;
        return data[index];
    }

    //����Ԫ��:ͷ�����룬β������
    public boolean insert(int index, int value) {
        //��������Ԫ��

        //if (index == count && count == 0) {
        //    data[index] = value;
        //    ++count;
        //    return true;
        //}

        // ����ռ�����
        if (count == n) {
            System.out.println("û�пɲ����λ��");
            return false;
        }
        // ���count��û������ô�Ϳ��Բ������ݵ�������
        // λ�ò��Ϸ�
        if (index < 0 || index > count) {
            System.out.println("λ�ò��Ϸ�");
            return false;
        }
        // λ�úϷ�
        for (int i = count; i > index; --i) {
            data[i] = data[i - 1];
        }
        data[index] = value;
        ++count;
        return true;
    }


    //����������ɾ��������Ԫ��
    public boolean delete(int index) {
        if (index < 0 || index >= count) return false;
        //��ɾ��λ�ÿ�ʼ���������Ԫ����ǰ�ƶ�һλ
        for (int i = index + 1; i < count; ++i) {
            data[i - 1] = data[i];
        }
        //ɾ������ĩβԪ��  ��δ��벻��ҪҲ����
        /*int[] arr = new int[count-1];
        for (int i=0; i<count-1;i++){
            arr[i] = data[i];
        }
        this.data = arr;*/

        --count;
        return true;
    }

    public void printAll() {
        for (int i = 0; i < count; ++i) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Array array = new Array(5);
        array.printAll();
        array.insert(0, 3);
        array.insert(0, 4);
        array.insert(1, 5);
        array.insert(3, 9);
        array.insert(3, 10);
        //array.insert(3, 11);
        array.printAll();
    }

}
