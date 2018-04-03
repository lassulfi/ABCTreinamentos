/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidade3;

/**
 *
 * @author LuisDaniel
 */
public class GenericImpar {
    
    static <T extends Number> int[] validaImpar(T[] object){
    
        int[] imparList = new int[object.length];
        int i = 0;
        
        for(T number: object){
            if (number.intValue() % 2 != 0) {
                imparList[i] = number.intValue();
            }
            i++;
        }
        
        return imparList;
    }
    
    static <T> T[] swap(T[] vector, int p1, int p2){
        
        T aux;
        
        aux = vector[p1];
        vector[p1] = vector[p2];
        vector[p2] = aux;
        
        return vector;
        
    }
    
    public static void main(String[] args) {
        
        Integer[] numberArray = {1, 2, 3, 4, 5};

        int[] oddNumbers = validaImpar(numberArray);
        
        System.out.println("Vetor com número impares");
        for (int i = 0; i < oddNumbers.length; i++) {
            System.out.print(oddNumbers[i] + " - ");
        }
        
        String[] original = {"Luis", "Daniel", "Assulfi"};
        System.out.println("Troca a posição de um vetor");
        System.out.print("Vetor original: ");
        for (int i = 0; i < original.length; i++) {
            System.out.print(original[i] + " - ");
        }
        
        System.out.println("");
        String[] swapped = swap(original, 0, 1);
        System.out.println("Vetor alterado: ");
        for (int i = 0; i < swapped.length; i++) {
            System.out.print(swapped[i] + " - ");
        }
    }
        
}
