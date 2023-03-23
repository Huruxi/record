/*
	Math:����ѧ�������
	�ص㣺û�й��췽������Ϊ���ĳ�Ա���Ǿ�̬�ġ�

	����1����ȡ�����
		public static double random():��ֵ���ڵ��� 0.0 ��С�� 1.0

	����2����ȡ1-100֮��������    
*/
class MathDemo {
    public static void main(String[] args) {
        //��ȡ�����
        //double d = Math.random();
        //System.out.println(d);

		/*
		for(int x=0; x<10; x++) {
			//System.out.println(Math.random());
			System.out.println(Math.random()*100);
		}
		*/

        //������λ�ȡ1-100֮����������?
        for (int x = 0; x < 100; x++) {
            int number = (int) (Math.random() * 100) + 1;
            System.out.println(number);
        }
    }
}