/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidade4;

import java.util.HashSet;

/**
 *
 * @author LuisDaniel
 */
public class HashSetApp {
    
    public static void main(String[] args) {
        
        HashSet<String> lista = new HashSet<>();
        lista.add("vermelho");
        lista.add("verde");
        lista.add("verde");
        lista.add("amarelo");
        System.out.println(lista);
    }
    
}
