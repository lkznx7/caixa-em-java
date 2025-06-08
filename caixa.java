import java.util.Scanner;

public class caixa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double Saldo = 100000;
        double VSaque;
        double VDeposito;
        int op;
        do {
            System.out.println("\n=== BEM VINDO A CAIXA ===");
            System.out.println("Digite a opção escolhida:");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Saque");
            System.out.println("3 - Depósito");
            System.out.println("4 - Sair");

            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Saldo atual: R$" + Saldo);
                    break;
                case 2:
                    System.out.println("Qual o valor do saque?");
                    VSaque = sc.nextDouble();
                    if (VSaque > Saldo) {
                        System.out.println("Saldo insuficiente!");
                    } else {
                        Saldo -= VSaque;
                        System.out.println("Você sacou: R$" + VSaque);
                        System.out.println("Saldo atual: R$" + Saldo);
                    }
                    break;
                case 3:
                    System.out.println("Qual o valor do depósito?");
                    VDeposito = sc.nextDouble();
                    Saldo += VDeposito;
                    System.out.println("Você depositou: R$" + VDeposito);
                    System.out.println("Saldo atual: R$" + Saldo);
                    break;
                case 4:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while (op != 4);

        sc.close();
    }
}
