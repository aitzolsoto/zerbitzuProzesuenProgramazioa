/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author soto.aitzol
 */
public class Ejemplo1 {
    public static void main(String[] args) {
        Runtime r = Runtime .getRuntime();
        String comando= "NOTEPAD";
        Process p;
        try {
            p = r.exec( comando ) ;
        } catch (Exception e) {
            System.out.println("Error e n : "+comando );
            e.printStackTrace() ;
        }
    }
}