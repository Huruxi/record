package cn.itcast_07;

public class StringTest4 {
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

        // ��һ�β���
        int index = maxString.indexOf(minString);

        while (index != -1) {
            count++;
            // ��ȡ���õ��µĴ�
            maxString = maxString.substring(index + minString.length());
            // ��������
            index = maxString.indexOf(minString);
        }

        return count;
    }
}
