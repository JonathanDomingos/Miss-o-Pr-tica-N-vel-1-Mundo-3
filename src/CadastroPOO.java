
import java.io.IOException;
import model.PessoaFisica;
import model.PessoaFisicaRepo;

public static void main(String[] args) throws IOException, ClassNotFoundException {
    PessoaFisicaRepo repo1 = new PessoaFisicaRepo();
    repo1.inserir(new PessoaFisica(1, "Fulano", "123.456.789-10", 30));
    repo1.inserir(new PessoaFisica(2, "Ciclano", "987.654.321-00", 25));
    repo1.persistir("pessoas_fisicas.txt");

    PessoaFisicaRepo repo2 = new PessoaFisicaRepo();
    repo2.recuperar("pessoas_fisicas.txt");
    repo2.exibirTodos();

    PessoaJuridicaRepo repo3 = new PessoaJuridicaRepo();
    repo3.inserir(new PessoaJuridica(1, "Empresa A", "12345678901234"));
    repo3.inserir(new PessoaJuridica(2, "Empresa B", "98765432109876"));
    repo3.persistir("pessoas_juridicas.txt");

    PessoaJuridicaRepo repo4 = new PessoaJuridicaRepo();
    repo4.recuperar("pessoas_juridicas.txt");
    repo4.exibirTodos();
}