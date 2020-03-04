/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.awt.Desktop;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Membreño
 */
public class Mv_Frm_Ventas extends javax.swing.JFrame {

    JFrame producto = new JFrame();
    public static float totalfinal = 0;
    public Mv_Frm_Ventas() {
        initComponents();
        producto.setVisible(true);
        producto.setResizable(false);
        producto.setContentPane(Principal);
        producto.pack();
        producto.setLocationRelativeTo(null);
        producto.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        producto.setTitle("Ventas");
 
        
    }

    int idusuario= Ms_Frm_Login.UsuarioId;
    public int tipocliente=2;
     String descripcion = "";
     public int SecuenciaCliente=0;
      int i=0;
      Ms_Conexion conexion = new Ms_Conexion();
      Clase_Impresion Imprimir = new Clase_Impresion();
    
   
    
    public void CargarArticulo(){
        DefaultTableModel modelo = (DefaultTableModel) Tabla_Productos.getModel();
        modelo.setRowCount(0);
        ResultSet Existenciaprod = Ms_Conexion.Consulta("SELECT [Descripcion_Producto],[Precio_Mayorista],[Precio_Minorista],[Producto_Exento_Impuestos],[Existencia_Actual] FROM TBL_MP_REGISTRO_MAESTRO_PRODUCTOS");
        
        try{
            while(Existenciaprod.next()){
                Vector v = new Vector();
                v.add(Existenciaprod.getString(1));
                v.add(Existenciaprod.getString(2));
                v.add(Existenciaprod.getString(3));
                v.add(Existenciaprod.getByte(4));
                v.add(Existenciaprod.getFloat(5));
                
                modelo.addRow(v);
                Tabla_Productos.setModel(modelo);
            }
        }catch (SQLException e){
        }
    }
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Principal = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_Productos = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        Txt_Buscar_Producto = new javax.swing.JTextField();
        Boton_Buscar_Producto = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        RadioClientefinal = new javax.swing.JRadioButton();
        Txt_buscar_Cliente = new javax.swing.JTextField();
        BotonAgregarCliente = new javax.swing.JButton();
        BotonFacturar = new javax.swing.JButton();
        Boton_Eliminar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        Txt_Descripcion_producto = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Txt_CantidadProd = new javax.swing.JTextField();
        Boton_Añadir_Prod_Tabla = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Txt_Efectivo = new javax.swing.JTextField();
        Txt_Cambio = new javax.swing.JTextField();
        BotonSalir = new javax.swing.JButton();
        Txt_Total_Final = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Txt_Nombre_Cliente = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Tabla_Productos.setBackground(new java.awt.Color(204, 255, 255));
        Tabla_Productos.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        Tabla_Productos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo Producto", "Descripcion Productos", "Cantidad", "Precio Unitario", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Tabla_Productos);
        if (Tabla_Productos.getColumnModel().getColumnCount() > 0) {
            Tabla_Productos.getColumnModel().getColumn(0).setMinWidth(50);
            Tabla_Productos.getColumnModel().getColumn(0).setMaxWidth(100);
            Tabla_Productos.getColumnModel().getColumn(1).setMinWidth(450);
            Tabla_Productos.getColumnModel().getColumn(1).setMaxWidth(1500);
            Tabla_Productos.getColumnModel().getColumn(2).setMinWidth(50);
            Tabla_Productos.getColumnModel().getColumn(3).setMinWidth(100);
            Tabla_Productos.getColumnModel().getColumn(4).setMinWidth(50);
        }

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setText("Codigo");

        Txt_Buscar_Producto.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        Txt_Buscar_Producto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Txt_Buscar_ProductoKeyPressed(evt);
            }
        });

        Boton_Buscar_Producto.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        Boton_Buscar_Producto.setText("Buscar");
        Boton_Buscar_Producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_Buscar_ProductoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel3.setText("Cliente: ");

        RadioClientefinal.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        RadioClientefinal.setText("Cliente Final");

        Txt_buscar_Cliente.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        BotonAgregarCliente.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        BotonAgregarCliente.setText("Agregar");
        BotonAgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAgregarClienteActionPerformed(evt);
            }
        });

        BotonFacturar.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        BotonFacturar.setText("Facturar");
        BotonFacturar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonFacturarActionPerformed(evt);
            }
        });

        Boton_Eliminar.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        Boton_Eliminar.setText("Eliminar");
        Boton_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_EliminarActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel8.setText("Producto:");

        Txt_Descripcion_producto.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        Txt_Descripcion_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_Descripcion_productoActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel9.setText("Cantidad");

        Txt_CantidadProd.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        Txt_CantidadProd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Txt_CantidadProdKeyPressed(evt);
            }
        });

        Boton_Añadir_Prod_Tabla.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        Boton_Añadir_Prod_Tabla.setText("Agregar");
        Boton_Añadir_Prod_Tabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_Añadir_Prod_TablaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setText("Total :");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel11.setText("Efectivo:");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel12.setText("Cambio:");

        Txt_Efectivo.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        Txt_Efectivo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Txt_EfectivoKeyPressed(evt);
            }
        });

        Txt_Cambio.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N

        BotonSalir.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        BotonSalir.setText("Salir");
        BotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalirActionPerformed(evt);
            }
        });

        Txt_Total_Final.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N

        Txt_Nombre_Cliente.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Txt_Nombre_Cliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Txt_Nombre_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 98, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PrincipalLayout = new javax.swing.GroupLayout(Principal);
        Principal.setLayout(PrincipalLayout);
        PrincipalLayout.setHorizontalGroup(
            PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrincipalLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PrincipalLayout.createSequentialGroup()
                        .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PrincipalLayout.createSequentialGroup()
                                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PrincipalLayout.createSequentialGroup()
                                        .addGap(76, 76, 76)
                                        .addComponent(jLabel1)
                                        .addGap(188, 188, 188)
                                        .addComponent(jLabel11))
                                    .addGroup(PrincipalLayout.createSequentialGroup()
                                        .addGap(75, 75, 75)
                                        .addComponent(Txt_Total_Final, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(114, 114, 114)
                                        .addComponent(Txt_Efectivo, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(117, 117, 117)
                                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(Txt_Cambio, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 773, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PrincipalLayout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Txt_Buscar_Producto, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(Boton_Buscar_Producto, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(294, 294, 294)
                                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Txt_buscar_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(BotonAgregarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(36, 36, 36)
                        .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RadioClientefinal)
                            .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(BotonFacturar, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                .addComponent(Boton_Eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BotonSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap(48, Short.MAX_VALUE))
                    .addGroup(PrincipalLayout.createSequentialGroup()
                        .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(Txt_Descripcion_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(90, 90, 90)
                        .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(PrincipalLayout.createSequentialGroup()
                                .addComponent(Txt_CantidadProd, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(75, 75, 75)
                                .addComponent(Boton_Añadir_Prod_Tabla, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(94, 94, 94)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        PrincipalLayout.setVerticalGroup(
            PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrincipalLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PrincipalLayout.createSequentialGroup()
                        .addComponent(BotonAgregarCliente)
                        .addGap(55, 55, 55)
                        .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Txt_CantidadProd, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Boton_Añadir_Prod_Tabla))
                            .addComponent(Txt_Descripcion_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4))
                    .addGroup(PrincipalLayout.createSequentialGroup()
                        .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(16, 16, 16)
                        .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Txt_buscar_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RadioClientefinal)
                            .addComponent(Txt_Buscar_Producto, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PrincipalLayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(Boton_Buscar_Producto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PrincipalLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))))
                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PrincipalLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BotonSalir)
                            .addComponent(Txt_Total_Final, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Txt_Cambio)
                            .addComponent(Txt_Efectivo))
                        .addGap(48, 48, 48))
                    .addGroup(PrincipalLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(Boton_Eliminar)
                        .addGap(61, 61, 61)
                        .addComponent(BotonFacturar)
                        .addContainerGap(207, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public void DatosUsuario(){
    
        int secuenciausuario = Ms_Frm_Login.UsuarioId;
                
        
        ResultSet consulta=Ms_Conexion.Consulta("SELECT [Secuencia_Usuario]" +
                            "      ,[Id_Usuario]" +
                            "  FROM [SRV_BD_APP_SINVEN].[dbo].[TBL_MS_REGISTRO_USUARIO]" +
                            "  WHERE [Secuencia_Usuario]="+secuenciausuario);
        
        try {
            consulta.next();
            
        } catch (SQLException ex) {
            Logger.getLogger(Ms_Frm_Login.class.getName()).log(Level.SEVERE, null, ex);
        }
                              
        
        
    }
    
    private void BotonAgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAgregarClienteActionPerformed
        
       tipocliente();
        
        
    }//GEN-LAST:event_BotonAgregarClienteActionPerformed

    private void Boton_Buscar_ProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_Buscar_ProductoActionPerformed
        
        BuscarCodProducto();
        Txt_Buscar_Producto.setText("");
        
    }//GEN-LAST:event_Boton_Buscar_ProductoActionPerformed

    private void Boton_Añadir_Prod_TablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_Añadir_Prod_TablaActionPerformed
        try {
            agregarprodtabla();
            i++;
        } catch (SQLException ex) {
            Logger.getLogger(Mv_Frm_Ventas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Boton_Añadir_Prod_TablaActionPerformed

    private void BotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirActionPerformed
        totalfinal = 0;
        producto.dispose();
       new Ms_Frm_Principal();
       
    }//GEN-LAST:event_BotonSalirActionPerformed

    private void Boton_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_EliminarActionPerformed
            DefaultTableModel modelo = (DefaultTableModel) Tabla_Productos.getModel();
            
        int FilasSeleccionada = Tabla_Productos.getSelectedRow();
        
        if(FilasSeleccionada!=-1){
            modelo.removeRow(FilasSeleccionada);
            System.out.println(FilasSeleccionada);
            retornarsumacolumnastotal();
             i--;
        }else{
                JOptionPane.showMessageDialog(null, "Seleccione una fila");
        }
    }//GEN-LAST:event_Boton_EliminarActionPerformed
    public void retornarsumacolumnastotal(){
        DefaultTableModel modelo = (DefaultTableModel) Tabla_Productos.getModel();
            
        int contador = Tabla_Productos.getRowCount();
        double suma=0;
      
        
        for (int j = 0; j < contador; j++) {
           
            suma=suma+Double.parseDouble((String) Tabla_Productos.getValueAt(j, 4)); 
        }
        String sumastring = String.valueOf(suma);
        Txt_Total_Final.setText(sumastring);
    }
    private void Txt_EfectivoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_EfectivoKeyPressed
        
        
        
        if (evt.getKeyCode()== KeyEvent.VK_ENTER){
        float cambio =0;
        float total = 0;
        float efectivo = 0;
        
        total = Float.parseFloat(Txt_Total_Final.getText());
        efectivo=Float.parseFloat(Txt_Efectivo.getText());
        cambio = efectivo-total;
        String cambiofinal=Float.toString(cambio);
        Txt_Cambio.setText(cambiofinal);
        
        }
    }//GEN-LAST:event_Txt_EfectivoKeyPressed

    private void Txt_Descripcion_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_Descripcion_productoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_Descripcion_productoActionPerformed

    private void BotonFacturarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonFacturarActionPerformed
        
        try {
            insertarFacturaPrincipal();
            
                    
        } catch (SQLException ex) {
            Logger.getLogger(Mv_Frm_Ventas.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_BotonFacturarActionPerformed

    private void Txt_Buscar_ProductoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_Buscar_ProductoKeyPressed
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){
            BuscarCodProducto();
        Txt_Buscar_Producto.setText("");
        }
        
    }//GEN-LAST:event_Txt_Buscar_ProductoKeyPressed

    private void Txt_CantidadProdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_CantidadProdKeyPressed
       
        
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){
            try {
                agregarprodtabla();
            } catch (SQLException ex) {
                Logger.getLogger(Mv_Frm_Ventas.class.getName()).log(Level.SEVERE, null, ex);
            }
            i++;
        }
        
        
        
    }//GEN-LAST:event_Txt_CantidadProdKeyPressed
    
    public void insertarFacturaPrincipal() throws SQLException{
    
        if (tipocliente()!=0){
            
       
        
                if (Txt_Total_Final.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null,"Ingrese Productos");
                
                
                }else{
                    
                    float total=Float.parseFloat(Txt_Total_Final.getText());
                    conexion.Insertar("INSERT INTO [dbo].[TBL_MV_ENCABEZADO_TRANSACCION]\n" +
"           ([Secuencia_Registro_Cliente]" +
"           ,[Secuencia_Usuario]" +
"           ,[Fecha_Realizacion_Ventas]" +
"           ,[Total_Factura])" +
"     VALUES" +
"           ("+tipocliente()+","+idusuario+",'"+ HoraActual() +"',"+ total +")");
            
                try {
                    insertarDetalleFactura();
                } catch (IOException ex) {
                    Logger.getLogger(Mv_Frm_Ventas.class.getName()).log(Level.SEVERE, null, ex);
                }
                    
                
                
                }
        }else{
            JOptionPane.showMessageDialog(null,"Inserte un cliente valido");
            
        }
    
    }
    
    
    public void insertarDetalleFactura() throws IOException{
    
    int Ultimafactura=0;
    int codproduct=0;
    float cantidad=0;
    float total=0;
    float existenciaactual = 0;
    
        ResultSet consulta=conexion.Consulta("SELECT TOP (1) [Secuencia_Encabezado_Ventas]" +
                        "  FROM [SRV_BD_APP_SINVEN].[dbo].[TBL_MV_ENCABEZADO_TRANSACCION]" +
                        "  ORDER BY [Secuencia_Encabezado_Ventas] desc");
        
        try {
            consulta.next();
            Ultimafactura = consulta.getInt(1);

        } catch (SQLException ex) {
            Logger.getLogger(Mv_Frm_Ventas.class.getName()).log(Level.SEVERE, null, ex);
        }
        
            for (int j = 0; j <Tabla_Productos.getRowCount() ; j++) {
                
                codproduct=Integer.parseInt(Tabla_Productos.getValueAt(j, 0).toString());
                cantidad= Float.parseFloat(Tabla_Productos.getValueAt(j, 2).toString());
                total= Float.parseFloat(Tabla_Productos.getValueAt(j, 4).toString());    
                
                    try {
            conexion.Insertar("INSERT INTO [dbo].[TBL_MV_DETALLE_TRANSACCION]\n" +
                    "           ([Secuencia_Encabezado_ventas]\n" +
                    "           ,[Secuencia_Registro_Producto]\n" +
                    "           ,[Cantidad]\n" +
                    "           ,[Subtotal_Producto])\n" +
                    "     VALUES\n" +
                    "           (" +Ultimafactura+","+ codproduct + ","  +cantidad +","+ total +  ")");
        } catch (SQLException ex) {
            Logger.getLogger(Mv_Frm_Ventas.class.getName()).log(Level.SEVERE, null, ex);
        }
                    
                            try {
            conexion.Insertar("INSERT INTO [dbo].[TBL_MI_INVENTARIO]\n" +
                        "           ([Secuencia_Cat_Tipo_Transaccion]\n" +
                        "           ,[Secuencia_Registro_Producto]\n" +
                        "           ,[Fecha_Registro_Producto_Inventario])\n" +
                        "     VALUES\n" +
                        "           (" + 2 +","+ codproduct +",'" + HoraActual() + "')");
        } catch (SQLException ex) {
            Logger.getLogger(Mv_Frm_Ventas.class.getName()).log(Level.SEVERE, null, ex);
        }
                    
                     
                    ResultSet consultaprod = Ms_Conexion.Consulta("SELECT [Existencia_Actual]" +
                        "  FROM [SRV_BD_APP_SINVEN].[dbo].[TBL_MP_REGISTRO_MAESTRO_PRODUCTOS]" +
                        "  where Secuencia_Registro_Producto = " + codproduct);
                            
                     try {
                    consultaprod.next();
                    existenciaactual=consultaprod.getFloat(1);
                } catch (Exception e) {
                    
                }
                    
                    existenciaactual=existenciaactual-cantidad;        
                    conexion.update("UPDATE [dbo].[TBL_MP_REGISTRO_MAESTRO_PRODUCTOS]" +
                        "   SET [Existencia_Actual] = " +existenciaactual+
                        " WHERE [Secuencia_Registro_Producto] = "+codproduct);
                
                Imprimir.imprimir();
                JOptionPane.showMessageDialog(null, "EL Cambio es "+Txt_Cambio.getText());
                producto.dispose();
               
            }
                
                producto.dispose();
                 new Ms_Frm_Principal();
    }
    
    
    
    
    public String HoraActual(){
        
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd "); 
        Calendar cal = Calendar.getInstance(); 
        return dateFormat.format(cal.getTime());
        
    }
    
    public void agregarprodtabla() throws SQLException{
       
        DefaultTableModel modelo = (DefaultTableModel) Tabla_Productos.getModel();
        modelo.setRowCount(i);
        
        ResultSet consulta = Ms_Conexion.Consulta("SELECT [Secuencia_Registro_Producto]" +
"      ,[Descripcion_Producto]" +
"      ,[Precio_Mayorista]" +
"      ,[Precio_Minorista]" +
"      ,[Existencia_Actual]" +
"  FROM [SRV_BD_APP_SINVEN].[dbo].[TBL_MP_REGISTRO_MAESTRO_PRODUCTOS]" +
"  WHERE [Descripcion_Producto] = '"+descripcion+"'");
        
        
            while(consulta.next()){
                Vector v = new Vector();
                
                v.add(consulta.getString(1));                
                v.add(consulta.getString(2));              
                v.add(Txt_CantidadProd.getText());  
                
                if(tipocliente==2){
                    v.add(consulta.getString(4));
                    
                }else{
                    v.add(consulta.getString(3));                   
                }
                
                
                String cantidad=v.get(2).toString();
                String Precio = v.get(3).toString();
                
                double total = 0;
                double cant = 0;
                double price = 0;
                
                cant= Float.parseFloat(cantidad);
                price = Float.parseFloat(Precio);

            if (price %2 == 0) {
                
                total = cant*price;

            } else {
 
                if(cant == 0.5 ){
                    total = cant*price;
                    total+=0.5;
                }else{
                total = cant*price;
                }
            }
                
                String totalString=String.valueOf(total);
                
                v.add(totalString);
                
                modelo.addRow(v);
                Tabla_Productos.setModel(modelo);
                
                retornarsumacolumnastotal();

            }

    }
    
    
    
    
    public void BuscarCodProducto(){
    
        ResultSet consulta = Ms_Conexion.Consulta("SELECT [Secuencia_Registro_Producto]" +
"      ,[Nombre_Corto_Producto]" +
"      ,[Descripcion_Producto]" +
"      ,[Precio_Mayorista]" +
"      ,[Precio_Minorista]" +
"      ,[Existencia_Actual]" +
"  FROM [SRV_BD_APP_SINVEN].[dbo].[TBL_MP_REGISTRO_MAESTRO_PRODUCTOS]" +
"  WHERE Secuencia_Registro_Producto = "+Txt_Buscar_Producto.getText());
        
        try {
            consulta.next();
                String Descripciondelproducto = consulta.getString(3);
                Descripciondelproducto=Descripciondelproducto.trim();
               Txt_Descripcion_producto.setText(Descripciondelproducto);
               
               descripcion = Txt_Descripcion_producto.getText();
               descripcion = descripcion.trim();
               Txt_CantidadProd.setText("1");
            
        } catch (SQLException ex) {
            Logger.getLogger(Ms_Frm_Login.class.getName()).log(Level.SEVERE, null, ex);
                                       JOptionPane.showMessageDialog(null, "Producto no Existente");
                                       Txt_buscar_Cliente.setText("");

        }
    
    
    }
    
    public int agregarCliente(){
          
        if(Txt_buscar_Cliente.getText()!=null){
        ResultSet consulta = Ms_Conexion.Consulta("SELECT [Nombre_Cliente]" +
                                    "      ,[Apellido_Cliente]" +
                                    "      ,[RTN_Cliente]" +
                                    "      ,[Secuencia_Tipo_Cliente]" +
                                    "       ,[Secuencia_Registro_Cliente]"+
                                    "  FROM [SRV_BD_APP_SINVEN].[dbo].[TBL_MC_REGISTRO_MAESTRO_CLIENTES]" +
                                    "    WHERE [RTN_Cliente] = '"+Txt_buscar_Cliente.getText()+"'");
        
        try {
            consulta.next();
            
               tipocliente = consulta.getInt(4);
               String nombre= consulta.getString(1);
               nombre=nombre.trim();
               String apellido = consulta.getString(2);
               apellido=apellido.trim();
               Txt_Nombre_Cliente.setText(nombre+" "+apellido);
               SecuenciaCliente=consulta.getInt(5);
               
            
        } catch (SQLException ex) {
            Logger.getLogger(Ms_Frm_Login.class.getName()).log(Level.SEVERE, null, ex);
                                       
                                       Txt_buscar_Cliente.setText("");

        }
        }
        return SecuenciaCliente;
    }
    
    public int tipocliente(){
    
        if (RadioClientefinal.isSelected()){
            
            tipocliente=2;
            SecuenciaCliente=1;
            
            
        }else{
            agregarCliente();
            
        }
        
        return SecuenciaCliente;
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAgregarCliente;
    private javax.swing.JButton BotonFacturar;
    private javax.swing.JButton BotonSalir;
    private javax.swing.JButton Boton_Añadir_Prod_Tabla;
    private javax.swing.JButton Boton_Buscar_Producto;
    private javax.swing.JButton Boton_Eliminar;
    private javax.swing.JPanel Principal;
    private javax.swing.JRadioButton RadioClientefinal;
    private javax.swing.JTable Tabla_Productos;
    private javax.swing.JTextField Txt_Buscar_Producto;
    private javax.swing.JTextField Txt_Cambio;
    private javax.swing.JTextField Txt_CantidadProd;
    private javax.swing.JTextField Txt_Descripcion_producto;
    private javax.swing.JTextField Txt_Efectivo;
    private javax.swing.JLabel Txt_Nombre_Cliente;
    private javax.swing.JLabel Txt_Total_Final;
    private javax.swing.JTextField Txt_buscar_Cliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
