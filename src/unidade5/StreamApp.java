/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidade5;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LuisDaniel
 */
public class StreamApp {
    
    //Atributos
    static List<String> funcionarios;
    
    //Métodos
    public static void main(String[] args) {
        
        funcionarios = new ArrayList<>();
        funcionarios.add("Antonio");
        funcionarios.add("José");
        funcionarios.add("Pedro");
        funcionarios.add("João");
        funcionarios.add("André");
        
        System.out.println("Filtro da lista");
        filtrar("A");
        
        System.out.println("Filtro ordenado na lista:");
        ordenar("A");
        
        System.out.println("Quantidade de itens com letra:");
        contar("A");
    }
    
    public static void filtrar(String letra){
        funcionarios.stream().filter(s -> s.startsWith(letra))
                .forEach(System.out::println);
    }
    
    public static void ordenar(String letra){
        funcionarios.stream().sorted().filter(s -> s.startsWith(letra))
                .forEach(System.out::println);
    }
    
    public static void contar(String letra){
        long contador = funcionarios.stream().filter(s -> s.startsWith(letra)).count();
        System.out.println(contador);
    }
}
