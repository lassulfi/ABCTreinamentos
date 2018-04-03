/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidade4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author LuisDaniel
 */
public class ArrayListApp {
    
    public static void main(String[] args) {
        
        List<String> lista = new ArrayList<>();
        lista.add("vermelho");
        lista.add("verde");
        lista.add("verde");
        lista.add("amarelo");
        System.out.println(lista);
        System.out.println("Lista ordenada: ");
        Collections.sort(lista);
        System.out.println(lista);
    }
}
