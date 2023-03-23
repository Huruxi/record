package cn.itcast_02;

/*
 * ��ת����	 public StringBuffer reverse()
 */
public class StringBufferDemo4 {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer();

        buffer.append("java").append("ϼ���ְ���");

        buffer.reverse();

        System.out.println("buffer:" + buffer);
    }
}
