/*
	����һ����Demo,���ж���һ�����������ݺ͵ķ���������һ��������Test�����в��ԡ�

	ʲôʱ�����Ա������?
	Ҫ��֪��������ʲôʱ�����Ա��������Ӧ����˼����Ա��������Ĺ�ϵ?
	��Ա������������Ļ�����Ϣ�ġ�
	Ҳ����˵��ֻ�к����й�ϵ�ı����ſ��Զ���Ϊ��Ա������
*/
class Demo {
    private int x;
    private int y;

    public Demo() {
    }

    public Demo(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }

    //��Ա�����Ѿ���x,y�ˡ������û�б�Ҫ�ڶ�����
	/*
	public int sum(int x,int y) {
		return x + y;
	}
	*/

    public int sum() {
        return x + y;
    }
}

class Test {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.setX(10);
        d.setY(20);
        int result = d.sum();
        System.out.println(result);
    }
}