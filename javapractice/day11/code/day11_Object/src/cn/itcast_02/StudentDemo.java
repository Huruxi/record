package cn.itcast_02;

/*
 * public boolean equals(Object obj):�Ƚ϶����Ƿ����
 *
 * ���Ƿ�����������������Ĳ�̫һ������ô������Ϊʲô��?
 * ���ʱ������Ҫ��֪��Ϊʲô���ͱ���ȥ��Դ�롣
 * Object���е�equals()������ʵ�֡�
 * ����Դ����������ӵģ�
 * 		 public boolean equals(Object obj) {
 *			return (this == obj);  //(s1 == s2);
 *		 }
 *
 *
 * �����⣺
 * 		==��equals()������?
 * 		==:
 * 			�������ͣ��Ƚϵ��ǻ������͵�ֵ�Ƿ���ͬ
 * 			�������ͣ��Ƚϵ����������͵ĵ�ֵַ�Ƿ���ͬ
 *		equals():
 *			�������͡�Ĭ������£��Ƚϵ����������͵ĵ�ַ�Ƿ���ͬ��
 *
 * һ����˵���Ƚϵ�ַ�����岻���������ǻ���д�÷�����
 * �����д��?
 * 		������д�Ļ���˼������ö���Ƚϳ�Ա������ֵ�Ƿ���ͬ��
 * 		ʵ�ʿ����У����Ƕ����Զ����ɡ�
 *
 * �ַ����ıȽϣ�
 * 		�ַ�������Ҳ��һ���࣬���������͡�
 * 		���ǵıȽ��õ���equals()�������ַ�������д�˸÷������Ƚϵ����ַ����������Ƿ���ͬ��
 *
 */
public class StudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student("����ϼ", 28);
        Student s2 = new Student("����ϼ", 28);
        Student s3 = new Student("����ϼ", 29);

        // System.out.println(s1 == s1);
        // System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s1));

        Demo d = new Demo();
        System.out.println(s1.equals(d)); //ClassCastException
    }
}

class Demo {
}
