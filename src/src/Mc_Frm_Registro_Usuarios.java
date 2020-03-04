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
import javax.naming.spi.DirStateFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import jdk.nashorn.internal.scripts.JO;

/**
 *
 * @author Membreño
 */
public class Mc_Frm_Registro_Usuarios extends javax.swing.JFrame {

    private JFrame Usuarios = new JFrame();
    /**
     * Creates new form Mc_Frm_Registro_Clientes
     */
    public Mc_Frm_Registro_Usuarios() {
        initComponents();
        Usuarios.setContentPane(PanelPrincipal);
        Usuarios.pack();
        Usuarios.setVisible(true);
        Usuarios.setLocationRelativeTo(null);
        Usuarios.setTitle("Ventana Principal");
        Usuarios.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        try {
            ResultSet preguntas = Ms_Conexion.Consulta("SELECT [Descripcion_Preguntas] FROM [SRV_BD_APP_SINVEN].[dbo].[TBL_MS_PREGUNTAS_RECUPERACION]");
            while(preguntas.next()){
                BoxPregunta1.addItem(preguntas.getString(1));
                BoxPregunta2.addItem(preguntas.getString(1));
                BoxPregunta3.addItem(preguntas.getString(1));            
            }                        
        } catch (Exception e) {
            
        }  
       
        
    }
    
    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Grupo1 = new javax.swing.ButtonGroup();
        PanelPrincipal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        BoxPregunta2 = new javax.swing.JComboBox<>();
        TxtRespuesta1 = new javax.swing.JTextField();
        TxtRespuesta2 = new javax.swing.JTextField();
        TxtRespuesta3 = new javax.swing.JTextField();
        BoxPregunta1 = new javax.swing.JComboBox<>();
        BoxPregunta3 = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Boton_registrar_Usuario = new javax.swing.JButton();
        Boton_Menu_Principal = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        Txt_Confirmar_Contrasenia = new javax.swing.JPasswordField();
        Txt_Confirmar_Contraseña = new javax.swing.JLabel();
        Txt_Contrasenia = new javax.swing.JPasswordField();
        Lbl_Contrasenia = new javax.swing.JLabel();
        Txt_Id_Uduario = new javax.swing.JTextField();
        Lbl_Id_Usuario = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Cbb_Dia_Nacimiento = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        Cbb_Mes_Nacimiento = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        Cbb_Año_Nacimiento = new javax.swing.JComboBox<>();
        Lbl_Fecha_Nacimiento = new javax.swing.JLabel();
        Txt_Apellido_Usuario = new javax.swing.JTextField();
        Lbl_Apellido_Usuario = new javax.swing.JLabel();
        Txt_Nombre_Usuario = new javax.swing.JTextField();
        Lbl_NombreUsuario = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Tipo_Administrador = new javax.swing.JRadioButton();
        Tipo_Vendedor = new javax.swing.JRadioButton();
        Boton_ValidaDatos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registro de Usuarios");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Preguntas de Recuperacion");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BoxPregunta1, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(BoxPregunta2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtRespuesta1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtRespuesta2, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtRespuesta3, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 46, Short.MAX_VALUE))
            .addComponent(BoxPregunta3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(29, 29, 29)
                .addComponent(BoxPregunta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(TxtRespuesta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(BoxPregunta2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(TxtRespuesta2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(BoxPregunta3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(TxtRespuesta3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Boton_registrar_Usuario.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Boton_registrar_Usuario.setText("Registrar");
        Boton_registrar_Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_registrar_UsuarioActionPerformed(evt);
            }
        });

        Boton_Menu_Principal.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Boton_Menu_Principal.setText("Salir");
        Boton_Menu_Principal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_Menu_PrincipalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(Boton_registrar_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                .addComponent(Boton_Menu_Principal, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Boton_registrar_Usuario)
                    .addComponent(Boton_Menu_Principal))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Txt_Confirmar_Contraseña.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Txt_Confirmar_Contraseña.setText("Confirmar Contraseña");

        Lbl_Contrasenia.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Lbl_Contrasenia.setText("Contraseña:");

        Lbl_Id_Usuario.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Lbl_Id_Usuario.setText("Usuario:");

        jLabel5.setText("Dia:");

        Cbb_Dia_Nacimiento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        jLabel6.setText("Mes: ");

        Cbb_Mes_Nacimiento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));

        jLabel7.setText("Año:");

        Cbb_Año_Nacimiento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019" }));

        Lbl_Fecha_Nacimiento.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Lbl_Fecha_Nacimiento.setText("Fecha de Nacimiento");

        Lbl_Apellido_Usuario.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Lbl_Apellido_Usuario.setText("Apellidos");

        Txt_Nombre_Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_Nombre_UsuarioActionPerformed(evt);
            }
        });

        Lbl_NombreUsuario.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Lbl_NombreUsuario.setText("Nombres");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Tipo de Usuario");

        Grupo1.add(Tipo_Administrador);
        Tipo_Administrador.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Tipo_Administrador.setText("Adminitrador");

        Grupo1.add(Tipo_Vendedor);
        Tipo_Vendedor.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Tipo_Vendedor.setText("Vendedor");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addGap(23, 23, 23)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Lbl_NombreUsuario)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Lbl_Apellido_Usuario)
                                    .addComponent(Txt_Nombre_Usuario, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
                                    .addComponent(Txt_Apellido_Usuario))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(18, 18, 18)
                                    .addComponent(Cbb_Dia_Nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Cbb_Mes_Nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(Cbb_Año_Nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(Lbl_Fecha_Nacimiento)
                            .addGap(103, 103, 103)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Lbl_Id_Usuario)
                                .addComponent(Lbl_Contrasenia)
                                .addComponent(Txt_Confirmar_Contraseña)
                                .addComponent(Txt_Confirmar_Contrasenia, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
                                .addComponent(Txt_Contrasenia)
                                .addComponent(Txt_Id_Uduario))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(Tipo_Administrador)
                                .addGap(43, 43, 43)
                                .addComponent(Tipo_Vendedor)))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 31, Short.MAX_VALUE)
                .addComponent(Lbl_NombreUsuario)
                .addGap(18, 18, 18)
                .addComponent(Txt_Nombre_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(Lbl_Apellido_Usuario)
                .addGap(18, 18, 18)
                .addComponent(Txt_Apellido_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(Lbl_Fecha_Nacimiento)
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Cbb_Dia_Nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(Cbb_Mes_Nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(Cbb_Año_Nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(Lbl_Id_Usuario)
                .addGap(18, 18, 18)
                .addComponent(Txt_Id_Uduario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(Lbl_Contrasenia)
                .addGap(18, 18, 18)
                .addComponent(Txt_Contrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(Txt_Confirmar_Contraseña)
                .addGap(18, 18, 18)
                .addComponent(Txt_Confirmar_Contrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tipo_Administrador)
                    .addComponent(Tipo_Vendedor))
                .addGap(32, 32, 32))
        );

        Boton_ValidaDatos.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Boton_ValidaDatos.setText("Validar Datos");
        Boton_ValidaDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_ValidaDatosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelPrincipalLayout = new javax.swing.GroupLayout(PanelPrincipal);
        PanelPrincipal.setLayout(PanelPrincipalLayout);
        PanelPrincipalLayout.setHorizontalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPrincipalLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(122, 122, 122))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPrincipalLayout.createSequentialGroup()
                        .addComponent(Boton_ValidaDatos)
                        .addGap(240, 240, 240))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPrincipalLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62))))
        );
        PanelPrincipalLayout.setVerticalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(Boton_ValidaDatos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Boton_Menu_PrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_Menu_PrincipalActionPerformed
        // TODO add your handling code here:
        Usuarios.dispose();
        new Ms_Frm_Principal();
    }//GEN-LAST:event_Boton_Menu_PrincipalActionPerformed

    private void Boton_registrar_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_registrar_UsuarioActionPerformed
                int var = validardatos();
                if(var ==1){
                InsertarNuevousuario();
                
                }else{JOptionPane.showMessageDialog(null, "Validacion incorrecta");}
        
        
    }//GEN-LAST:event_Boton_registrar_UsuarioActionPerformed
    
    
    public String HoraActual(){
        
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd "); 
        Calendar cal = Calendar.getInstance(); 
        return dateFormat.format(cal.getTime());
        
    
    }
    
    private int tipoUsuario(){
        
        int Tipo =0;
        if(Tipo_Administrador.isSelected())
            Tipo=1;
        if(Tipo_Vendedor.isSelected())
            Tipo = 2;
        return Tipo;
    }
    
    public String fechaNacimiento (){
        String fechaNacimiento = "";  
        String mes = "";
        if(Cbb_Mes_Nacimiento.getSelectedItem().toString().equals("Enero"))
                mes="01";
        if(Cbb_Mes_Nacimiento.getSelectedItem().toString().equals("Febrero"))
                mes="02";
        if(Cbb_Mes_Nacimiento.getSelectedItem().toString().equals("Marzo"))
                mes="03";
        if(Cbb_Mes_Nacimiento.getSelectedItem().toString().equals("Abril"))
                mes="04";
        if(Cbb_Mes_Nacimiento.getSelectedItem().toString().equals("Mayo"))
                mes="05";
        if(Cbb_Mes_Nacimiento.getSelectedItem().toString().equals("Junio"))
                mes="06";
        if(Cbb_Mes_Nacimiento.getSelectedItem().toString().equals("Julio"))
                mes="07";
        if(Cbb_Mes_Nacimiento.getSelectedItem().toString().equals("Agosto"))
                mes="08";
        if(Cbb_Mes_Nacimiento.getSelectedItem().toString().equals("Septiembre"))
                mes="09";
        if(Cbb_Mes_Nacimiento.getSelectedItem().toString().equals("Octubre"))
                mes="10";
        if(Cbb_Mes_Nacimiento.getSelectedItem().toString().equals("Noviembre"))
                mes="11";
        if(Cbb_Mes_Nacimiento.getSelectedItem().toString().equals("Diciembre"))
                mes="12";
        
        fechaNacimiento=Cbb_Año_Nacimiento.getSelectedItem().toString()+"-"+mes+"-"+Cbb_Dia_Nacimiento.getSelectedItem().toString();          
         
        return fechaNacimiento;
    }
    
    private void InsertarNuevousuario (){
        String resultado = "";
        Ms_Conexion conexion = new Ms_Conexion();
        System.out.println(HoraActual());
        char passArray[] = Txt_Contrasenia.getPassword();        
            String pass1 = new String(passArray);
        try {
            conexion.Insertar("INSERT INTO [dbo].[TBL_MS_REGISTRO_USUARIO]" +
                    "           ([Id_Usuario]" +
                    "           ,[Contrasenia]" +
                    "           ,[Nombre_Usuario]" +
                    "           ,[Apellido_Usuario]" +
                    "           ,[Fecha_Nacimiento]" +
                    "           ,[Fecha_Creacion_Registo_Usuario]" +
                    "           ,[Fecha_Actualizacion_Registro_Usuario]" +
                    "           ,[Fecha_Cambio_Contrasenia]" +
                    "           ,[Codigo_Estado_Usuario]" +
                    "           ,[Codigo_Tipo_Usuario])" +
                    "     VALUES" + "( '"+Txt_Id_Uduario.getText() + "',"+"'" + pass1 + "'," + "'"+ Txt_Nombre_Usuario.getText()+"',"+ "'"+Txt_Apellido_Usuario.getText()+"',"+
                     "'"+ fechaNacimiento()+"',"+"'"+HoraActual()+"','"+HoraActual()+"','"+HoraActual()+"',"+ 1 + ","+ tipoUsuario()+   ")");
                        
        } catch (SQLException ex) {
            Logger.getLogger(Mc_Frm_Registro_Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        ResultSet ultimodatosecuencia = conexion.Consulta("SELECT TOP (1) [Secuencia_Usuario]" +"  FROM [SRV_BD_APP_SINVEN].[dbo].[TBL_MS_REGISTRO_USUARIO]" +"  ORDER BY [Secuencia_Usuario] DESC");
        
        
        try {
            ultimodatosecuencia.next();
        } catch (Exception e) {
        }
        try {
           resultado = ultimodatosecuencia.getString("Secuencia_Usuario");
            System.out.println(resultado);
        } catch (Exception e) {
        }
        
        try {
            conexion.Insertar("INSERT INTO [dbo].[TBL_MS_RESPUESTAS_RECUPERACION]" +
                    "           ([Secuencia_Usuario]" +
                    "           ,[Descripcion_Respuesta]" +
                    "           ,[Fecha_Creacion_Registro_Respuesta_Usuario]" +
                    "           ,[Fecha_Actualizacion_Registro_Repuesta_Usuario]" +
                    "           ,[Registro_Activo_Respuesta])" +
                    "     VALUES" + " ("+ resultado +",'"+ TxtRespuesta1.getText()+"','"+HoraActual()+"','"+HoraActual()+"',"+1+ ")");
                 
        } catch (SQLException ex) {
            Logger.getLogger(Mc_Frm_Registro_Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conexion.Insertar("INSERT INTO [dbo].[TBL_MS_RESPUESTAS_RECUPERACION]" +
                    "           ([Secuencia_Usuario]" +
                    "           ,[Descripcion_Respuesta]" +
                    "           ,[Fecha_Creacion_Registro_Respuesta_Usuario]" +
                    "           ,[Fecha_Actualizacion_Registro_Repuesta_Usuario]" +
                    "           ,[Registro_Activo_Respuesta])" +
                    "     VALUES" + " ('"+ resultado +"','"+ TxtRespuesta2.getText()+"','"+HoraActual()+"','"+HoraActual()+"',"+1+ ")");
        } catch (SQLException ex) {
            Logger.getLogger(Mc_Frm_Registro_Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conexion.Insertar("INSERT INTO [dbo].[TBL_MS_RESPUESTAS_RECUPERACION]" +
                    "           ([Secuencia_Usuario]" +
                    "           ,[Descripcion_Respuesta]" +
                    "           ,[Fecha_Creacion_Registro_Respuesta_Usuario]" +
                    "           ,[Fecha_Actualizacion_Registro_Repuesta_Usuario]" +
                    "           ,[Registro_Activo_Respuesta])" +
                    "     VALUES" + " ('"+ resultado +"','"+ TxtRespuesta3.getText()+"','"+HoraActual()+"','"+HoraActual()+"',"+1+ ")");
        } catch (SQLException ex) {
            Logger.getLogger(Mc_Frm_Registro_Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        
    }
    
    
    
    
    private void Boton_ValidaDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_ValidaDatosActionPerformed
        // TODO add your handling code here:
        validardatos();
        
    }//GEN-LAST:event_Boton_ValidaDatosActionPerformed

    private void Txt_Nombre_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_Nombre_UsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_Nombre_UsuarioActionPerformed
    
    
    
    private int validardatos(){
        int c = 1;
        
        
            char passArray[] = Txt_Contrasenia.getPassword();        
            String pass1 = new String(passArray);
            
            char passArray2[] = Txt_Confirmar_Contrasenia.getPassword();        
            String Confirmpass = new String(passArray2);
            
        
            if(pass1.equals("")){
                JOptionPane.showMessageDialog(null, "Por favor llene el campo Contraseña");
                c=0;
            }
            if(Confirmpass.equals("")){
                JOptionPane.showMessageDialog(null, "Por favor Confirme la contraseña");
                
                c=0;
            }
            if(Confirmpass.equals(pass1)){                                      
                }else{
                JOptionPane.showMessageDialog(null, "las contraseñas no coinciden");
                    c=0;
                    JOptionPane.showMessageDialog(null, pass1 + "\n" + Confirmpass);            
            }
            if(Txt_Nombre_Usuario.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Por favor llene el campo NOMBRE");
                c=0;
            }
            if(Txt_Apellido_Usuario.getText().equals("")){
                 JOptionPane.showMessageDialog(null, "Por favor llene el campo APELLIDO");            
                c=0;
            }
            if(Txt_Id_Uduario.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Por favor llene el campo ID DEL USUARIO");
                c=0;
            }
            if(TxtRespuesta1.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Por favor llene el campo de respuesta 1");
                c=0;
            }
            if(TxtRespuesta2.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Por favor llene el campo de respuesta 2");
                c=0;
            }
            if(TxtRespuesta3.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Por favor llene el campo de respuesta 3"); 
                    c=0;                
            }
            
            
        if(c==1){
            JOptionPane.showMessageDialog(null, "Datos Correctos");
            System.out.println(pass1 + "\n" + Confirmpass );
        }              
    
        return c;
    }
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_Menu_Principal;
    private javax.swing.JButton Boton_ValidaDatos;
    private javax.swing.JButton Boton_registrar_Usuario;
    private javax.swing.JComboBox<String> BoxPregunta1;
    private javax.swing.JComboBox<String> BoxPregunta2;
    private javax.swing.JComboBox<String> BoxPregunta3;
    private javax.swing.JComboBox<String> Cbb_Año_Nacimiento;
    private javax.swing.JComboBox<String> Cbb_Dia_Nacimiento;
    private javax.swing.JComboBox<String> Cbb_Mes_Nacimiento;
    private javax.swing.ButtonGroup Grupo1;
    private javax.swing.JLabel Lbl_Apellido_Usuario;
    private javax.swing.JLabel Lbl_Contrasenia;
    private javax.swing.JLabel Lbl_Fecha_Nacimiento;
    private javax.swing.JLabel Lbl_Id_Usuario;
    private javax.swing.JLabel Lbl_NombreUsuario;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JRadioButton Tipo_Administrador;
    private javax.swing.JRadioButton Tipo_Vendedor;
    private javax.swing.JTextField TxtRespuesta1;
    private javax.swing.JTextField TxtRespuesta2;
    private javax.swing.JTextField TxtRespuesta3;
    private javax.swing.JTextField Txt_Apellido_Usuario;
    private javax.swing.JPasswordField Txt_Confirmar_Contrasenia;
    private javax.swing.JLabel Txt_Confirmar_Contraseña;
    private javax.swing.JPasswordField Txt_Contrasenia;
    private javax.swing.JTextField Txt_Id_Uduario;
    private javax.swing.JTextField Txt_Nombre_Usuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
