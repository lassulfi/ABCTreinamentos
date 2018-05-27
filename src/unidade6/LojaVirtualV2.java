/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidade6;

import java.awt.Container;
import java.awt.GridLayout;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author LuisDaniel
 */
public class LojaVirtualV2 {
    
    //Atributos
    static Map<Cliente, List<Curso>> pagamentos = new HashMap<>();
    static List<Cliente> listaClientes = new ArrayList<>();

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
    
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Loja Virtual");
        frame.setSize(350, 250);
        
        Container container = frame.getContentPane();
        
        JMenuBar barra = new JMenuBar();
        
        JMenu m1 = new JMenu("Clientes");
        JMenuItem m11 = new JMenuItem("Novo");
        m11.addActionListener(ev ->{
            ClienteFrame cFrame = new ClienteFrame("Novo Cliente",listaClientes,1);
            cFrame.showClienteFrame();
        });
        JMenuItem m12 = new JMenuItem("Consultar");
        m12.addActionListener(ev -> {
            ClienteFrame cFrame = new ClienteFrame("Consultar cliente", listaClientes, 2);
            cFrame.showClienteFrame();
        });
        JMenuItem m13 = new JMenuItem("Alterar");
        m13.addActionListener(ev -> {
            ClienteFrame cframe = new ClienteFrame("Alterar cliente", listaClientes, 3);
            cframe.showClienteFrame();
        });
        JMenuItem m14 = new JMenuItem("Excluir");
        
        m1.add(m11);
        m1.add(m12);
        m1.add(m13);
        m1.add(m14);
        
        JMenu m2 = new JMenu("Cursos");
        JMenuItem m21 = new JMenuItem("Novo");
        JMenuItem m22 = new JMenuItem("Consultar");
        JMenuItem m23 = new JMenuItem("Alterar");
        JMenuItem m24 = new JMenuItem("Excluir");
        
        m2.add(m21);
        m2.add(m22);
        m2.add(m23);
        m2.add(m24);
        
        barra.add(m1);
        barra.add(m2);
        
        frame.setJMenuBar(barra);
        
        frame.setVisible(true);
    }
    
    private void excluirCliente(){
        String idCli = JOptionPane.showInputDialog(null, "Informe a id do cliente");
        int id = Integer.valueOf(idCli);
        
        listaClientes.remove(id);
        
        System.out.println(listaClientes);
    }
    
}

class ClienteFrame{
        
        private String titulo;
        
        private JFrame frame;
        private JTextField id;
        private JTextField cpf;
        private JTextField nome;
        private JTextField email;
        
        private JButton confirmar;
        private JButton sair;
        
        private List<Cliente> clientes;
        private int opcao;
        
        ClienteFrame(String titulo, List<Cliente> cliente, int opcao){
            this.titulo = titulo;
            
            this.clientes = cliente;
            this.opcao = opcao;
            
            //Interface
            frame = new JFrame();
            id = new JTextField();
            cpf = new JTextField();
            nome = new JTextField();
            email = new JTextField();
            confirmar = new JButton("Confirmar");
            sair = new JButton("Sair");
            
            //Eventos
            confirmar.addActionListener(ev -> {
                //Recupera os valores inputados pelo usuário
                
                switch (opcao){
                    case 1:
                        //Adiciona cliente
                        cadastrar();
                        break;
                    case 3:
                        //Altera o cliente
                        alterar();
                        break;
                }
            });
            
            sair.addActionListener(ev -> {
                frame.dispose();
            });
            
        }
        
        public void showClienteFrame(){
            
            switch (opcao){
                case 2:
                    String idCliString = JOptionPane.showInputDialog("Informe a id do cliente");
                    int idCLi = Integer.parseInt(idCliString);

                    Cliente c = clientes.get(idCLi);

                    id.setText(String.valueOf(idCLi));
                    id.setEnabled(false);
                    nome.setText(c.getNome());
                    nome.setEnabled(false);
                    cpf.setText(c.getCpf());
                    cpf.setEnabled(false);
                    email.setText(c.getEmail());
                    email.setEnabled(false);
                    confirmar.setEnabled(false);
                    break;
                case 3:
                   idCliString = JOptionPane.showInputDialog("Informe a id do cliente");
                    idCLi = Integer.parseInt(idCliString);

                    c = clientes.get(idCLi); 
                    
                    id.setText(String.valueOf(idCLi));
                    id.setEnabled(false);
                    nome.setText(c.getNome());
                    cpf.setText(c.getCpf());
                    email.setText(c.getEmail());
                    break;
            }
            
            frame.setTitle(titulo);
            frame.setSize(350, 250);
            
            GridLayout grid = new GridLayout(0, 2, 5, 5);
            
            Container cont = frame.getContentPane();
            cont.setLayout(grid);
            
            cont.add(new JLabel("ID"));
            cont.add(id);
            cont.add(new JLabel("CPF:"));
            cont.add(cpf);
            cont.add(new JLabel("Nome"));
            cont.add(nome);
            cont.add(new JLabel("e-mail"));
            cont.add(email);
            
            cont.add(confirmar);
            cont.add(sair);
            
            frame.show();
        }
    
        private void cadastrar(){
            //Recupera os dados dos elementos
            String nomeCliente = nome.getText();
            String cpfCliente = cpf.getText();
            String emailCliente = email.getText();
            //Cria um objeto cliente
            Cliente cliente = new Cliente(cpfCliente, nomeCliente, emailCliente);
            cliente.setId();
            
            //Adiciona o cliente a lista
            clientes.add(cliente);
            
            JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");
            
            limparCampos();
            
            //Exibe o cliente exibido
            System.out.println(clientes.toString());
        }
        
        private void alterar(){
            
            //Recupera os dados dos elementos
            int idCliente = Integer.parseInt(id.getText());
            String nomeCliente = nome.getText();
            String cpfCliente = cpf.getText();
            String emailCliente = email.getText();
            
            Cliente cliente = new Cliente(cpfCliente, nomeCliente, emailCliente);
            clientes.set(idCliente, cliente);
            
            JOptionPane.showMessageDialog(null, "Cliente atualizado com sucesso!");
            limparCampos();
            
            //Exibe a lista de clientes
            System.out.println(clientes.toString());
            
        }
        
        
        
        private void limparCampos(){
            id.setText("");
            nome.setText("");
            cpf.setText("");
            email.setText("");
        }
        
    }

class Cliente{
    
        //Atributos
    private static int id = 0;
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
    
    public void setId(){
        this.id += 1;
    }
    
    public int getId(){
        return id;
    }

    public String getNome() {
        return nome;
    }
    
    public String getEmail(){
        return email;
    }
    
    public String getCpf(){
        return cpf;
    }

    public void setTotalPago(float valorCurso) {
        this.totalPago += valorCurso;
    }

    public float getTotalPago() {
        return totalPago;
    }

    @Override
    public String toString() {
        return "Cliente{ id =" + id + "cpf=" + cpf + ", nome=" + nome + ", email=" + email + '}';
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
}

