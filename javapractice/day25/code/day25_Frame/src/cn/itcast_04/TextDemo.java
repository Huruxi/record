package cn.itcast_04;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
 * ͨ���۲�ͼ�����Ƿ���֪��Ӧ�������µļ��������
 * ���壬�ı��򣬰�ť���ı���
 * ���ҶԴ���Ͱ�ť����¼�
 */
public class TextDemo {
    public static void main(String[] args) {
        // �����������
        Frame f = new Frame("����ת��");
        // ���ô�������
        f.setBounds(500, 250, 400, 300);
        // ���ò���
        f.setLayout(new FlowLayout());

        // �����ı���
        final TextField tf = new TextField(20);
        // ������ť
        Button bu = new Button("����ת��");
        // �����ı���
        final TextArea ta = new TextArea(10, 40);

        // ��ӵ�����
        f.add(tf);
        f.add(bu);
        f.add(ta);

        // ע���¼�
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        // ��bu����¼�
        bu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // ��ȡ�ı����ֵ����ֵ���ı���
                String tf_str = tf.getText();
                // �������
                tf.setText("");

                // ta.setText(tf_str);
                ta.append(tf_str + "\n");
            }
        });

        // ���ô���ɼ�
        f.setVisible(true);
    }
}
