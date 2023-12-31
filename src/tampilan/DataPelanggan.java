/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tampilan;

import helper.database;
import helper.reset;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author afgha
 */
public class DataPelanggan extends javax.swing.JFrame {
    String[] columns = {"id_pelanggan", "nama_pelanggan", "alamat", "telepon", "email", "jenis_kelamin", "tanggal_lahir"};
    String[] columnsUpdate = {"nama_pelanggan", "alamat", "telepon", "email", "jenis_kelamin", "tanggal_lahir"};
    reset reset = new reset();
    database db = new database();
    String condition = "id_pelanggan = ";
    private Connection conn = new helper.database().connect();
    String table = "pelanggan";
    private DefaultTableModel tabmode;
    /**
     * Creates new form DataPelanggan
     */
    public DataPelanggan() {
        initComponents();
        datatable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tIdPelanggan = new javax.swing.JTextField();
        tTelepon = new javax.swing.JTextField();
        tNamaPelanggan = new javax.swing.JTextField();
        tEmail = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tAlamat = new javax.swing.JTextArea();
        tTanggalLahir = new com.toedter.calendar.JDateChooser();
        rbLakiLaki = new javax.swing.JRadioButton();
        rbPerempuan = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabPelanggan = new javax.swing.JTable();
        bSave = new javax.swing.JButton();
        bEdit = new javax.swing.JButton();
        bDelete = new javax.swing.JButton();
        bCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Data Pelanggan");

        jLabel2.setText("ID Pelanggan");

        jLabel3.setText("Nama Pelanggan");

        jLabel4.setText("Alamat");

        jLabel5.setText("Telepon");

        jLabel6.setText("Email");

        jLabel7.setText("Jenis Kelamin");

        jLabel8.setText("Tanggal Lahir");

        tEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tEmailActionPerformed(evt);
            }
        });

        tAlamat.setColumns(20);
        tAlamat.setRows(5);
        jScrollPane1.setViewportView(tAlamat);

        buttonGroup1.add(rbLakiLaki);
        rbLakiLaki.setText("Laki-Laki");
        rbLakiLaki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbLakiLakiActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbPerempuan);
        rbPerempuan.setText("Perempuan");

        tabPelanggan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabPelanggan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabPelangganMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabPelanggan);

        bSave.setText("Save");
        bSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSaveActionPerformed(evt);
            }
        });

        bEdit.setText("Edit");
        bEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEditActionPerformed(evt);
            }
        });

        bDelete.setText("Delete");
        bDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDeleteActionPerformed(evt);
            }
        });

        bCancel.setText("Cancel");
        bCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(372, 372, 372)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tNamaPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(31, 31, 31)
                                .addComponent(tIdPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(65, 65, 65)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbLakiLaki)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(tTelepon)
                                        .addComponent(tEmail)
                                        .addComponent(tTanggalLahir, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE))
                                    .addComponent(rbPerempuan))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bSave)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bEdit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bDelete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bCancel))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tIdPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tNamaPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(tTelepon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(tEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(rbLakiLaki))
                        .addGap(18, 18, 18)
                        .addComponent(rbPerempuan)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(tTanggalLahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bSave)
                    .addComponent(bEdit)
                    .addComponent(bDelete)
                    .addComponent(bCancel))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tEmailActionPerformed

    private void rbLakiLakiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbLakiLakiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbLakiLakiActionPerformed
    
    void datatable() {
    Object[] baris = {"id_pelanggan", "nama_pelanggan", "alamat", "telepon", "email", "jenis_kelamin", "tanggal_lahir"};
    tabmode = new DefaultTableModel(null, baris);
    tabPelanggan.setModel(tabmode);
    String sql = "SELECT * FROM "+table; // Sesuaikan dengan nama tabel pelanggan di database Anda
    try {
        Statement stat = conn.createStatement();
        ResultSet res = stat.executeQuery(sql);
        while (res.next()) {
            String idPelanggan = res.getString("id_pelanggan");
            String namaPelanggan = res.getString("nama_pelanggan");
            String alamat = res.getString("alamat");
            String telepon = res.getString("telepon");
            String email = res.getString("email");
            String jenisKelamin = res.getString("jenis_kelamin");
            java.sql.Date tanggalLahir = res.getDate("tanggal_lahir");

            String[] data = {idPelanggan, namaPelanggan, alamat, telepon, email, jenisKelamin, tanggalLahir.toString()};
            tabmode.addRow(data);
        }
    } catch (SQLException ex) {
        System.out.println("Error: " + ex);
    }
}
    
    private boolean isFormPelangganValid() {
    String idPelanggan = tIdPelanggan.getText();
    String namaPelanggan = tNamaPelanggan.getText();
    String alamat = tAlamat.getText();
    String telepon = tTelepon.getText();
    String email = tEmail.getText();

    if (idPelanggan.isEmpty() || namaPelanggan.isEmpty() || alamat.isEmpty() || telepon.isEmpty() || email.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Semua kolom harus diisi.", "Kesalahan", JOptionPane.ERROR_MESSAGE);
        return false;
    }

    if (!isValidTelepon(telepon)) {
        JOptionPane.showMessageDialog(this, "Format telepon tidak valid. Contoh: 08123456789", "Kesalahan", JOptionPane.ERROR_MESSAGE);
        return false;
    }

    if (!isValidEmail(email)) {
        JOptionPane.showMessageDialog(this, "Format email tidak valid. Contoh: nama@example.com", "Kesalahan", JOptionPane.ERROR_MESSAGE);
        return false;
    }

    return true;
}

private boolean isValidTelepon(String telepon) {
    // Validasi format telepon dengan menggunakan regular expression
    String regex = "^(\\+?62|0)[2-9]{1}[0-9]+$";
    return telepon.matches(regex);
}

private boolean isValidEmail(String email) {
    // Validasi format email dengan menggunakan regular expression
    String regex = "^[\\w-]+(\\.[\\w-]+)*@[\\w-]+(\\.[\\w-]+)*(\\.[a-z]{2,})$";
    return email.matches(regex);
}
    
    void reset(){
        reset.resetTextFields(this.getContentPane());
        buttonGroup1.clearSelection();
        tAlamat.setText("");
    }
    private void bSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSaveActionPerformed

        if (!isFormPelangganValid()) {
                return; // Menghentikan proses update data pelanggan karena form tidak valid
            }
        String namaPelanggan = tNamaPelanggan.getText();
        String alamat = tAlamat.getText();
        String telepon = tTelepon.getText();
        String email = tEmail.getText();
        String jenisKelamin = "";

        if (rbLakiLaki.isSelected()) {
            jenisKelamin = "Laki-laki";
        } else if (rbPerempuan.isSelected()) {
            jenisKelamin = "Perempuan";
        }

        java.sql.Date tanggalLahir = null;
        if (tTanggalLahir.getDate() != null) {
            tanggalLahir = new java.sql.Date(tTanggalLahir.getDate().getTime());
        }
        
        

        Object[] values = {0, namaPelanggan, alamat, telepon, email, jenisKelamin, tanggalLahir};
        try {
            db.insertData(conn, table, columns, values);
            datatable();
            reset();
        } catch (SQLException ex) {
            Logger.getLogger(DataPelanggan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bSaveActionPerformed

    private void tabPelangganMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabPelangganMouseClicked
        int selectedRowIndex = tabPelanggan.getSelectedRow();
        String idPelanggan = tabmode.getValueAt(selectedRowIndex, 0).toString();
        String namaPelanggan = tabmode.getValueAt(selectedRowIndex, 1).toString();
        String alamat = tabmode.getValueAt(selectedRowIndex, 2).toString();
        String telepon = tabmode.getValueAt(selectedRowIndex, 3).toString();
        String email = tabmode.getValueAt(selectedRowIndex, 4).toString();
        String jenisKelamin = tabmode.getValueAt(selectedRowIndex, 5).toString();
        String tanggalLahir = tabmode.getValueAt(selectedRowIndex, 6).toString();

        tIdPelanggan.setText(idPelanggan);
        tNamaPelanggan.setText(namaPelanggan);
        tAlamat.setText(alamat);
        tTelepon.setText(telepon);
        tEmail.setText(email);

        if (jenisKelamin.equalsIgnoreCase("Laki-laki")) {
            rbLakiLaki.setSelected(true);
            rbPerempuan.setSelected(false);
        } else if (jenisKelamin.equalsIgnoreCase("Perempuan")) {
            rbLakiLaki.setSelected(false);
            rbPerempuan.setSelected(true);
        }

        tTanggalLahir.setDate(java.sql.Date.valueOf(tanggalLahir));
    }//GEN-LAST:event_tabPelangganMouseClicked

    private void bDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDeleteActionPerformed
        String idPelanggan = tIdPelanggan.getText();

        // Validasi apakah ID Mitra Kerja tidak kosong
        if (idPelanggan.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Kolom ID Pelanggan tidak boleh kosong.", "Kesalahan", JOptionPane.ERROR_MESSAGE);
            return; // Menghentikan proses penghapusan data dari tabel partnership
        }

        // Konfirmasi penghapusan data
        int confirm = JOptionPane.showConfirmDialog(this, "Anda yakin ingin menghapus data ini?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            try {
                db.deleteData(conn, table, condition + idPelanggan);
                reset();
                datatable();
            } catch (SQLException ex) {
                Logger.getLogger(DataPemasaran.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_bDeleteActionPerformed

    private void bEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEditActionPerformed
        if (!isFormPelangganValid()) {
            return; // Menghentikan proses update data pelanggan karena form tidak valid
        }
        String idPelanggan = tIdPelanggan.getText();
        String namaPelanggan = tNamaPelanggan.getText();
        String alamat = tAlamat.getText();
        String telepon = tTelepon.getText();
        String email = tEmail.getText();
        String jenisKelamin = "";
        if (rbLakiLaki.isSelected()) {
            jenisKelamin = "Laki-laki";
        } else if (rbPerempuan.isSelected()) {
            jenisKelamin = "Perempuan";
        }

        java.sql.Date tanggalLahir = null;
        if (tTanggalLahir.getDate() != null) {
            tanggalLahir = new java.sql.Date(tTanggalLahir.getDate().getTime());
        }
        

        try {
            Object[] values = {namaPelanggan, alamat, telepon, email, jenisKelamin, tanggalLahir};
            db.updateData(conn, table, columnsUpdate, values, condition + idPelanggan);
            datatable();
            reset();
        } catch (SQLException ex) {
            Logger.getLogger(DataPelanggan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bEditActionPerformed

    private void bCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelActionPerformed
        reset();
    }//GEN-LAST:event_bCancelActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DataPelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataPelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataPelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataPelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DataPelanggan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCancel;
    private javax.swing.JButton bDelete;
    private javax.swing.JButton bEdit;
    private javax.swing.JButton bSave;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rbLakiLaki;
    private javax.swing.JRadioButton rbPerempuan;
    private javax.swing.JTextArea tAlamat;
    private javax.swing.JTextField tEmail;
    private javax.swing.JTextField tIdPelanggan;
    private javax.swing.JTextField tNamaPelanggan;
    private com.toedter.calendar.JDateChooser tTanggalLahir;
    private javax.swing.JTextField tTelepon;
    private javax.swing.JTable tabPelanggan;
    // End of variables declaration//GEN-END:variables
}
