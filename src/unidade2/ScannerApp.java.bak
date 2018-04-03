/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidade2;

import java.util.Formatter;
import java.util.Scanner;

/**
 *
 * @author LuisDaniel
 */
public class ScannerApp {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Formatter saida = new Formatter(System.out);
        
        System.out.print("Informe a nota n1: ");
        float n1 = entrada.nextFloat();
        System.out.print("Informe a nota n2: ");
        float n2 = entrada.nextFloat();
        System.out.print("Informe a nota n3: ");
        float n3 = entrada.nextFloat();
        System.out.print("Informe a nota n4: ");
        float n4 = entrada.nextFloat();
        
        float media = (n1 + n2 + n3 + n4) / 4;
        
        saida.format("Média = %.2f", media);
        
        entrada.close();
        saida.close();
    }
    
}
