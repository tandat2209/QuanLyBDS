/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FrameView;

import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import model.bean.BatDongSan;
import model.dao.BatDongSanDAO;

/**
 *
 * @author hoanghuynhman
 */
public class XemDanhSachBDS extends javax.swing.JPanel {

    /**
     * Creates new form XemDanhSachBDS
     */
    public XemDanhSachBDS() {
        initComponents();
//        loadTableDanhSachBDS();
    }

    private void loadTableDanhSachBDS() {
        BatDongSanDAO bdsDao = new BatDongSanDAO();
        ArrayList<BatDongSan> alBatDongSan = bdsDao.getListBatDongSan();
        DefaultTableModel modelBatDongSan = (DefaultTableModel) jtBatDongSan.getModel();
        for (BatDongSan bds : alBatDongSan) {
            Object[] row = {bds.getMaBDS(), bds.getMaKH(), bds.getLoaiNC(), bds.getLoaiBDS(), bds.getDiaChi(), bds.getViTri(), bds.getHuong(), bds.getDienTich(), bds.getGiaTien(), bds.getGhiChu(), bds.getTinhTrang()};
            modelBatDongSan.addRow(row);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgLoaiBDS = new javax.swing.ButtonGroup();
        bgViTri = new javax.swing.ButtonGroup();
        btTroVe = new javax.swing.JButton();
        pTimKiem = new javax.swing.JPanel();
        lb1 = new javax.swing.JLabel();
        tf1 = new javax.swing.JTextField();
        tf2 = new javax.swing.JTextField();
        lb2 = new javax.swing.JLabel();
        tf3 = new javax.swing.JTextField();
        tf4 = new javax.swing.JTextField();
        bt2 = new javax.swing.JButton();
        lb3 = new javax.swing.JLabel();
        rb1 = new javax.swing.JRadioButton();
        rb2 = new javax.swing.JRadioButton();
        lb4 = new javax.swing.JLabel();
        rb3 = new javax.swing.JRadioButton();
        rb4 = new javax.swing.JRadioButton();
        lb5 = new javax.swing.JLabel();
        cb1 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtBatDongSan = new javax.swing.JTable();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setMaximumSize(new java.awt.Dimension(700, 450));
        setMinimumSize(new java.awt.Dimension(100, 100));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(300, 200));

        btTroVe.setText("Trở về");

        pTimKiem.setBorder(javax.swing.BorderFactory.createTitledBorder("Tìm kiếm"));

        lb1.setText("Diện tích");

        lb2.setText("Giá tiền");

        tf4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf4ActionPerformed(evt);
            }
        });

        bt2.setText("Tìm kiếm");

        lb3.setText("Loại BDS");

        bgLoaiBDS.add(rb1);
        rb1.setText("Đất");
        rb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb1ActionPerformed(evt);
            }
        });

        bgLoaiBDS.add(rb2);
        rb2.setText("Nhà ở");

        lb4.setText("Vị trí");

        bgViTri.add(rb3);
        rb3.setText("Ngoại ô");
        rb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb3ActionPerformed(evt);
            }
        });

        bgViTri.add(rb4);
        rb4.setText("Trung tâm");

        lb5.setText("Hướng");

        cb1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Đông", "Tây", "Nam", "Bắc", "Đông Bắc", "Tây Bắc", "Đông Nam", "Tây Nam" }));
        cb1.setSelectedIndex(6);

        javax.swing.GroupLayout pTimKiemLayout = new javax.swing.GroupLayout(pTimKiem);
        pTimKiem.setLayout(pTimKiemLayout);
        pTimKiemLayout.setHorizontalGroup(
            pTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTimKiemLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb1)
                    .addComponent(lb3))
                .addGap(4, 4, 4)
                .addGroup(pTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rb1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pTimKiemLayout.createSequentialGroup()
                        .addComponent(tf2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(lb2)
                        .addGap(2, 2, 2)
                        .addComponent(tf3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(bt2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pTimKiemLayout.createSequentialGroup()
                        .addComponent(rb2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb4)
                        .addGap(3, 3, 3)
                        .addComponent(rb3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rb4)
                        .addGap(18, 18, 18)
                        .addComponent(lb5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 236, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pTimKiemLayout.setVerticalGroup(
            pTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTimKiemLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb1)
                    .addComponent(tf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb2)
                    .addComponent(tf3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt2))
                .addGap(27, 27, 27)
                .addGroup(pTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb3)
                    .addComponent(rb1)
                    .addComponent(rb2)
                    .addComponent(lb4)
                    .addComponent(rb3)
                    .addComponent(rb4)
                    .addComponent(lb5)
                    .addComponent(cb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jtBatDongSan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã BĐS", "Mã KH", "Loại BĐS", "Địa chỉ", "Vị trí", "Hướng", "Diện tích", "Giá tiền", "Ghi chú", "Tình trạng"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtBatDongSan);
        if (jtBatDongSan.getColumnModel().getColumnCount() > 0) {
            jtBatDongSan.getColumnModel().getColumn(0).setResizable(false);
            jtBatDongSan.getColumnModel().getColumn(1).setResizable(false);
            jtBatDongSan.getColumnModel().getColumn(2).setResizable(false);
            jtBatDongSan.getColumnModel().getColumn(3).setResizable(false);
            jtBatDongSan.getColumnModel().getColumn(4).setResizable(false);
            jtBatDongSan.getColumnModel().getColumn(5).setResizable(false);
            jtBatDongSan.getColumnModel().getColumn(6).setResizable(false);
            jtBatDongSan.getColumnModel().getColumn(7).setResizable(false);
            jtBatDongSan.getColumnModel().getColumn(8).setResizable(false);
            jtBatDongSan.getColumnModel().getColumn(9).setResizable(false);
        }
        jtBatDongSan.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pTimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btTroVe)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btTroVe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tf4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf4ActionPerformed

    private void rb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb1ActionPerformed

    private void rb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgLoaiBDS;
    private javax.swing.ButtonGroup bgViTri;
    private javax.swing.JButton bt2;
    private javax.swing.JButton btTroVe;
    private javax.swing.JComboBox<String> cb1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtBatDongSan;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lb3;
    private javax.swing.JLabel lb4;
    private javax.swing.JLabel lb5;
    private javax.swing.JPanel pTimKiem;
    private javax.swing.JRadioButton rb1;
    private javax.swing.JRadioButton rb2;
    private javax.swing.JRadioButton rb3;
    private javax.swing.JRadioButton rb4;
    private javax.swing.JTextField tf1;
    private javax.swing.JTextField tf2;
    private javax.swing.JTextField tf3;
    private javax.swing.JTextField tf4;
    // End of variables declaration//GEN-END:variables
}