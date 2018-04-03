/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidade4;

import java.util.HashMap;

/**
 *
 * @author LuisDaniel
 */
public class HashMapApp {
    
    public static void main(String[] args) {
        HashMap<Integer, String> mapa = new HashMap<>();
        mapa.put(1, "Bruno");
        mapa.put(2, "Umberto");
        mapa.put(3, "Fernando");
        mapa.put(3, "Caetano");
        mapa.put(4, "Umberto");
        System.out.println(mapa);
    }
}
