/*
	��������˵���������֣�Ҫ��������֪�⣬�����ڵ�n��a������һ���õı������ơ�

	���ڱ����ڲ��ҵ�ʱ�򣬲��õ��Ǿͽ�ԭ�����ԣ����ʱ�򣬾Ͳ��������⡣
	���������Ա������ֵ�ģ�ȷ��ֵ���˾ֲ�������
	��ô�����Ǹ���ν�����������?
	java���������������ṩ��һ���ؼ��֣�this

	this��������Ķ���

	Ӧ�ó�����
		�ֲ��������س�Ա����
*/
class Student {
    private String name;
    private int age;

	/*
	public void setName(String n) {
		name = n;
	}
	*/

    public void setName(String name) {  //"����ϼ"
        this.name = name;
    }

    public String getName() {
        return name; //��ʵ����������this
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

class StudentDemo {
    public static void main(String[] args) {
        //��������
        Student s = new Student();
        //�����Ա������ֵ
        System.out.println(s.getName() + "---" + s.getAge());

        //����Ա������ֵ
        s.setName("����ϼ");
        s.setAge(28);

        //�ٴ������Ա������ֵ
        System.out.println(s.getName() + "---" + s.getAge());
    }
}
