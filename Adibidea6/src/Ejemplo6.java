
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aitzol
 */
public class Ejemplo6 {
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        String comando = "java EjemploLectura";
        Process p=null;
        try{
            p = r.exec(comando);
            //escritura -- envia entrada a DATE
            OutputStream os = p.getOutputStream();
            os.write("Hola Manuel\n".getBytes());
            os.flush();//vacia el buffer de salida
            
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        //COPROBACION DE ERROR - 0 bien 1 -mal
        int exitVal;
        try{
            exitVal = p.waitFor();
            System.out.println("Valor de Salida: " + exitVal);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
