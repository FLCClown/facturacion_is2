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


public class Ventana_Añadir_Exitencia extends javax.swing.JFrame {

    
    JFrame producto = new JFrame();
    int secuencia = 0;
    double existenciaActual= 0;
    int usuario = Ms_Frm_Login.UsuarioId;
    
    public Ventana_Añadir_Exitencia() {
        initComponents();
         producto.setVisible(true);
        producto.setContentPane(PanelPrincipal);
        producto.pack();
        producto.setLocationRelativeTo(null);
        producto.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        producto.setTitle("Añadir Existencia");
        traerproducto();
    }
    public void traerproducto(){
        
        
        String descripcion=Mi_Frm_Inventario.secuenciaproducto;
        
        ResultSet consulta = Ms_Conexion.Consulta("SELECT [Secuencia_Registro_Producto],[Descripcion_Producto],[Existencia_Actual]" +
                            "  FROM [SRV_BD_APP_SINVEN].[dbo].[TBL_MP_REGISTRO_MAESTRO_PRODUCTOS]" +
                            "  WHERE [Descripcion_Producto] ='"+descripcion+"'");
        
        try {
            consulta.next();
            secuencia = consulta.getInt(1);
            Txt_Descripcion.setText(consulta.getString(2));
            existenciaActual=consulta.getDouble(3);
  
            
        } catch (SQLException e) {
        }
        
    }

    private void actualizardatos(){
    
        if(secuencia!=0){
            Ms_Conexion conexion = new Ms_Conexion();
            double nuevaExistencia= Double.parseDouble(Txt_Nueva_Existencia.getText()) ;
            existenciaActual = existenciaActual+nuevaExistencia;
            
            
            
        conexion.update("UPDATE [dbo].[TBL_MP_REGISTRO_MAESTRO_PRODUCTOS]" +
                "   SET [Existencia_Actual] = " +existenciaActual
                + "WHERE Secuencia_Registro_Producto = "+secuencia );
                    JOptionPane.showMessageDialog(null, "Existencia actualizada");
                    
                    
                    
            try {
                conexion.Insertar("INSERT INTO [dbo].[Tbl_Ms_Registro_Ingresos]" +
                        "           ([Secuencia_Registro_Producto]" +
                        "           ,[Secuencia_Usuario]" +
                        "           ,[Cantidad_Producto]" +
                        "           ,[Fecha_Registro])" +
                        "     VALUES" +
                        "           ("+secuencia + ","+usuario+","+nuevaExistencia +",'"+ HoraActual() +"')");
                        
                        
                        } catch (SQLException ex) {
                Logger.getLogger(Ventana_Añadir_Exitencia.class.getName()).log(Level.SEVERE, null, ex);
            }
                    
                    
        }else{
            JOptionPane.showMessageDialog(null, "no selecciono ningun Producto");
        }
        

    }
    public String HoraActual(){
        
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd "); 
        Calendar cal = Calendar.getInstance(); 
        return dateFormat.format(cal.getTime());
        
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelPrincipal = new javax.swing.JPanel();
        Lbl_Descripcion = new javax.swing.JLabel();
        BotonAgregar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Txt_Nueva_Existencia = new javax.swing.JTextField();
        BotonSalir = new javax.swing.JButton();
        Txt_Descripcion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Lbl_Descripcion.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Lbl_Descripcion.setText("Producto: ");

        BotonAgregar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        BotonAgregar.setText("Agregar");
        BotonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAgregarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Nueva Existencia:");

        BotonSalir.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        BotonSalir.setText("Salir");
        BotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalirActionPerformed(evt);
            }
        });

        Txt_Descripcion.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        javax.swing.GroupLayout PanelPrincipalLayout = new javax.swing.GroupLayout(PanelPrincipal);
        PanelPrincipal.setLayout(PanelPrincipalLayout);
        PanelPrincipalLayout.setHorizontalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                .addGap(0, 59, Short.MAX_VALUE)
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                        .addComponent(BotonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addComponent(BotonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                        .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Lbl_Descripcion)
                            .addComponent(jLabel1))
                        .addGap(47, 47, 47)
                        .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Txt_Descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt_Nueva_Existencia, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(57, 57, 57))
        );
        PanelPrincipalLayout.setVerticalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Lbl_Descripcion)
                    .addComponent(Txt_Descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_Nueva_Existencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonAgregar)
                    .addComponent(BotonSalir))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirActionPerformed
       producto.dispose();
       new Mi_Frm_Inventario();
    }//GEN-LAST:event_BotonSalirActionPerformed

    private void BotonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAgregarActionPerformed

        actualizardatos();
        
    }//GEN-LAST:event_BotonAgregarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAgregar;
    private javax.swing.JButton BotonSalir;
    private javax.swing.JLabel Lbl_Descripcion;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JLabel Txt_Descripcion;
    private javax.swing.JTextField Txt_Nueva_Existencia;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
