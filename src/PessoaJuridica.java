

public class Main {
    public static void main(String[] args) throws Object {
        PessoaFisicaRepo repo = new PessoaFisicaRepo();

        // Criando e adicionando uma nova PessoaFisica
        PessoaFisica pf1 = new PessoaFisica(1, "João", "123.456.789-00", 30);
        repo.inserir(pf1);

        // Criando e adicionando outra PessoaFisica
        PessoaFisica pf2 = new PessoaFisica(2, "Maria", "987.654.321-00", 25);
        repo.inserir(pf2);

        // Persistindo os dados em um arquivo
        repo.persistir("pessoasFisicas.dat");

        // Recuperando os dados do arquivo
        repo.recuperar("pessoasFisicas.dat");

        // Exibindo todas as PessoasFisicas
        for (PessoaFisica pf : repo.obterTodos()) {
            System.out.println(pf.exibir());
        }
    }
}
