package cn.itcast_07;

/*
 * ͳ�ƴ���С�����ֵĴ���
 * ���������ַ����� woaijavawozhenaijavawozhendeaijavawozhendehenaijavaxinbuxinwoaijavagun����java������5��
 */
public class StringTest3 {
    public static void main(String[] args) {
        String maxString = "woaijavawozhenaijavawozhendeaijavawozhendehenaijavaxinbuxinwoaijavagun";
        String minString = "java";

        int count = getCount(maxString, minString);
        System.out.println(count);
    }

    // д����ʵ�֣�
    // ��ʽ����:String maxString,String minString;
    // ����ֵ����:int
    public static int getCount(String maxString, String minString) {
        // ����ͳ�Ʊ���
        int count = 0;

        // �Ȳ���һ��
        int index = maxString.indexOf(minString);
        // ����һ�����������ڼ�¼ÿ�����µĲ���λ��
        int startIndex = 0;

        // �ж�λ���ǲ���-1������ǣ��Ͳ�������
        while (index != -1) {
            // ͳ�Ʊ�����1
            count++;
            // �������µĲ���λ��
            startIndex = index + minString.length();
            // �����µĲ���λ�ã��ٲ�һ��С���ڴ��г��ֵ�λ��
            index = maxString.indexOf(minString, startIndex);
        }

        return count;
    }
}
