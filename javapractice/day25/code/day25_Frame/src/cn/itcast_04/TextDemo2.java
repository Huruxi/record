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
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * ͨ���۲�ͼ�����Ƿ���֪��Ӧ�������µļ��������
 * ���壬�ı��򣬰�ť���ı���
 * ���ҶԴ���Ͱ�ť����¼�
 */
public class TextDemo2 {
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
        Button bu = new Button("д���ı��ļ�");
        Button bu2 = new Button("��ȡ�ı��ļ�");
        // �����ı���
        final TextArea ta = new TextArea(10, 40);

        // ��ӵ�����
        f.add(tf);
        f.add(bu);
        f.add(bu2);
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

                // д���ı��ļ�
                BufferedWriter bw = null;
                try {
                    bw = new BufferedWriter(new FileWriter("bw.txt", true));
                    bw.write(tf_str);
                    bw.newLine();
                    bw.flush();
                } catch (IOException e1) {
                    e1.printStackTrace();
                } finally {
                    if (bw != null) {
                        try {
                            bw.close();
                        } catch (IOException e1) {
                            e1.printStackTrace();
                        }
                    }
                }
            }
        });

        bu2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ta.setText("");

                BufferedReader br = null;
                try {
                    br = new BufferedReader(new FileReader("bw.txt"));
                    String line = null;
                    while ((line = br.readLine()) != null) {
                        ta.append(line + "\n");
                    }
                } catch (IOException e1) {
                    e1.printStackTrace();
                } finally {
                    if (br != null) {
                        try {
                            br.close();
                        } catch (IOException e1) {
                            e1.printStackTrace();
                        }
                    }
                }
            }
        });

        // ���ô���ɼ�
        f.setVisible(true);
    }
}
