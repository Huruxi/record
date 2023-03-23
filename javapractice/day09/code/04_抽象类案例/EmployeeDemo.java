/*
	���������ڿ���һ��ϵͳʱ��Ҫ��Ա���������ƣ�Ա������3�����ԣ������������Լ����ʡ�
	����Ҳ��Ա�������˺���Ա���������⣬��Ϊ����һ���������ԡ�
	��ʹ�ü̳е�˼����Ƴ�Ա����;����ࡣҪ�������ṩ��Ҫ�ķ����������Է��ʡ�
	
	Ա���ࣺ
		��ͨԱ����
			�����������Լ�����
		����
			�����������Լ����ʣ�����
*/
abstract class Employee {
    private String name;
    private String eid;
    private int salary;

    public Employee() {
    }

    public Employee(String name, String eid, int salary) { //"��һ�","10000",500
        this.name = name;
        this.eid = eid;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setEid(String eid) {
        this.eid = eid;
    }

    public String getEid() {
        return eid;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void show() {
        System.out.println(name + "---" + eid + "---" + salary);
    }

    public abstract void work();
}

class Programmer extends Employee {
    public Programmer() {
    }

    public Programmer(String name, String eid, int salary) {
        super(name, eid, salary);
    }

    public void work() {
        System.out.println("����ʨ�������д����");
    }
}

class Manager extends Employee {
    private int bonus;

    public Manager() {
    }

    public Manager(String name, String eid, int salary, int bonus) { //"��һ�","10000",500,10000
        super(name, eid, salary); //"��һ�","10000",500
        this.bonus = bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public void work() {
        System.out.println("�����������Ϳͻ�̸����");
    }

    public void show() {
        //System.out.println(getName()+"---"+getEid()+"---"+getSalary()+"---"+bonus);

        super.show();
        System.out.println("�������Ľ����ǣ�" + bonus);
    }
}

class EmployeeDemo {
    public static void main(String[] args) {
        //����Ա
        Programmer p = new Programmer();
        p.setName("л�ҽ�");
        p.setEid("10010");
        p.setSalary(7700);
        p.show();
        p.work();
        //�������ֲ�д�ˡ�
        System.out.println("---------------------");

        //����Ĳ���
		/*
		Employee e = new Manager();
		e.setName("����");
		e.setEid("10086");
		e.setSalary(6000);
		//e.setBonus(2000);
		e.show();
		e.work();
		*/

        Employee e = new Manager("��һ�", "10000", 500, 10000);
        e.show();
        e.work();
    }
}