/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol2_3;

import java.util.Scanner;

/**
 *
 * @author doutedasolla
 */
public class Bol2_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduce o diñeiro =");
        int dinero = sc.nextInt();
        System.out.println("Billetes de 100€ = "+ (dinero/100));
        System.out.println("Billetes de 20€ = "+ (dinero/20));
        System.out.println("Billetes de 5€ = "+ (dinero/5));
        System.out.println("Monedas de 1€ = "+ (dinero/1));
    }
    
}
