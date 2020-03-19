/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author fm_ro
 */
public class gestorCaminos {
    
    private Path camino = Paths.get("");
    private String str;
    
    public gestorCaminos(String objetivo){
        str = camino.toAbsolutePath().toString().concat(objetivo).trim();
    }
    
    public String getCamino(){
        return str;
    }
    
}
