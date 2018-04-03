/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidade4;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 *
 * @author LuisDaniel
 */
public class DequeApp {
    
    public static void main(String[] args) {
        Deque<String> lista = new ArrayDeque<>();
        lista.add("vermelho");
        lista.add("verde");
        lista.add("verde");
        lista.add("amarelo");
        System.out.println(lista);
        lista.removeFirst();
        lista.removeLast();
        System.out.println(lista);
        lista.addFirst("azul");
        lista.addLast("preto");
        System.out.println(lista);
        System.out.println(lista.peekFirst());
        System.out.println(lista.peekLast());
    }
}
