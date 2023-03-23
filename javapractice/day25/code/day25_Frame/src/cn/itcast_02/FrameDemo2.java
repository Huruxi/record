package cn.itcast_02;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
 * ����������Ľ�����
 *
 * ������
 * 		 �������е��¼�����Ҫ�������ࡣ
 * 		������һ���¼��ӿ���ֻ��һ��������
 */
public class FrameDemo2 {
    public static void main(String[] args) {
        // ��������
        Frame f = new Frame();

        // ���ô�������
        f.setTitle("����ر�");
        f.setSize(400, 200);
        f.setLocation(500, 250);

        // ע���¼�
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        // ���ô���ɼ�
        f.setVisible(true);
    }
}
