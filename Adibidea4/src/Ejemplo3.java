/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *
 * @author soto.aitzol
 */
public class Ejemplo3 {
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        String comando = "java Unsaludo \"Hola mundo!!\" ";
        Process p = null;
        
        if(args.length < 1){
            System.out.println("Se necesita un nombre de fichero...");
            System.exit(1);
        }
        
        try{
            //fichero al que se enviara la salida del programa UnSaludo
            FileOutputStream fos = new FileOutputStream(args[0]);
            PrintWriter pw = new PrintWriter(fos);
            p = r.exec(comando);
            
            InputStream is = p.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String linea;
            while((linea = br.readLine())!= null){
                System.out.println("INSERTO EN " + args[0]+" > " + linea);
                pw.println(linea);
            }
            br.close();
            pw.close();
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
