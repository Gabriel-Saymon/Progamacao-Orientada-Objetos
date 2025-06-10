import banco.Banco;
import banco.Agencia;
import banco.Conta;

public class App {

    public static void main(String[] args) {
        Banco banco = new Banco("BB");
        Agencia agencia = banco.criaAgencia("Jardim da Penha");

        String comando = "";
        while (!comando.equals("9")) {
            System.out.println("\nEntre com a opção desejada:");
            System.out.println("1 - Cadastrar conta");
            System.out.println("2 - Consultar conta");
            System.out.println("3 - Excluir conta");
            System.out.println("4 - Listar todas as contas");   // **Etapa 2**
            System.out.println("9 - Sair");
            comando = System.console().readLine();

            switch (comando) {
                case "1":
                    cadastraConta(agencia);
                    break;
                case "2":
                    consultaConta(agencia);
                    break;
                case "3":
                    excluiConta(agencia);
                    break;
                case "4":
                    listaTodasContas(agencia);
                    break;
                case "9":
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    // Etapa 2: listar todas as contas
    private static void listaTodasContas(Agencia agencia) {
        System.out.println("\n-- Contas da agência " + agencia.getNome() + " --");
        for (Conta c : agencia.getTodasContas()) {
            System.out.println(c);
        }
    }

    // Etapa 4: evita duplicar conta
    private static void cadastraConta(Agencia agencia) {
        System.out.print("Entre com o nome do cliente: ");
        String nome = System.console().readLine();
        if (agencia.obtemConta(nome) != null) {
            System.out.println("Erro: já existe uma conta com esse nome.");
            return;
        }
        System.out.print("Entre com o saldo inicial: ");
        String saldoStr = System.console().readLine();
        double saldo = Double.parseDouble(saldoStr);
        Conta c = agencia.adicionaConta(nome, saldo);
        if (c != null) {
            System.out.println("Conta criada com sucesso!");
        } else {
            System.out.println("Erro ao criar a conta.");
        }
    }

    // Etapa 3: trata conta não existente
    private static void consultaConta(Agencia agencia) {
        System.out.print("Entre com o nome do cliente: ");
        String nome = System.console().readLine();
        Conta c = agencia.obtemConta(nome);
        if (c == null) {
            System.out.println("Erro: conta não encontrada.");
        } else {
            System.out.printf("O saldo é: R$ %.2f%n", c.getSaldo());
        }
    }

    // Etapa 3: trata conta não existente
    private static void excluiConta(Agencia agencia) {
        System.out.print("Entre com o nome do cliente: ");
        String nome = System.console().readLine();
        boolean removed = agencia.removeConta(nome);
        if (removed) {
            System.out.println("Conta removida com sucesso.");
        } else {
            System.out.println("Erro: conta não encontrada.");
        }
    }
}
