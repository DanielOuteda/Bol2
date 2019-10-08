/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol2_4;

import java.util.Scanner;

/**
 *
 * @author doutedasolla
 */
public class Bol2_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduce o diñeiro =");
        int dinero = sc.nextInt();
        int dinero100 = (dinero/100);
        int dinero20 = ((dinero%100)/20);
        int dinero5 = ((dinero%20)/5);
        int dinero1 = ((dinero%5)/1);
        System.out.println("Billetes de 100€ = "+ (dinero100));
        System.out.println("Billetes de 20€ = "+ (dinero20));
        System.out.println("Billetes de 5€ = "+ (dinero5));
        System.out.println("Monedas de 1€ = "+ (dinero1));
    }
    
}
