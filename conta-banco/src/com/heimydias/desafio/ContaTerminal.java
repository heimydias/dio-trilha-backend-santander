package com.heimydias.desafio;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;
        String agencia;
        String nomeCliente;
        double saldo = 0;

        System.out.println("Digite seu Nome: ");
        nomeCliente = sc.nextLine();
        System.out.println("Por favor, digite o número da Conta: ");
        numero = sc.nextInt();
        System.out.println("Digite o número da Agência: ");
        agencia = sc.next();
        System.out.println("Digite seu Saldo: ");
        saldo = sc.nextDouble();

        System.out.println();
        System.out.println("Olá " + nomeCliente + ", obrigada por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo R$" + saldo + " já esta disponível para saque.");

    }
}
