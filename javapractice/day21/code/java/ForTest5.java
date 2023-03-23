/*
	�������ڿ���̨�������������������λ��
			��λ������λ
			ʮλ����ǧλ
			��λ+ʮλ+ǧλ+��λ=��λ

	������
		A:��λ���������Ƿ�Χ��
		B:��ȡÿһ��λ�ϵ����ݡ�
		C:��������
			��λ������λ
			ʮλ����ǧλ
			��λ+ʮλ+ǧλ+��λ=��λ
*/
class ForTest5 {
    public static void main(String[] args) {
        for (int x = 10000; x < 100000; x++) {
            int ge = x % 10;
            int shi = x / 10 % 10;
            int bai = x / 10 / 10 % 10;
            int qian = x / 10 / 10 / 10 % 10;
            int wan = x / 10 / 10 / 10 / 10 % 10;

            if ((ge == wan) && (shi == qian) && (ge + shi + qian + wan == bai)) {
                System.out.println(x);
            }
        }
    }
}