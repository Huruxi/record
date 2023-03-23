/*
	����һ��Ա����,�Լ�������������Ա��
	Ȼ�������Ա���������췽����getXxx()/setXxx()������
	�Լ�һ����ʾ���г�Ա��Ϣ�ķ����������ԡ�

	Employee��
		��Ա������Ա�����,����,ְλ
		���췽�����޲Σ�����
		��Ա������getXxx()/setXxx()������show()
*/
class Employee {
    private String eid;
    private String name;
    private String job;

    public Employee() {
    }

    public Employee(String eid, String name, String job) {
        this.eid = eid;
        this.name = name;
        this.job = job;
    }

    public void setEid(String eid) {
        this.eid = eid;
    }

    public String getEid() {
        return eid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getJob() {
        return job;
    }

    public void show() {
        System.out.println("Ա������ǣ�" + eid + ",�����ǣ�" + name + ",ְλ�ǣ�" + job);
    }
}

class EmployeeDemo {
    public static void main(String[] args) {
        //�޲�
        Employee e = new Employee();
        e.setEid("itcast007");
        e.setName("���ǳ�");
        e.setJob("�߼�����ʦ");
        e.show();

        //����
        Employee e2 = new Employee("itcast003", "���»�", "�ھ������ʦ");
        e2.show();
    }
}