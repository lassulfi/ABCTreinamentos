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
public class NotaAluno {
    
    //Atributos    
    private double valor;
    
    //Construtor
    <T extends Number> NotaAluno(T object){
        this.valor = object.doubleValue();
    }
    
    //Métodos
    <T extends Number> double retornarValor(T obj){
    
        return obj.doubleValue();
    }
}
