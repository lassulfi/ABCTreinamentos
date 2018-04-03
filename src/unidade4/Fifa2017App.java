/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidade4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Jogador implements Comparable<Jogador>{
    
    //Atributos
    private String nome;
    private int pontuacao;
    private String clube;
    private String pais;
    
    //Métodos especiais

    public Jogador(String nome, int pontuacao, String clube, String pais) {
        this.nome = nome;
        this.pontuacao = pontuacao;
        this.clube = clube;
        this.pais = pais;
    }

    public String getNome() {
        return nome;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public String getClube() {
        return clube;
    }

    public String getPais() {
        return pais;
    }

    @Override
    public String toString() {
        return "Jogador{" + "nome=" + nome + ", pontuacao=" + pontuacao + ", clube=" + clube + ", pais=" + pais + '}';
    }

    @Override
    public int compareTo(Jogador j) {
        if (this.pontuacao > j.pontuacao) {
            return -1;
        } else if(this.pontuacao < j.pontuacao) {
            return 1;
        } else {
            return 0;
        }
    }    
}

/**
 *
 * @author LuisDaniel
 */
public class Fifa2017App {
    
    //Atributos
    
    //Métodos
    public static void main(String[] args) {
        List<Jogador> lista = new ArrayList<>();
        
        //Jogadores
        Jogador jogador1 = new Jogador("Neymar Jr.", 60, "PSG", "Brasil");
        Jogador jogador2 = new Jogador("Lionel Messi", 80, "Barcelona", "Argentina");
        Jogador jogador3 = new Jogador("Zlatan Ibrahimovic", 90, "PSG", "Suécia");
        Jogador jogador4 = new Jogador("Cristiano Ronaldo", 95, "Real Madrid", "Portugal");
        Jogador jogador5 = new Jogador("Luis Alberto Suárez", 50, "Barcelona", "Uruguai");
        
        lista.add(jogador1);
        lista.add(jogador2);
        lista.add(jogador3);
        lista.add(jogador4);
        lista.add(jogador5);
        
        Collections.sort(lista);
        
        System.out.println(lista);
        
    }
}
