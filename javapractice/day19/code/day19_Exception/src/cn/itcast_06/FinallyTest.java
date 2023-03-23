package cn.itcast_06;

/*
 * �����⣺
 * final,finally��finalize������?
 * final:�����࣬���γ�Ա���������γ�Ա����
 * 		������,�಻�ܱ��̳�
 * 		���γ�Ա�����������ǳ���
 * 		���γ�Ա�������������ܱ���д
 * finally:��finally���ƵĴ�����Զ��ִ�У������ͷ���Դ��
 * 		ע�����������ִ�е�finally֮ǰjvm�˳��ˡ�
 * finalize:��Object��ķ������������������������ڻ���������
 *
 * ���catch������return��䣬����finally�Ĵ��뻹��ִ����?����ᣬ��������returnǰ����return��
 * ��ִ�С�
 * ǰ��
 * ׼ȷ��˵�����м䡣
 * �������������������
 * 		1��ִ�е�return 40;��ʱ�򣬾����ڴ����γ���һ������·����
 * 		2:���������ֻ���һ��finally�����ԣ�����ִ����finally��n=50
 * 		3:finally�������ٴλص���ǰ�ķ���·�������������Է��ص���40
 */
public class FinallyTest {
    public static void main(String[] args) {
        System.out.println(returnInt()); // 40
    }

    public static int returnInt() {
        int n = 10;
        try {
            n = 20;
            System.out.println(10 / 0);
            n = 30;
        } catch (ArithmeticException e) {
            n = 40;
            return n;
        } finally {
            n = 50;
            return n;
        }
        // return 0;
    }
}
