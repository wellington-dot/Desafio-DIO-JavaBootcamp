import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Numero da Agência: ");
        String agencia = input.nextLine();
        System.out.print("Numero da Conta: ");
        int conta = input.nextInt();
        input.nextLine();
        System.out.print("Seu nome: ");
        String nome = input.nextLine();
        System.out.print("Saldo: ");
        double saldo = input.nextDouble();

        Conta contaCliente = new Conta(conta, agencia, nome, saldo);

        System.out.println("Olá "+ contaCliente.nomeTitular + ", obrigado por criar uma conta em nosso banco" +
                ", sua agência é "+ contaCliente.agencia + ", conta " + contaCliente.numeroConta + " e seu saldo " + contaCliente.saldo + " já " +
                "está disponível para saque.");

    }
}
