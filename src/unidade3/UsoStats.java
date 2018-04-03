/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidade3;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author LuisDaniel
 */
public class UsoStats {
    
    public static void main(String[] args) {
        
        Double[] notas = {7.5, 6.0, 5.5, 10.0};
        Stats<Double> media = new Stats<>(notas);
        
        System.out.println("O valor da média é " + media.media());
        
        //Exercicio 4
        Set<String> strSet = new HashSet<String>();
        //strSet.add(new StringBuilder("hello"));
        
        Set<? extends Float> s = new TreeSet<Float>();
        
        //LinkedList<int> list = new LinkedList<int>();
    }
    
}
