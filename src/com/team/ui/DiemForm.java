package com.team.ui;

import com.team.dao.DiemDAO;
import com.team.dao.MonHocDAO;
import com.team.dao.SinhVienDAO;
import com.team.entity.Diem;
import com.team.entity.MonHoc;
import com.team.entity.SinhVien;
import com.team.helper.DialogHelper;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author null
 * @copyright null
 *
 */
public class DiemForm extends javax.swing.JInternalFrame {

    public DiemForm() {
        initComponents();
        setup();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtDiem = new javax.swing.JTextField();
        cboSinhVien = new javax.swing.JComboBox<>();
        cboMon = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblList = new javax.swing.JTable();

        setClosable(true);
        setTitle("Quản lý điểm");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Sinh viên");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Môn");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Điểm");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/team/img/add.png"))); // NOI18N
        jButton1.setText("Thêm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/team/img/wrench.png"))); // NOI18N
        jButton2.setText("Sửa");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/team/img/delete (1).png"))); // NOI18N
        jButton3.setText("Xóa");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setText("Sắp xếp theo tên");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButton2, jButton3, jButton4});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton1, jButton2, jButton3, jButton4});

        tblList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblList);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cboSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cboMon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, jLabel2, jLabel3});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cboMon, cboSinhVien, txtDiem});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cboMon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtDiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cboMon, cboSinhVien, jLabel1, jLabel2, jLabel3, txtDiem});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        List<Diem> list = new DiemDAO().getAll();
        SinhVienDAO svdao = new SinhVienDAO();
        list.sort((Diem o1, Diem o2) -> {
            return svdao.getID(o1.getSinhVien()).getHoTen().compareToIgnoreCase(svdao.getID(o2.getSinhVien()).getHoTen());
        });
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (checkAll()) {
            Diem diem = new DiemDAO().getID(listSinhVien.get(cboSinhVien.getSelectedIndex()).getId(),
                    listMonHoc.get(cboMon.getSelectedIndex()).getId());
            if (diem != null) {
                DialogHelper.alert(this, "Bảng điểm đã tồn tại!");
                return;
            }
            new DiemDAO().insert(new Diem(listSinhVien.get(cboSinhVien.getSelectedIndex()).getId(),
                    listMonHoc.get(cboMon.getSelectedIndex()).getId(), Double.parseDouble(txtDiem.getText())));
            fillToTable();
            DialogHelper.successfully(this, DialogHelper.ADD);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (index != -1) {
            if (checkAll()) {
                new DiemDAO().update(new Diem(listSinhVien.get(cboSinhVien.getSelectedIndex()).getId(),
                        listMonHoc.get(cboMon.getSelectedIndex()).getId(), Double.parseDouble(txtDiem.getText())));
                fillToTable();
                DialogHelper.successfully(this, DialogHelper.UPDATE);
            }
        } else {
            DialogHelper.alert(this, "Vui lòng chọn bảng điểm cần sửa!");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tblListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblListMouseClicked
        index = tblList.getSelectedRow();
        cboSinhVien.setSelectedItem(tblList.getValueAt(index, 0));
        cboMon.setSelectedItem(tblList.getValueAt(index, 1));
        txtDiem.setText(String.valueOf(tblList.getValueAt(index, 2)));
    }//GEN-LAST:event_tblListMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (index != -1) {
            new DiemDAO().delete(new Diem(listSinhVien.get(cboSinhVien.getSelectedIndex()).getId(),
                    listMonHoc.get(cboMon.getSelectedIndex()).getId(), 0));
            fillToTable();
            DialogHelper.successfully(this, DialogHelper.DELETE);
        } else {
            DialogHelper.alert(this, "Vui lòng chọn bảng điểm cần xóa!");
        }
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboMon;
    private javax.swing.JComboBox<String> cboSinhVien;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblList;
    private javax.swing.JTextField txtDiem;
    // End of variables declaration//GEN-END:variables

    private void setup() {
        String[] column = {"Tên sinh viên", "Môn học", "Điểm"};
        model = new DefaultTableModel(column, 0) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tblList.setModel(model);

        for (SinhVien x : listSinhVien) {
            cboSinhVien.addItem(x.getHoTen());
        }
        for (MonHoc x : listMonHoc) {
            cboMon.addItem(x.getTenMon());
        }

        fillToTable();
    }

    private void fillToTable() {
        model.setRowCount(0);
        SinhVienDAO svdao = new SinhVienDAO();
        MonHocDAO mondao = new MonHocDAO();
        for (Diem x : new DiemDAO().getAll()) {
            model.addRow(new Object[]{
                svdao.getID(x.getSinhVien()).getHoTen(), mondao.getID(x.getMonHoc()).getTenMon(), formatter.format(x.getDiem())
            });
        }
        index = -1;
    }

    private void fillToTable(List<Diem> list) {
        model.setRowCount(0);
        SinhVienDAO svdao = new SinhVienDAO();
        MonHocDAO mondao = new MonHocDAO();
        for (Diem x : list) {
            model.addRow(new Object[]{
                svdao.getID(x.getSinhVien()).getHoTen(), mondao.getID(x.getMonHoc()).getTenMon(), formatter.format(x.getDiem())
            });
        }
        index = -1;
    }

    private boolean checkAll() {
        if (txtDiem.getText().trim().equals("")) {
            DialogHelper.alert(this, "Vui lòng nhập điểm sinh viên!");
            return false;
        } else {
            try {
                double diem = Double.parseDouble(txtDiem.getText());
                if (diem < 0 || diem > 10) {
                    DialogHelper.alert(this, "Vui lòng nhập điểm trong khoảng 0 - 10!");
                    return false;
                }

            } catch (Exception e) {
                DialogHelper.alert(this, "Vui lòng nhập đúng điểm sinh viên!");
                return false;
            }
            return true;
        }
    }

    DefaultTableModel model;
    int index = -1;
    NumberFormat formatter = new DecimalFormat("#.0");
    List<SinhVien> listSinhVien = new SinhVienDAO().getAll();
    List<MonHoc> listMonHoc = new MonHocDAO().getAll();
}
