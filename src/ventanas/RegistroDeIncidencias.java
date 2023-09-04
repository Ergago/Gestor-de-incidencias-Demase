/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;
import org.jdatepicker.JDatePicker;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilCalendarModel;
import org.jdatepicker.impl.UtilDateModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import org.jdatepicker.impl.*;
import org.jdatepicker.util.*;
import org.jdatepicker.*;
import static ventanas.Calendario.DateLabelFormatter;
import java.awt.Desktop;
import java.util.ArrayList;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.lang.Object;
import javax.swing.table.AbstractTableModel;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.HeadlessException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
//import org.apache.commons.dbutils.DbUtils;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Font;
import java.io.IOException;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import java.awt.*;    
import java.io.File;
import java.util.Properties;
import java.util.Scanner;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import static ventanas.TablaInc.CmbVentanas;
import static ventanas.TablaInc.LblPrivilegios1;
import static ventanas.TablaStockR.LblPrivilegios3;





  
public class RegistroDeIncidencias extends javax.swing.JFrame {

    boolean activador = false;
    
   
    /**
     * Creates new form RegistroAlumnos
     */
    public RegistroDeIncidencias() {
        seticon();
        
        
        initComponents();
        jButton9.setVisible(false);
        
        this.setLocationRelativeTo(null);
        
        
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Parent = new javax.swing.JPanel();
        PnlRegistro = new javax.swing.JPanel();
        BtnMod = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txt_telefono = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        BtnElim = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txt_codigo = new javax.swing.JTextField();
        label_status = new javax.swing.JLabel();
        BtnPDF = new javax.swing.JButton();
        LblApellidos = new javax.swing.JLabel();
        LblDescripcion = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        TxtDispositivo = new javax.swing.JLabel();
        CmbDispositivo = new javax.swing.JComboBox<>();
        TxtInc = new javax.swing.JLabel();
        CmbInc = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        TxtApellidos = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        TxtObservaciones = new javax.swing.JTextArea();
        DcFecha = new com.toedter.calendar.JDateChooser();
        jScrollPane6 = new javax.swing.JScrollPane();
        TxtDescripcion = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        CmbEmpleado = new javax.swing.JComboBox<>();
        LblPrivilegios = new javax.swing.JLabel();
        PnlProcedimientos = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TxtProcedimientos = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        TxtMateriales = new javax.swing.JTextArea();
        BtnReg1 = new javax.swing.JButton();
        BtnEliminar1 = new javax.swing.JButton();
        BtnLista1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        TxtHorasM = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        TxtPrecioTotal = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        TxtPrecioMateriales = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        PnlMateriales = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        TxtCantidadM = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TxtIDM = new javax.swing.JTextField();
        TxtNombreM = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        TxtDescripcionM = new javax.swing.JTextArea();
        TxtPrecioM = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        TxtCodigoM = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        PnlMateriales1 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        TxtCantidadM1 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        TxtIDM1 = new javax.swing.JTextField();
        TxtNombreM1 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        TxtDescripcionM1 = new javax.swing.JTextArea();
        BtnMod2 = new javax.swing.JButton();
        TxtPrecioM1 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        TxtCodigoM1 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        TxtIdentificador = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro de incidencias DEMASE");
        setBackground(new java.awt.Color(56, 47, 128));
        setForeground(new java.awt.Color(56, 47, 128));
        setName("Main"); // NOI18N
        setResizable(false);

        Parent.setPreferredSize(new java.awt.Dimension(886, 443));
        Parent.setLayout(new java.awt.CardLayout());

        PnlRegistro.setBackground(new java.awt.Color(56, 47, 128));

        BtnMod.setText("Aceptar");
        BtnMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModActionPerformed(evt);
            }
        });

        jLabel2.setText("Teléfono:");

        txt_telefono.setNextFocusableComponent(TxtDescripcion);
        txt_telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_telefonoActionPerformed(evt);
            }
        });

        txt_nombre.setNextFocusableComponent(TxtApellidos);
        txt_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre:");

        BtnElim.setText("Eliminar");
        BtnElim.setMaximumSize(new java.awt.Dimension(0, 0));
        BtnElim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnElimActionPerformed(evt);
            }
        });

        jLabel3.setText("código de la incidencia: ");

        txt_codigo.setEditable(false);
        txt_codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_codigoActionPerformed(evt);
            }
        });

        label_status.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        BtnPDF.setText("Generar PDF");
        BtnPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPDFActionPerformed(evt);
            }
        });

        LblApellidos.setText("Apellidos:");

        LblDescripcion.setText("Descripcion:");

        jLabel10.setText("Dispositivo de la incidencia:");

        jLabel8.setText("Fecha:");

        TxtDispositivo.setForeground(new java.awt.Color(255, 0, 0));

        CmbDispositivo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PC", "Portatil", "Impresora", "Movil", "Tablet", "Televisor/monitor", "Consola", "Componente", "Otros", " " }));

        TxtInc.setForeground(new java.awt.Color(255, 0, 0));

        CmbInc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activa", "Resuelta", "Devuelta", "Esperando piezas", "Envio de garantia", "Facturada" }));
        CmbInc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmbIncActionPerformed(evt);
            }
        });

        jLabel6.setText("Estado de la incidencia:");

        jButton1.setText("Lista de incidencias");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        TxtApellidos.setNextFocusableComponent(txt_telefono);
        TxtApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtApellidosActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/descarga.png"))); // NOI18N

        jLabel9.setText("Observaciones:");

        TxtObservaciones.setColumns(20);
        TxtObservaciones.setLineWrap(true);
        TxtObservaciones.setRows(5);
        TxtObservaciones.setWrapStyleWord(true);
        TxtObservaciones.setNextFocusableComponent(txt_nombre);
        jScrollPane4.setViewportView(TxtObservaciones);

        TxtDescripcion.setColumns(20);
        TxtDescripcion.setLineWrap(true);
        TxtDescripcion.setRows(5);
        TxtDescripcion.setWrapStyleWord(true);
        jScrollPane6.setViewportView(TxtDescripcion);

        jLabel4.setText("Empleado:");

        CmbEmpleado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Abián Barreto", "Arón García", "Oscar Martín", "Ariana González" }));

        javax.swing.GroupLayout PnlRegistroLayout = new javax.swing.GroupLayout(PnlRegistro);
        PnlRegistro.setLayout(PnlRegistroLayout);
        PnlRegistroLayout.setHorizontalGroup(
            PnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlRegistroLayout.createSequentialGroup()
                .addGroup(PnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlRegistroLayout.createSequentialGroup()
                        .addGroup(PnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txt_telefono, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                                .addComponent(txt_nombre)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(LblDescripcion))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LblApellidos)
                            .addComponent(TxtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(DcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnPDF))
                        .addGroup(PnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PnlRegistroLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PnlRegistroLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CmbEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(LblPrivilegios, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PnlRegistroLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(PnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(PnlRegistroLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PnlRegistroLayout.createSequentialGroup()
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(PnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PnlRegistroLayout.createSequentialGroup()
                                        .addGroup(PnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10)
                                            .addComponent(CmbDispositivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(PnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(TxtDispositivo)))
                                    .addGroup(PnlRegistroLayout.createSequentialGroup()
                                        .addGroup(PnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(CmbInc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(PnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(PnlRegistroLayout.createSequentialGroup()
                                                .addGap(138, 138, 138)
                                                .addComponent(label_status))
                                            .addGroup(PnlRegistroLayout.createSequentialGroup()
                                                .addComponent(BtnMod)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(BtnElim, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton1))
                                            .addComponent(TxtInc)))))
                            .addGroup(PnlRegistroLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(544, Short.MAX_VALUE))
        );
        PnlRegistroLayout.setVerticalGroup(
            PnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlRegistroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(LblApellidos)
                    .addComponent(jLabel4))
                .addGap(9, 9, 9)
                .addGroup(PnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CmbEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblPrivilegios))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel8)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlRegistroLayout.createSequentialGroup()
                        .addGroup(PnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnMod)
                            .addComponent(BtnPDF)
                            .addComponent(BtnElim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addGap(18, 18, 18)
                        .addGroup(PnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(TxtInc))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CmbInc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_status))
                        .addGroup(PnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlRegistroLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PnlRegistroLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(TxtDispositivo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CmbDispositivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43))))
                    .addGroup(PnlRegistroLayout.createSequentialGroup()
                        .addComponent(LblDescripcion)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addGroup(PnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        Parent.add(PnlRegistro, "card2");

        PnlProcedimientos.setBackground(new java.awt.Color(56, 47, 128));

        jLabel11.setText("Describe los procedimientos realizados:");

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        TxtProcedimientos.setColumns(20);
        TxtProcedimientos.setLineWrap(true);
        TxtProcedimientos.setRows(5);
        TxtProcedimientos.setWrapStyleWord(true);
        jScrollPane2.setViewportView(TxtProcedimientos);

        TxtMateriales.setColumns(20);
        TxtMateriales.setRows(5);
        jScrollPane3.setViewportView(TxtMateriales);

        BtnReg1.setText("Aceptar");
        BtnReg1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnReg1ActionPerformed(evt);
            }
        });

        BtnEliminar1.setText("Eliminar");
        BtnEliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminar1ActionPerformed(evt);
            }
        });

        BtnLista1.setText("Lista de incidencias");
        BtnLista1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLista1ActionPerformed(evt);
            }
        });

        jLabel13.setText("Materiales:");

        jButton7.setText("Añadir materiales");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel14.setText("Horas trabajadas:");

        TxtPrecioTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtPrecioTotalActionPerformed(evt);
            }
        });

        jLabel19.setText("Precio total:");

        jButton3.setText("Guardar precio final");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        TxtPrecioMateriales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtPrecioMaterialesActionPerformed(evt);
            }
        });

        jLabel20.setText("Precio de los materiales:");

        javax.swing.GroupLayout PnlProcedimientosLayout = new javax.swing.GroupLayout(PnlProcedimientos);
        PnlProcedimientos.setLayout(PnlProcedimientosLayout);
        PnlProcedimientosLayout.setHorizontalGroup(
            PnlProcedimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlProcedimientosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnlProcedimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PnlProcedimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addGroup(PnlProcedimientosLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PnlProcedimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnEliminar1)
                            .addComponent(BtnLista1)
                            .addComponent(BtnReg1)
                            .addGroup(PnlProcedimientosLayout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel20))
                            .addComponent(jButton7)
                            .addGroup(PnlProcedimientosLayout.createSequentialGroup()
                                .addGroup(PnlProcedimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(TxtHorasM, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(TxtPrecioTotal, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGroup(PnlProcedimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PnlProcedimientosLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton3))
                                    .addGroup(PnlProcedimientosLayout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(TxtPrecioMateriales, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PnlProcedimientosLayout.setVerticalGroup(
            PnlProcedimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlProcedimientosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnlProcedimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PnlProcedimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlProcedimientosLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jButton7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnReg1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnEliminar1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnLista1)
                        .addGap(44, 44, 44)
                        .addGroup(PnlProcedimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jLabel20))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PnlProcedimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtHorasM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtPrecioMateriales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel19)
                        .addGap(8, 8, 8)
                        .addGroup(PnlProcedimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtPrecioTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(151, Short.MAX_VALUE))
        );

        Parent.add(PnlProcedimientos, "card3");

        PnlMateriales.setBackground(new java.awt.Color(56, 47, 128));

        jLabel12.setText("Enumera los materiales utilizados:");

        jButton8.setText("Manda los datos al registro");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton2.setText("Registro de Inventario");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel5.setText("Cantidad");

        TxtIDM.setEditable(false);
        TxtIDM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtIDMActionPerformed(evt);
            }
        });

        TxtNombreM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNombreMActionPerformed(evt);
            }
        });

        jLabel16.setText("ID");

        jLabel17.setText("Nombre");

        jLabel18.setText("Descripcion del producto");

        TxtDescripcionM.setColumns(20);
        TxtDescripcionM.setRows(5);
        jScrollPane8.setViewportView(TxtDescripcionM);

        jLabel15.setText("Precio");

        jLabel21.setText("Codigo");

        javax.swing.GroupLayout PnlMaterialesLayout = new javax.swing.GroupLayout(PnlMateriales);
        PnlMateriales.setLayout(PnlMaterialesLayout);
        PnlMaterialesLayout.setHorizontalGroup(
            PnlMaterialesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlMaterialesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnlMaterialesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtCantidadM, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PnlMaterialesLayout.createSequentialGroup()
                        .addGroup(PnlMaterialesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PnlMaterialesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                                .addComponent(TxtIDM))
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtNombreM, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtPrecioM, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(PnlMaterialesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton8)
                            .addGroup(PnlMaterialesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(TxtCodigoM, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PnlMaterialesLayout.setVerticalGroup(
            PnlMaterialesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlMaterialesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel16)
                .addGap(1, 1, 1)
                .addGroup(PnlMaterialesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtIDM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PnlMaterialesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtNombreM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtCantidadM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PnlMaterialesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PnlMaterialesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtPrecioM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtCodigoM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jLabel18)
                .addGap(7, 7, 7)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        Parent.add(PnlMateriales, "card4");

        PnlMateriales1.setBackground(new java.awt.Color(56, 47, 128));

        jLabel22.setText("Datos del producto:");

        jButton6.setText("Registro de Inventario");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel23.setText("Cantidad");

        TxtIDM1.setEditable(false);
        TxtIDM1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtIDM1ActionPerformed(evt);
            }
        });

        TxtNombreM1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNombreM1ActionPerformed(evt);
            }
        });

        jLabel24.setText("ID");

        jLabel25.setText("Nombre");

        jLabel26.setText("Descripcion del producto");

        TxtDescripcionM1.setColumns(20);
        TxtDescripcionM1.setRows(5);
        jScrollPane9.setViewportView(TxtDescripcionM1);

        BtnMod2.setText("Aceptar");
        BtnMod2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMod2ActionPerformed(evt);
            }
        });

        jLabel27.setText("Precio");

        jLabel28.setText("Codigo");

        TxtIdentificador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtIdentificadorActionPerformed(evt);
            }
        });

        jLabel29.setText("Identificador de compra");

        javax.swing.GroupLayout PnlMateriales1Layout = new javax.swing.GroupLayout(PnlMateriales1);
        PnlMateriales1.setLayout(PnlMateriales1Layout);
        PnlMateriales1Layout.setHorizontalGroup(
            PnlMateriales1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlMateriales1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnlMateriales1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PnlMateriales1Layout.createSequentialGroup()
                        .addGroup(PnlMateriales1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PnlMateriales1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                                .addComponent(TxtIDM1))
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtNombreM1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtPrecioM1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtCantidadM1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23))
                        .addGap(31, 31, 31)
                        .addGroup(PnlMateriales1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BtnMod2)
                            .addComponent(TxtCodigoM1)
                            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29)
                            .addComponent(TxtIdentificador))))
                .addGap(841, 856, Short.MAX_VALUE))
        );
        PnlMateriales1Layout.setVerticalGroup(
            PnlMateriales1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlMateriales1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel24)
                .addGap(1, 1, 1)
                .addGroup(PnlMateriales1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtIDM1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnMod2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PnlMateriales1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(jButton6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtNombreM1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PnlMateriales1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jLabel29))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PnlMateriales1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtCantidadM1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtIdentificador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PnlMateriales1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(jLabel28))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PnlMateriales1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtPrecioM1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtCodigoM1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jLabel26)
                .addGap(7, 7, 7)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        Parent.add(PnlMateriales1, "card4");

        jPanel2.setBackground(new java.awt.Color(56, 47, 128));

        jButton4.setText("Formulario de registro");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Procedimientos");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton9.setText("Lista de incidencias");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Parent, javax.swing.GroupLayout.DEFAULT_SIZE, 1329, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Parent, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
double precio = 0;
    private void BtnModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModActionPerformed
String data = txt_codigo.getText().trim();
        
        if(!data.equals("")) {String title = "Advertencia";
    
        String message = "¿Estás seguro de que quieres modificar este registro?";
        int reply = JOptionPane.showConfirmDialog(null, message, title, JOptionPane.YES_NO_OPTION);
if (reply == JOptionPane.YES_OPTION) {
        SimpleDateFormat formateador = new SimpleDateFormat("EEEE, d '/' MMMM '/' yyyy");
        String fecha = formateador.format(DcFecha.getDate());
        try {
            String ID = txt_codigo.getText().trim();

            Connection cn = DriverManager.getConnection("jdbc:mysql://Localhost:3306/incidenciasdb", "root", "");
            PreparedStatement pst = cn.prepareStatement("update incidencias set nombre = ? where numincidencia = " + ID);
            PreparedStatement pst2 =cn.prepareStatement("update incidencias set Numtelefono = ? where numincidencia = " + ID);
            PreparedStatement pst3 =cn.prepareStatement("update incidencias set Apellidos = ? where numincidencia = " + ID);
            PreparedStatement pst4 =cn.prepareStatement("update incidencias set descripcion = ? where numincidencia = " + ID);
            PreparedStatement pst5 =cn.prepareStatement("update incidencias set EstadoInc = ? where numincidencia = " + ID);
            PreparedStatement pst6 =cn.prepareStatement("update incidencias set Fecha = ? where numincidencia = " + ID);
            PreparedStatement pst7 =cn.prepareStatement("update incidencias set Aparato = ? where numincidencia = " + ID);
            PreparedStatement pst8 =cn.prepareStatement("update incidencias set Materiales = ? where numincidencia = " + ID);
            PreparedStatement pst9 =cn.prepareStatement("update incidencias set Procedimientos = ? where numincidencia = " + ID);
            PreparedStatement pst10 = cn.prepareStatement("update incidencias set observaciones = ? where numincidencia = " + ID);
            PreparedStatement pst11 = cn.prepareStatement("update incidencias set Empleado = ? where numincidencia = " + ID);
            pst.setString(1, txt_nombre.getText().trim());
            pst2.setString(1, txt_telefono.getText().trim());
            pst3.setString(1, TxtApellidos.getText().trim());
            pst4.setString(1, TxtDescripcion.getText().trim());
            pst5.setString(1, CmbInc.getSelectedItem().toString().trim());
            pst6.setString(1, fecha);
            pst7.setString(1, CmbDispositivo.getSelectedItem().toString().trim());
            pst8.setString(1, TxtMateriales.getText().trim());
            pst9.setString(1,TxtProcedimientos.getText().trim());
            pst10.setString(1, TxtObservaciones.getText().trim());
            pst11.setString(1, CmbEmpleado.getSelectedItem().toString().trim());
            pst.executeUpdate();
            pst2.executeUpdate();
            pst3.executeUpdate();
            pst4.executeUpdate();
            pst5.executeUpdate();
            pst6.executeUpdate();
            pst7.executeUpdate();
            pst8.executeUpdate();
            pst9.executeUpdate();
            pst10.executeUpdate();
            pst11.executeUpdate();
            label_status.setText("modificacion exitosa");
        } catch (Exception e) {
            System.out.println(e);
        }
        } else {
    JOptionPane.showMessageDialog(null, "operacion cancelada");
    
}
} else if(data.equals("")){
    SimpleDateFormat formateador = new SimpleDateFormat("EEEE, d '/' MMMM '/' yyyy");
        String fecha = formateador.format(DcFecha.getDate());
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://Localhost:3306/incidenciasdb", "root", "");
            PreparedStatement pst = cn.prepareStatement("insert into incidencias values(?,?,?,?,?,?,?,?,?,?,?,?)");
            Statement stmt=cn.createStatement();  
            ResultSet rs=stmt.executeQuery("select * from incidencias");
            int id = 0;
            while(rs.next()){
                 id= rs.getInt(1);
                 System.out.println(id);
            }
            pst.setInt(1, id + 1);
            pst.setString(2, txt_nombre.getText().trim());
            pst.setString(5, TxtDescripcion.getText());
            pst.setString(4, txt_telefono.getText().trim());
            pst.setString(3, TxtApellidos.getText().trim());
            pst.setString(6, CmbInc.getSelectedItem().toString().trim());
            pst.setString(7, fecha);
            pst.setString(8, CmbDispositivo.getSelectedItem().toString().trim());
            pst.setString(9,TxtMateriales.getText().trim());
            pst.setString(10, TxtProcedimientos.getText().trim());
            pst.setString(11,TxtObservaciones.getText().trim());
            pst.setString(12,CmbEmpleado.getSelectedItem().toString().trim());
            pst.executeUpdate();

            txt_nombre.setText("");
            txt_telefono.setText("");
            TxtDescripcion.setText("");
            TxtApellidos.setText("");
            TxtInc.setText("");
            
            TxtMateriales.setText("");
            TxtProcedimientos.setText("");
            TxtObservaciones.setText("");
            DcFecha.setCalendar(null);
            /*DefaultTableModel dtm = (DefaultTableModel) TblMateriales.getModel();
            dtm.setRowCount(0);
            dtm.setRowCount(10);*/
            
            label_status.setText("Registro exitoso.");
        } catch (Exception e) {
        System.out.println(e);
        }
}
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnModActionPerformed

    private void BtnElimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnElimActionPerformed
        String title = "Advertencia";
        String message = "¿Estás seguro de que quieres eliminar este registro?";
        int reply = JOptionPane.showConfirmDialog(null, message, title, JOptionPane.YES_NO_OPTION);
if (reply == JOptionPane.YES_OPTION) {
    try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://Localhost:3306/incidenciasdb", "root", "");
            PreparedStatement pst = cn.prepareStatement("delete from incidencias where numincidencia = ?");
            
            pst.setString(1, txt_codigo.getText().trim());
            pst.executeUpdate();
            
            txt_nombre.setText("");
            txt_telefono.setText("");
            TxtApellidos.setText("");
            TxtDescripcion.setText("");
            txt_codigo.setText("");
            TxtInc.setText("");
            
            TxtMateriales.setText("");
            TxtProcedimientos.setText("");
            TxtObservaciones.setText("");
            DcFecha.setCalendar(null);
            //DefaultTableModel dtm = (DefaultTableModel) TblMateriales.getModel();
            //dtm.setRowCount(0);
            //dtm.setRowCount(10);
            
            label_status.setText("registro eliminado");
            
        } catch (Exception e) {
            System.out.println(e);
        }
} else {
    JOptionPane.showMessageDialog(null, "operacion cancelada");
    
}
        

    }//GEN-LAST:event_BtnElimActionPerformed

    private void BtnPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPDFActionPerformed
           
            
            
            
            Document documento = new Document();
            try {
            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/desktop/reporte.pdf"));
            
            
            
            try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://Localhost:3306/incidenciasdb", "root", "");
            PreparedStatement pst = cn.prepareStatement("select * from incidencias where numincidencia = ?");
            pst.setString(1, txt_codigo.getText().trim());
            
            ResultSet rs = pst.executeQuery();
            
            if (rs.next()) {
                Image header = Image.getInstance("src/img/descarga.png");
            header.scaleToFit(100, 50);
            header.setAlignment(Chunk.ALIGN_LEFT);
            
            Paragraph parrafo = new Paragraph();
            Paragraph parrafo1 = new Paragraph();
            Paragraph parrafo2 = new Paragraph();
            Paragraph parrafo3 = new Paragraph();
            Paragraph parrafo4 = new Paragraph();
            Paragraph parrafo5 = new Paragraph();
            Paragraph parrafo6 = new Paragraph();
            Paragraph parrafo7 = new Paragraph();
            parrafo3.setFont(FontFactory.getFont("Tahoma", 11, Font.BOLD, BaseColor.BLACK));
            parrafo4.setFont(FontFactory.getFont("Tahoma",8, Font.NORMAL, BaseColor.BLACK));
            parrafo5.setFont(FontFactory.getFont("Tahoma", 11, Font.BOLD, BaseColor.BLACK));
            parrafo6.setFont(FontFactory.getFont("Tahoma", 11, Font.BOLD, BaseColor.BLACK));
            parrafo7.setFont(FontFactory.getFont("Tahoma", 11, Font.BOLD, BaseColor.BLACK));
            
            parrafo.setAlignment(Paragraph.ALIGN_LEFT);
            
            parrafo.add("Calle Tanausú 6                                                  Informe de incidencia          Nº Parte:   " + rs.getString(1)  + "\n");
            parrafo.add("38760 El Paso                                                     Nombre:  " + rs.getString(2) + " " + rs.getString(3) + "\n");
            parrafo.add("Santa cruz de Tenerife                                        Teléfono:      " + rs.getString(4) + "\n");
            parrafo.add("E-mail: serviciotecnico@demase.org                  Fecha:      " + rs.getString(7) + "\n");
            parrafo.add("TLF/FAX: 34 922497151 / 34 922497142 \n");
            parrafo1.setAlignment(Paragraph.ALIGN_CENTER);
            parrafo1.setFont(FontFactory.getFont("Tahoma", 15, Font.BOLD, BaseColor.BLACK));
            parrafo1.add("APARATO:\n\n");
            parrafo1.setAlignment(Paragraph.ALIGN_LEFT);
            parrafo2.add(rs.getString(8) + "\n\n");
            parrafo3.add("DESCRIPCION");
            parrafo4.add("EL ARTÍCULO 12 DE LA LEY 7/1996, DEL 15 DE ENERO, DE "
                    + "ORDENACIÓN DE COMERCIO MINORISTA ESTABLECE QUE LA ACCIÓN O DERECHO"
                    + " DE RECUPERACIÓN DE LOS BIENES ENTREGADOS POR EL CONSUMIDOR O USUARIO "
                    + "AL COMERCIANTE PARA SU REPARACION PRESCRIBIRÁ A LOS 3 AÑOS A PARTIR "
                    + "DEL MOMENTO DE LA ENTREGA, SIN EMBARGO, EXISTE UNA NORMATIVA INTERNA "
                    + "NO SE HACE CARGO DEL ALMACENAMIENTO DE LOS EQUIPOS PASADOS LOS 6 MESES "
                    + "A PARTIR DE LA ENTREGA");
            parrafo5.add("Estado de la incidencia");
            parrafo6.add("MATERIALESs=> \n Codigo/Descripcion/Cantidad");
            parrafo7.add("PROCEDIMIENTOS");
            
            
            documento.open();
            documento.add(header);
            documento.add(parrafo);
            documento.add(parrafo1);
            documento.add(parrafo2);
            
            
            PdfPTable tabla = new PdfPTable(1);
            PdfPTable tabla1 = new PdfPTable(1);
            PdfPTable tabla2 = new PdfPTable(1);
            PdfPTable tabla3 = new PdfPTable(2);
            
            
            
            
            tabla.addCell( parrafo3);
            
            tabla1.addCell(parrafo6);
            tabla1.addCell(rs.getString(9) + "\n\n\n\n\n\n\n");
            tabla1.addCell(parrafo7);
            tabla1.addCell(rs.getString(10) + "\n\n\n\n\n\n\n\n\n");
            tabla3.addCell(" FIRMA CLIENTE \n\n\n\n\n\n");
            tabla3.addCell(" EMPRESA \n\n\n\n\n\n");
            /*tabla.addCell("Estado de la incidencia");
            tabla.addCell("Fecha");
            tabla.addCell("Aparato");
            tabla.addCell("Materiales");
            tabla.addCell("Procedimientos");
            */
            do {
            
            
            tabla.addCell(rs.getString(5) +"\n\n\n\n\n\n\n");
            
            
            
            tabla2.addCell("Nota: La reparacion tiene garantía total de 1 mes. DEMASE"
                    + " ELECTRONICA no se hace responsable del tratamiento de datos de los "
                    + "dispositivos móviles, discos duros, pendrives y cualquier otro medio "
                    + "de almacenamiento. Es responsabilidad del cliente tener copia de "
                    + "seguridad de sus datos.");
            tabla2.addCell(parrafo4);
           /* tabla.addCell(rs.getString(6));
            tabla.addCell(rs.getString(7));
            tabla.addCell(rs.getString(8));
            tabla.addCell(rs.getString(9));
            tabla.addCell(rs.getString(10));*/
            } while (rs.next());
            documento.add(tabla);
            documento.add(tabla1);
            documento.add(tabla2);
            documento.add(tabla3);
            
            } else {
            }
            } catch (DocumentException | SQLException e) {
            System.out.println(e);
            }
            documento.close();
            JOptionPane.showMessageDialog(null, "reporte creado");
            } catch (DocumentException | HeadlessException | FileNotFoundException e) {
            System.out.println(e);
            }catch(IOException e){
            System.out.println(e);
            
            }
            
       
            String file = "C:\\Users\\Usuario\\Desktop\\reporte.pdf";
           Desktop desktop = Desktop.getDesktop();
        try {
            desktop.print(new File(file));
    } catch (IOException ex) {
            Logger.getLogger(RegistroDeIncidencias.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BtnPDFActionPerformed

    private void txt_telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_telefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_telefonoActionPerformed

    private void TxtApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtApellidosActionPerformed

    private void txt_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      TablaInc tab = new TablaInc();
      tab.setVisible(true);
      if(LblPrivilegios.getText().trim() == "Administrador"){
        LblPrivilegios1.setText("Administrador");
        CmbVentanas.addItem("Registro de usuarios");
    }
      dispose();
      txt_codigo.setText(null);
      
      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_codigo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_codigo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_codigo1ActionPerformed

    private void CmbIncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmbIncActionPerformed
        
    }//GEN-LAST:event_CmbIncActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Parent.removeAll();
        Parent.add(PnlProcedimientos);
        Parent.repaint();
        Parent.revalidate();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Parent.removeAll();
        Parent.add(PnlRegistro);
        Parent.repaint();
        Parent.revalidate();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void BtnReg1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnReg1ActionPerformed
String data = txt_codigo.getText().trim();
        
        if(!data.equals("")) {String title = "Advertencia";
    
        String message = "¿Estás seguro de que quieres modificar este registro?";
        int reply = JOptionPane.showConfirmDialog(null, message, title, JOptionPane.YES_NO_OPTION);
if (reply == JOptionPane.YES_OPTION) {
        SimpleDateFormat formateador = new SimpleDateFormat("EEEE, d '/' MMMM '/' yyyy");
        String fecha = formateador.format(DcFecha.getDate());
        try {
            String ID = txt_codigo.getText().trim();

            Connection cn = DriverManager.getConnection("jdbc:mysql://Localhost:3306/incidenciasdb", "root", "");
            PreparedStatement pst = cn.prepareStatement("update incidencias set nombre = ? where numincidencia = " + ID);
            PreparedStatement pst2 =cn.prepareStatement("update incidencias set Numtelefono = ? where numincidencia = " + ID);
            PreparedStatement pst3 =cn.prepareStatement("update incidencias set Apellidos = ? where numincidencia = " + ID);
            PreparedStatement pst4 =cn.prepareStatement("update incidencias set descripcion = ? where numincidencia = " + ID);
            PreparedStatement pst5 =cn.prepareStatement("update incidencias set EstadoInc = ? where numincidencia = " + ID);
            PreparedStatement pst6 =cn.prepareStatement("update incidencias set Fecha = ? where numincidencia = " + ID);
            PreparedStatement pst7 =cn.prepareStatement("update incidencias set Aparato = ? where numincidencia = " + ID);
            PreparedStatement pst8 =cn.prepareStatement("update incidencias set Materiales = ? where numincidencia = " + ID);
            PreparedStatement pst9 =cn.prepareStatement("update incidencias set Procedimientos = ? where numincidencia = " + ID);
            PreparedStatement pst10 = cn.prepareStatement("update incidencias set observaciones = ? where numincidencia = " + ID);
            PreparedStatement pst11 = cn.prepareStatement("update incidencias set Empleado = ? where numincidencia = " + ID);
            pst.setString(1, txt_nombre.getText().trim());
            pst2.setString(1, txt_telefono.getText().trim());
            pst3.setString(1, TxtApellidos.getText().trim());
            pst4.setString(1, TxtDescripcion.getText().trim());
            pst5.setString(1, CmbInc.getSelectedItem().toString().trim());
            pst6.setString(1, fecha);
            pst7.setString(1, CmbDispositivo.getSelectedItem().toString().trim());
            pst8.setString(1, TxtMateriales.getText().trim());
            pst9.setString(1,TxtProcedimientos.getText().trim());
            pst10.setString(1, TxtObservaciones.getText().trim());
            pst11.setString(1, CmbEmpleado.getSelectedItem().toString().trim());
            pst.executeUpdate();
            pst2.executeUpdate();
            pst3.executeUpdate();
            pst4.executeUpdate();
            pst5.executeUpdate();
            pst6.executeUpdate();
            pst7.executeUpdate();
            pst8.executeUpdate();
            pst9.executeUpdate();
            pst10.executeUpdate();
            pst11.executeUpdate();
            label_status.setText("modificacion exitosa");
        } catch (Exception e) {
            System.out.println(e);
        }
        } else {
    JOptionPane.showMessageDialog(null, "operacion cancelada");
    
}
} else if(data.equals("")){
    SimpleDateFormat formateador = new SimpleDateFormat("EEEE, d '/' MMMM '/' yyyy");
        String fecha = formateador.format(DcFecha.getDate());
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://Localhost:3306/incidenciasdb", "root", "");
            PreparedStatement pst = cn.prepareStatement("insert into incidencias values(?,?,?,?,?,?,?,?,?,?,?,?)");
            Statement stmt=cn.createStatement();  
            ResultSet rs=stmt.executeQuery("select * from incidencias");
            int id = 0;
            while(rs.next()){
                 id= rs.getInt(1);
                 System.out.println(id);
            }
            pst.setInt(1, id + 1);
            pst.setString(2, txt_nombre.getText().trim());
            pst.setString(5, TxtDescripcion.getText());
            pst.setString(4, txt_telefono.getText().trim());
            pst.setString(3, TxtApellidos.getText().trim());
            pst.setString(6, CmbInc.getSelectedItem().toString().trim());
            pst.setString(7, fecha);
            pst.setString(8, CmbDispositivo.getSelectedItem().toString().trim());
            pst.setString(9,TxtMateriales.getText().trim());
            pst.setString(10, TxtProcedimientos.getText().trim());
            pst.setString(11,TxtObservaciones.getText().trim());
            pst.setString(12,CmbEmpleado.getSelectedItem().toString().trim());
            pst.executeUpdate();

            txt_nombre.setText("");
            txt_telefono.setText("");
            TxtDescripcion.setText("");
            TxtApellidos.setText("");
            TxtInc.setText("");
            
            TxtMateriales.setText("");
            TxtProcedimientos.setText("");
            TxtObservaciones.setText("");
            DcFecha.setCalendar(null);
            //DefaultTableModel dtm = (DefaultTableModel) TblMateriales.getModel();
            /*dtm.setRowCount(0);
            dtm.setRowCount(10);*/
            
            label_status.setText("Registro exitoso.");
        } catch (Exception e) {
        System.out.println(e);
        }
}
    }//GEN-LAST:event_BtnReg1ActionPerformed

    private void BtnEliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminar1ActionPerformed
       String title = "Advertencia";
        String message = "¿Estás seguro de que quieres eliminar este registro?";
        int reply = JOptionPane.showConfirmDialog(null, message, title, JOptionPane.YES_NO_OPTION);
if (reply == JOptionPane.YES_OPTION) {
    try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://Localhost:3306/incidenciasdb", "root", "");
            PreparedStatement pst = cn.prepareStatement("delete from incidencias where numincidencia = ?");
            
            pst.setString(1, txt_codigo.getText().trim());
            pst.executeUpdate();
            
            txt_nombre.setText("");
            txt_telefono.setText("");
            TxtApellidos.setText("");
            TxtDescripcion.setText("");
            txt_codigo.setText("");
            TxtInc.setText("");
            
            TxtMateriales.setText("");
            TxtProcedimientos.setText("");
            TxtObservaciones.setText("");
            DcFecha.setCalendar(null);
           // DefaultTableModel dtm = (DefaultTableModel) TblMateriales.getModel();
            //dtm.setRowCount(0);
            //dtm.setRowCount(10);
            
            label_status.setText("registro eliminado");
            
        } catch (Exception e) {
            System.out.println(e);
        }
} else {
    JOptionPane.showMessageDialog(null, "operacion cancelada");
    
}
   
    }//GEN-LAST:event_BtnEliminar1ActionPerformed

    private void BtnLista1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLista1ActionPerformed
 TablaInc tab = new TablaInc();
      tab.setVisible(true);
      if(LblPrivilegios.getText().trim() == "Administrador"){
        LblPrivilegios1.setText("Administrador");
        CmbVentanas.addItem("Registro de usuarios");
    }
      dispose();
      txt_codigo.setText(null);
      
              // TODO add your handling code here:
    }//GEN-LAST:event_BtnLista1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

        Parent.removeAll();
        Parent.add(PnlMateriales);
        Parent.repaint();
        Parent.revalidate();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void txt_codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_codigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_codigoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
TablaStock tab = new TablaStock();
tab.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    String TextoFinal = "";
    
    
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed

        System.out.println(precio);
        double resta = 0;
        String ID = TxtIDM.getText().trim();
try{
    Connection con = DriverManager.getConnection("jdbc:mysql://Localhost:3306/incidenciasdb", "root", "");
            PreparedStatement pst1 = con.prepareStatement("select * from stock where ID = ?");
            
            pst1.setString(1, TxtIDM.getText().trim());
            
            
            

            ResultSet rs = pst1.executeQuery();
            if(rs.next()){
               //System.out.println(rs.getString("Cantidad")); 
            }
            
            
            //System.out.println("aqui");
            if(Double.parseDouble(rs.getString("Cantidad"))- Double.parseDouble(TxtCantidadM.getText()) >= 0){
                //System.out.println(Integer.parseInt(rs.getString("cantidad")));
                try{
                    precio += Double.parseDouble(TxtPrecioM.getText()) * Integer.parseInt(TxtCantidadM.getText());
                resta = Double.parseDouble(rs.getString("Cantidad")) - Double.parseDouble(TxtCantidadM.getText());
                }catch(Exception e){
                    System.out.println(e);
                }
                String message = "¿Estás seguro de que quieres añadir estos articulos?(se restarán del stock)";
        int reply = JOptionPane.showConfirmDialog(null, message, "", JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.YES_OPTION) {
                 try{
                Connection cn = DriverManager.getConnection("jdbc:mysql://Localhost:3306/incidenciasdb", "root", "");
                PreparedStatement pst = cn.prepareStatement("update stock set Cantidad = ? where ID = " + ID);
                    // System.out.println(String.valueOf(resta));
                pst.setString(1, String.valueOf(resta));
                pst.executeUpdate();
                TextoMateriales();
TextoFinal += "Codigo de producto: " + TxtIDM.getText().trim() + "\n";
TextoFinal += "Nombre: " + TxtNombreM.getText().trim() + "\n";
TextoFinal += "Cantidad usada: " + TxtCantidadM.getText().trim() + "\n";
TextoFinal += "Codigo del producto usado: " + TxtCodigoM.getText().trim() + "\n";
TextoFinal += "Descripcion del producto: " + TxtDescripcionM.getText().trim() + "\n\n";


TxtMateriales.setText(TextoFinal);
TxtPrecioMateriales.setText(String.valueOf(precio));
            }catch(Exception e){
                System.out.println(e);
            }
                }else{
                    JOptionPane.showMessageDialog(null, "operacion cancelada");
                }
            }else{
                JOptionPane.showMessageDialog(null, "No hay suficientes unidades en stock");
            }
            
}catch(Exception e){
    System.out.println(e);
}

           
        
        /*String data = "";
        String out = "";

        for (int row = 0; row < TblMateriales.getRowCount(); row++){

            for (int column = 0; column < TblMateriales.getColumnCount(); column++){
                if(TblMateriales.getValueAt(row,column) != null){
                    data += TblMateriales.getValueAt(row, column).toString() + " / ";
                }

            }
            data += "\n";
            out = data;

        }*/
        //TxtMateriales.setText(out);
        Parent.removeAll();
        Parent.add(PnlProcedimientos);
        Parent.repaint();
        Parent.revalidate();
        TxtDescripcionM.setText(null);
        TxtPrecioM.setText(null);
        TxtCantidadM.setText(null);
        TxtNombreM.setText(null);
        TxtIDM.setText(null);
        //DefaultTableModel dtm = (DefaultTableModel) TblMateriales.getModel();
        /*dtm.setRowCount(0);
        dtm.setRowCount(10);// TODO add your handling code here:*/
    }//GEN-LAST:event_jButton8ActionPerformed

    private void TxtIDMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtIDMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtIDMActionPerformed

    private void TxtNombreMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNombreMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNombreMActionPerformed

    private void TxtPrecioTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtPrecioTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPrecioTotalActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        TxtPrecioTotal.setText(String.valueOf(precio + (Integer.parseInt(TxtHorasM.getText()) * 8)));
        TextoFinal += String.valueOf(precio + (Integer.parseInt(TxtHorasM.getText()) * 8)) + " euros";
        TxtMateriales.setText(TextoFinal );
    }//GEN-LAST:event_jButton3ActionPerformed

    private void TxtPrecioMaterialesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtPrecioMaterialesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPrecioMaterialesActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
TablaStockR tab = new TablaStockR();
tab.setVisible(true); 
if(LblPrivilegios.getText().trim() == "Administrador"){
        LblPrivilegios3.setText("Administrador");
    }
dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void TxtIDM1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtIDM1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtIDM1ActionPerformed

    private void TxtNombreM1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNombreM1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNombreM1ActionPerformed

    private void BtnMod2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMod2ActionPerformed
 String data = TxtIDM1.getText().trim();
        String data2 = TxtNombreM1.getText().trim();
        String data3 = TxtPrecioM1.getText().trim();
        String data4 = TxtCantidadM1.getText().trim();
        String data5 = TxtDescripcionM1.getText().trim();
        String data6 = TxtCodigoM1.getText().trim();
        String data7 = TxtIdentificador.getText().trim();

        Boolean activador = false;
        if(!data2.equals("") || !data3.equals("") || !data4.equals("") || !data5.equals("") || !data6.equals("")  || !data7.equals("")){
            activador = true;
        }
        if(activador == true) {
            if(!data.equals("")) {String title = "Advertencia";

                String message = "¿Estás seguro de que quieres modificar este registro?";
                int reply = JOptionPane.showConfirmDialog(null, message, title, JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.YES_OPTION) {

                    try {
                        String ID = TxtIDM1.getText().trim();

                        Connection cn = DriverManager.getConnection("jdbc:mysql://Localhost:3306/incidenciasdb", "root", "");
                        PreparedStatement pst = cn.prepareStatement("update stock set Nombre = ? where ID = " + ID);
                        PreparedStatement pst2 = cn.prepareStatement("update stock set Descripcion = ? where ID = " + ID);
                        PreparedStatement pst3 = cn.prepareStatement("update stock set Cantidad = ? where ID = " + ID);
                        PreparedStatement pst4 = cn.prepareStatement("update stock set Precio = ? where ID = " + ID);
                        PreparedStatement pst5 = cn.prepareStatement("update stock set Codigo = ? where ID = " + ID);
                        PreparedStatement pst6 = cn.prepareStatement("update stock set IdentificadorDeCompra = ? where ID = " + ID);
                        

                        pst.setString(1, TxtNombreM1.getText().trim());
                        pst2.setString(1, TxtDescripcionM1.getText().trim());
                        pst3.setString(1, TxtCantidadM1.getText().trim());
                        pst4.setString(1, TxtPrecioM1.getText().trim());
                        pst5.setString(1, TxtCodigoM1.getText().trim());
                        pst6.setString(1, TxtIdentificador.getText().trim());

                        pst.executeUpdate();
                        pst2.executeUpdate();
                        pst3.executeUpdate();
                        pst4.executeUpdate();
                        pst5.executeUpdate();
                        pst6.executeUpdate();

                        label_status.setText("modificacion exitosa");
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "operacion cancelada");

                }
            } else if(data.equals("")){

                try {
                    Connection cn = DriverManager.getConnection("jdbc:mysql://Localhost:3306/incidenciasdb", "root", "");
                    PreparedStatement pst = cn.prepareStatement("insert into stock values(?,?,?,?,?,?,?)");
                    Statement stmt=cn.createStatement();
                    ResultSet rs=stmt.executeQuery("select * from stock");
                    int id = 0;
                    while(rs.next()){
                        id= rs.getInt(1);
                        System.out.println(id);
                    }
                    pst.setInt(1, id + 1);
                    pst.setString(2, TxtNombreM1.getText().trim());
                    pst.setString(3, TxtDescripcionM1.getText());
                    pst.setString(4, TxtCantidadM1.getText().trim());
                    pst.setString(5, TxtPrecioM1.getText().trim());
                    pst.setString(6, TxtCodigoM1.getText().trim());
                    pst.setString(7, TxtIdentificador.getText().trim());
                    pst.executeUpdate();

                    TxtNombreM1.setText("");
                    TxtDescripcionM1.setText("");
                    TxtCantidadM1.setText("");
                    TxtPrecioM1.setText("");
                    TxtIDM1.setText("");
                    TxtCodigoM1.setText("");

                    /*DefaultTableModel dtm = (DefaultTableModel) TblMateriales.getModel();
                    dtm.setRowCount(0);
                    dtm.setRowCount(10);*/

                    label_status.setText("Registro exitoso.");
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "introduce todos los campos");

        }        // TODO add your handling code here:
    }//GEN-LAST:event_BtnMod2ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
TablaInc tab = new TablaInc();
      tab.setVisible(true);
      if(LblPrivilegios.getText().trim() == "Administrador"){
        LblPrivilegios1.setText("Administrador");
        CmbVentanas.addItem("Registro de usuarios");
    }
      dispose();
      txt_codigo.setText(null);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void TxtIdentificadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtIdentificadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtIdentificadorActionPerformed
   
     
    

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
            java.util.logging.Logger.getLogger(RegistroDeIncidencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroDeIncidencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroDeIncidencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroDeIncidencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        date2 d1 = new date2();
        d1.GUI();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              
                new RegistroDeIncidencias().setVisible(true);
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnElim;
    private javax.swing.JButton BtnEliminar1;
    private javax.swing.JButton BtnLista1;
    private javax.swing.JButton BtnMod;
    private javax.swing.JButton BtnMod2;
    private javax.swing.JButton BtnPDF;
    private javax.swing.JButton BtnReg1;
    public static javax.swing.JComboBox<String> CmbDispositivo;
    public static javax.swing.JComboBox<String> CmbEmpleado;
    public static javax.swing.JComboBox<String> CmbInc;
    public static com.toedter.calendar.JDateChooser DcFecha;
    private javax.swing.JLabel LblApellidos;
    private javax.swing.JLabel LblDescripcion;
    public static javax.swing.JLabel LblPrivilegios;
    public static javax.swing.JPanel Parent;
    public static javax.swing.JPanel PnlMateriales;
    public static javax.swing.JPanel PnlMateriales1;
    private javax.swing.JPanel PnlProcedimientos;
    private javax.swing.JPanel PnlRegistro;
    public static javax.swing.JTextField TxtApellidos;
    public static javax.swing.JTextField TxtCantidadM;
    public static javax.swing.JTextField TxtCantidadM1;
    public static javax.swing.JTextField TxtCodigoM;
    public static javax.swing.JTextField TxtCodigoM1;
    public static javax.swing.JTextArea TxtDescripcion;
    public static javax.swing.JTextArea TxtDescripcionM;
    public static javax.swing.JTextArea TxtDescripcionM1;
    public static javax.swing.JLabel TxtDispositivo;
    public static javax.swing.JTextField TxtHorasM;
    public static javax.swing.JTextField TxtIDM;
    public static javax.swing.JTextField TxtIDM1;
    public static javax.swing.JTextField TxtIdentificador;
    public static javax.swing.JLabel TxtInc;
    public static javax.swing.JTextArea TxtMateriales;
    public static javax.swing.JTextField TxtNombreM;
    public static javax.swing.JTextField TxtNombreM1;
    public static javax.swing.JTextArea TxtObservaciones;
    public static javax.swing.JTextField TxtPrecioM;
    public static javax.swing.JTextField TxtPrecioM1;
    private javax.swing.JTextField TxtPrecioMateriales;
    private javax.swing.JTextField TxtPrecioTotal;
    public static javax.swing.JTextArea TxtProcedimientos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    public static javax.swing.JButton jButton4;
    public static javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    public static javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JLabel label_status;
    public static javax.swing.JTextField txt_codigo;
    public static javax.swing.JTextField txt_nombre;
    public static javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
    private void TextoMateriales(){
        if(TxtMateriales != null){
    TextoFinal = TxtMateriales.getText() + "\n\n";
}else{
            TextoFinal = "";
        }
    }
    private void seticon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage("src/img/icono.png"));
    }
}
