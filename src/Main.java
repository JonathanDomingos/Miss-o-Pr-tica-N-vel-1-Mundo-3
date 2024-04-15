import java.util.Scanner;

public class Main {
    public static void main (String[] args) throws Object {
        try (Scanner scanner = new Scanner(System.in)) {
            PessoaFisicaRepo repoFisica = new PessoaFisicaRepo();
            PessoaJuridicaRepo repoJuridica = new PessoaJuridicaRepo();
            
            int opcao;
            do {
                System.out.println("Selecione uma opção:");
                System.out.println("1. Incluir Pessoa");
                System.out.println("2. Alterar Pessoa");
                System.out.println("3. Excluir Pessoa");
                System.out.println("4. Exibir Pessoa por ID");
                System.out.println("5. Exibir Todas as Pessoas");
                System.out.println("6. Salvar Dados");
                System.out.println("7. Recuperar Dados");
                System.out.println("0. Finalizar");
                System.out.print("Opção: ");
                opcao = scanner.nextInt();
                
                switch (opcao) {
                    case 1 -> {
                        System.out.println("Selecione o tipo de Pessoa (1 para Física, 2 para Jurídica):");
                        int tipo = scanner.nextInt();
                        scanner.nextLine(); // Limpar o buffer
                    switch (tipo) {
                        case 1 ->                             {
                                System.out.print("Nome: ");
                                String nome = scanner.nextLine();
                                System.out.print("CPF: ");
                                String cpf = scanner.nextLine();
                                System.out.print("Idade: ");
                                int idade = scanner.nextInt();
                                repoFisica.inserir(new PessoaFisica(repoFisica.obterTodos().size() + 1, nome, cpf, idade));
                            }
                        case 2 ->                             {
                                System.out.print("Nome: ");
                                String nome = scanner.nextLine();
                                System.out.print("CNPJ: ");
                                String cnpj = scanner.nextLine();
                                repoJuridica.inserir(new PessoaJuridica(repoJuridica.obterTodos().size() + 1, nome, cnpj));
                            }
                        default -> System.out.println("Opção inválida.");
                    }
                    }
                    case 2 -> {
                    }
                    case 3 -> {
                    }
                    case 4 -> {
                    }
                    case 5 -> {
                    }
                    case 6 -> {
                        System.out.print("Digite o prefixo para os arquivos: ");
                        String prefixo = scanner.next();
                        repoFisica.persistir(prefixo + "_fisica.bin");
                        repoJuridica.persistir(prefixo + "_juridica.bin");
                        System.out.println("Dados salvos com sucesso.");
                    }

                    case 7 -> {
                        System.out.print("Digite o prefixo dos arquivos: ");
                        String prefixo = scanner.next();
                        repoFisica.recuperar(prefixo + "_fisica.bin");
                        repoJuridica.recuperar(prefixo + "_juridica.bin");
                        System.out.println("Dados recuperados com sucesso.");
                    }

                    case 0 -> System.out.println("Finalizando...");
                    default -> System.out.println("Opção inválida.");
                }
                // Implementar alteração
                // Implementar exclusão
                // Implementar obtenção por ID
                // Implementar exibição de todas as pessoas
                            } while (opcao != 0);
        }
    }

    private Main() {
    }
}
