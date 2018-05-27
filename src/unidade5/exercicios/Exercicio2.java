/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidade5.exercicios;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author LuisDaniel
 */
public class Exercicio2 {
    
    public static void main(String[] args) {
        
        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
        
        System.out.println("Impressão da lista criada");
        System.out.println(names);
        
        names.sort((n1, n2) -> {
            return n1.compareTo(n2); //To change body of generated lambdas, choose Tools | Templates.
        });
        
        System.out.println("Impressao da lista ordenada");
        System.out.println(names);
    }
    
    
}
