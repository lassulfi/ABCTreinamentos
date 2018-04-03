/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidade2;

import java.io.FileInputStream;

/**
 *
 * @author LuisDaniel
 */
public class StreamApp {
    
    public static void byteStream() throws Exception{
    
        FileInputStream entrada = new FileInputStream("C:\\Users\\LuisDaniel\\"
                + "Documents\\NetBeansProjects\\ABCTreinamentos\\src\\unidade2"
                + "\\dados.txt");
        
        int count = 0;
        while((entrada.read()) != -1){
            count++;
        }
        
        System.out.println("Número de caracteres: " + count);
        
        entrada.close();
    }
    
    public static void caracterStream(char letra) throws Exception{
        
        FileInputStream entrada = new FileInputStream("C:\\Users\\LuisDaniel\\"
                + "Documents\\NetBeansProjects\\ABCTreinamentos\\src\\unidade2"
                + "\\dados.txt");
        
        int count = 0;
        int c;
        while((c = entrada.read()) != -1){
            if (c == letra) {
                count++;
            }
            
        }
        
        System.out.println("Número de vezes que a letra informada foi "
                + "encontrada: " + count);
        
        entrada.close();
    }
    
    public static void main(String[] args) {
               
        try {
            //byteStream();
            System.out.print("Informar a letra a ser encontrada: ");
            char letra = (char) System.in.read();
            caracterStream(letra);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
}
