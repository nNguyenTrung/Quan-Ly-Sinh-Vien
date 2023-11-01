package com.team.ui;

import com.formdev.flatlaf.intellijthemes.FlatDarkPurpleIJTheme;
import com.team.dao.TaiKhoanDAO;
import com.team.entity.TaiKhoan;
import com.team.helper.DialogHelper;
import com.team.jdbc.JDBCHelper;
import java.awt.CardLayout;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.UIManager;

/**
 *
 * @author null
 * @copyright null
 *
 */
public class Welcome extends javax.swing.JFrame {

    public Welcome() throws IOException {
        this.setUndecorated(true);
        this.setIconImage(ImageIO.read(new File("src/com/team/img/icon.png")));
        initComponents();
        setup();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        welcome = new javax.swing.JPanel();
        logo1 = new javax.swing.JLabel();
        pg = new javax.swing.JProgressBar();
        bg1 = new javax.swing.JLabel();
        login = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtTK = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtMK = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        bg2 = new javax.swing.JLabel();
        mainForm = new javax.swing.JPanel();

        welcome.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        welcome.add(logo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 400, 400));
        welcome.add(pg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 770, 20));
        welcome.add(bg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 490));

        login.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setBackground(new java.awt.Color(255, 255, 255,0));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/team/img/exit.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        login.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 0, 40, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Đăng nhập");
        login.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 770, 50));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255,0
        ));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Tài khoản");

        txtTK.setBackground(new java.awt.Color(204, 255, 255));
        txtTK.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtTK.setForeground(new java.awt.Color(153, 0, 153));
        txtTK.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTK.setBorder(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Mật khẩu");

        txtMK.setBackground(new java.awt.Color(204, 255, 255));
        txtMK.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtMK.setForeground(new java.awt.Color(153, 0, 153));
        txtMK.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMK.setBorder(null);

        jButton1.setBackground(new java.awt.Color(204, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 0, 204));
        jButton1.setText("Đăng nhập");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(txtTK, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel3)
            .addComponent(txtMK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel2, jLabel3, txtMK, txtTK});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTK, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel2, jLabel3, txtMK, txtTK});

        login.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 350, 280));
        login.add(bg2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 490));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainForm.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainForm, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainForm, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        TaiKhoan tk = new TaiKhoanDAO().getTaiKhoan(txtTK.getText(), String.valueOf(txtMK.getPassword()));
        if (tk != null) {
            try {
                new MainForm().setVisible(true);
                this.dispose();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        } else {
            DialogHelper.alert(this, "Thông tin tài khoản hoặc mật khẩu không đúng!");
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg1;
    private javax.swing.JLabel bg2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel login;
    private javax.swing.JLabel logo1;
    private javax.swing.JPanel mainForm;
    private javax.swing.JProgressBar pg;
    private javax.swing.JPasswordField txtMK;
    private javax.swing.JTextField txtTK;
    private javax.swing.JPanel welcome;
    // End of variables declaration//GEN-END:variables

    private void setup() throws IOException {
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.card = (CardLayout) mainForm.getLayout();
        mainForm.add(welcome, "welcome");
        mainForm.add(login, "login");

        Image img1 = ImageIO.read(new File("src/com/team/img/bg.jpg")).getScaledInstance(770, 490, Image.SCALE_SMOOTH);
        bg1.setIcon(new ImageIcon(img1));
        bg2.setIcon(new ImageIcon(img1));
        Image img2 = ImageIO.read(new File("src/com/team/img/logo.png")).getScaledInstance(400, 400, Image.SCALE_SMOOTH);
        logo1.setIcon(new ImageIcon(img2));
        connectDB();
    }

    private void connectDB() {
        new Thread(() -> {
            for (int i = 0; i < 110; i++) {
                if (i == 30) {
                    JDBCHelper.connectDatabase();
                }
                try {
                    pg.setValue(i);
                    Thread.sleep(15);
                } catch (InterruptedException ex) {
                }
            }
            card.next(mainForm);
        }).start();
    }

    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(new FlatDarkPurpleIJTheme());
        } catch (Exception e) {
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Welcome().setVisible(true);
                } catch (IOException ex) {
                }
            }
        });
    }

    CardLayout card;
}
