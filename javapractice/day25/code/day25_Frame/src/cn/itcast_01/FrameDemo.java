package cn.itcast_01;

import java.awt.Frame;

/*
 * Component�����������һ������
 * 		�������	һ�����ж������ܵ����������Ҫ�����������������
 * 		�������	���Դ洢���������������������
 * ͨ���۲����ļ̳���ϵͼ���������������ǰ��ѧϰ��ʽ��ѧϰ���㣬̫�鷳�ˡ�
 * ���ԣ����ǽ���ֱ������Frame���ɡ�
 *
 * ���췽����
 * 		public Frame()
 *
 * ͨ���۲죬����֪��������������С����
 * 		A:�������ڴ��д����ˣ�ֻ��������û�п�����
 * 		B:�����Ĵ���Ҳ�ǿ������̵߳ġ�
 */
public class FrameDemo {
    public static void main(String[] args) {
        // �����������
        Frame f = new Frame();

        // ���ñ���
        f.setTitle("�ٶ�һ��,���֪��");
        // ���ô����С
        f.setSize(400, 300);
        // ���ô���ɼ�
        f.setVisible(true);

        // ����λ��
        f.setLocation(500, 200);

        // f.show();
        // System.out.println("over");
    }
}
