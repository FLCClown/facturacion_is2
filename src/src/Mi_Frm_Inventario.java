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
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Mi_Frm_Inventario extends javax.swing.JFrame {

    
    private JFrame Inventario = new JFrame();
    public static String secuenciaproducto="";
    public Mi_Frm_Inventario() {
        initComponents();
        
        Inventario.setContentPane(PanelPrincipal);
        Inventario.pack();
        Inventario.setVisible(true);
        Inventario.setLocationRelativeTo(null);
        Inventario.setTitle("Inventario");
        Inventario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
    }
   int tipousuario = Ms_Frm_Login.TipoUsuario;
    Ms_Conexion conexion = new Ms_Conexion();
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GrupoTipoGasto = new javax.swing.ButtonGroup();
        PanelPrincipal = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        Boton_Generar_Consultas = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tbl_Consultas = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        Txt_Datos_Buscar = new javax.swing.JTextField();
        Boton_buscar = new javax.swing.JButton();
        botoneditar = new javax.swing.JButton();
        Boton_salir_V2 = new javax.swing.JButton();
        BotonAñadirExistencia = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla_Reporte_Ingresos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        Cb_Dia = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        Cb_Mes = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        Cb_Año = new javax.swing.JComboBox<>();
        BotonBuscarRegistros = new javax.swing.JButton();
        BotonSalir = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        Txt_Descripcion_Gasto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Txt_Cantidad_Gasto = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        RadioGastoCorriente = new javax.swing.JRadioButton();
        Radiogastoventa = new javax.swing.JRadioButton();
        Boton_Guardar = new javax.swing.JButton();
        Boton_Salir = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        Txt_Cod_Productomuestra = new javax.swing.JTextField();
        Boton_Verificar_Cod = new javax.swing.JButton();
        Lbl_Texto_verificar_Nombre_Producto = new javax.swing.JLabel();
        Txt_Cantidad_Rebajar = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        BtonGuardarMuestras = new javax.swing.JButton();
        BotonSAlirMuestras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Boton_Generar_Consultas.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Boton_Generar_Consultas.setText("generar todos");
        Boton_Generar_Consultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_Generar_ConsultasActionPerformed(evt);
            }
        });

        Tbl_Consultas.setBackground(new java.awt.Color(240, 240, 240));
        Tbl_Consultas.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        Tbl_Consultas.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Tbl_Consultas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo Producto", "Descripcion_Producto", "Precio Mayorista", "Precio Minorista", "Existencia_Actual"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tbl_Consultas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Tbl_Consultas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tbl_ConsultasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tbl_Consultas);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("Buscar Producto: ");

        Boton_buscar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Boton_buscar.setText("Buscar");
        Boton_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_buscarActionPerformed(evt);
            }
        });

        botoneditar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        botoneditar.setText("editar");
        botoneditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botoneditarMouseClicked(evt);
            }
        });
        botoneditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botoneditarActionPerformed(evt);
            }
        });

        Boton_salir_V2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Boton_salir_V2.setText("salir");
        Boton_salir_V2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_salir_V2ActionPerformed(evt);
            }
        });

        BotonAñadirExistencia.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        BotonAñadirExistencia.setText("Añadir Existencia");
        BotonAñadirExistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAñadirExistenciaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(Txt_Datos_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(Boton_buscar))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(Boton_Generar_Consultas, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(71, 71, 71)
                                .addComponent(BotonAñadirExistencia)
                                .addGap(76, 76, 76)
                                .addComponent(botoneditar, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66)
                                .addComponent(Boton_salir_V2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 76, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Txt_Datos_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Boton_buscar))
                .addGap(57, 57, 57)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Boton_Generar_Consultas)
                    .addComponent(botoneditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Boton_salir_V2)
                    .addComponent(BotonAñadirExistencia))
                .addGap(102, 102, 102))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Consultar Productos", jPanel3);

        Tabla_Reporte_Ingresos.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Tabla_Reporte_Ingresos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo Producto", "Codigo Usuaro", "Cantidad Igresada", "Fecha Registro"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(Tabla_Reporte_Ingresos);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Dia:");

        Cb_Dia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Mes:");

        Cb_Mes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Año:");

        Cb_Año.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2019", "2020", "2021", "2022" }));

        BotonBuscarRegistros.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        BotonBuscarRegistros.setText("Buscar");
        BotonBuscarRegistros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBuscarRegistrosActionPerformed(evt);
            }
        });

        BotonSalir.setText("Salir");
        BotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 886, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(Cb_Dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Cb_Mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Cb_Año, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addComponent(BotonBuscarRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BotonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Cb_Dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(Cb_Mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(Cb_Año, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonBuscarRegistros))
                .addGap(52, 52, 52)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(BotonSalir)
                .addGap(36, 36, 36))
        );

        jTabbedPane1.addTab("Reporte Ingresos", jPanel1);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel4.setText("Descripcion del gasto");

        Txt_Descripcion_Gasto.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel5.setText("Cantidad");

        Txt_Cantidad_Gasto.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel7.setText("Tipo de Gasto");

        GrupoTipoGasto.add(RadioGastoCorriente);
        RadioGastoCorriente.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        RadioGastoCorriente.setText("Gasto Corriente");

        GrupoTipoGasto.add(Radiogastoventa);
        Radiogastoventa.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Radiogastoventa.setText("gasto de Venta");

        Boton_Guardar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Boton_Guardar.setText("Guardar");
        Boton_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_GuardarActionPerformed(evt);
            }
        });

        Boton_Salir.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Boton_Salir.setText("Salir");
        Boton_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_SalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Txt_Descripcion_Gasto, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(135, 135, 135)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt_Cantidad_Gasto, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Radiogastoventa)
                            .addComponent(RadioGastoCorriente))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Boton_Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(Boton_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(131, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Txt_Cantidad_Gasto, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_Descripcion_Gasto, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(RadioGastoCorriente)
                        .addGap(18, 18, 18)
                        .addComponent(Radiogastoventa)
                        .addContainerGap(27, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Boton_Guardar, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                            .addComponent(Boton_Salir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(55, 55, 55))))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 239, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Gastos", jPanel2);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel8.setText("Producto:");

        Txt_Cod_Productomuestra.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        Boton_Verificar_Cod.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        Boton_Verificar_Cod.setText("Verificar");
        Boton_Verificar_Cod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_Verificar_CodActionPerformed(evt);
            }
        });

        Lbl_Texto_verificar_Nombre_Producto.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        Txt_Cantidad_Rebajar.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel9.setText("Cantidad a rebajar:");

        BtonGuardarMuestras.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        BtonGuardarMuestras.setText("Guardar");
        BtonGuardarMuestras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtonGuardarMuestrasActionPerformed(evt);
            }
        });

        BotonSAlirMuestras.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        BotonSAlirMuestras.setText("Salir");
        BotonSAlirMuestras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSAlirMuestrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Lbl_Texto_verificar_Nombre_Producto, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(Txt_Cod_Productomuestra, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57)
                                .addComponent(Boton_Verificar_Cod))
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(135, 135, 135)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Txt_Cantidad_Rebajar)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(218, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtonGuardarMuestras, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addComponent(BotonSAlirMuestras, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Txt_Cod_Productomuestra, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Boton_Verificar_Cod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(Txt_Cantidad_Rebajar)))
                .addGap(38, 38, 38)
                .addComponent(Lbl_Texto_verificar_Nombre_Producto, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtonGuardarMuestras, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonSAlirMuestras, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(339, 339, 339))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 666, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Muestras", jPanel5);

        javax.swing.GroupLayout PanelPrincipalLayout = new javax.swing.GroupLayout(PanelPrincipal);
        PanelPrincipal.setLayout(PanelPrincipalLayout);
        PanelPrincipalLayout.setHorizontalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPrincipalLayout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 938, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PanelPrincipalLayout.setVerticalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPrincipalLayout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 696, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Boton_Generar_ConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_Generar_ConsultasActionPerformed
        CargarArticulo();
    }//GEN-LAST:event_Boton_Generar_ConsultasActionPerformed
    
    public void CargarArticulo(){
        DefaultTableModel modelo = (DefaultTableModel) Tbl_Consultas.getModel();
        modelo.setRowCount(0);
        ResultSet Existenciaprod = Ms_Conexion.Consulta("SELECT Secuencia_Registro_Producto,[Descripcion_Producto],[Precio_Mayorista],[Precio_Minorista],[Existencia_Actual] FROM TBL_MP_REGISTRO_MAESTRO_PRODUCTOS");
        
        try{
            while(Existenciaprod.next()){
                Vector v = new Vector();
                v.add(Existenciaprod.getInt(1));
                v.add(Existenciaprod.getString(2));
                v.add(Existenciaprod.getString(3));
                v.add(Existenciaprod.getString(4));
                v.add(Existenciaprod.getFloat(5));
                
                modelo.addRow(v);
                Tbl_Consultas.setModel(modelo);
            }
        }catch (SQLException e){
        }
    }
    
    public String HoraActual(){
        
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd "); 
        Calendar cal = Calendar.getInstance(); 
        return dateFormat.format(cal.getTime());
        
    }
    
    public String Fecha_Busqueda (){
        String Fecha_Busqueda = "";  
        String mes = "";
        if(Cb_Mes.getSelectedItem().toString().equals("Enero"))
                mes="01";
        if(Cb_Mes.getSelectedItem().toString().equals("Febrero"))
                mes="02";
        if(Cb_Mes.getSelectedItem().toString().equals("Marzo"))
                mes="03";
        if(Cb_Mes.getSelectedItem().toString().equals("Abril"))
                mes="04";
        if(Cb_Mes.getSelectedItem().toString().equals("Mayo"))
                mes="05";
        if(Cb_Mes.getSelectedItem().toString().equals("Junio"))
                mes="06";
        if(Cb_Mes.getSelectedItem().toString().equals("Julio"))
                mes="07";
        if(Cb_Mes.getSelectedItem().toString().equals("Agosto"))
                mes="08";
        if(Cb_Mes.getSelectedItem().toString().equals("Septiembre"))
                mes="09";
        if(Cb_Mes.getSelectedItem().toString().equals("Octubre"))
                mes="10";
        if(Cb_Mes.getSelectedItem().toString().equals("Noviembre"))
                mes="11";
        if(Cb_Mes.getSelectedItem().toString().equals("Diciembre"))
                mes="12";
        
        Fecha_Busqueda=Cb_Año.getSelectedItem().toString()+"-"+mes+"-"+Cb_Dia.getSelectedItem().toString();          
         
        return Fecha_Busqueda;
    }
    
    private void Tbl_ConsultasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tbl_ConsultasMouseClicked
        // TODO add your handling code here:
        int row = Tbl_Consultas.rowAtPoint(evt.getPoint());

        secuenciaproducto = (String.valueOf(Tbl_Consultas.getValueAt(row, 1)));

    }//GEN-LAST:event_Tbl_ConsultasMouseClicked

    private void Boton_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_buscarActionPerformed
        consultaLike();
    }//GEN-LAST:event_Boton_buscarActionPerformed

    private void botoneditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botoneditarMouseClicked
        // TODO add your handling code here

    }//GEN-LAST:event_botoneditarMouseClicked

    private void botoneditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botoneditarActionPerformed
        
        int usuariotipo = Ms_Frm_Login.TipoUsuario;
        if(usuariotipo==1){
            Inventario.dispose();
            new Mp_Frm_Actualizar_Producto();
        }else{JOptionPane.showMessageDialog(null, "Su Usuario no esta Autorizado a realizar esta opcion");}
        
        
    }//GEN-LAST:event_botoneditarActionPerformed

    private void Boton_salir_V2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_salir_V2ActionPerformed
        new Ms_Frm_Principal();
        Inventario.dispose();
    }//GEN-LAST:event_Boton_salir_V2ActionPerformed

    private void BotonAñadirExistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAñadirExistenciaActionPerformed
       Inventario.dispose();
       new Ventana_Añadir_Exitencia();
    }//GEN-LAST:event_BotonAñadirExistenciaActionPerformed

    private void BotonBuscarRegistrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBuscarRegistrosActionPerformed
        
        if(tipousuario==1){
            consultalikeregistros();
        }else{
        JOptionPane.showMessageDialog(null, "usuario no puede realizar esta accion");
        }
        
        
    }//GEN-LAST:event_BotonBuscarRegistrosActionPerformed

    private void BotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirActionPerformed
        Inventario.dispose();
        new Ms_Frm_Principal();
    }//GEN-LAST:event_BotonSalirActionPerformed

    private void Boton_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_GuardarActionPerformed
       registrargasto();
       Txt_Cantidad_Gasto.setText("");
       Txt_Descripcion_Gasto.setText("");
    }//GEN-LAST:event_Boton_GuardarActionPerformed

    private void Boton_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_SalirActionPerformed
        
                Inventario.dispose();
        new Ms_Frm_Principal();
    }//GEN-LAST:event_Boton_SalirActionPerformed

    private void BotonSAlirMuestrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSAlirMuestrasActionPerformed
        Inventario.dispose();
        new Ms_Frm_Principal();
    }//GEN-LAST:event_BotonSAlirMuestrasActionPerformed

    private void Boton_Verificar_CodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_Verificar_CodActionPerformed
        VerificarCodProductoMuestras();
    }//GEN-LAST:event_Boton_Verificar_CodActionPerformed

    private void BtonGuardarMuestrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtonGuardarMuestrasActionPerformed
        try {
            // TODO add your handling code here:
            guardarmuestraingresada();
        } catch (SQLException ex) {
            Logger.getLogger(Mi_Frm_Inventario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BtonGuardarMuestrasActionPerformed
   
    public void consultalikeregistros(){
        DefaultTableModel modelo = (DefaultTableModel) Tabla_Reporte_Ingresos.getModel();
         
        ResultSet Busqueda = Ms_Conexion.Consulta("SELECT [Secuencia_Registro_Producto]" +
"      ,[Secuencia_Usuario]" +
"      ,[Cantidad_Producto]" +
"      ,[Fecha_Registro]" +
"  FROM [SRV_BD_APP_SINVEN].[dbo].[Tbl_Ms_Registro_Ingresos]" +
"  WHERE [Fecha_Registro] LIKE '%"+Fecha_Busqueda()+"%'");
       
        try {
            
            while(Busqueda.next()){
                Vector v = new Vector();
                v.add(Busqueda.getInt(1));
                v.add(Busqueda.getInt(2));
                v.add(Busqueda.getInt(3));
                v.add(Busqueda.getString(4));
                
                 modelo.addRow(v);
                Tabla_Reporte_Ingresos.setModel(modelo);
            }
        } catch (Exception e) {
        }
    
    }
    
    public void consultaLike (){
       DefaultTableModel modelo = (DefaultTableModel) Tbl_Consultas.getModel();
        modelo.setRowCount(0);

            ResultSet Existenciaprod = Ms_Conexion.Consulta("SELECT Secuencia_Registro_Producto,[Descripcion_Producto],[Precio_Mayorista],[Precio_Minorista],[Existencia_Actual]"+
                                        "  FROM TBL_MP_REGISTRO_MAESTRO_PRODUCTOS" +
                                        "  WHERE [Descripcion_Producto] LIKE" + "'%" + Txt_Datos_Buscar.getText()+"%'");

        try{
            while(Existenciaprod.next()){
                Vector v = new Vector();
                v.add(Existenciaprod.getInt(1));
                v.add(Existenciaprod.getString(2));
                v.add(Existenciaprod.getString(3));
                v.add(Existenciaprod.getString(4));
                v.add(Existenciaprod.getFloat(5));
                 modelo.addRow(v);
                Tbl_Consultas.setModel(modelo);
            }
        }catch (SQLException e){
        }

    }
    
    public int validarTipoGasto(){
        int tipogasto = 0;
        if(RadioGastoCorriente.isSelected()){
            tipogasto=2;
        
        }if(Radiogastoventa.isSelected()){
            tipogasto=1;
            
        }if(tipogasto==0){
            JOptionPane.showMessageDialog(null, "Seleccione un tipo de gasto");
        }
    
        return tipogasto;
    }
    
    public void registrargasto(){
        
        
        
        if(!Txt_Descripcion_Gasto.getText().isEmpty() && !Txt_Cantidad_Gasto.getText().isEmpty()){
            
            
            try {
                conexion.Insertar("INSERT INTO [dbo].[Tbl_Mv_Gastos]" +
                        "           ([Secuencia_Tipo_Gasto]" +
                        "           ,[Descripcion_Tipo_gasto]" +
                        "           ,[Costo_Gasto]" +
                        "           ,[Fecha_Gasto])" +
                        "     VALUES" +
                        "           (" + validarTipoGasto() +",'"+ Txt_Descripcion_Gasto.getText() +"',"+ Txt_Cantidad_Gasto.getText() +",'"+HoraActual()+  "')");
                
                 JOptionPane.showMessageDialog(null, "Gasto Ingresado Correctamente");
            } catch (SQLException ex) {
                Logger.getLogger(Mi_Frm_Inventario.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            
        }else{
            JOptionPane.showMessageDialog(null, "Rellene los campos");
            
        }  
        
    }
  
     public void VerificarCodProductoMuestras(){
     
                
                
                if(!Txt_Cod_Productomuestra.getText().isEmpty()){
                    System.out.println(Txt_Cod_Productomuestra.getText());
                    int Cod_Prueba = Integer.parseInt(Txt_Cod_Productomuestra.getText());
                   ResultSet consultamuestra= Ms_Conexion.Consulta("SELECT [Descripcion_Producto],[Descripcion_Producto]" +
                "  FROM [SRV_BD_APP_SINVEN].[dbo].[TBL_MP_REGISTRO_MAESTRO_PRODUCTOS]" +
                "  WHERE [Secuencia_Registro_Producto]= "+Cod_Prueba );
                    try {
                        consultamuestra.next();
                        String nombrepro= consultamuestra.getString(2);
                        Lbl_Texto_verificar_Nombre_Producto.setText(nombrepro);
                        System.out.println(nombrepro);
                        

                    } catch (Exception e) {
                    }                 
                
                }
     }
     
     public void guardarmuestraingresada() throws SQLException{
     
                int Cod_Prueba = Integer.parseInt(Txt_Cod_Productomuestra.getText());
                ResultSet consultamuestra= Ms_Conexion.Consulta("SELECT [Secuencia_Registro_Producto]" +
                "      ,[Existencia_actual]" +
                "  FROM [SRV_BD_APP_SINVEN].[dbo].[TBL_MP_REGISTRO_MAESTRO_PRODUCTOS]" +
                "  WHERE [Secuencia_Registro_Producto]= "+Cod_Prueba );
                
                    try {
                        consultamuestra.next();
                         if(!consultamuestra.getString(1).isEmpty()){
                            
                            int producto=consultamuestra.getInt(1);
                            int cantidad = Integer.parseInt(Txt_Cantidad_Rebajar.getText());
                            int existenciactual=consultamuestra.getInt(3);
                            
                            conexion.Insertar("INSERT INTO [dbo].[TBL_MV_MUESTRAS]" +
                        "           ([Secuencia_Registro_Productos]" +
                        "           ,[Cantidad_Muestra]" +
                        "           ,[Fecha_Muestra_Dada])" +
                        "     VALUES" +
                        "           (" + producto + ","+cantidad +",'"+HoraActual() +  "')");
                         
                            
                            existenciactual=existenciactual-cantidad;
                            conexion.update("UPDATE [dbo].[TBL_MP_REGISTRO_MAESTRO_PRODUCTOS]" +
                        "   SET " +
                        "      ,[Fecha_Actualizacion_Registro_Productos] = "+"'"+HoraActual()+"'" +
                        "      ,[Existencia_Actual] = "+existenciactual +
                        " WHERE [Secuencia_Registro_Producto]= " +producto);

                        }

                    } catch (Exception e) {
                    }
        
         
     
     
     }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAñadirExistencia;
    private javax.swing.JButton BotonBuscarRegistros;
    private javax.swing.JButton BotonSAlirMuestras;
    private javax.swing.JButton BotonSalir;
    private javax.swing.JButton Boton_Generar_Consultas;
    private javax.swing.JButton Boton_Guardar;
    private javax.swing.JButton Boton_Salir;
    private javax.swing.JButton Boton_Verificar_Cod;
    private javax.swing.JButton Boton_buscar;
    private javax.swing.JButton Boton_salir_V2;
    private javax.swing.JButton BtonGuardarMuestras;
    private javax.swing.JComboBox<String> Cb_Año;
    private javax.swing.JComboBox<String> Cb_Dia;
    private javax.swing.JComboBox<String> Cb_Mes;
    private javax.swing.ButtonGroup GrupoTipoGasto;
    private javax.swing.JLabel Lbl_Texto_verificar_Nombre_Producto;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JRadioButton RadioGastoCorriente;
    private javax.swing.JRadioButton Radiogastoventa;
    private javax.swing.JTable Tabla_Reporte_Ingresos;
    private javax.swing.JTable Tbl_Consultas;
    private javax.swing.JTextField Txt_Cantidad_Gasto;
    private javax.swing.JTextField Txt_Cantidad_Rebajar;
    private javax.swing.JTextField Txt_Cod_Productomuestra;
    private javax.swing.JTextField Txt_Datos_Buscar;
    private javax.swing.JTextField Txt_Descripcion_Gasto;
    private javax.swing.JButton botoneditar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
