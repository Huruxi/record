package cn.itcast_07;

/*
 * java API��Ȼ�ṩ�˴�������쳣�࣬�����������ܿ��ǵ����е������
 * �����أ���������Լ�������������쳣��������Ҫ�Լ������쳣��
 * ������Ҫ�Լ�����һ���࣬������Ϊ�쳣�࣬��ô��������Ҫ�̳����쳣�ࡣ
 * �̳����ĸ���?
 * 		�̳���Exception
 *		�̳���RuntimeException
 */
public class MyException extends Exception {
    public MyException() {
        super();
    }

    public MyException(String message) {
        super(message);
    }
}
