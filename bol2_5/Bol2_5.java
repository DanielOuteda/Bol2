/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol2_5;

import java.util.Scanner;

/**
 *
 * @author doutedasolla
 */
public class Bol2_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        System.out.println("Soldo fixo =");
        float soldoFixo = sc.nextFloat();
        System.out.println("Total de vendas  =");
        float comision = sc.nextFloat();
        System.out.println("Kilometros recorridos =");
        float quilometraxe = sc.nextFloat();
        System.out.println("Dias de desprazamento =");
        float dietas = sc.nextFloat();
        float soldoBruto = (soldoFixo+(comision*1.5f)-(quilometraxe*2)-(dietas*30));
        System.out.println("Soldo Bruto = "+ (soldoBruto));
        float irpf = (soldoBruto*0.82f);
        System.out.println("Soldo Líquido = "+ (irpf-36));
        
        
    }
    
}
