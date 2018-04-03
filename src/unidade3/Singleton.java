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
public class Singleton<T> {
    
    public T getInstance(){
        if (instance == null) {
            instance = (T) new Singleton<T>();
        }
        
        return instance;
    }
    
    private T instance = null;
}
