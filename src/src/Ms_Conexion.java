/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Ms_Conexion {

    static Connection contacto = null;
    public static String Usuario;
    public static String Password;
    public static boolean status = false;
   
     public static Connection getConexion(){
        status = false;
        //Login de legado para referencia
        //String url = "jdbc:sqlserver://FLCCLOWN\\MSSQLSERVER2014:1433;databaseName=SRV_BD_APP_SINVEN";
        ////String[] credenciales = getCredenciales();
        String[] credenciales = new Ms_GestionArchivo("src\\Misc\\CredencialesSQL.txt").leerArchivo();
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            
        }catch (ClassNotFoundException e){
            JOptionPane.showMessageDialog(null, "No se pudo establece la conexion." + e.getMessage(),
            "Error de Conexion",JOptionPane.ERROR_MESSAGE);
            
        }  
        
        
       try{
            //Login de legado para referencia
            //contacto = DriverManager.getConnection(url, "sa", "Ujcv2020");
            contacto = DriverManager.getConnection(credenciales[0], credenciales[1], credenciales[2]);
            status = true;
            
        }catch (SQLException e){
             JOptionPane.showMessageDialog(null, "No se pudo establecer la conexion." + e.getMessage()
                     + "\n\nVerifique sus credenciales de SQL",
            "Error de Conexion",JOptionPane.ERROR_MESSAGE);
        }
        return contacto;
    
     }
     
     public static void setcuenta(String newusuario, String newpassword){
        Usuario = newusuario;
        Password = newpassword;
    }
     
     
     public static boolean getstatus(){
        return  status;
    }
    
       
     
     public static ResultSet Consulta(String consulta){
        Connection con = getConexion();
        Statement declara;
        try{
            declara=con.createStatement();
            ResultSet respuesta = declara.executeQuery(consulta);
            return respuesta;
        }catch (SQLException e){
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Error" + e.getMessage(),
            "Error de Conexion",JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }
    
    public void update(String consulta){
    
        Connection con = getConexion();
        PreparedStatement declarar;
        try {
            declarar = con.prepareStatement(consulta);
            int respuesta = declarar.executeUpdate();
           
        } catch (Exception e) {
        }
    
    }  
     
     public int Insertar (String insertar) throws SQLException{
          
          int FilasAfectadas = 0;
          
         try {
             Connection con = getConexion();
             Statement Sentenciainsert = con.createStatement();
             FilasAfectadas = Sentenciainsert.executeUpdate(insertar);
             
         } catch (Exception e) {
             
             JOptionPane.showMessageDialog(null, "No Ingresado Correctamente"+ e.getMessage());
         }
     return FilasAfectadas;
     
     
     
     }
     
     
}
    
 