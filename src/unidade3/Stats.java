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
public class Stats<T extends Number> {
    
    //Atributos
    private T[] num;
    
    //Construtor
    public Stats(T[] num) {
        this.num = num;
    }
    
    //Métodos
    public double media(){
        int i;
        double soma = 0;
        for (i = 0; i < num.length; i++) {
            soma += num[i].doubleValue();
        }
        
        return soma/i;
    }
}
