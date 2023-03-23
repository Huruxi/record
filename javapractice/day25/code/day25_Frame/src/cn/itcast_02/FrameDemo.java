package cn.itcast_02;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class FrameDemo {
    public static void main(String[] args) {
        // ��������
        Frame f = new Frame();

        // ���ô�������
        f.setTitle("����ر�");
        f.setSize(400, 200);
        f.setLocation(500, 250);

        // ע���¼�
        f.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {
            }

            @Override
            public void windowIconified(WindowEvent e) {
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
            }

            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }

            @Override
            public void windowClosed(WindowEvent e) {
            }

            @Override
            public void windowActivated(WindowEvent e) {
            }
        });

        // ���ô���ɼ�
        f.setVisible(true);
    }
}
