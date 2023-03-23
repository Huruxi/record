package cn.itcast_06;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
 * һ�����壬һ����ǩ��һ���ı���
 */
public class KeyDemo {
    public static void main(String[] args) {
        // �����������
        final Frame f = new Frame("�����¼�");
        // ���ô�������
        f.setBounds(500, 250, 400, 300);
        // ���ò���
        f.setLayout(new FlowLayout());

        // ������ǩ����
        Label label = new Label("���������qq���룬ֻ����������,����������:");
        // �����ı���
        TextField tf = new TextField(20);

        // ��ӵ�����
        f.add(label);
        f.add(tf);

        // ע���¼�
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        tf.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                // public char getKeyChar()
                char ch = e.getKeyChar();
                if (!(ch >= KeyEvent.VK_0 && ch <= KeyEvent.VK_9)) {
                    System.out.println("��������ǣ�" + ch);
                    e.consume();
                }
            }
        });

        // ���ÿɼ�
        f.setVisible(true);
    }
}
