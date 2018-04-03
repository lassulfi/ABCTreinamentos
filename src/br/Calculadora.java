/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br;

import java.util.Scanner;

/**
 *
 * @author LuisDaniel
 */
public class Calculadora {

    public static void main(String[] args) throws DivisaoZeroException {

        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        try {
            dividir(n1, n2);
        } catch (ArithmeticException e) {
            System.out.println("Divisão por zero");
            throw new DivisaoZeroException();
        }

    }

    public static void dividir(int n1, int n2) throws ArithmeticException {
        System.out.println(n1 / n2);
    }

}
