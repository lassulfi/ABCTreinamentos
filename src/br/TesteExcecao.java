/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br;

/**
 *
 * @author LuisDaniel
 */
public class TesteExcecao {

    public static void main(String[] args) {

        try {
            int i = 50;
            i = i / 0;
            System.out.println("O resultado é " + i);
            Object c = null;
            System.out.println("O resultado é " + c.toString());
        } catch (ArithmeticException | NullPointerException e) {
            e.printStackTrace();
        }
    }

}
