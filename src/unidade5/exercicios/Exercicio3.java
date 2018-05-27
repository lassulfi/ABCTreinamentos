/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidade5.exercicios;

/**
 *
 * @author LuisDaniel
 */

@FunctionalInterface
interface Converter<F, T>{
    T convert(F from);
}

class Something{

    String startsWith(String s){
        return String.valueOf(s.charAt(0));
    }
}

public class Exercicio3 {
    
    public static void main(String[] args) {
        
        Something something = new Something();
        Converter<String, String> converter = something::startsWith;
        String converted = converter.convert("Java");
        System.err.println(converted);
        
        int num = 1;
        
        Converter<String, String> stringConverter = 
                (from) -> String.valueOf(from + num);
        
        //stringConverter.convert(2);
    }
    
}
