package cn.itcast_05;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/*
 * ͨ���۲�����֪������Ҫ���Ķ�����1�����壬4����ť
 */
public class MouseDemo {
    public static void main(String[] args) {
        // �����������
        final Frame f = new Frame("���ı���ɫ");
        // ���ô�������
        f.setBounds(500, 250, 400, 300);
        // ���ò���
        f.setLayout(new FlowLayout());

        // ������ť
        Button redButton = new Button("��ɫ");
        Button greenButton = new Button("��ɫ");
        Button blueButton = new Button("��ɫ");
        Button whiteButton = new Button("��ԭ");

        // ��ӵ�����
        f.add(redButton);
        f.add(greenButton);
        f.add(blueButton);
        f.add(whiteButton);

        // ע���¼�
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        // redButton

        // �����¼�
        // redButton.addActionListener(new ActionListener() {
        // @Override
        // public void actionPerformed(ActionEvent e) {
        // // public void setBackground(Color c)
        // f.setBackground(Color.RED);
        // }
        // });

        // ����¼�
        // redButton.addMouseListener(new MouseAdapter() {
        // @Override
        // public void mouseClicked(MouseEvent e) {
        // f.setBackground(Color.RED);
        // }
        // });

        redButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                f.setBackground(Color.RED);
            }
        });

        redButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                f.setBackground(Color.WHITE);
            }
        });

        // ���ô���ɼ�
        f.setVisible(true);

    }
}
