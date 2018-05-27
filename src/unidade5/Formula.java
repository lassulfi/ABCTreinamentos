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
@FunctionalInterface
public interface Formula {
    
    double calcular(int a); //apenas 1 método abstrato
    
    default double sqrt(int a){
        return Math.sqrt(a);
    }
    
    default double sqrt(int a, int b){
        return Math.pow(a, 1 / b);
    }
}
