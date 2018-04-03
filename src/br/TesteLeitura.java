/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br;

import java.io.IOException;

/**
 *
 * @author LuisDaniel
 */
public class TesteLeitura {

    public static void main(String[] args) throws IOException {
        byte bytes[] = new byte[10];
        System.out.print("Digite algo: ");

        System.in.read(bytes);

        System.out.println("\nEco: " + new String(bytes));
    }

}
