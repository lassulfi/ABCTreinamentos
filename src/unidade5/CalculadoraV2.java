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
public class CalculadoraV2 {
 
    public static void main(String[] args) {
        
        CalculadoraV2 objeto = new CalculadoraV2();
        IMath somar = (a, b) -> a + b;
        IMath subtrair = (a, b) -> a - b;
        IMath multiplicar = (a, b) -> a * b;
        IMath dividir = (a, b) -> a / b;
        IMath exponenciacao = (a, b) -> Math.pow(a, b);
        IMath radiciacao = (a, b) -> Math.pow(a, 1 / b);
        
        // Chamada das expressões lambdas
        
        System.out.println(objeto.execOperacao(10, 5, somar));        
        System.out.println(objeto.execOperacao(10, 5, subtrair));        
        System.out.println(objeto.execOperacao(10, 5, multiplicar));        
        System.out.println(objeto.execOperacao(10, 5, dividir));        
        System.out.println(objeto.execOperacao(10, 5, exponenciacao));        
        System.out.println(objeto.execOperacao(10, 5, radiciacao));        
    }
    
    public double execOperacao(double a, double b, IMath operacao){
        return operacao.operacao(a, b);
    }
}
