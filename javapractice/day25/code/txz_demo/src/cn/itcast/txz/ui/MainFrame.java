package cn.itcast.txz.ui;

import java.awt.Container;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

//�����Ϸ˵��
//��ӱ���˵��
//��Ϸ�����Ի���ͼ����
//��Ϸ�����Ի���������
//����Ƕ�������������

public class MainFrame extends JFrame implements KeyListener {
    private Container panel;
    private JLabel player;
    // ����������
    private int playerX;
    // ����������
    private int playerY;
    // ������ɼ�����
    int count = 0;
    // �����������
    int total = 3;

    public MainFrame() {
        // ������UI��ʼ��
        this.mainFrameBaseUI();
        // UI���ݳ�ʼ��
        this.dateInit();
        // UI��ʼ��
        this.dateUI();
        // �����ذ�UI��ʼ��
        this.backgroundUI();
        // ������Ӽ��̼���
        this.addKeyListener(this);
        this.setVisible(true);
    }

    private JLabel[][] uis = new JLabel[12][16];

    private void dateUI() {
        // ǽ��ʼ��
        for (int i = 0; i < dates.length; i++) {
            for (int j = 0; j < dates[i].length; j++) {
                if (dates[i][j] == 1) {
                    JLabel temp = new JLabel(new ImageIcon("1.png"));
                    temp.setBounds(10 + j * 50, 10 + i * 50, 50, 50);
                    this.panel.add(temp);
                }
            }
        }
        // �����ʼλ�õ�3�У���3��(���ڵ�0�е�0��)
        this.playerX = 3;
        this.playerY = 3;
        player = new JLabel(new ImageIcon("-10.png"));
        player.setBounds(10 + playerX * 50, 10 + playerY * 50, 50, 50);
        this.panel.add(player);

        // Ŀ���ʼ��
        // ��total�й�
        JLabel tar1 = new JLabel(new ImageIcon("8.png"));
        tar1.setBounds(10 + 14 * 50, 10 + 5 * 50, 50, 50);
        this.panel.add(tar1);
        dates[5][14] = LogicHelper.TARGET;
        uis[5][14] = tar1;
        JLabel tar2 = new JLabel(new ImageIcon("8.png"));
        tar2.setBounds(10 + 14 * 50, 10 + 6 * 50, 50, 50);
        this.panel.add(tar2);
        dates[6][14] = LogicHelper.TARGET;
        uis[6][14] = tar2;
        JLabel tar3 = new JLabel(new ImageIcon("8.png"));
        tar3.setBounds(10 + 14 * 50, 10 + 7 * 50, 50, 50);
        this.panel.add(tar3);
        dates[7][14] = LogicHelper.TARGET;
        uis[7][14] = tar3;

        // ���ӳ�ʼ��
        // ��total�й�
        JLabel box1 = new JLabel(new ImageIcon("4.png"));
        box1.setBounds(10 + 7 * 50, 10 + 3 * 50, 50, 50);
        this.panel.add(box1);
        dates[3][7] = LogicHelper.BOX;
        uis[3][7] = box1;
        JLabel box2 = new JLabel(new ImageIcon("4.png"));
        box2.setBounds(10 + 7 * 50, 10 + 5 * 50, 50, 50);
        this.panel.add(box2);
        dates[5][7] = LogicHelper.BOX;
        uis[5][7] = box2;
        JLabel box3 = new JLabel(new ImageIcon("4.png"));
        box3.setBounds(10 + 7 * 50, 10 + 7 * 50, 50, 50);
        this.panel.add(box3);
        dates[7][7] = LogicHelper.BOX;
        uis[7][7] = box3;

    }

    private int[][] dates = new int[12][16];

    private void dateInit() {
        dates = new int[][]{
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                {1, 0, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1},
                {1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 1},
                {1, 0, 1, 0, 1, 1, 1, 0, 0, 0, 0, 0, 1, 0, 0, 1},
                {1, 0, 1, 0, 1, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 1},
                {1, 0, 1, 0, 1, 1, 1, 0, 0, 0, 0, 0, 1, 0, 0, 1},
                {1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1},
                {1, 0, 1, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 0, 0, 1},
                {1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},};
    }

    private void backgroundUI() {
        // ����ͼƬ��Ϣ����
        JLabel floor = new JLabel(new ImageIcon("floor.png"));
        floor.setBounds(10, 10, 800, 600);
        this.panel.add(floor);
    }

    private void mainFrameBaseUI() {
        this.panel = this.getContentPane();
        this.setSize(826, 650);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.panel.setLayout(null);
        // ���ô��������,ǿ�����ǲ���Ʒ����ʶ,ͬʱÿ���Ͽν�����Ҫ�԰汾��v1.0���е����仯
        this.setTitle("������v1.0 - java.itcast.cn  ���ǲ���Java��ѵѧԺ��ȫ����õ�Java��ѵ����������Java��ѵ�γ�");
        this.setResizable(false);
        this.getContentPane().setLayout(null);
    }

    // �ƶ����ƣ�����ԭʼλ�ý����ƶ�����2������ʾ��ֱ�����ƶ��������ƶ�����3������ʾˮƽ�����ƶ��������ƶ�
    private static void move(JLabel c, int vMoveType, int hMoveType) {
        c.setLocation(c.getX() - hMoveType * 50, c.getY() - vMoveType * 50);
    }

    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        int x = keyCode % 2 == 0 ? 39 - keyCode : 0;
        int y = keyCode % 2 == 1 ? 38 - keyCode : 0;

        // ��ǽ
        if (keyCode >= 37 && keyCode <= 40) {
            // ����ͼƬ�л�
            // ��10
            // ��-10
            // ��01
            // ��0-1
            player.setIcon(new ImageIcon(x + "" + y + ".png"));
            // ���ذ���,��Ŀ����
            if (dates[playerX - x][playerY - y] == LogicHelper.FLOOR
                    || dates[playerX - x][playerY - y] == LogicHelper.TARGET) {
                move(player, x, y);
                playerX = playerX - x;
                playerY = playerY - y;
                return;
            }
            // �����Ӽ��
            if (dates[playerX - x][playerY - y] == LogicHelper.BOX
                    || dates[playerX - x][playerY - y] == LogicHelper.BOX_AND_TARGET) {
                // ͬ�����Ƿ�Ϊ�յذ��Ŀ��λ��
                // ��ȡǰ���ƶ��ϰ�����
                int code1 = dates[playerX - x][playerY - y];
                int code2 = dates[playerX - x * 2][playerY - y * 2];
                if (code2 == LogicHelper.FLOOR || code2 == LogicHelper.TARGET) {
                    // �����ƶ�
                    JLabel box = uis[playerX - x][playerY - y];
                    move(box, x, y);
                    // uisģ�͸���
                    uis[playerX - x * 2][playerY - y * 2] = uis[playerX - x][playerY
                            - y];
                    uis[playerX - x][playerY - y] = null;

                    // datesģ�͸���
                    // �����ӵ��յ�
                    if (code1 == LogicHelper.BOX && code2 == LogicHelper.FLOOR) {
                        dates[playerX - x * 2][playerY - y * 2] = LogicHelper.BOX;
                        dates[playerX - x][playerY - y] = LogicHelper.FLOOR;
                    }
                    // �����ӵ�Ŀ��
                    if (code1 == LogicHelper.BOX && code2 == LogicHelper.TARGET) {
                        dates[playerX - x * 2][playerY - y * 2] = LogicHelper.BOX_AND_TARGET;
                        dates[playerX - x][playerY - y] = LogicHelper.FLOOR;
                        // �ı�����ģ��
                        box.setIcon(new ImageIcon("40.png"));
                        count++;
                    }
                    // ������Ŀ�굽�յ�
                    if (code1 == LogicHelper.BOX_AND_TARGET
                            && code2 == LogicHelper.FLOOR) {
                        dates[playerX - x * 2][playerY - y * 2] = LogicHelper.BOX;
                        dates[playerX - x][playerY - y] = LogicHelper.TARGET;
                        // �ı�����ģ��
                        box.setIcon(new ImageIcon("4.png"));
                        count--;
                    }
                    // ������Ŀ�굽Ŀ��
                    if (code1 == LogicHelper.BOX_AND_TARGET
                            && code2 == LogicHelper.TARGET) {
                        dates[playerX - x * 2][playerY - y * 2] = LogicHelper.BOX_AND_TARGET;
                        dates[playerX - x][playerY - y] = LogicHelper.TARGET;
                        // �ı�����ģ��
                        box.setIcon(new ImageIcon("40.png"));
                    }

                    // ����ģ���ƶ�
                    move(player, x, y);
                    // �����������
                    playerX = playerX - x;
                    playerY = playerY - y;

                    victory();
                }
                return;
            }
        }
    }

    // ʤ���ж�
    private void victory() {
        if (count == total) {
            // �Ƴ���������¼��������û��������
            this.removeKeyListener(this);
            // ���´���Ϊ���ֲ�룬��Ҫ��������Ϻ����ն���
            JDialog victory = new JDialog(this, "��ϲ��ȡ����ʤ��!���ǲ��͡���JAVA��ѵ��ҵ����콢",
                    true);
            victory.setSize(400, 300);
            victory.setLocationRelativeTo(null);
            victory.setLayout(null);

            JLabel info = new JLabel(new ImageIcon("gg.jpg"));
            info.setBounds(2, 2, 380, 180);
            victory.add(info);

            JLabel click = new JLabel(new ImageIcon("gg2.jpg"));
            click.setBounds(2, 182, 380, 88);
            click.addMouseListener(new MouseAdapter() {
                public void mousePressed(MouseEvent e) {
                    try {
                        Runtime.getRuntime()
                                .exec("rundll32 url.dll,FileProtocolHandler http://www.itcast.cn");
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                }
            });
            victory.add(click);
            victory.setVisible(true);
        }
    }

    public void keyReleased(KeyEvent e) {
    }

    public void keyTyped(KeyEvent e) {
    }
}
