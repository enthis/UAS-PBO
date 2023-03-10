
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author nhari
 */
public class Penjualan extends javax.swing.JFrame {

    /**
     * Creates new form Penjualan
     */
    public Penjualan() {
        initComponents();
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
        jTbBarang = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jCCabang = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jCCashier = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTblPenjualan = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jTbBarang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "No", "Nama", "Harga", "id"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTbBarang.setColumnSelectionAllowed(true);
        jTbBarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTbBarangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTbBarang);
        jTbBarang.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (jTbBarang.getColumnModel().getColumnCount() > 0) {
            jTbBarang.getColumnModel().getColumn(0).setResizable(false);
            jTbBarang.getColumnModel().getColumn(1).setResizable(false);
            jTbBarang.getColumnModel().getColumn(2).setResizable(false);
            jTbBarang.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel1.setText("Cabang");

        jLabel2.setText("Cashier");

        jTblPenjualan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nama", "Qty", "id_barang", "Harga"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTblPenjualan.setColumnSelectionAllowed(true);
        jScrollPane2.setViewportView(jTblPenjualan);
        jTblPenjualan.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (jTblPenjualan.getColumnModel().getColumnCount() > 0) {
            jTblPenjualan.getColumnModel().getColumn(0).setResizable(false);
            jTblPenjualan.getColumnModel().getColumn(1).setResizable(false);
            jTblPenjualan.getColumnModel().getColumn(2).setMinWidth(0);
            jTblPenjualan.getColumnModel().getColumn(2).setMaxWidth(0);
            jTblPenjualan.getColumnModel().getColumn(3).setResizable(false);
        }

        jButton1.setText("Simpan Transaksi");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Reset Transaksi");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(30, 30, 30)
                                .addComponent(jCCabang, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(476, 476, 476)
                        .addComponent(jLabel2)
                        .addGap(32, 32, 32)
                        .addComponent(jCCashier, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jCCabang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jCCashier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
                // TODO add your handling code here:
        this.addProductList();
        this.addCabangDDL();
        this.addCashierDDL();
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        DatabaseConnection conn = new DatabaseConnection();
        try {
            
            conn.conn.setAutoCommit(false);
            Object iCabang = jCCabang.getSelectedItem();
            String vCabang = iCabang.toString().split("-")[0];
            Object iCashier = jCCashier.getSelectedItem();
            String vCashier = iCashier.toString().split("-")[0];
            String sqlPenjualan = "INSERT penjualan (id_cabang, id_karyawan) VALUES ( "+vCabang+", "+vCashier+");";
            int idPenjualan = conn.cn.executeUpdate(sqlPenjualan,Statement.RETURN_GENERATED_KEYS);
            DefaultTableModel tm = (DefaultTableModel)jTblPenjualan.getModel();
            for (int i = 0; i < tm.getRowCount(); i++) {
                String sqlPenjualanBarang = "INSERT INTO penjualan_barang (id_penjualan, id_barang, harga, qty) VALUES ( "+idPenjualan+", "+tm.getValueAt(i, 2)+", "+tm.getValueAt(i, 3)+","+tm.getValueAt(i, 1)+");";
                conn.cn.execute(sqlPenjualanBarang);
            }
            conn.conn.commit();
            JOptionPane.showMessageDialog(null, "Penjualan "+idPenjualan+" berhasil di simpan");
            this.reset();
        } catch(SQLException e){
            try {
                conn.conn.rollback();
            } catch (SQLException ex) {
                Logger.getLogger(Penjualan.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.out.println(e.getMessage());
        } 
    }//GEN-LAST:event_jButton1ActionPerformed
    private void reset(){
        DefaultTableModel tm = (DefaultTableModel)jTblPenjualan.getModel();
        tm.setRowCount(0);
    }
    int ip = 1;
    private void jTbBarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTbBarangMouseClicked
        // TODO add your handling code here:
        JTable source = (JTable)evt.getSource();
        int row = source.rowAtPoint( evt.getPoint() );
        String harga=source.getModel().getValueAt(row, 2)+"";
        String id=source.getModel().getValueAt(row, 3)+"";
        String nama=source.getModel().getValueAt(row, 1)+"";
        DefaultTableModel tm = (DefaultTableModel)jTblPenjualan.getModel();
        Boolean isUpdateRecord = false;
        for (int i = 0; i < tm.getRowCount(); i++) {
            if(tm.getValueAt(i, 2).equals(id)){
                isUpdateRecord = true;
                String qty = tm.getValueAt(i, 1)+"";
                tm.setValueAt(Integer.parseInt(qty) + 1 , i, 1);
            }
        }
        if(!isUpdateRecord){
                Object o[] = {nama,1,id,harga};
                tm.addRow(o);
                ip = ip + 1;
        }
        
        
    }//GEN-LAST:event_jTbBarangMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.reset();
    }//GEN-LAST:event_jButton2ActionPerformed
    private void addProductList(){
        try {
            DatabaseConnection conn = new DatabaseConnection();
            String sql = "SELECT * FROM product p;";
            ResultSet rs = conn.cn.executeQuery(sql);
            
            DefaultTableModel tm = (DefaultTableModel)jTbBarang.getModel();
            tm.setRowCount(0);
            int i = 1;
            while(rs.next()){
                Object o[] = {i,rs.getString("nama"),rs.getInt("harga_jual"),rs.getInt("id")};
                tm.addRow(o);
                i = i + 1;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.out.println(e.getMessage());
        }
    }                                    
    private void addCabangDDL(){
        try {
            DatabaseConnection conn = new DatabaseConnection();
            String sql = "SELECT * FROM cabang p;";
            ResultSet rs = conn.cn.executeQuery(sql);
            int i = 1;
            while(rs.next()){
                jCCabang.addItem(rs.getString("id") +"-"+rs.getString("nama"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.out.println(e.getMessage());
        }
    }                                 
    private void addCashierDDL(){
        try {
            DatabaseConnection conn = new DatabaseConnection();
            String sql = "SELECT * FROM karyawan p;";
            ResultSet rs = conn.cn.executeQuery(sql);
            int i = 1;
            while(rs.next()){
                jCCashier.addItem(rs.getString("id") +"-"+rs.getString("nama"));
                i = i + 1;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.out.println(e.getMessage());
        }
    }
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
            java.util.logging.Logger.getLogger(Penjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Penjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Penjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Penjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Penjualan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jCCabang;
    private javax.swing.JComboBox<String> jCCashier;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTbBarang;
    private javax.swing.JTable jTblPenjualan;
    // End of variables declaration//GEN-END:variables
}
