/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidade4;

import java.util.LinkedList;

/**
 *
 * @author LuisDaniel
 */
public class LinkedListApp {
    
    public static void main(String[] args) {
        
        LinkedList<String> lista = new LinkedList<>();
        lista.add("vermelho");
        lista.add("verde");
        lista.add("verde");
        lista.add("amarelo");
        System.out.println(lista);
        lista.removeFirst();
        lista.removeLast();
        System.out.println(lista);
    }
}
