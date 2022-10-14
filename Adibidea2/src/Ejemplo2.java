/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *
 * @author soto.aitzol
 */
public class Ejemplo2 {
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        String comando = "CMD /C DIR";
        Process p = null;
        try{
            p = r.exec(comando);
            InputStream is = p.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String linea;
            while((linea = br.readLine())!= null){
                System.out.println(linea);
            }
            br.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        
        //COMPROBACION DE ERROR - 0 bien - 1 mal
        int exitVal;
        try{
            exitVal = p.waitFor();
            System.out.println("valor de Salida: " + exitVal);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
