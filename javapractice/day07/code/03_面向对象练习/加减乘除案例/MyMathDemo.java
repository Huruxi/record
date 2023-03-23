/*
	����һ����MyMath,�ṩ�����ļӼ��˳����ܣ�Ȼ����в��ԡ�
*/
class MyMath {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }
}

class MyMathDemo {
    public static void main(String[] args) {
        //��������
        MyMath my = new MyMath();

        System.out.println("�ӷ���" + my.add(23, 34));
        System.out.println("������" + my.subtract(23, 34));
        System.out.println("�˷���" + my.multiply(2, 4));
        System.out.println("������" + my.divide(10, 4));
    }
}