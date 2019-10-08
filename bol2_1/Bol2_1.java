/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol2_1;

import java.util.Scanner;

/**
 *
 * @author doutedasolla
 */
public class Bol2_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        System.out.println("Prezo orixinal =");
        float coste = sc.nextFloat();
        System.out.println("Prezo con desconto =");
        float descuento = sc.nextFloat();
        float porcentaxe1 = (coste-descuento);
        float porcentaxe2 = (porcentaxe1/coste);
        float porcentaxe3 = (porcentaxe2*100);
        System.out.println("Porcentaxe descontada = "+ (porcentaxe3)+"%");
    }
    
}
