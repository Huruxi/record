package cn.itcast_01;

/*
 * �쳣�����������еĹ����У������˲������������
 * ������
 * 		�೤�������г�ȥ����
 * 		һ��ʼ��Ҫ���ģ�©���ˣ����ӵ���
 * 		����û�����⣬����·��һ·˳�硣
 * 		ɽ·���м���̺õ�ˮ��·�������м��Сʯ�ӣ�
 * 		������������Ļ�����ˮ��·�ͺ��ˣ��϶���û���κ�����ģ�
 * 		�����أ���ƫƫ����Ѱ��·������Сʯ�ӣ�����̥�ˡ�
 * 		���±�̥û��ʯ��·���ߵ���ˮ��·�������ߵ�һ�룬����ɽ·�����ˣ��೤ֻ�û����ˡ�
 * ���ࣺ
 * 		����	Error	�����Ӧ�ó���Ӧ����ͼ������������⡣˵�����ǲ���Ҫ�����������⣬����˵�ڴ������
 * 		�쳣	Exception	�����Ӧ�ó�����Ҫ�����������˵������Ҫ���ǽ��д���ġ�
 * 			����ʱ���쳣	��RuntimeException	�������Ǳ���Ҫ������쳣��
 * 			����ʱ���쳣	RuntimeException	�����쳣��һ������Ҳ�ǲ���Ҫ����ġ�һ��������������⣬Ӧ��������д�Ĵ���������ˡ�
 *
 * JVM��Ĭ�ϴ�����:
 * 		����������쳣���������û�����κδ���jvm������Ĭ�ϵĴ���
 * 		���쳣��������������ԭ���Լ����ֵ�λ�õ���Ϣ��ʾ���˿���̨��
 * 		���ó������������ˡ�
 */
public class ExceptionDemo {
    public static void main(String[] args) {
        System.out.println("hello");

        int a = 10;
        // int b = 4;
        int b = 0; // java.lang.ArithmeticException: / by zero
        System.out.println(a / b);

        System.out.println("world");
    }
}