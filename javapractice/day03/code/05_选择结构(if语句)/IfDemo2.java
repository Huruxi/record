/*
	if���ע�����
		A:��ϵ���ʽ���ۼ򵥻��Ǹ��ӣ����������boolean����
		B:�����жϵ�ʱ�򣬽��鳣������ߡ�
		C:if�����Ƶ�����������һ����䣬�����ſ���ʡ�ԣ�
		  ����Ƕ�����䣬�Ͳ���ʡ�ԡ�������Զ��Ҫʡ��
		D:һ����˵����������ž�û�зֺţ��зֺž�û���������
*/
class IfDemo2 {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int z = 30;

        if (x > y) {
            System.out.println("hello");
        }

        //���ﲻ��boolean����
		/*
		if(30) {
			System.out.println("world");
		}
		*/

        if (true) {
            System.out.println("java");
        }

        if (x < y && x < z) {
            System.out.println("android");
        }
        System.out.println("-----------");

        boolean flag = false;
		/*
		if(flag == true) {
			System.out.println("javaweb");
		}
		*/
		
		/*
		if(flag = true) {
			System.out.println("javaweb");
		}
		*/
		
		/*
		if(true = flag) {
			System.out.println("javaweb");
		}
		*/
        System.out.println("-----------");

        if (false) {
            System.out.println("haha");
            System.out.println("hehe");
        }

        System.out.println("heihei");

        System.out.println("-----------");

        if (false) ;

        //�����
        {
            System.out.println("111");
            System.out.println("222");
        }
        System.out.println("over");
    }
}
