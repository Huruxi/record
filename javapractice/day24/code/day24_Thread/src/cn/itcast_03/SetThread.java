package cn.itcast_03;

public class SetThread implements Runnable {

    private Student s;

    public SetThread(Student s) {
        this.s = s;
    }

    @Override
    public void run() {
        // Student s = new Student();
        s.name = "����ϼ";
        s.age = 28;
    }

}
