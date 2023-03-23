/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.itcast.view;

import cn.itcast.util.UiUtil;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import javax.swing.JOptionPane;

/**
 * @author fqy
 */
public class GuessNumberJFrame extends javax.swing.JFrame {

    private int number;

//    private static File file = new File("count.txt");
//    static {
//        BufferedWriter bw = null;
//        try {
////            file.createNewFile();
//            bw = new BufferedWriter(new FileWriter(file));
//            bw.write("count=0");
//            bw.newLine();
//            bw.flush();
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        } finally {
//            if (bw != null) {
//                try {
//                    bw.close();
//                } catch (IOException ex) {
//                    ex.printStackTrace();
//                }
//            }
//        }
//    }

    /**
     * Creates new form GuessNumberJFrame
     */
    public GuessNumberJFrame() {
        initComponents();
    }

    public GuessNumberJFrame(String username) {
        initComponents();
        init(username);
        checkGame();
    }

    private void init(String username) {
        this.setTitle("欢迎" + username + "光临");
        UiUtil.setFrameCenter(this);
        number = getRandomNumber();
        System.out.println("number:" + number);
    }

    private int getRandomNumber() {
        return (int) (Math.random() * 100) + 1;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jtfGuessNumber = new javax.swing.JTextField();
        guessButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("系统已经产生了一个随机数,请输入你要猜的数据(1-100)");

        guessButton.setText("我猜");
        guessButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guessButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jtfGuessNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(guessButton))
                                        .addComponent(jLabel1))
                                .addGap(46, 46, 46))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(jLabel1)
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jtfGuessNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(guessButton))
                                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checkGame() {
        Properties prop = new Properties();
        try {
            FileReader fr = new FileReader("count.txt");
            prop.load(fr);
            fr.close();

            String countString = prop.getProperty("count");
            int count = Integer.parseInt(countString);
            if (count >= 5) {
                JOptionPane.showMessageDialog(this, "试玩结束,要想继续玩,请充值");
                System.exit(0);
            } else {
                count++;
                prop.setProperty("count", String.valueOf(count));

                FileWriter fw = new FileWriter("count.txt");
                prop.store(fw, null);
                fw.close();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void guessButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guessButtonActionPerformed
        checkGame();

        //获取数据
        String guessNumberString = this.jtfGuessNumber.getText().trim();

        //判断必须是数字
        String regex = "\\d{1,3}";

        //判断
        if (!guessNumberString.matches(regex)) {
            JOptionPane.showMessageDialog(this, "你猜的数据不是数字");
            this.jtfGuessNumber.setText("");
            this.jtfGuessNumber.requestFocus();
            return;
        }

        //转换为数据
        int guessNumber = Integer.parseInt(guessNumberString);

        if (guessNumber < 0 || guessNumber > 100) {
            JOptionPane.showMessageDialog(this, "你猜的数字超出范围(1-100)");
            this.jtfGuessNumber.setText("");
            this.jtfGuessNumber.requestFocus();
            return;
        }

        if (guessNumber > number) {
            JOptionPane.showMessageDialog(this, "你猜的数字" + guessNumber + "大了");
            this.jtfGuessNumber.setText("");
            this.jtfGuessNumber.requestFocus();
        } else if (guessNumber < number) {
            JOptionPane.showMessageDialog(this, "你猜的数字" + guessNumber + "小了");
            this.jtfGuessNumber.setText("");
            this.jtfGuessNumber.requestFocus();
        } else {
            JOptionPane.showMessageDialog(this, "恭喜你猜中了");

            //public static int showConfirmDialog(Component parentComponent,Object message)
            int choice = JOptionPane.showConfirmDialog(this, "还要玩吗");
            //System.out.println("choice:"+choice);
            if (choice == 0) {
                number = getRandomNumber();
                JOptionPane.showMessageDialog(this, "随机数再次产生，祝玩的开心");
                this.jtfGuessNumber.setText("");
                this.jtfGuessNumber.requestFocus();
            }
        }
    }//GEN-LAST:event_guessButtonActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(GuessNumberJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(GuessNumberJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(GuessNumberJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(GuessNumberJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new GuessNumberJFrame().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton guessButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jtfGuessNumber;
    // End of variables declaration//GEN-END:variables
}
