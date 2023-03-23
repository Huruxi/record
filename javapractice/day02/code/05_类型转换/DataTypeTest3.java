class DataTypeTest3 {
    public static void main(String[] args) {
        byte b = (byte) 300;
        System.out.println(b);


        System.out.println((byte) 127);
        System.out.println((byte) 128);
        System.out.println((byte) 129);
        System.out.println((byte) 130);
        System.out.println((byte) 131);
    }
}

/*
	ʮ���ƣ�300

	A:��ʮ����ת��Ϊ������
		00000000 00000000 00000001 00101100

	B:��ȡ
		0 0101100
*/