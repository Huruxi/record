package cn.itcast_07;

public class Teacher {
    public void check(int score) throws MyException {
        if (score < 0 || score > 100) {
            throw new MyException("��������0-100֮��");
        } else {
            System.out.println("��������");
        }
    }
}
