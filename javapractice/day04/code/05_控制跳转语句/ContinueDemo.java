/*
	continue��ʹ�ó�����
		��ѭ�������
		�뿪ʹ�ó����Ĵ�����û�������
	
	continue�����ã�
		A:����ѭ���Ա�break��Ȼ���ܽ�����������
			break  �˳���ǰѭ��
			continue  �˳�����ѭ��
		B:Ҳ���Դ���ǩ��ʹ��

*/
class ContinueDemo {
    public static void main(String[] args) {
        //continue;

        for (int x = 0; x < 10; x++) {
            if (x % 2 == 0) {
                //break;  //������ǰѭ��
                continue; //��������ѭ��������������һ�β���
            }
            System.out.println(x);
        }


        wc:
        for (int x = 0; x < 3; x++) {
            nc:
            for (int y = 0; y < 4; y++) {
                System.out.print("*");
                continue wc;
            }
            System.out.println();
        }
    }
}
