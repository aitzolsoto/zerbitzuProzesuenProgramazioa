/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author soto.aitzol
 */
public class UnSaludo {
    public static void main(String[] args) {
        if(args.length < 1){
            System.out.println("Se necesita un saludo...");
            System.exit(1);
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(i+1 + ". " + args[0]);
        }
    }
}
