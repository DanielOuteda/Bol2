/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol2_2;

import java.util.Scanner;

/**
 *
 * @author doutedasolla
 */
public class Bol2_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduce Grados Centigrados =");
        float gc = sc.nextFloat();
        System.out.println("Grados Fahrenheit = "+ (gc*9/5)+32);
        System.out.println("Grados Kelvin = "+ (gc + 273.15f));
    }
    
}
