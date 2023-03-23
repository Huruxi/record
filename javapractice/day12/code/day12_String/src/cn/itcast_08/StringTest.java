package cn.itcast_08;

/*
 * �������Լ�дһ�����ܣ��Ƚ������ַ����Ƿ���ȡ�
 *
 * ������
 * 		A:���������ַ���
 * 		B:�Ƚϳ����Ƿ���ͬ�������ͬ���򷵻�false��
 * 		      �����ͬ���ͼ���
 * 		C:��ÿ���ַ���ת��Ϊ�ַ����顣
 * 		D:�����������飬��ÿһ��λ���ϵ��ַ����бȽϡ�
 * 		  һ�������в�ͬ�ģ��ͷ���false��
 * 		E:����true��
 */
public class StringTest {
    public static void main(String[] args) {
        System.out.println(compare("admin", "admin"));
        System.out.println(compare("admin", "Admin"));
        System.out.println(compare("admin", "hello"));

        System.out.println("admin".equals("admin"));
    }

    // ���ǿ����е��÷�
    // public static boolean compare(String s1, String s2) {
    // return s1.equals(s2);
    // }

    // ���������뿼���
    public static boolean compare(String s1, String s2) {
        // �Ƚϳ����Ƿ���ͬ
        if (s1.length() != s2.length()) {
            return false;
        }

        char[] chs1 = s1.toCharArray();
        char[] chs2 = s2.toCharArray();

        for (int x = 0; x < chs1.length; x++) {
            if (chs1[x] != chs2[x]) {
                return false;
            }
        }

        return true;
    }
}
