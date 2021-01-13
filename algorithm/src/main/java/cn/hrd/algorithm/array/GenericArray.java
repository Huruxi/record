package cn.hrd.algorithm.array;

/**
 * @author hrd <br/>
 * @date 2019/9/4
 */
public class GenericArray<T> {

    private T[] data;
    private int size;

    // ���ݴ�������������Array
    public GenericArray(int capacity) {
        data = (T[]) new Object[capacity];
        size = 0;
    }

    // �޲ι��췽����Ĭ����������Ϊ10
    public GenericArray() {
        this(10);
    }

    // ��ȡ��������
    public int getCapacity() {
        return data.length;
    }

    // ��ȡ��ǰԪ�ظ���
    public int count() {
        return size;
    }

    // �ж������Ƿ�Ϊ��
    public boolean isEmpty() {
        return size == 0;
    }

    // �޸� index λ�õ�Ԫ��
    public void set(int index, T e) {
        checkIndex(index);
        data[index] = e;
    }

    // ��ȡ��Ӧ index λ�õ�Ԫ��
    public T get(int index) {
        checkIndex(index);
        return data[index];
    }

    // �鿴�����Ƿ����Ԫ��e
    public boolean contains(T e) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(e)) {
                return true;
            }
        }
        return false;
    }

    // ��ȡ��ӦԪ�ص��±�, δ�ҵ������� -1
    public int find(T e) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(e)) {
                return i;
            }
        }
        return -1;
    }


    // �� index λ�ã�����Ԫ��e, ʱ�临�Ӷ� O(m+n)
    public void add(int index, T e) {
        checkIndex(index);
        // �����ǰԪ�ظ���������������������������Ϊԭ����2��
        if (size == data.length) {
            resize(2 * data.length);
        }

        for (int i = size - 1; i >= index; i--) {
            data[i + 1] = data[i];
        }
        data[index] = e;
        size++;
    }

    // ������ͷ����Ԫ��
    public void addFirst(T e) {
        add(0, e);
    }

    // ������β����Ԫ��
    public void addLast(T e) {
        add(size, e);
    }

    // ɾ�� index λ�õ�Ԫ�أ�������
    public T remove(int index) {
        checkIndexForRemove(index);

        T ret = data[index];
        for (int i = index + 1; i < size; i++) {
            data[i - 1] = data[i];
        }
        size--;
        data[size] = null;

        // ����
        if (size == data.length / 4 && data.length / 2 != 0) {
            resize(data.length / 2);
        }

        return ret;
    }

    // ɾ����һ��Ԫ��
    public T removeFirst() {
        return remove(0);
    }

    // ɾ��ĩβԪ��
    public T removeLast() {
        return remove(size - 1);
    }

    // ��������ɾ��ָ��Ԫ��
    public void removeElement(T e) {
        int index = find(e);
        if (index != -1) {
            remove(index);
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(String.format("Array size = %d, capacity = %d \n", size, data.length));
        builder.append('[');
        for (int i = 0; i < size; i++) {
            builder.append(data[i]);
            if (i != size - 1) {
                builder.append(", ");
            }
        }
        builder.append(']');
        return builder.toString();
    }


    // ���ݷ�����ʱ�临�Ӷ� O(n)
    private void resize(int capacity) {
        T[] newData = (T[]) new Object[capacity];

        for (int i = 0; i < size; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }

    private void checkIndex(int index) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("Add failed! Require index >=0 and index <= size.");
        }
    }

    private void checkIndexForRemove(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("remove failed! Require index >=0 and index < size.");
        }
    }
}
