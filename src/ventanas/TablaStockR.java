/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventanas;
import java.text.SimpleDateFormat;
import java.awt.event.*;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import static ventanas.RegistroDeIncidencias.txt_codigo;

import static ventanas.RegistroDeIncidencias.txt_nombre;
import static ventanas.RegistroDeIncidencias.TxtApellidos;
import static ventanas.RegistroDeIncidencias.txt_telefono;
import static ventanas.RegistroDeIncidencias.TxtInc;

import static ventanas.RegistroDeIncidencias.CmbInc;
import static ventanas.RegistroDeIncidencias.CmbDispositivo;
import static ventanas.RegistroDeIncidencias.TxtDispositivo;
import static ventanas.RegistroDeIncidencias.TxtMateriales;
import static ventanas.RegistroDeIncidencias.TxtProcedimientos;
import static ventanas.RegistroDeIncidencias.TxtObservaciones;
import static ventanas.RegistroDeIncidencias.DcFecha;
import static ventanas.RegistroDeIncidencias.TxtDescripcion;
import static ventanas.RegistroDeIncidencias.CmbEmpleado;
import static ventanas.RegistroDeIncidencias.LblPrivilegios;
import static ventanas.RegistroDeIncidencias.Parent;
import static ventanas.RegistroDeIncidencias.PnlMateriales1;
import static ventanas.RegistroDeIncidencias.TxtNombreM1;
import static ventanas.RegistroDeIncidencias.TxtDescripcionM1;
import static ventanas.RegistroDeIncidencias.TxtCantidadM1;
import static ventanas.RegistroDeIncidencias.TxtPrecioM1;
import static ventanas.RegistroDeIncidencias.TxtIDM1;
import static ventanas.RegistroDeIncidencias.TxtCodigoM1;
import static ventanas.RegistroDeIncidencias.TxtIdentificador;

import static ventanas.RegistroDeIncidencias.jButton4;
import static ventanas.RegistroDeIncidencias.jButton5;
import static ventanas.RegistroDeIncidencias.jButton9;
import static ventanas.TablaInc.LblPrivilegios1;



public class TablaStockR extends javax.swing.JFrame {

    /**
     * Creates new form TablaInc
     */
    public TablaStockR() {
        initComponents();
        init2();
        seticon();
        
            try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://Localhost:3306/incidenciasdb", "root", "");
            String sql = "select * from stock"; 
            PreparedStatement pst = cn.prepareStatement(sql);
            ResultSet  rst = pst.executeQuery();
             
            
            
            
            
             try{
           
         DefaultTableModel model =(DefaultTableModel) tabla2.getModel();
            tabla2.setModel(DbUtils.resultSetToTableModel(rst));
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
                   
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } 
        
      tabla2.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
        public void valueChanged(ListSelectionEvent event) {
            try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://Localhost:3306/incidenciasdb", "root", "");
            PreparedStatement pst = cn.prepareStatement("select * from stock where ID = ?");
            pst.setString(1, tabla2.getValueAt(tabla2.getSelectedRow(), 0).toString().trim());

            ResultSet rs = pst.executeQuery();
            

            if (rs.next()) {
                RegistroDeIncidencias tab = new RegistroDeIncidencias();
                tab.setVisible(true);
                Parent.removeAll();
        Parent.add(PnlMateriales1);
        Parent.repaint();
        Parent.revalidate();
                if(LblPrivilegios3.getText().trim() == "Administrador"){
        LblPrivilegios.setText("Administrador");
    }
    dispose();
    TxtIDM1.setText(rs.getString("ID"));
    TxtDescripcionM1.setText(rs.getString("Descripcion"));
    TxtNombreM1.setText(rs.getString("Nombre"));
    TxtPrecioM1.setText(rs.getString("Precio"));
    TxtCodigoM1.setText(rs.getString("Codigo"));
    TxtCantidadM1.setText(rs.getString("cantidad"));
    TxtIdentificador.setText(rs.getString("IdentificadorDeCompra"));
    jButton4.setVisible(false);
jButton5.setVisible(false);

jButton9.setVisible(true);
    
               
                
                
            } else {
                JOptionPane.showMessageDialog(null, "Numero de telefono no registrado.");
            }

        } catch (Exception e) {
            System.out.println(e);
        
        }
           
        }
    });    
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
        tabla2 = new javax.swing.JTable();
        BtnApellidosT = new javax.swing.JButton();
        LblPrivilegios3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tabla de incidencias DEMASE");
        setBackground(new java.awt.Color(56, 47, 128));

        jScrollPane1.setPreferredSize(new java.awt.Dimension(1366, 778));

        tabla2.setModel(new javax.swing.table.DefaultTableModel(
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
        tabla2.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tabla2.setCellSelectionEnabled(true);
        tabla2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabla2.setPreferredSize(new java.awt.Dimension(1366, 778));
        tabla2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                click(evt);
            }
        });
        jScrollPane1.setViewportView(tabla2);
        tabla2.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (tabla2.getColumnModel().getColumnCount() > 0) {
            tabla2.getColumnModel().getColumn(3).setPreferredWidth(200);
        }

        BtnApellidosT.setText("Buscar");
        BtnApellidosT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnApellidosTActionPerformed(evt);
            }
        });

        jButton1.setText("Nuevo articulo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1897, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnApellidosT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LblPrivilegios3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 49, Short.MAX_VALUE)
                .addComponent(LblPrivilegios3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnApellidosT)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1001, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void init2(){
    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
}
    private void BtnApellidosTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnApellidosTActionPerformed
   BuscadorStock tab = new BuscadorStock();
      tab.setVisible(true);
    }//GEN-LAST:event_BtnApellidosTActionPerformed

    private void click(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_click
        // TODO add your handling code here:
    }//GEN-LAST:event_click

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
RegistroDeIncidencias tab = new RegistroDeIncidencias();
                tab.setVisible(true);
                Parent.removeAll();
        Parent.add(PnlMateriales1);
        Parent.repaint();
        Parent.revalidate();
                if(LblPrivilegios3.getText().trim() == "Administrador"){
        LblPrivilegios.setText("Administrador");
    }
    dispose();     
    jButton4.setVisible(false);
jButton5.setVisible(false);

jButton9.setVisible(true);// TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(TablaStockR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TablaStockR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TablaStockR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TablaStockR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TablaStockR().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton BtnApellidosT;
    public static javax.swing.JLabel LblPrivilegios3;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable tabla2;
    // End of variables declaration//GEN-END:variables
private void seticon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage("src/img/icono.png"));
    }
}
