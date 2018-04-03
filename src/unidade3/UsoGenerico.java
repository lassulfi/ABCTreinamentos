/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidade3;

/**
 *
 * @author LuisDaniel
 */
public class UsoGenerico {
    
    public static void main(String[] args) {
        
        ExemploGenerics<Integer> iob = new ExemploGenerics<>(88);
        iob.showType();
        
        ExemploGenerics<String> sob = new ExemploGenerics<>("Luis Daniel");
        sob.showType();
        
        if (iob.equals(sob)) {
            System.out.println("Os objetos iob e sob são iguais");
        } else {
            System.out.println("Os objetos iob e sob são diferentes");
        }
    }
    
}
