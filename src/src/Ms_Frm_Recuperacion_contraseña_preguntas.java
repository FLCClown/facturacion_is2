/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Membreño
 */
public class Ms_Frm_Recuperacion_contraseña_preguntas extends javax.swing.JFrame {
    
    private JFrame Recuperacion = new JFrame();

    /**
     * Creates new form Ms_Frm_Recuperacion_contraseña_Principal
     */
    public Ms_Frm_Recuperacion_contraseña_preguntas() {
        initComponents();
        
        Recuperacion.setContentPane(PanelPrincipal);
        
        Recuperacion.pack();
        
        Recuperacion.setVisible(true);
        
        Recuperacion.setLocationRelativeTo(null);
        
        Recuperacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                 
        Recuperacion.setTitle("Recuperacion de contraseña");
        Lbl_usuario.setText(MS_Frm_Recuperacion_Contraseña_Reconocer_Usuaraio.Id_Usuario);
        
        try {
            ResultSet preguntas = Ms_Conexion.Consulta("SELECT [Descripcion_Preguntas] FROM [SRV_BD_APP_SINVEN].[dbo].[TBL_MS_PREGUNTAS_RECUPERACION]");
            while(preguntas.next()){
                Pregunta_1_Lista.addItem(preguntas.getString(1));
                Pregunta_2_lista.addItem(preguntas.getString(1));
                Pregunta_3_lista.addItem(preguntas.getString(1));            
            }                        
        } catch (Exception e) {
        }
    }
    public static boolean verificarrespuest1 = false;
    public static boolean verificarrespuest2 = false;
    public static boolean verificarrespuest3 = false;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelPrincipal = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Pregunta_1_Lista = new javax.swing.JComboBox<>();
        Pregunta_2_lista = new javax.swing.JComboBox<>();
        Pregunta_3_lista = new javax.swing.JComboBox<>();
        Descripcion_Respuesta_1 = new javax.swing.JTextField();
        Descripcion_Respuesta_2 = new javax.swing.JTextField();
        Descripcion_Respuesta_3 = new javax.swing.JTextField();
        Boton_salir = new javax.swing.JButton();
        Boton_Siguiente = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Lbl_usuario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setText("asistente de recuperacion de contraseña");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setText("Selecione las preguntas de seguridad con su respectiva respuesta");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel3.setText(" para poder reestablecer su contraseña");

        Pregunta_1_Lista.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Pregunta_1_Lista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pregunta_1_ListaActionPerformed(evt);
            }
        });

        Pregunta_2_lista.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        Pregunta_3_lista.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        Boton_salir.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Boton_salir.setText("Salir");
        Boton_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_salirActionPerformed(evt);
            }
        });

        Boton_Siguiente.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Boton_Siguiente.setText("Siguiente");
        Boton_Siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_SiguienteActionPerformed(evt);
            }
        });

        Lbl_usuario.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        javax.swing.GroupLayout PanelPrincipalLayout = new javax.swing.GroupLayout(PanelPrincipal);
        PanelPrincipal.setLayout(PanelPrincipalLayout);
        PanelPrincipalLayout.setHorizontalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPrincipalLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Boton_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Boton_Siguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Descripcion_Respuesta_3, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(Descripcion_Respuesta_2, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Descripcion_Respuesta_1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Pregunta_1_Lista, 0, 397, Short.MAX_VALUE)
                                        .addComponent(Pregunta_2_lista, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Pregunta_3_lista, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(28, 28, 28)
                                        .addComponent(Lbl_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(0, 0, Short.MAX_VALUE))))))
                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(jLabel2)))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        PanelPrincipalLayout.setVerticalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2)
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(Lbl_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addComponent(Pregunta_1_Lista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Descripcion_Respuesta_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(Pregunta_2_lista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Descripcion_Respuesta_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(Pregunta_3_lista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Descripcion_Respuesta_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Boton_salir)
                    .addComponent(Boton_Siguiente))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Pregunta_1_ListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pregunta_1_ListaActionPerformed
  
    }//GEN-LAST:event_Pregunta_1_ListaActionPerformed
    
    private void consultaPregunta1 () {
       String[] respuestas = new String[3];
       
       int i = 0;
        ResultSet consultarespuesta = Ms_Conexion.Consulta("SELECT[Descripcion_Respuesta] "
                                + "FROM [SRV_BD_APP_SINVEN].[dbo].[TBL_MS_RESPUESTAS_RECUPERACION] "
                                + "WHERE [Secuencia_Usuario] = "+MS_Frm_Recuperacion_Contraseña_Reconocer_Usuaraio.Secuencia_Usuario);
         
            
        try {
            while(consultarespuesta.next()){               
                    respuestas[i++]= consultarespuesta.getString(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Ms_Frm_Recuperacion_contraseña_preguntas.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String dato1 = respuestas[0];
        dato1 = dato1.trim();
        String dato2 = respuestas[1];
        dato2 = dato2.trim();
        String dato3 = respuestas[2];
        dato3 = dato3.trim();
        System.out.println(dato1+dato2+dato3);
        if(dato1.equals(Descripcion_Respuesta_1.getText())){
            verificarrespuest1= true;
        }else{
            JOptionPane.showMessageDialog(null, "La Respuesta 1 es incorrecta");
        }
        if(dato2.equals(Descripcion_Respuesta_2.getText())){
            verificarrespuest2= true;
        }else{
            JOptionPane.showMessageDialog(null, "La Respuesta 2 es incorrecta");
        }
        if(dato3.equals(Descripcion_Respuesta_3.getText())){
            verificarrespuest3= true;
        }else{
            JOptionPane.showMessageDialog(null, "La Respuesta 3 es incorrecta");
        }
       

    }
    
    
    
    
    public int verificarrespuestas(){
        consultaPregunta1();
        int var = 0;
        if(verificarrespuest1==true){
            var++;
        }
        if(verificarrespuest2==true){
            var++;
        }
        if(verificarrespuest3==true){
            var++;
        }
        return var;
    }
    
        
    private void Boton_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_salirActionPerformed
        Recuperacion.dispose();
        new Ms_Frm_Login();       
    }//GEN-LAST:event_Boton_salirActionPerformed

    private void Boton_SiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_SiguienteActionPerformed
        
        int var = verificarrespuestas();
        if (var>=2){
            new Ms_Frm_Recuperacion_Contraseña_Contraseña();
            Recuperacion.dispose();  
        }else{
            JOptionPane.showMessageDialog(null, "hubo un error al comparar las respuestas INTENTELO DE NUEVO\n Verifique sus respuestas ");
            new MS_Frm_Recuperacion_Contraseña_Reconocer_Usuaraio();
            Recuperacion.dispose();
        }
        
    }//GEN-LAST:event_Boton_SiguienteActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_Siguiente;
    private javax.swing.JButton Boton_salir;
    private javax.swing.JTextField Descripcion_Respuesta_1;
    private javax.swing.JTextField Descripcion_Respuesta_2;
    private javax.swing.JTextField Descripcion_Respuesta_3;
    private javax.swing.JLabel Lbl_usuario;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JComboBox<String> Pregunta_1_Lista;
    private javax.swing.JComboBox<String> Pregunta_2_lista;
    private javax.swing.JComboBox<String> Pregunta_3_lista;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
