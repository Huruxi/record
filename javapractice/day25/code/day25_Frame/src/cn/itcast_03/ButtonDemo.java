package cn.itcast_03;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
 * �����ڴ��������һ����ť�����԰�ť����¼���û���һ�ΰ�ť������̨��������ٵ�����
 *
 * ������
 * 		A:�����������
 * 		B:������ť����
 * 		C:�Ѱ�ť������ӵ��������
 * 		D:�ô�����ʾ
 */
public class ButtonDemo {
    public static void main(String[] args) {
        // �����������
        Frame f = new Frame();
        // ���ô�������
        f.setTitle("��ť�¼�");
        f.setBounds(500, 250, 400, 300);
        // ���ò���
        f.setLayout(new FlowLayout());

        // ������ť����
        Button bu = new Button("���Ұ�");
        // bu.setSize(20, 10);

        // �Ѱ�ť��ӵ�����
        f.add(bu);

        // ע���¼�

        // ע�ᰴť����¼�
        bu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("���ٵ�����");
            }
        });

        // ����ر��¼�
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        // ���ô�����ʾ
        f.setVisible(true);
    }
}
