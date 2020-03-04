/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Membreño
 */
public class Ms_Frm_Principal extends javax.swing.JFrame {

    
    private JFrame Principal = new JFrame();
    
    public Ms_Frm_Principal() {
        initComponents();
        
        Principal.setContentPane(PanelPrincipal);
        Principal.pack();
        Principal.setVisible(true);
        Principal.setLocationRelativeTo(null);
        Principal.setTitle("Sistema de Inventario y Ventas");
        Principal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Principal.setResizable(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelPrincipal = new javax.swing.JPanel();
        BotonSalir = new javax.swing.JButton();
        BotonUsuarios = new javax.swing.JButton();
        BotonInventario = new javax.swing.JButton();
        BotonVentas = new javax.swing.JButton();
        BotonCierreCaja = new javax.swing.JButton();
        BotonProductos = new javax.swing.JButton();
        BotonClientes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BotonSalir.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        BotonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono salir (2).jpg"))); // NOI18N
        BotonSalir.setText(" Salir");
        BotonSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalirActionPerformed(evt);
            }
        });

        BotonUsuarios.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        BotonUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoUsuarios.jpg"))); // NOI18N
        BotonUsuarios.setText("Usuarios");
        BotonUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonUsuarios.setPreferredSize(new java.awt.Dimension(205, 73));
        BotonUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonUsuariosActionPerformed(evt);
            }
        });

        BotonInventario.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        BotonInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono inventario (7).jpg"))); // NOI18N
        BotonInventario.setText(" Inventario");
        BotonInventario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonInventarioActionPerformed(evt);
            }
        });

        BotonVentas.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        BotonVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Icono Venta.jpg"))); // NOI18N
        BotonVentas.setText(" Ventas");
        BotonVentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonVentasActionPerformed(evt);
            }
        });

        BotonCierreCaja.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        BotonCierreCaja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconocierre caja (2).jpg"))); // NOI18N
        BotonCierreCaja.setText(" Cierre Caja ");
        BotonCierreCaja.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonCierreCaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCierreCajaActionPerformed(evt);
            }
        });

        BotonProductos.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        BotonProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono producto.jpg"))); // NOI18N
        BotonProductos.setText(" Productos");
        BotonProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonProductos.setMaximumSize(new java.awt.Dimension(193, 59));
        BotonProductos.setPreferredSize(new java.awt.Dimension(203, 65));
        BotonProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonProductosActionPerformed(evt);
            }
        });

        BotonClientes.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        BotonClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Icono Clientes.jpg"))); // NOI18N
        BotonClientes.setText("Clientes");
        BotonClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonClientesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelPrincipalLayout = new javax.swing.GroupLayout(PanelPrincipal);
        PanelPrincipal.setLayout(PanelPrincipalLayout);
        PanelPrincipalLayout.setHorizontalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BotonSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonVentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 187, Short.MAX_VALUE)
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(BotonCierreCaja, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotonClientes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(87, 87, 87))
        );
        PanelPrincipalLayout.setVerticalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPrincipalLayout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonCierreCaja, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BotonClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(BotonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
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

    private void BotonProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonProductosActionPerformed
        // TODO add your handling code here:
        Principal.dispose();
        new Mp_Frm_Productos();
    }//GEN-LAST:event_BotonProductosActionPerformed

    
    public String HoraActual(){
        
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd "); 
        Calendar cal = Calendar.getInstance(); 
        return dateFormat.format(cal.getTime());
        
    }
    private void BotonCierreCajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCierreCajaActionPerformed
       
                Principal.dispose();
                new Mv_Frm_Cierre_Caja();
    }//GEN-LAST:event_BotonCierreCajaActionPerformed

    private void BotonVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVentasActionPerformed
        // TODO add your handling code here:
        Principal.dispose();
        new Mv_Frm_Ventas();
    }//GEN-LAST:event_BotonVentasActionPerformed

    private void BotonUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonUsuariosActionPerformed
        int usuariotipo = Ms_Frm_Login.TipoUsuario;
        if(usuariotipo==1){
            Principal.dispose();
        new Mc_Frm_Registro_Usuarios();
        }else{JOptionPane.showMessageDialog(null, "Su Usuario no esta Autorizado a realizar esta opcion");}
    }//GEN-LAST:event_BotonUsuariosActionPerformed

    private void BotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirActionPerformed
        Principal.dispose();
        new Ms_Frm_Login();
    }//GEN-LAST:event_BotonSalirActionPerformed

    private void BotonClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonClientesActionPerformed
       
        Principal.dispose();
        new Mc_frm_Registro_Clientes();
    }//GEN-LAST:event_BotonClientesActionPerformed

    private void BotonInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonInventarioActionPerformed
        Principal.dispose();
        new Mi_Frm_Inventario();
    }//GEN-LAST:event_BotonInventarioActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonCierreCaja;
    private javax.swing.JButton BotonClientes;
    private javax.swing.JButton BotonInventario;
    private javax.swing.JButton BotonProductos;
    private javax.swing.JButton BotonSalir;
    private javax.swing.JButton BotonUsuarios;
    private javax.swing.JButton BotonVentas;
    private javax.swing.JPanel PanelPrincipal;
    // End of variables declaration//GEN-END:variables
}
