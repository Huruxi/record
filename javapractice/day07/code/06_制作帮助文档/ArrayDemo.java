//��Ϊ�������Ĺ����ಢû��ʹ�÷Ǿ�̬�ĳ�Ա��
//Ϊ�˷�����ã����ǾͰ���������Ľ�Ϊ��̬���ε�
/*
	����һ��˵����Ĺ��̣�
		A:д����
		B:�����ĵ�ע��
		C:ͨ��javadoc��������˵����
			��ʽ��javadoc -d Ŀ¼ -author -version ArrayTool.java
				  javadoc -d doc -author -version ArrayTool.java
			ע�⣺javadoc: ���� - �Ҳ��������ĵ����Ĺ������ܱ������ࡣ
				˵�����Ȩ�޲�������public���μ���
*/
class ArrayDemo {
    public static void main(String[] args) {
        int[] arr = {56, 38, 91, 72, 40};

        //���󣺱�������
        //ArrayTool at = new ArrayTool();
        //at.printArray(arr);

        ArrayTool.printArray(arr);

        //������Ҫ��ȡ�����е����ֵ

    }
}