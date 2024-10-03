import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do titular:");
        String titular = sc.nextLine();
        Conta conta = new Conta(titular);

        System.out.println("Escolha o tipo de conta:");
        System.out.println("1. Conta Corrente");
        System.out.println("2. Conta Poupança");
        int tipoConta = sc.nextInt();

        int opcao;
        do {
            System.out.println("\nMenu de opções:");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            if (tipoConta == 1) {
                System.out.println("3. Usar cheque especial");
            } else {
                System.out.println("3. Calcular rendimento");
            }
            System.out.println("4. Exibir dados da conta");
            System.out.println("5. Sair");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o valor para depósito:");
                    double valorDeposito = sc.nextDouble();
                    conta.depositar(valorDeposito);
                    break;
                case 2:
                    System.out.println("Digite o valor para saque:");
                    double valorSaque = sc.nextDouble();
                    conta.sacar(valorSaque);
                    break;
                case 3:
                    if (tipoConta == 1) {
                        System.out.println("Digite o valor para utilizar o cheque especial:");
                        double valorChequeEspecial = sc.nextDouble();
                        conta.sacar(valorChequeEspecial);
                    } else {
                        System.out.println("Digite a taxa Selic atual:");
                        double selic = sc.nextDouble();
                        conta.calcularRendimento(selic);
                    }
                    break;
                case 4:
                    conta.exibirDados();
                    break;
                case 5:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 5);

        sc.close();
    }
}