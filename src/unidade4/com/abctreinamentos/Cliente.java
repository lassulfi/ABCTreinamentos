/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidade4.com.abctreinamentos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author LuisDaniel
 */
public class Cliente {
    
    Set<Curso> cursos;
    
    public static void main(String[] args) {
        
        Curso java8 = new Curso("Java 8");
        Curso oracle12c = new Curso("Oracle 12c");
        
        Set<Curso> cursoA = new HashSet<>();
        Set<Curso> cursoB = new HashSet<>();
        
        cursoA.add(java8);
        cursoA.add(oracle12c);
        
        cursoB.add(java8);
        
        //Operação de interseção
        //cursoA.retainAll(cursoB);
        //System.out.print("A intersec B: " );
        //System.out.println(cursoA);
        
        //Operação de subtração
        //cursoA.removeAll(cursoB);
        //System.out.print("A - B: " );
        //System.out.println(cursoA);
        
        cursoB.removeAll(cursoA);
        System.out.print("B - A");
        System.out.println(cursoB);
        
        Cliente A = new Cliente();
        A.setCursos(cursoA);
        
        Cliente B = new Cliente();
        B.setCursos(cursoB);
    }
    
    //Getters & Setters

    public Set<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(Set<Curso> cursos) {
        this.cursos = cursos;
    }
}
