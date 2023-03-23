/*
	for��while������
	ʹ�����𣺿���������������Ƶ��Ǹ���������forѭ�������󣬾Ͳ����ٱ����ʵ��ˣ�
			  ��whileѭ�����������Լ���ʹ�ã�����������ʹ�ã�����while�������Ƽ�ʹ��for��
			  ԭ����forѭ���������ñ����ʹ��ڴ�����ʧ���ܹ�����ڴ��ʹ��Ч�ʡ�
	��������
			forѭ���ʺ����һ����Χ�жϽ��в���
				ˮ�ɻ�
			whileѭ���ʺ��жϴ�������ȷ����
				������
*/
class WhileDemo2 {
    public static void main(String[] args) {
        int x = 0;
        while (x < 10) {
            System.out.println(x);
            x++;
        }
        System.out.println(x + "---");
        System.out.println("-----------");

        for (int y = 0; y < 10; y++) {
            System.out.println(y);
        }
        //System.out.println(y+"---");
    }
}
