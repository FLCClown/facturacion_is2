/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;


import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;


public class Mv_Frm_Cierre_Caja extends javax.swing.JFrame {
private final JFrame Cierre = new JFrame();
    Clase_Impresion Imprimir = new Clase_Impresion();


    public Mv_Frm_Cierre_Caja() {
        initComponents();    
        Cierre.setContentPane(PanelPrincipal);
        Cierre.setVisible(true);
        Cierre.setLocationRelativeTo(null);
        Cierre.pack();
        Cierre.setVisible(true);
        Cierre.setLocationRelativeTo(null);
        Cierre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        
    }
    Ms_Conexion conexion = new Ms_Conexion();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelPrincipal = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Txt_gastos = new javax.swing.JTextField();
        BotonSalir = new javax.swing.JButton();
        Txt_Apunte = new javax.swing.JTextField();
        BotonGenerarCierre = new javax.swing.JButton();
        TxtCajaFinal = new javax.swing.JTextField();
        BotonGuardar = new javax.swing.JButton();
        Txt_SobFal = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        AbrirCajon = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel5.setText("Efectivo en Caja");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel6.setText("Caja:");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel7.setText("Sobrante/Faltante:");

        Txt_gastos.setEditable(false);
        Txt_gastos.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        Txt_gastos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_gastosActionPerformed(evt);
            }
        });

        BotonSalir.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        BotonSalir.setText("Salir");
        BotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalirActionPerformed(evt);
            }
        });

        Txt_Apunte.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        Txt_Apunte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_ApunteActionPerformed(evt);
            }
        });
        Txt_Apunte.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Txt_ApunteKeyReleased(evt);
            }
        });

        BotonGenerarCierre.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        BotonGenerarCierre.setText("Generar");
        BotonGenerarCierre.setEnabled(false);
        BotonGenerarCierre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGenerarCierreActionPerformed(evt);
            }
        });

        TxtCajaFinal.setEditable(false);
        TxtCajaFinal.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        TxtCajaFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCajaFinalActionPerformed(evt);
            }
        });

        BotonGuardar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        BotonGuardar.setText("Guardar");
        BotonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGuardarActionPerformed(evt);
            }
        });

        Txt_SobFal.setEditable(false);
        Txt_SobFal.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        Txt_SobFal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_SobFalActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setText("Gastos:");

        AbrirCajon.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        AbrirCajon.setText("Abrir");
        AbrirCajon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbrirCajonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelPrincipalLayout = new javax.swing.GroupLayout(PanelPrincipal);
        PanelPrincipal.setLayout(PanelPrincipalLayout);
        PanelPrincipalLayout.setHorizontalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Txt_Apunte, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5)
                            .addComponent(Txt_gastos))
                        .addGap(129, 129, 129))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPrincipalLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(AbrirCajon, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(BotonGenerarCierre, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)))
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                        .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(TxtCajaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt_SobFal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                        .addComponent(BotonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addComponent(BotonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        PanelPrincipalLayout.setVerticalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_gastos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtCajaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addGap(19, 19, 19)
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_Apunte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_SobFal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75)
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BotonSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(BotonGenerarCierre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AbrirCajon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Txt_gastosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_gastosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_gastosActionPerformed

    private void Txt_ApunteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_ApunteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_ApunteActionPerformed

    private void TxtCajaFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCajaFinalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCajaFinalActionPerformed

    private void Txt_SobFalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_SobFalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_SobFalActionPerformed

    private void BotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirActionPerformed
        // TODO add your handling code here:
        Cierre.dispose();
        new Ms_Frm_Principal();
    }//GEN-LAST:event_BotonSalirActionPerformed

    private void BotonGenerarCierreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGenerarCierreActionPerformed
        Txt_Apunte.setEditable(false);
        BotonGenerarCierre.setEnabled(false);
        generarCierrecaja();
        generargastoCierrecaja();
        generarsobfal();
        BotonSalir.setEnabled(false);
    }//GEN-LAST:event_BotonGenerarCierreActionPerformed

    private void BotonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGuardarActionPerformed
       
        insertarCierreCaja();
        
    }//GEN-LAST:event_BotonGuardarActionPerformed

    private void Txt_ApunteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_ApunteKeyReleased
        HabilitarBoton();
    }//GEN-LAST:event_Txt_ApunteKeyReleased

    private void AbrirCajonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbrirCajonActionPerformed
        Imprimir.imprimir();
        AbrirCajon.setEnabled(false);
        
    }//GEN-LAST:event_AbrirCajonActionPerformed
    
    public void HabilitarBoton(){

        if(!Txt_Apunte.getText().isEmpty()){
 
            BotonGenerarCierre.setEnabled(true);
  
        }
    }
    
    public String HoraActual(){
        
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd "); 
        Calendar cal = Calendar.getInstance(); 
        return dateFormat.format(cal.getTime());
        
    }
    
    
    public void generarsobfal(){
        float caja=0;
        float gastos=0;
        float efectivocaja=0;
        float sobfal=0;
        float cajagastos=0;
        
        
        caja=Float.parseFloat(TxtCajaFinal.getText());
        
        gastos=Float.parseFloat(Txt_gastos.getText());
        efectivocaja=Float.parseFloat(Txt_Apunte.getText());
        
        cajagastos= caja-gastos;
        sobfal=efectivocaja-cajagastos;
        
        Txt_SobFal.setText( Float.toString(sobfal));

    }
    
    
    public void generarCierrecaja(){
        
        ResultSet consulta = Ms_Conexion.Consulta("SELECT sum(Total_Factura)" +
                        "      " +
                        "  FROM [dbo].[TBL_MV_ENCABEZADO_TRANSACCION]" +
                        "  WHERE Fecha_Realizacion_Ventas = '" +HoraActual()+ "'");
        
        try {
            consulta.next();
            float cierrecaja= consulta.getFloat(1);
            TxtCajaFinal.setText(Float.toString(cierrecaja));
        } catch (Exception e) {
            
        }
        
        
    }
    
    public void generargastoCierrecaja(){
        
        ResultSet consulta = Ms_Conexion.Consulta("SELECT sum([Costo_Gasto])" +
                        "      " +
                        "  FROM [SRV_BD_APP_SINVEN].[dbo].[Tbl_Mv_Gastos]" +
                        "  WHERE Fecha_Gasto = '" +HoraActual()+ "'");
        
        try {
            consulta.next();
            float gastoscaja= consulta.getFloat(1);
            Txt_gastos.setText(Float.toString(gastoscaja));
        } catch (Exception e) {
            
        }
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AbrirCajon;
    private javax.swing.JButton BotonGenerarCierre;
    private javax.swing.JButton BotonGuardar;
    private javax.swing.JButton BotonSalir;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JTextField TxtCajaFinal;
    private javax.swing.JTextField Txt_Apunte;
    private javax.swing.JTextField Txt_SobFal;
    private javax.swing.JTextField Txt_gastos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables


    public void insertarCierreCaja(){
    
        if(!TxtCajaFinal.getText().isEmpty()){
            try {
                conexion.Insertar("INSERT INTO [dbo].[TBL_MV_CIERRE_CAJA]" +
"           ([Cantidad_Apuntado]" +
"           ,[Cantidad_Caja]" +
"           ,[Sobrante_Faltante]" +
"           ,[Fecha_Cierre_Caja])" +
"     VALUES" +
"           ("+ Txt_Apunte.getText() +"," + TxtCajaFinal.getText() + "," + Txt_SobFal.getText() +",'" +HoraActual()  +  "')");
            } catch (SQLException ex) {
                Logger.getLogger(Mv_Frm_Cierre_Caja.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
    
    
    }

}
