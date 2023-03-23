/*
	ģ��������ѡ���⣬�������ѡ�񣬸�����Ӧ�Ĵ𰸡�(���ʽ���ַ������)
	���ݸ������ַ������������ѡ����ַ�����ʲô��(���ʽ���ַ��������)
*/
class SwitchTest2 {
    public static void main(String[] args) {
        //����һ��ѡ��
        //���ʽ���ַ�
        char ch = 'B';

        switch (ch) {
            case 'A':
                System.out.println("��ѡ����A");
                break;
            case 'B':
                System.out.println("��ѡ����B");
                break;
            case 'C':
                System.out.println("��ѡ����C");
                break;
            case 'D':
                System.out.println("��ѡ����D");
                break;
        }

        //�����ַ��������ж�
        String s = "java";

        switch (s) {
            case "hello":
                System.out.println("hello");
                break;
            case "world":
                System.out.println("world");
                break;
            case "java":
                System.out.println("java");
                break;
            default:
                System.out.println("android");
        }
    }
}
