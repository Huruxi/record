package cn.itcast_01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * Collection
 *	 	List:Ԫ������(�洢˳���ȡ��˳��һ��),Ԫ�ؿ��ظ���
 *		Set:Ԫ������,Ԫ��Ψһ
 * ������List���ϴ洢�ַ�����������
 */
public class ListDemo {
    public static void main(String[] args) {
        // �������϶���
        List list = new ArrayList();

        // ���������Ԫ��
        list.add("�����");
        list.add("˾��ܲ");
        list.add("�ܲ�");

        // ��������
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String s = (String) it.next();
            System.out.println(s);
        }
    }
}
