/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;


import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.UIManager;




import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UnsupportedLookAndFeelException;
public class Ms_Frm_Login extends javax.swing.JFrame {

    private JFrame login = new JFrame();
    
    public static int UsuarioId = 0;
    public static int TipoUsuario = 0;
    
    public Ms_Frm_Login() {
        
        initComponents();
        
       
        
        login.setContentPane(PanelPrincipal);
        
        login.pack();
        
        login.setVisible(true);
        
        login.setLocationRelativeTo(null);
        
        login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                 
        login.setTitle("Inicio De Sesion");
        
        login.setResizable(false);
         
        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.mint.MintLookAndFeel");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Ms_Frm_Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Ms_Frm_Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Ms_Frm_Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Ms_Frm_Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelPrincipal = new javax.swing.JPanel();
        InicioSesionBotton = new javax.swing.JButton();
        BotonSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Txt_Id_Usuario = new javax.swing.JTextField();
        Txt_Contraseña_Usuaro = new javax.swing.JPasswordField();
        Boton_Olvido_Conraseña = new javax.swing.JToggleButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        PanelPrincipal.setPreferredSize(new java.awt.Dimension(400, 500));
        PanelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        InicioSesionBotton.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        InicioSesionBotton.setText("Inicio de Sesión");
        InicioSesionBotton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        InicioSesionBotton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InicioSesionBottonActionPerformed(evt);
            }
        });
        PanelPrincipal.add(InicioSesionBotton, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 380, -1, 40));

        BotonSalir.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        BotonSalir.setText("Salir");
        BotonSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalirActionPerformed(evt);
            }
        });
        PanelPrincipal.add(BotonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 150, 40));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setText("Hacienda Pueblo Viejo S. de RL");
        PanelPrincipal.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, 90));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setText("Usuario:");
        PanelPrincipal.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel3.setText("Contraseña:");
        PanelPrincipal.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        Txt_Id_Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_Id_UsuarioActionPerformed(evt);
            }
        });
        PanelPrincipal.add(Txt_Id_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 190, -1));

        Txt_Contraseña_Usuaro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_Contraseña_UsuaroActionPerformed(evt);
            }
        });
        Txt_Contraseña_Usuaro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Txt_Contraseña_UsuaroKeyPressed(evt);
            }
        });
        PanelPrincipal.add(Txt_Contraseña_Usuaro, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 190, -1));

        Boton_Olvido_Conraseña.setText("¿Olvidaste tu Contraseña?");
        Boton_Olvido_Conraseña.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Boton_Olvido_Conraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_Olvido_ConraseñaActionPerformed(evt);
            }
        });
        PanelPrincipal.add(Boton_Olvido_Conraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 470, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel4.setText("Bienvenido");
        PanelPrincipal.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 120, 60));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo_Inicio_Sesion.jpg"))); // NOI18N
        PanelPrincipal.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_BotonSalirActionPerformed
    
    public void Usuario(){
        
        ResultSet consulta = Ms_Conexion.Consulta("SELECT [Secuencia_Usuario],[Codigo_Tipo_Usuario] "
                + "FROM [dbo].[TBL_MS_REGISTRO_USUARIO]"
                + "WHERE Id_Usuario = '" + Txt_Id_Usuario.getText() + "'");

        try {
            consulta.next();
        } catch (SQLException ex) {
            Logger.getLogger(Ms_Frm_Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {      
            UsuarioId=consulta.getInt("Secuencia_Usuario");
            TipoUsuario=consulta.getInt(2);
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Ms_Frm_Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    private void InicioSesionBottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InicioSesionBottonActionPerformed
       
        
        String Resultado="";
        
        ResultSet consulta = Ms_Conexion.Consulta("SELECT [Contrasenia] "
                + "FROM [dbo].[TBL_MS_REGISTRO_USUARIO]"
                + "WHERE Id_Usuario = '" + Txt_Id_Usuario.getText() + "'");
         
               
        char passArray[] = Txt_Contraseña_Usuaro.getPassword();        
        String pass = new String(passArray);
        
        
        try {
            consulta.next();
        } catch (SQLException ex) {
            Logger.getLogger(Ms_Frm_Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {      
            Resultado=consulta.getString("contrasenia");
            Resultado = Resultado.trim();
            
        } catch (SQLException ex) {
            Logger.getLogger(Ms_Frm_Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
                            
        if(pass.equals(Resultado) && !Resultado.isEmpty()){                                                  
            Usuario() ;        
            login.dispose();
            new Ms_Frm_Principal(); 
                    
        }else{
            
            JOptionPane.showMessageDialog(null, "Datos Incorrectos","Erroe de Conexion",JOptionPane.ERROR_MESSAGE);
            Txt_Id_Usuario.setText( "");
            Txt_Contraseña_Usuaro.setText( "");
        }
        
        
    }//GEN-LAST:event_InicioSesionBottonActionPerformed

    private void Boton_Olvido_ConraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_Olvido_ConraseñaActionPerformed
        login.dispose();
        new MS_Frm_Recuperacion_Contraseña_Reconocer_Usuaraio();
        
    }//GEN-LAST:event_Boton_Olvido_ConraseñaActionPerformed

    private void Txt_Id_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_Id_UsuarioActionPerformed
        Txt_Contraseña_Usuaro.requestFocus();
    }//GEN-LAST:event_Txt_Id_UsuarioActionPerformed

    private void Txt_Contraseña_UsuaroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_Contraseña_UsuaroActionPerformed
      
    }//GEN-LAST:event_Txt_Contraseña_UsuaroActionPerformed

    private void Txt_Contraseña_UsuaroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_Contraseña_UsuaroKeyPressed
      /*  if(evt.getKeyCode()== KeyEvent.VK_ENTER){
        
        if(Ms_Conexion.getstatus() ){
             login.dispose();
        new Ms_Frm_Principal();
        
        }else{
            JOptionPane.showMessageDialog(null, "Datos Incorrectos","Erroe de Conexion",JOptionPane.ERROR_MESSAGE);
            Txt_Id_Usuario.setText( "");
            Txt_Contraseña_Usuaro.setText( "");
        }
        
        }*/
    }//GEN-LAST:event_Txt_Contraseña_UsuaroKeyPressed

    
    
    public static void main(String args[]) {
        new Ms_Frm_Login();
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonSalir;
    private javax.swing.JToggleButton Boton_Olvido_Conraseña;
    private javax.swing.JButton InicioSesionBotton;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JPasswordField Txt_Contraseña_Usuaro;
    private javax.swing.JTextField Txt_Id_Usuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}

