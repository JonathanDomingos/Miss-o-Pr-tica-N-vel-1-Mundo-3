
import java.io.Serializable;

// Classe Pessoa
public class Pessoa implements Serializable {
    private int id;
    private String nome;

    // Construtores, getters e setters
}

// Classe PessoaFisica
 public class PessoaFisica extends Pessoa {

    public PessoaFisica(int par, String joão, String string, int par1) {
    }
    private String cpf;
    private int idade;

    // Construtores, getters e setters

    boolean exibir() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

// Classe PessoaJuridica
public class PessoaJuridica extends Pessoa {

    public PessoaJuridica(int par, String empresa_A, String string) {
    }
    private String cnpj;

    // Construtores, getters e setters

    PessoaJuridica(int i, String empresa_A, String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

// Classe PessoaFisicaRepo
public class PessoaFisicaRepo {
    private final ArrayList<PessoaFisica> pessoasFisicas = new ArrayList<>();

    // Métodos inserir, alterar, excluir, obter e obterTodos

    void inserir(PessoaFisica pf1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void inserir(PessoaFisica pf2) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void inserir(PessoaFisica pf1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void inserir(PessoaFisica pf1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void inserir(PessoaFisica pf2) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void persistir(String pessoasFisicasdat) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void recuperar(String pessoasFisicasdat) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    Iterable<PessoaFisica> obterTodos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

// Classe PessoaJuridicaRepo
public class PessoaJuridicaRepo {
    private final ArrayList<PessoaJuridica> pessoasJuridicas = new ArrayList<>();

    // Métodos inserir, alterar, excluir, obter e obterTodos
}
