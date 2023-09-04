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
import static ventanas.RegistroDeIncidencias.Parent;
import static ventanas.RegistroDeIncidencias.PnlMateriales1;
import static ventanas.RegistroDeIncidencias.LblPrivilegios;

import static ventanas.RegistroDeIncidencias.jButton4;
import static ventanas.RegistroDeIncidencias.jButton5;
import static ventanas.RegistroDeIncidencias.jButton9;
import static ventanas.TablaStockR.LblPrivilegios3;

public class TablaInc extends javax.swing.JFrame {

    /**
     * Creates new form TablaInc
     */
    public TablaInc() {
        
        initComponents();
        
       
        seticon();
        
        
        
            try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://Localhost:3306/incidenciasdb", "root", "");
            String sql = "select * from incidencias"; 
            PreparedStatement pst = cn.prepareStatement(sql);
            ResultSet  rst = pst.executeQuery();
             
            
            
            
            
             try{
           
         DefaultTableModel model =(DefaultTableModel) tabla.getModel();
            tabla.setModel(DbUtils.resultSetToTableModel(rst));
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
                   
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } 
        
      tabla.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
        public void valueChanged(ListSelectionEvent event) {
            try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://Localhost:3306/incidenciasdb", "root", "");
            PreparedStatement pst = cn.prepareStatement("select * from incidencias where numincidencia = ?");
            pst.setString(1, tabla.getValueAt(tabla.getSelectedRow(), 0).toString().trim());

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                RegistroDeIncidencias rg = new RegistroDeIncidencias();
    rg.setVisible(true);
    if(LblPrivilegios1.getText().trim() == "Administrador"){
        LblPrivilegios.setText("Administrador");
    }
    dispose();
    
      
      String date = rs.getString("Fecha");
      java.util.Date date2 = new SimpleDateFormat("EEEE, d '/' MMMM '/' yyyy").parse(date);
                txt_codigo.setText(rs.getString("numincidencia"));
                txt_nombre.setText(rs.getString("nombre"));
                txt_telefono.setText(rs.getString("Numtelefono"));
                TxtApellidos.setText(rs.getString("Apellidos"));
                TxtDescripcion.setText(rs.getString("descripcion"));
                TxtInc.setText(rs.getString("EstadoInc"));
                
                CmbDispositivo.setSelectedItem(rs.getString("Aparato"));
                CmbInc.setSelectedItem(rs.getString("EstadoInc"));
                TxtDispositivo.setText(rs.getString("Aparato"));
                TxtMateriales.setText(rs.getString("Materiales"));
                TxtProcedimientos.setText(rs.getString("Procedimientos"));
                TxtObservaciones.setText(rs.getString("observaciones"));
                DcFecha.setDate(date2);
                CmbEmpleado.setSelectedItem(rs.getString("Empleado"));
                
                
            } else {
                JOptionPane.showMessageDialog(null, "Numero de telefono no registrado.");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
            System.out.println(tabla.getValueAt(tabla.getSelectedRow(), 0).toString());
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
        tabla = new javax.swing.JTable();
        BtnApellidosT = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        CmbVentanas = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        LblPrivilegios1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tabla de incidencias DEMASE");
        setBackground(new java.awt.Color(56, 47, 128));

        jScrollPane1.setPreferredSize(new java.awt.Dimension(1366, 778));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
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
        tabla.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tabla.setCellSelectionEnabled(true);
        tabla.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabla.setPreferredSize(new java.awt.Dimension(1366, 778));
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                click(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);
        tabla.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(3).setPreferredWidth(200);
        }

        BtnApellidosT.setText("Buscar");
        BtnApellidosT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnApellidosTActionPerformed(evt);
            }
        });

        jButton3.setText("Nueva");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel3.setText("Registrar incidencia");

        CmbVentanas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Login", "Registro de incidencias", "Registro de stock" }));

        jButton1.setText("Ir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Acerca de");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
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
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(56, 56, 56)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LblPrivilegios1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CmbVentanas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(CmbVentanas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(LblPrivilegios1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnApellidosT)
                    .addComponent(jButton3)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1001, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnApellidosTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnApellidosTActionPerformed
   Buscador tab = new Buscador();
      tab.setVisible(true);
    }//GEN-LAST:event_BtnApellidosTActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
RegistroDeIncidencias rg = new RegistroDeIncidencias();
    rg.setVisible(true);
    if(LblPrivilegios1.getText().trim() == "Administrador"){
        LblPrivilegios.setText("Administrador");
    }
    dispose();
    
    
    }//GEN-LAST:event_jButton3ActionPerformed

    private void click(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_click
        // TODO add your handling code here:
    }//GEN-LAST:event_click

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (CmbVentanas.getSelectedItem().toString().trim() == "Login") {
            PaginaInicio tab = new PaginaInicio();
            tab.setVisible(true);
            dispose();
            
        } 
        if(CmbVentanas.getSelectedItem().toString().trim() == "Registro de incidencias"){
            RegistroDeIncidencias tab = new RegistroDeIncidencias();
            tab.setVisible(true);
            if(LblPrivilegios1.getText().trim() == "Administrador"){
        LblPrivilegios.setText("Administrador");
    }
            dispose();
        }
        if(CmbVentanas.getSelectedItem().toString().trim() == "Registro de stock"){
            TablaStockR tab = new TablaStockR();
tab.setVisible(true);

            if(LblPrivilegios1.getText().trim() == "Administrador"){
        LblPrivilegios3.setText("Administrador");
    }
            dispose();
             
        }
        if(CmbVentanas.getSelectedItem().toString().trim() == "Registro de usuarios"){
            TablaEmp tab = new TablaEmp();
            tab.setVisible(true);
            dispose();
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
AcercaDe tab = new AcercaDe();
tab.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(TablaInc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TablaInc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TablaInc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TablaInc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TablaInc().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton BtnApellidosT;
    public static javax.swing.JComboBox<String> CmbVentanas;
    public static javax.swing.JLabel LblPrivilegios1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
private void seticon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage("src/img/icono.png"));
    }

}
