
import com.mysql.cj.protocol.Resultset;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author nhari
 */
public class Product extends javax.swing.JFrame {

    /**
     * Creates new form Product
     */
    public Product() {
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTProduct = new javax.swing.JTable();
        jTnama = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTbahan = new javax.swing.JTextField();
        jTharga_beli = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTketerangan_harga_beli = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTharga_jual = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTketerangan_harga_jual = new javax.swing.JTextField();
        jBtnSimpan = new javax.swing.JToggleButton();
        jBtnRandom = new javax.swing.JButton();
        JTId = new javax.swing.JTextField();
        JBDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Nama");

        jTProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Kode Barang", "Jenis perawatan (skincare", "Bahan", "Harga Beli", "Harga beli bahan2 per kg", "Harga Jual", "Hrg Jual bahan2 per Volume pakai * 1 kg,"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTProduct.getTableHeader().setReorderingAllowed(false);
        jTProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTProductMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTProduct);
        if (jTProduct.getColumnModel().getColumnCount() > 0) {
            jTProduct.getColumnModel().getColumn(0).setResizable(false);
            jTProduct.getColumnModel().getColumn(1).setResizable(false);
            jTProduct.getColumnModel().getColumn(2).setResizable(false);
            jTProduct.getColumnModel().getColumn(3).setResizable(false);
            jTProduct.getColumnModel().getColumn(4).setResizable(false);
            jTProduct.getColumnModel().getColumn(5).setResizable(false);
            jTProduct.getColumnModel().getColumn(6).setResizable(false);
            jTProduct.getColumnModel().getColumn(7).setResizable(false);
        }

        jTnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTnamaActionPerformed(evt);
            }
        });

        jLabel2.setText("Bahan");

        jTharga_beli.setText("0");

        jLabel3.setText("Harga Beli");

        jLabel4.setText("Keterangan Harga Beli");

        jTharga_jual.setText("0");
        jTharga_jual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTharga_jualActionPerformed(evt);
            }
        });

        jLabel5.setText("Harga Jual");

        jLabel6.setText("Keterangan Harga Jual");

        jTketerangan_harga_jual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTketerangan_harga_jualActionPerformed(evt);
            }
        });

        jBtnSimpan.setText("Simpan");
        jBtnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSimpanActionPerformed(evt);
            }
        });

        jBtnRandom.setText("Random");
        jBtnRandom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnRandomActionPerformed(evt);
            }
        });

        JTId.setEditable(false);
        JTId.setText("-1");
        JTId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTIdActionPerformed(evt);
            }
        });

        JBDelete.setText("Delete");
        JBDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTnama, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 304, Short.MAX_VALUE)
                        .addComponent(jTbahan, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 283, Short.MAX_VALUE)
                        .addComponent(jTharga_beli, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 220, Short.MAX_VALUE)
                        .addComponent(jTketerangan_harga_beli, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 282, Short.MAX_VALUE)
                        .addComponent(jTharga_jual, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(JTId, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBtnSimpan)
                                .addGap(87, 87, 87)
                                .addComponent(JBDelete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtnRandom))
                            .addComponent(jTketerangan_harga_jual, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTbahan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTharga_beli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTketerangan_harga_beli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTharga_jual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTketerangan_harga_jual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnSimpan)
                    .addComponent(jBtnRandom)
                    .addComponent(JTId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBDelete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTharga_jualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTharga_jualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTharga_jualActionPerformed

    private void jTketerangan_harga_jualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTketerangan_harga_jualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTketerangan_harga_jualActionPerformed

    private void jTnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTnamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTnamaActionPerformed

    private void jBtnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSimpanActionPerformed
        try {
            DatabaseConnection conn = new DatabaseConnection();
            String nama = jTnama.getText();
            String bahan = jTbahan.getText();
            String keterangan_harga_beli = jTketerangan_harga_beli.getText();
            String keterangan_harga_jual = jTketerangan_harga_jual.getText();
            int harga_beli = Integer.parseInt(jTharga_beli.getText());
            int harga_jual = Integer.parseInt(jTharga_jual.getText());
            int id = Integer.parseInt(JTId.getText());

            if(nama == "" || bahan == "" ){
                throw new Exception("Ada Field kosong");
            }
            if(id == -1){
                
                String sql = "INSERT INTO product (nama, bahan, harga_beli, keterangan_harga_beli, harga_jual, keterangan_harga_jual)\n" +
                         "  VALUES ('"+nama+"', '"+bahan+"', "+harga_beli+", '"+keterangan_harga_beli+"', "+harga_jual+", '"+keterangan_harga_jual+"');";
                conn.cn.execute(sql);
            }else{
                String sql = "UPDATE product p \n" +
                            "SET nama = '"+nama+"',\n" +
                            "    bahan = '"+bahan+"',\n" +
                            "    harga_beli = "+harga_beli+",\n" +
                            "    keterangan_harga_beli = '"+keterangan_harga_beli+"',\n" +
                            "    harga_jual = "+harga_jual+",\n" +
                            "    keterangan_harga_jual = '"+keterangan_harga_jual+"'\n" +
                            "WHERE id = "+JTId.getText()+";";
                conn.cn.execute(sql);
            }
            
            this.addProductList();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jBtnSimpanActionPerformed

    private void jBtnRandomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnRandomActionPerformed
        // TODO add your handling code here :
        jTnama.setText(Double.toString(Math.random()));
        jTbahan.setText(Double.toString(Math.random()));
        jTketerangan_harga_beli.setText("Keterangan Beli "+Double.toString(Math.random()));
        jTketerangan_harga_jual.setText("Keterangan Beli "+Double.toString(Math.random()));
    }//GEN-LAST:event_jBtnRandomActionPerformed
    
    private void resetForm(){
        jBtnSimpan.setText("Simpan");
        jTnama.setText("");
        jTbahan.setText("");
        jTketerangan_harga_beli.setText("");
        jTketerangan_harga_jual.setText("");
        jTharga_beli.setText("0");
        jTharga_jual.setText("0");
        JTId.setText("-1");
        JTId.hide();
    }
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.addProductList();
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void jTProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTProductMouseClicked
        // TODO add your handling code here:
        try {
            JTable source = (JTable)evt.getSource();
            int row = source.rowAtPoint( evt.getPoint() );
            String id=source.getModel().getValueAt(row, 1)+"";
            String nama=source.getModel().getValueAt(row, 2)+"";
            String bahan=source.getModel().getValueAt(row, 3)+"";
            String keterangan_harga_beli=source.getModel().getValueAt(row, 5)+"";
            String keterangan_harga_jual=source.getModel().getValueAt(row, 7)+"";
            String harga_beli=source.getModel().getValueAt(row, 4)+"";
            String harga_jual=source.getModel().getValueAt(row, 6)+"";
            JTId.setText(id);
            jTharga_beli.setText(harga_beli);
            jTharga_jual.setText(harga_jual);
            jTnama.setText(nama);
            jTbahan.setText(bahan);
            jTketerangan_harga_beli.setText(keterangan_harga_beli);
            jTketerangan_harga_jual.setText(keterangan_harga_jual);
            jBtnSimpan.setText("Rubah");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jTProductMouseClicked

    private void JTIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTIdActionPerformed

    private void JBDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBDeleteActionPerformed
        // TODO add your handling code here:
        try {
            DatabaseConnection conn = new DatabaseConnection();
            int input = JOptionPane.showConfirmDialog(null, "Apakah anda yakin menghapus "+jTnama.getText()+" ?","Pilih salah satu",JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
            if(input == 0){
                String sql = "DELETE FROM product WHERE id = "+JTId.getText()+";";
                conn.cn.execute(sql);                                
                this.addProductList();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.out.println(e.getMessage());
        }	
    }//GEN-LAST:event_JBDeleteActionPerformed
    
    private void addProductList(){
        try {
            this.resetForm();
            DatabaseConnection conn = new DatabaseConnection();
            String sql = "SELECT * FROM product p;";
            ResultSet rs = conn.cn.executeQuery(sql);
            
            DefaultTableModel tm = (DefaultTableModel)jTProduct.getModel();
            tm.setRowCount(0);
            int i = 1;
            while(rs.next()){
                Object o[] = {i,rs.getInt("id"),rs.getString("nama"),rs.getString("bahan"),rs.getInt("harga_beli"),rs.getString("keterangan_harga_beli"),rs.getInt("harga_jual"),rs.getString("keterangan_harga_jual")};
                tm.addRow(o);
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
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Product().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBDelete;
    private javax.swing.JTextField JTId;
    private javax.swing.JButton jBtnRandom;
    private javax.swing.JToggleButton jBtnSimpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTProduct;
    private javax.swing.JTextField jTbahan;
    private javax.swing.JTextField jTharga_beli;
    private javax.swing.JTextField jTharga_jual;
    private javax.swing.JTextField jTketerangan_harga_beli;
    private javax.swing.JTextField jTketerangan_harga_jual;
    private javax.swing.JTextField jTnama;
    // End of variables declaration//GEN-END:variables
}
