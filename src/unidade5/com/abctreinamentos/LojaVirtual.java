/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidade5.com.abctreinamentos;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Consumer;

/**
 *
 * @author LuisDaniel
 */
class Cliente {

    //Atributos
    private String cpf;
    private String nome;
    private String email;
    private float totalPago = 0.0f;

    //Métodos especiais
    public Cliente(String cpf, String nome, String email) {
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setTotalPago(float valorCurso) {
        this.totalPago += valorCurso;
    }

    public float getTotalPago() {
        return totalPago;
    }

    @Override
    public String toString() {
        return "Cliente{" + "cpf=" + cpf + ", nome=" + nome + ", email=" + email + '}';
    }

    //Métodos
    public void cadastrar() {
    }
    
}

class Curso {

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

    public int getCdCurso() {
        return cdCurso;
    }

    public void setCdCurso(int cdCurso) {
        this.cdCurso = cdCurso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Path getUrl() {
        return url;
    }

    public void setUrl(Path url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Curso{" + "cdCurso=" + cdCurso + ", nome=" + nome + ", valor="
                + valor + ", url=" + url + '}';
    }

    public void cadastrar() {
    }
;

}

public class LojaVirtual {

    //Atributos
    static Map<Cliente, List<Curso>> pagamentos = new HashMap<>();

    static float receitaLoja = 0.0f;

    static void listarCursos(List<Curso> lista) {
        //lista.forEach(p -> System.out.println(p.getCdCurso()+"<=>"+p.getNome()));
        //lista.forEach(System.out::print);
    }

    /**
     * Método que ordena a lista de clientes em ordem alfabética e imprime na
     * tela para visualização
     *
     * @param lista List<Cliente> lista de clientes cadastrados
     */
    static void ordenarClientes(List<Cliente> lista) {
        lista.stream().sorted((p1, p2) -> p1.getNome().compareTo(p2.getNome()))
                .forEach(System.out::println);
    }
    
    static void ordernarClientesPorValor(List<Cliente> clientes, Map<Cliente, List<Curso>> matriculas){
        //Cálculo do total gasto por cliente
        matriculas.forEach((cliente, curso) -> {
            //Zera o total pago
            cliente.setTotalPago(0.0f);
            //Calcula a soma do curso gasto por cliente
            curso.forEach(c -> cliente.setTotalPago(c.getValor()));
        });
        
        clientes.sort(
                (Cliente c1, Cliente c2) -> 
                        Float.compare(c2.getTotalPago(), c1.getTotalPago()));
        
        System.out.println(clientes);
    }

    /**
     * Método que calcula e imprime o valor total da receita auferida pela loja
     *
     * @param lista List<Curso> lista de cursos adquiridas por um cliente
     */
    static void receitaAuferida(Map<Cliente, List<Curso>> pagamentos) {
        pagamentos.forEach((cliente, curso) -> {
            curso.forEach(c -> cliente.setTotalPago(c.getValor()));
            receitaLoja += cliente.getTotalPago();
        });
        System.out.println("Valor total de cursos comprados: " + receitaLoja);
    }

    public static void main(String[] args) {

        //Cursos disponíveis no site para venda
        Curso java8 = new Curso(1, "Java 8 para Web", 2000.0f, Paths.get("/java8"));
        Curso oracle12c = new Curso(2, "Oracle 12c", 2500.0f, Paths.get("/oracle12c"));
        Curso php7 = new Curso(3, "PHP 7", 1500.0f, Paths.get("/php7"));

        //Cadastro de clientes
        Cliente cliente1 = new Cliente("123.456.789-00", "Daniel Assulfi", "daniel@email.com");
        Cliente cliente2 = new Cliente("123.456.789-00", "Marisa Amaral", "marisa@email.com");
        Cliente cliente3 = new Cliente("123.456.789-00", "Antonio Carlos", "antonio@email.com");

        //Lista de Clientes
        List<Cliente> listaClientes = new LinkedList<>();
        listaClientes.add(cliente1);
        listaClientes.add(cliente2);
        listaClientes.add(cliente3);

        //Ordena e imprime os clientes cadastrados
        System.out.println("Alunos matriculados");
        ordenarClientes(listaClientes);
        
        System.out.println("===============================================");

        Scanner scanner = new Scanner(System.in);
        //Check-out dos cursos escolhidos
        for (Cliente c : listaClientes) {

            //Lista de Cursos por cliente
            List<Curso> cursoCliente = new LinkedList<>();

            int opcao = 0;
            System.out.println("Bem-vindo " + c.getNome());
            while (opcao != 4) {
                System.out.println("Qual curso deseja adquirir: [1-Java8], "
                        + "[2-Oracle 12c], [3-PHP 7], [4-Finalizar compra]");
                opcao = scanner.nextInt();
                switch (opcao) {
                    case 1:
                        cursoCliente.add(java8);
                        break;
                    case 2:
                        cursoCliente.add(oracle12c);
                        break;
                    case 3:
                        cursoCliente.add(php7);
                        break;
                    default:
                        opcao = 4;
                        break;
                }
            }

            pagamentos.put(c, cursoCliente);

            //listarCursos(cursosDaniel);
            Consumer<List<Curso>> consumer = LojaVirtual::listarCursos;
            consumer.accept(cursoCliente);

        }

        scanner.close();
        System.out.println("===============================================");
        System.out.println(pagamentos);

        //Cálculo da receita auferida na loja
        System.out.println("===============================================");
        receitaAuferida(pagamentos);
        
        //Imprime a lista de clientes ordenada por valor
        System.out.println("Lista de clientes ordenado por valor adquirido:");
        ordernarClientesPorValor(listaClientes, pagamentos);

    }

    static void pagamento() {

    }
}
