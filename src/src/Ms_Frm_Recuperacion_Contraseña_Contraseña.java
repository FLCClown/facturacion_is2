/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Membreño
 */
public class Ms_Frm_Recuperacion_Contraseña_Contraseña extends javax.swing.JFrame {

    private JFrame Recuperacion = new JFrame();
    /**
     * Creates new form Ms_Frm_Recuperacion_Contraseña_Contraseña
     */
    public Ms_Frm_Recuperacion_Contraseña_Contraseña() {
        initComponents();
        Recuperacion.setContentPane(PanelPrincipal);
        
        Recuperacion.pack();
        
        Recuperacion.setVisible(true);
        
        Recuperacion.setLocationRelativeTo(null);
        
        Recuperacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                 
        Recuperacion.setTitle("Recuperacion de contraseña");
    }

    Ms_Conexion conexion = new Ms_Conexion();
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelPrincipal = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Txt_Contraseña1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Txt_Contraseña2 = new javax.swing.JTextField();
        Boton_Actualizar = new javax.swing.JButton();
        Boton_salir = new javax.swing.JButton();
        Boton_Verificar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setText("asistente de recuperacion de contraseña");

        jLabel1.setText("Ingrese nueva contraseña");

        jLabel3.setText("Repita la nueva contraseña");

        Boton_Actualizar.setText("Actualizar");
        Boton_Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_ActualizarActionPerformed(evt);
            }
        });

        Boton_salir.setText("Salir");
        Boton_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_salirActionPerformed(evt);
            }
        });

        Boton_Verificar.setText("Verificar");
        Boton_Verificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_VerificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelPrincipalLayout = new javax.swing.GroupLayout(PanelPrincipal);
        PanelPrincipal.setLayout(PanelPrincipalLayout);
        PanelPrincipalLayout.setHorizontalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                        .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                                .addGap(115, 115, 115)
                                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)))
                            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(Boton_Verificar, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(Boton_Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66)
                                .addComponent(Boton_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Txt_Contraseña1)
                                    .addComponent(Txt_Contraseña2, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)))))
                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(jLabel2)))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        PanelPrincipalLayout.setVerticalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel2)
                .addGap(86, 86, 86)
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Txt_Contraseña1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Txt_Contraseña2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Boton_Actualizar)
                    .addComponent(Boton_salir)
                    .addComponent(Boton_Verificar))
                .addGap(32, 32, 32))
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

    private void Boton_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_salirActionPerformed
        // TODO add your handling code here:
        new Ms_Frm_Login();
        Recuperacion.dispose();
    }//GEN-LAST:event_Boton_salirActionPerformed
    
    
    public int verificarContraseñas (){
        int var = 0;
        if( Txt_Contraseña1.getText().isEmpty()){
        
        }else{var++;}
            
        
        if(Txt_Contraseña1.getText().equals(Txt_Contraseña2.getText()) )   
            var++;
        
        return var;
        
    }
    
    
    private void Boton_VerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_VerificarActionPerformed
        // TODO add your handling code here:
        int var = verificarContraseñas();
        if (var==2){
                    conexion.update("UPDATE [dbo].[TBL_MS_REGISTRO_USUARIO]SET [Contrasenia] = '"+Txt_Contraseña1.getText()+"'WHERE Secuencia_Usuario="+MS_Frm_Recuperacion_Contraseña_Reconocer_Usuaraio.Secuencia_Usuario);

        }else{
        
            JOptionPane.showMessageDialog(null, "Digite dos contraseñas iguales");
            Txt_Contraseña1.setText("");
            Txt_Contraseña2.setText("");
        }
    }//GEN-LAST:event_Boton_VerificarActionPerformed

    private void Boton_ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_ActualizarActionPerformed
        
            int var = verificarContraseñas();
        if (var==2){
            
             if(Txt_Contraseña1.getText().equals(Txt_Contraseña2.getText()) )
                    conexion.update("UPDATE [dbo].[TBL_MS_REGISTRO_USUARIO]SET [Contrasenia] = '"+Txt_Contraseña1.getText()+"'WHERE Secuencia_Usuario="+MS_Frm_Recuperacion_Contraseña_Reconocer_Usuaraio.Secuencia_Usuario);

        }else{
        
            JOptionPane.showMessageDialog(null, "Digite dos contraseñas iguales");
            Txt_Contraseña1.setText("");
            Txt_Contraseña2.setText("");
        }        
    }//GEN-LAST:event_Boton_ActualizarActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_Actualizar;
    private javax.swing.JButton Boton_Verificar;
    private javax.swing.JButton Boton_salir;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JTextField Txt_Contraseña1;
    private javax.swing.JTextField Txt_Contraseña2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
