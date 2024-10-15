import java.util.Scanner;


public class ContaTerminal {

    public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = scanner.next();

        System.out.println("Usuário: ");
        int numero = scanner.nextInt();

        System.out.println("Informe o nome do cliente: ");
        scanner.nextLine();
        String nomeCliente = scanner.nextLine();

        System.out.println("Informe o saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + " , obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
        }
    }
