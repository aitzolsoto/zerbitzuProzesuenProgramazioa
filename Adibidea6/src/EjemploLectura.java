/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.io.BufferedReader;

import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.zip.InflaterInputStream;

/**
 *
 * @author soto.aitzol
 */
public class EjemploLectura {
    public static void main(String[] args) {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        String texto;
        try{
            System.out.println("Introduce una cadena...");         
            texto = br.readLine();
            System.out.println("Cadena escrita: " +texto);
            in.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
