/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidade5.exercicios;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LuisDaniel
 */
public class Exercicio5 {
    
    public static void main(String[] args) {
        
        List<String> stringCollection = new ArrayList<>();
        stringCollection.add("ddd2");
        stringCollection.add("aaa2");
        stringCollection.add("bbb1");
        stringCollection.add("aaa1");
        stringCollection.add("bbb3");
        stringCollection.add("ccc");
        stringCollection.add("bbb2");
        stringCollection.add("ddd1");
        
        System.out.println("Impressão da lista gerada pela aplicação");
        System.out.println(stringCollection);
        
        System.out.println("Impressão da lista filtrando letras que começam com a");
        
        stringCollection.stream()
                .filter((s) -> s.startsWith("a"))
                .forEach(System.out::println);
        
        System.out.println("Impressão da lista filtrando letras que começam "
                + "com a e ordenando-as");
        
        stringCollection.stream()
                .filter((s) -> s.startsWith("a"))
                .sorted()
                .forEach(System.out::println);
        
    }
    
}
