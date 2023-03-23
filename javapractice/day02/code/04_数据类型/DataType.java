/*
	Ϊ�˸��õı����ʵ��������Java��Բ�ͬ�������ṩ�˲�ͬ���������͡�

	�������ͣ�
		�������ͣ�4��8��
		�������ͣ��࣬�ӿڣ����顣(���潲)

	��������:
		������				ռ�õ��ڴ�ռ�
			byte			1�ֽ�
								01111111
								10000000(1�ȱ�ʾ����λ���ֱ�ʾ��ֵ -128)
			short			2�ֽ�
			int				4�ֽ�
			long			8�ֽ�
		��������
			float			4�ֽ�
			double			8�ֽ�
		�ַ���
			char			2�ֽ�
		������
			boolean			δ֪��1�ֽ�

	�����⣺
		Java���ַ����Դ洢һ��������?
		���ԡ���ΪJava���Բ��õ���unicode���룬
		��unicode�����ÿ���ַ��������ֽڣ�
		���ԣ�java�е��ַ����Դ洢һ�����֡�


	ע�⣺
		����Ĭ����int����
		������Ĭ����double����

		long���͵ı�����Ҫ��l����L��
		float���͵ı�����Ҫ��f����F��

		��ͬһ��{}���棬�ǲ�����ͬ���ı�����
*/
class DataType {
    public static void main(String[] args) {
        //��������ĸ�ʽ��
        //�������� ������ = ��ʼ��ֵ;

        //����byte���͵ı���
        byte b = 1;
        System.out.println(1);
        System.out.println(b);

        //����short���͵ı���
        short s = 100;
        System.out.println(s);

        //����int���͵ı���
        int i = 100000;
        System.out.println(i);

        //����
        //int j = 2147483648;
        //System.out.println(j);

        //����long���͵ı���
        long l = 2147483648L;
        System.out.println(l);

        //����float���͵ı���
        float f = 12.34F;
        System.out.println(f);

        //����double���͵ı���
        double d = 23.56;
        System.out.println(d);

        //����char���͵ı���
        char ch = 'a';
        System.out.println(ch);

        //����boolean���͵ı���
        boolean flag = true;
        System.out.println(flag);
    }
}
