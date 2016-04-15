/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FrameView;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import model.bean.GiaoDich;
import model.dao.GiaoDichDAO;

/**
 *
 * @author dracu
 */
public class XemDanhSachGiaoDich extends javax.swing.JPanel {

    /**
     * Creates new form XemDanhSachGiaoDich
     */
    public XemDanhSachGiaoDich() {
        initComponents();
        loadDanhSach();
    }
    
    private void loadDanhSach(){
        GiaoDichDAO gdDAO = new GiaoDichDAO();
        ArrayList<GiaoDich> gdList = gdDAO.getListGiaoDich();
        DefaultTableModel model = (DefaultTableModel) jtDanhSachGiaoDich.getModel();
        for(GiaoDich gd: gdList){
            Object[] row = {gd.getMaGD(),gd.getMaNVGD(), gd.getMoTaGD(), gd.getBenMua(), gd.getBenBan(), gd.getMaBDS(),gd.getSoTien(),gd.getNgayGD(), gd.getTiLeHoaHong()};
            model.addRow(row);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jtDanhSachGiaoDich = new javax.swing.JTable();
        jbTimKiem = new javax.swing.JButton();
        tfTimKiem = new javax.swing.JTextField();
        jlQuanLyGiaoDich = new javax.swing.JLabel();
        jbThemGiaoDich = new javax.swing.JButton();

        jtDanhSachGiaoDich.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã giao dịch", "Mã nhân viên giao dịch", "Mô tả giao dịch", "Bên mua", "Bên bán", "Mã bất động sản", "Số tiền", "Ngày giao dịch", "Tỷ lệ hoa hồng", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtDanhSachGiaoDich);
        if (jtDanhSachGiaoDich.getColumnModel().getColumnCount() > 0) {
            jtDanhSachGiaoDich.getColumnModel().getColumn(0).setResizable(false);
            jtDanhSachGiaoDich.getColumnModel().getColumn(1).setResizable(false);
            jtDanhSachGiaoDich.getColumnModel().getColumn(2).setResizable(false);
            jtDanhSachGiaoDich.getColumnModel().getColumn(3).setResizable(false);
            jtDanhSachGiaoDich.getColumnModel().getColumn(4).setResizable(false);
            jtDanhSachGiaoDich.getColumnModel().getColumn(5).setResizable(false);
            jtDanhSachGiaoDich.getColumnModel().getColumn(6).setResizable(false);
            jtDanhSachGiaoDich.getColumnModel().getColumn(7).setResizable(false);
            jtDanhSachGiaoDich.getColumnModel().getColumn(8).setResizable(false);
        }

        jbTimKiem.setText("Tìm kiếm");

        jlQuanLyGiaoDich.setText("Quản lý giao dịch");

        jbThemGiaoDich.setText("Thêm giao dịch");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlQuanLyGiaoDich)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 347, Short.MAX_VALUE)
                .addComponent(jbTimKiem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jbThemGiaoDich)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbTimKiem)
                    .addComponent(tfTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlQuanLyGiaoDich))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbThemGiaoDich))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbThemGiaoDich;
    private javax.swing.JButton jbTimKiem;
    private javax.swing.JLabel jlQuanLyGiaoDich;
    private javax.swing.JTable jtDanhSachGiaoDich;
    private javax.swing.JTextField tfTimKiem;
    // End of variables declaration//GEN-END:variables
}
