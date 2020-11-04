package ExercioContaBancaria;

import java.util.Scanner;

public class ApplicationProgram {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Cadastro de conta");
        System.out.println();

        System.out.println("Informe os cados para cadastro da conta");
        Conta conta = new Conta();

        //Campo NOME
        System.out.println("Nome:");
        String nome = input.nextLine();
        conta.setNome(nome);

        //Campo NUMERO DA CONTA
        System.out.println("Numero da conta");
        int numeroConta = input.nextInt();
        conta.addConta(numeroConta);

        //Deposito Incial da conta
        System.out.println("Deposito Inicial:");
        double deposito = input.nextDouble();
        conta.depositar(deposito);

        System.out.println("Realisar Saque");
        double saque = input.nextDouble();
        conta.saque(saque);



        System.out.println(conta.getNome());
        System.out.println(conta.getNumeroConta());
        System.out.println(conta.saldo());

        input.close();
    }
}
