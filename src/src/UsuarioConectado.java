
package src;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class UsuarioConectado {
    
    
    
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
    
    
    
}
