package ventanas;

import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

import static ventanas.TablaEmp.tablaE;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class BuscadorUsuarios extends javax.swing.JFrame {

    /**
     * Creates new form Buscador
     */
    public BuscadorUsuarios() {
        initComponents();
        seticon();
        init2();
        
    }
private void init2(){
    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        TxtFiltro1 = new javax.swing.JTextField();
        CmbFiltro = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Buscador");

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        CmbFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Usuario", "Permisos" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CmbFiltro, 0, 171, Short.MAX_VALUE)
                    .addComponent(TxtFiltro1)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(129, Short.MAX_VALUE)
                .addComponent(CmbFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtFiltro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(92, 92, 92))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String value = CmbFiltro.getSelectedItem().toString();
        if(value == "Usuario"){
            try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://Localhost:3306/incidenciasdb", "root", "");
            String sql = "select * from usuarios where Usuario like ?"; 
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1,"%"+TxtFiltro1.getText().trim() + "%");
            ResultSet  rst = pst.executeQuery();
             
            
            
            
            
             try{
           
         DefaultTableModel model =(DefaultTableModel) tablaE.getModel();
            tablaE.setModel(DbUtils.resultSetToTableModel(rst));
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
                   
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        } 
        if(value == "Permisos"){
            try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://Localhost:3306/incidenciasdb", "root", "");
            String sql = "select * from usuarios where Permisos like ?"; 
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1,"%"+TxtFiltro1.getText().trim() + "%");
            ResultSet  rst = pst.executeQuery();
             
            
            
            
            
             try{
           
         DefaultTableModel model =(DefaultTableModel) tablaE.getModel();
            tablaE.setModel(DbUtils.resultSetToTableModel(rst));
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
                   
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } 
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(BuscadorUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscadorUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscadorUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscadorUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscadorUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CmbFiltro;
    private javax.swing.JTextField TxtFiltro1;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
private void seticon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage("src/img/icono.png"));
    }
}
