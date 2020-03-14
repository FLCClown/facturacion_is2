/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fm_ro
 */
public class Ms_GestionArchivo{
    
    private File texto;
    
    public Ms_GestionArchivo(String path){
        texto = new File(path);
        if(!texto.exists()){
            try {
                texto.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(Ms_GestionArchivo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public String[] leerArchivo(){
        ArrayList<String> arr = new ArrayList<>(0);
        String lectura;
        try {
            BufferedReader br = new BufferedReader(new FileReader(texto));
            while((lectura = br.readLine()) != null){
                arr.add(lectura);
            }
            String[] retval = new String[arr.size()];
            for(int i = 0; i < retval.length; i++){
                retval[i] = arr.get(i);
            }
            return retval;
        }catch (IOException ex) {
            Logger.getLogger(Ms_GestionArchivo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public boolean escribirArchivo(String[] arr){
        try {
            FileWriter fw = new FileWriter(texto);
            fw.flush();
            fw.write(arr[0] + "\n");
            for(int i = 1; i < arr.length; i++){
                fw.flush();
                fw.append(arr[i] + "\n");
            }
            fw.flush();
            fw.append(arr[arr.length - 1]);
            return true;
        } catch (IOException ex) {
            Logger.getLogger(Ms_GestionArchivo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
}
