/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidade4;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author LuisDaniel
 */
class Cliente{
    
    //Atributos
    private String cpf;
    private String nome;
    private String email;
    
    //Métodos especiais

    public Cliente(String cpf, String nome, String email) {
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Cliente{" + "cpf=" + cpf + ", nome=" + nome + ", email=" + email + '}';
    }
    
    //Métodos
    public void cadastrar(){
    }
}

class Curso{
    
    //Atributos
    private int cdCurso;
    private String nome;
    private float valor;
    private Path url;

    //Métodos especiais
    public Curso(int cdCurso, String nome, float valor, Path url) {
        this.cdCurso = cdCurso;
        this.nome = nome;
        this.valor = valor;
        this.url = url;
    }

    @Override
    public String toString() {
        return "Curso{" + "cdCurso=" + cdCurso + ", nome=" + nome + ", valor=" 
                + valor + ", url=" + url + '}';
    }
           
    public void cadastrar(){
    };
}

public class LojaVirtual {
    
    //Atributos
    List<Curso> cursos;
    static Map<Cliente, List<Curso>> pagamentos = new HashMap<>();
    
    public static void main(String[] args) {
    
        //Cursos disponíveis no site para venda
        Curso java8 = new Curso(1, "Java 8 para Web", 2000.0f, Paths.get("/java8"));
        Curso oracle12c = new Curso(2, "Oracle 12c", 2500.0f, Paths.get("/oracle12c"));
        Curso php7 = new Curso(3, "PHP 7", 1500.0f, Paths.get("/php7"));
        
        //Cadastro de clientes
        Cliente daniel = new Cliente("123.456.789-00", "Daniel Assulfi", "daniel@email.com");
        
        //Lista de Cursos por cliente
        List<Curso> cursosDaniel = new LinkedList<>();
        
        //Check-out dos cursos escolhidos
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        while(opcao != 4){
            System.out.println("Qual curso deseja adquirir: [1-Java8], "
                    + "[2-Oracle 12c], [3-PHP 7], [4-Finalizar compra]");
            opcao = scanner.nextInt();
            switch (opcao){
                case 1:
                    cursosDaniel.add(java8);
                    break;
                case 2:
                    cursosDaniel.add(oracle12c);
                    break;
                case 3:
                    cursosDaniel.add(php7);
                    break;
                default:
                    opcao = 4;
                    break;
            }
        }
        scanner.close();
        pagamentos.put(daniel, cursosDaniel);
        
        System.out.println(pagamentos);
    }
    
    static void pagamento(){
        
    }
}
