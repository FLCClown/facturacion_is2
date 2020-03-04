/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Mc_frm_Registro_Clientes extends javax.swing.JFrame {

        private JFrame Usuarios = new JFrame();
    public Mc_frm_Registro_Clientes() {
        initComponents();
        
        Usuarios.setContentPane(PanelPrincipal);
        Usuarios.pack();
        Usuarios.setVisible(true);
        Usuarios.setLocationRelativeTo(null);
        Usuarios.setTitle("Registro Clientes");
        Usuarios.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupo1 = new javax.swing.ButtonGroup();
        PanelPrincipal = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Txt_Nombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Txt_Apellido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Txt_Identidad = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Txt_Telefono = new javax.swing.JTextField();
        Boton_Validar = new javax.swing.JButton();
        Boton_Registrar = new javax.swing.JButton();
        Boton_Salir = new javax.swing.JButton();
        Rb_Mayorista = new javax.swing.JRadioButton();
        Rb_Minorista = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Apellido");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("RTN / Nº Identidad");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("Telefono");

        Boton_Validar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Boton_Validar.setText("Validar");
        Boton_Validar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_ValidarActionPerformed(evt);
            }
        });

        Boton_Registrar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Boton_Registrar.setText("Registrar");
        Boton_Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_RegistrarActionPerformed(evt);
            }
        });

        Boton_Salir.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Boton_Salir.setText("Salir");
        Boton_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_SalirActionPerformed(evt);
            }
        });

        grupo1.add(Rb_Mayorista);
        Rb_Mayorista.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Rb_Mayorista.setText("Mayorista");

        grupo1.add(Rb_Minorista);
        Rb_Minorista.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Rb_Minorista.setText("Minorista");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setText("Tipo de Cliente");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Rb_Mayorista)
                        .addGap(18, 18, 18)
                        .addComponent(Rb_Minorista))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Boton_Validar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(Boton_Registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(Boton_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 142, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Txt_Identidad, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Txt_Nombre))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Txt_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(Txt_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Txt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Txt_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_Identidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addComponent(jLabel8)
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Rb_Mayorista)
                    .addComponent(Rb_Minorista))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Boton_Validar)
                    .addComponent(Boton_Registrar)
                    .addComponent(Boton_Salir))
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registro de Clientes");

        javax.swing.GroupLayout PanelPrincipalLayout = new javax.swing.GroupLayout(PanelPrincipal);
        PanelPrincipal.setLayout(PanelPrincipalLayout);
        PanelPrincipalLayout.setHorizontalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelPrincipalLayout.setVerticalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Boton_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_SalirActionPerformed
        Usuarios.dispose();
        new Ms_Frm_Principal();
    }//GEN-LAST:event_Boton_SalirActionPerformed

    private void Boton_ValidarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_ValidarActionPerformed
        validardatos();
    }//GEN-LAST:event_Boton_ValidarActionPerformed

    private void Boton_RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_RegistrarActionPerformed
        
        int var = validardatos();
        if(var==1){
            insertarcliente();
            
        }else{
            JOptionPane.showMessageDialog(null, "Validacion Incorrecta");
        
        }
    }//GEN-LAST:event_Boton_RegistrarActionPerformed

    
   
    
    public String HoraActual(){
        
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd "); 
        Calendar cal = Calendar.getInstance(); 
        return dateFormat.format(cal.getTime());
        
    
    }
    
    private int tipoUsuario(){
        
        int Tipo =0;
        if(Rb_Mayorista.isSelected())
            Tipo=1;
        if(Rb_Minorista.isSelected())
            Tipo = 2;
        return Tipo;
    }
    
    private int validardatos(){
        int c = 1;

            if(Txt_Nombre.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Por favor llene el campo nombre");
                c=0;
            }
            if(Txt_Apellido.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Por favor Confirme la Apellido");
                
                c=0;
            }
            
            if(Txt_Identidad.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Por favor llene el campo Direccion");
                c=0;
            }
            if(Txt_Telefono.getText().equals("")){
                 JOptionPane.showMessageDialog(null, "Por favor llene el campo Telefono");            
                c=0;
            }
            
            
            
        if(c==1){
            JOptionPane.showMessageDialog(null, "Datos Correctos");
            
        }
        return c;
    
    }
    
    private void insertarcliente(){
    
        Ms_Conexion conexion = new Ms_Conexion();
        
        try {
            conexion.Insertar("INSERT INTO [dbo].[TBL_MC_REGISTRO_MAESTRO_CLIENTES]  ([Telefono],[Nombre_Cliente],[Apellido_Cliente],[RTN_Cliente],[Fecha_Creacion_Registro_Cliente],[Fecha_Actualizacion_Registro_Cliente],[Secuencia_Tipo_Cliente])\n" +
                "     VALUES  ( '"+Txt_Telefono.getText()+"','"+Txt_Nombre.getText()+ "','"+Txt_Apellido.getText() +"','"+Txt_Identidad.getText()+"','"+HoraActual()+"','"+HoraActual()+"',"+tipoUsuario()+"  )");
        } catch (Exception e) {
        }
    
    
    }
        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_Registrar;
    private javax.swing.JButton Boton_Salir;
    private javax.swing.JButton Boton_Validar;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JRadioButton Rb_Mayorista;
    private javax.swing.JRadioButton Rb_Minorista;
    private javax.swing.JTextField Txt_Apellido;
    private javax.swing.JTextField Txt_Identidad;
    private javax.swing.JTextField Txt_Nombre;
    private javax.swing.JTextField Txt_Telefono;
    private javax.swing.ButtonGroup grupo1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
