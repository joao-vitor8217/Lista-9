package banco;

import java.util.Scanner;

public class ContaCorrente {
    private int numero, agencia;
    private double saldo;

    public void iniciarContaCorrente(int n, int ag) {
        numero = n;
        agencia = ag;
        saldo = 0;
    }

    public void sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Erro: Saldo insuficiente para saque.");
        } else {
            saldo = saldo - valor;
        }
    }

    public void depositar(double valor) {
        saldo = saldo + valor;
    }

    public double consultarSaldo() {
        return saldo;
    }

    public String exibe() {
        return "Agência: " + agencia + "\nConta: " + numero + "\nSaldo: R$ " + String.format("%.2f", saldo);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o número da conta: ");
        int numeroConta = scanner.nextInt();
        System.out.print("Informe o número da agência: ");
        int numeroAgencia = scanner.nextInt();

        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.iniciarContaCorrente(numeroConta, numeroAgencia);

        System.out.print("Informe o valor do depósito: R$ ");
        double valorDeposito = scanner.nextDouble();
        contaCorrente.depositar(valorDeposito);

        System.out.println("Dados da conta após depósito:\n" + contaCorrente.exibe());

        System.out.print("Informe o valor do saque: R$ ");
        double valorSaque = scanner.nextDouble();
        contaCorrente.sacar(valorSaque);

        System.out.println("Dados da conta após saque:\n" + contaCorrente.exibe());

        scanner.close();
    }
}
