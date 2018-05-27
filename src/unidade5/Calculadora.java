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
public class Calculadora {
    
    public static void main(String[] args) {
        IMatematica anonimo = new IMatematica() {
            @Override
            public int somar(int a, int b) {
                return a + b;
            }

            @Override
            public int subtrair(int a, int b) {
                return a - b;
            }

            @Override
            public int multiplicar(int a, int b) {
                return a * b;
            }

            @Override
            public int dividir(int a, int b) {
                return a / b;
            }

            @Override
            public double exponenciacao(double a, double b) {
                return Math.pow(a, b);
            }

            @Override
            public double radicioacao(double a, double b) {
                return Math.pow(a, 1 / b);
            }
        };
        
        System.out.println("anônimo: " + anonimo.getClass());
        System.out.println("=> " + anonimo.somar(10, 5));
        System.out.println("=> " + anonimo.subtrair(10, 5));
        System.out.println("=> " + anonimo.multiplicar(10, 5));
        System.out.println("=> " + anonimo.dividir(10, 5));
    }
}
