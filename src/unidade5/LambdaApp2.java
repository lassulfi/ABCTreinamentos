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
public class LambdaApp2 {
    
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        //Expressão lambda
        integers.forEach(x -> {
            x += 10;
            System.out.println(x);
        });
    }
}
