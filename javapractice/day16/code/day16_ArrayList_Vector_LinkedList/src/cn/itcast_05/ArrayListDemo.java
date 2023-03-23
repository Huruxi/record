package cn.itcast_05;

import java.util.ArrayList;

/*
 * �����Ĵ�����
 * ��������
 * 		��������Τ������
 * ��¥��
 * 		�ֱ���������������ؿ���
 * ˮ䰴�
 * 		���ɣ�³������ӣ�¬���壬����������
 * ���μ�
 * 		�׹Ǿ���������㣬����գ�ţħ�����캢��
 *
 * �ҹ����Ĵ�������ÿ���������кܶ�����Խ�ɫ��
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        // ��������С����
        ArrayList<String> sgyy = new ArrayList<String>();
        sgyy.add("����");
        sgyy.add("��Τ");
        sgyy.add("����");

        // ��¥��С����
        ArrayList<String> hlm = new ArrayList<String>();
        hlm.add("�ֱ���");
        hlm.add("������");
        hlm.add("������");
        hlm.add("�ؿ���");

        // ˮ䰴�С����
        ArrayList<String> shz = new ArrayList<String>();
        shz.add("����");
        shz.add("³����");
        shz.add("����");
        shz.add("¬����");
        shz.add("����");
        shz.add("����");

        // ���μ�С����
        ArrayList<String> xyj = new ArrayList<String>();
        xyj.add("�׹Ǿ�");
        xyj.add("�������");
        xyj.add("�����");
        xyj.add("ţħ��");
        xyj.add("�캢��");

        // ���������Ĵ󼯺�
        ArrayList<ArrayList<String>> sdmz = new ArrayList<ArrayList<String>>();
        sdmz.add(sgyy);
        sdmz.add(hlm);
        sdmz.add(shz);
        sdmz.add(xyj);

        // ��������
        for (ArrayList<String> array : sdmz) {
            for (String s : array) {
                System.out.print(s + " ");
            }
            System.out.println();
        }
    }
}
