/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidade5;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LuisDaniel
 */
public class ParallelStreamApp {
    
    public static void main(String[] args) {
        
        colecaoStream();
        colecaoParallelStream();
    }

    private static void colecaoStream() {
        List<String> valores = new ArrayList<>();
        int max = 1000000;
        long t0 = System.currentTimeMillis();
        for (int i = 0; i < max; i++) {
            valores.add("=>" + i);
            
            valores.stream().sorted().forEach(System.out::println);
            
        }
        
        long t1 = System.currentTimeMillis();
            
        System.out.println("**********************" + (t1 - t0));
    }

    private static void colecaoParallelStream() {
    
        List<String> valores = new ArrayList<>();
        int max = 1000000;
        long t0 = System.currentTimeMillis();
        for (int i = 0; i < max; i++) {
            valores.add("=> " + i);
            
            valores.parallelStream().sorted().forEach(System.out::println);
            
        }
        
        long t1 = System.currentTimeMillis();
            
        System.out.println("**********************" + (t1 - t0));
    }
    
}
