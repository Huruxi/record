package cn.itcast_02;

public class Tool {
//	private Student student;
//	public Student getStudent() {
//		return student;
//	}
//	public void setStudent(Student student) {
//		this.student = student;
//	}

    //����⹤�ߣ���Ҫ����Teacher������ֻ��Ҫ��Student��ΪTeacher�Ϳ�����
    //���ǣ��������Ǽ�ҪTeacher����ҪStudent���������ô����?

    private Object obj;

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }
}

class Student {
    public void love() {
        System.out.println("ѧ����ѧϰ");
    }
}

class Teacher {
    public void love() {
        System.out.println("��ʦ������ϼ");
    }
}