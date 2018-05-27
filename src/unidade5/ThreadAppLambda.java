/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidade5;

/**
 *
 * @author LuisDaniel
 */
public class ThreadAppLambda {
 
    public static void main(String[] args) {
        
        Runnable r = () -> {
            for (int i = 0; i < 1000; i++) {
                    System.out.println(i);
                }
        };
        
        new Thread(r).start();
    }
}
