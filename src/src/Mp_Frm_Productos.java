/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


/**
 *
 * @author Membreño
 */
public class Mp_Frm_Productos extends javax.swing.JFrame {

    Ms_Conexion conexion = new Ms_Conexion();
   
    JFrame producto = new JFrame();
    public Mp_Frm_Productos() {
        initComponents();
        producto.setVisible(true);
        producto.setResizable(false);
        producto.setContentPane(Principal);
        producto.pack();
        producto.setLocationRelativeTo(null);
        producto.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        producto.setTitle("productos");
        
        
    }
    

    public void VerificarBasios(){
    
        if(Txt_Nombre_Corto_Producto.getText().isEmpty())
                JOptionPane.showMessageDialog(null, "Ingrese el nombre corto del Producto");
        if(Txt_Descripcion_Producto.getText().isEmpty())
                JOptionPane.showMessageDialog(null, "Ingrese la Descripcion del Producto");
        if(Txt_Precio_Minorista.getText().isEmpty())
                JOptionPane.showMessageDialog(null, "Ingrese el Precio de Minorista");
        if(Txt_Precio_Mayorista.getText().isEmpty())
                JOptionPane.showMessageDialog(null, "Ingrese el Precio de Mayorista");
       
        
    }
    
    public String HoraActual(){
        
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd "); 
        Calendar cal = Calendar.getInstance(); 
        return dateFormat.format(cal.getTime());
        
    }
    
    public int CategoriaProducto (){
            int categoria = 0;
            String Grano_Basicos = "Granos Basicos";
            String Golosinas = "Golosinas";
            String Lacteos = "Lacteos";            
               String Producto=Box_Categoria_Producto.getSelectedItem().toString().trim();
               
            if (Producto.equals(Grano_Basicos))
                categoria=2;
            if (Producto.equals(Lacteos))
                categoria=1;
            if (Producto.equals(Golosinas))
                categoria=3;              
            return categoria;
    }
    
    public int UnidadProducto (){
            int categoria = 0;
            String Unidad = "Unidad";
            String Litros = "Litros";
            String Libras = "Libras";           
               
            if (Box_Unidad_Medida.getSelectedItem().equals(Unidad))
                categoria=1;
            if (Box_Unidad_Medida.getSelectedItem().equals(Litros))
                categoria=2;
            if (Box_Unidad_Medida.getSelectedItem().equals(Libras))
                categoria=3;
                         
            return categoria;
    }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Principal = new javax.swing.JTabbedPane();
        v_Registro_Productos = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        BotonGuardardatos = new javax.swing.JButton();
        Lbl_Nombre_Corto_Producto = new javax.swing.JLabel();
        Txt_Nombre_Corto_Producto = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Txt_Descripcion_Producto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Txt_Precio_Minorista = new javax.swing.JTextField();
        Txt_Precio_Mayorista = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Box_Categoria_Producto = new javax.swing.JComboBox<>();
        Box_Unidad_Medida = new javax.swing.JComboBox<>();
        BotonSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Principal.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        v_Registro_Productos.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        BotonGuardardatos.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        BotonGuardardatos.setText("Guardar datos");
        BotonGuardardatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGuardardatosActionPerformed(evt);
            }
        });

        Lbl_Nombre_Corto_Producto.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Lbl_Nombre_Corto_Producto.setText("Nombre Corto del Producto");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Descripcion del Producto");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Precio Minorista");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Precio Mayorista");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Categoria del Producto");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Unidad de Medida del Producto");

        Box_Categoria_Producto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lacteos", "Granos Basicos", "Golosinas" }));

        Box_Unidad_Medida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Unidad", "Litros", "Libras" }));

        BotonSalir.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        BotonSalir.setText("salir");
        BotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(BotonGuardardatos, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(BotonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Box_Categoria_Producto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Txt_Precio_Minorista)
                            .addComponent(Txt_Nombre_Corto_Producto)
                            .addComponent(jLabel4)
                            .addComponent(Lbl_Nombre_Corto_Producto, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(161, 161, 161)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5)
                            .addComponent(Txt_Descripcion_Producto)
                            .addComponent(Txt_Precio_Mayorista)
                            .addComponent(Box_Unidad_Medida, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lbl_Nombre_Corto_Producto)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_Nombre_Corto_Producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_Descripcion_Producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_Precio_Minorista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_Precio_Mayorista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Box_Categoria_Producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Box_Unidad_Medida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(98, 98, 98)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonGuardardatos)
                    .addComponent(BotonSalir))
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout v_Registro_ProductosLayout = new javax.swing.GroupLayout(v_Registro_Productos);
        v_Registro_Productos.setLayout(v_Registro_ProductosLayout);
        v_Registro_ProductosLayout.setHorizontalGroup(
            v_Registro_ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, v_Registro_ProductosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
        );
        v_Registro_ProductosLayout.setVerticalGroup(
            v_Registro_ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Principal.addTab("Registro nuevo Producto", v_Registro_Productos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Principal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 878, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Principal, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirActionPerformed
        producto.dispose();
        new Ms_Frm_Principal();
    }//GEN-LAST:event_BotonSalirActionPerformed

    private void BotonGuardardatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGuardardatosActionPerformed
        VerificarBasios();
        try {
            String sql="INSERT INTO TBL_MP_REGISTRO_MAESTRO_PRODUCTOS(Nombre_Corto_Producto,Descripcion_Producto,Precio_Mayorista,Precio_Minorista,Fecha_Creacion_Registro_Producto,Fecha_Actualizacion_Registro_Productos,Secuencia_Categoria_Productos,Secuencia_Unidad_Medida_Producto)" +
            "VALUES ('"+ Txt_Nombre_Corto_Producto.getText()+"','" +Txt_Descripcion_Producto.getText()+"',"+Txt_Precio_Mayorista.getText()+","+Txt_Precio_Minorista.getText()+",'"+  HoraActual() +"','"+  HoraActual()+"',"+CategoriaProducto()+","+ UnidadProducto()+")";

            conexion.Insertar(sql);
            JOptionPane.showMessageDialog(null, "Producto Ingresado Correctamente ");
        } catch (SQLException ex) {
            Logger.getLogger(Mp_Frm_Productos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BotonGuardardatosActionPerformed
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonGuardardatos;
    private javax.swing.JButton BotonSalir;
    private javax.swing.JComboBox<String> Box_Categoria_Producto;
    private javax.swing.JComboBox<String> Box_Unidad_Medida;
    private javax.swing.JLabel Lbl_Nombre_Corto_Producto;
    private javax.swing.JTabbedPane Principal;
    private javax.swing.JTextField Txt_Descripcion_Producto;
    private javax.swing.JTextField Txt_Nombre_Corto_Producto;
    private javax.swing.JTextField Txt_Precio_Mayorista;
    private javax.swing.JTextField Txt_Precio_Minorista;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel v_Registro_Productos;
    // End of variables declaration//GEN-END:variables
}
