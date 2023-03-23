package cn.itcast;

/*
	������ʽ
		import ����..����;

	package,import,class��û��˳���ϵ(������)
		�С�
		package --> import --> class
		Ψһ		���		���
*/

import com.liuyi.Demo;

public class Test {
    public static void main(String[] args) {
		/*
		com.liuyi.Demo d = new com.liuyi.Demo();
		int result = d.sum(10,20);
		System.out.println(result);

		com.liuyi.Demo d2 = new com.liuyi.Demo();
		int result2 = d2.sum(10,20);
		System.out.println(result2);

		com.liuyi.Demo d3 = new com.liuyi.Demo();
		int result3 = d3.sum(10,20);
		System.out.println(result3);
		*/

        Demo d = new Demo();
        int result = d.sum(10, 20);
        System.out.println(result);
    }
}