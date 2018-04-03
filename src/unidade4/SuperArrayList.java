/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidade4;

import java.util.ArrayList;

/**
 *
 * @author LuisDaniel
 */
public class SuperArrayList {
    
    static ArrayList<Integer> list;
    
    public static void main(String[] args) {
     
        list = new ArrayList<>();
        
        long t1 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            list.add(i);
        }
        long t2 = System.currentTimeMillis();
        
        System.out.println(list);
        System.out.println("Tempo para criação da lista: " + (t2 - t1) + " milisegundos");
    }
}
