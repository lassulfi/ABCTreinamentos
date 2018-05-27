/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidade5;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author LuisDaniel
 */
public class LambdaApp4 {
 
    static int numero;
    int somatorio;
    
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        LambdaApp4 app = new LambdaApp4();
        //Expressão lambda
        integers.forEach(x -> {
            numero = 10;
            x += numero;
            app.somatorio += x;
            System.out.println(x);
        });
        System.out.println(app.somatorio);
    }
}
