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
public interface Validador<T> {
    
    boolean valida(T t);
}
