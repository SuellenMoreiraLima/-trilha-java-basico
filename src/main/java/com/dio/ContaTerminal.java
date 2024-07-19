package com.dio;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public void criarConta() {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Digite seu numero de Agência: ");
        int agencia = scanner.nextInt();
        System.out.println("Digite seu numero de Conta: ");
        int conta = scanner.nextInt();
        System.out.println("Digite seu Saldo: ");
        double saldo = scanner.nextDouble();

        scanner.close();

        System.out.printf("Olá %s , obrigado por criar uma conta em nosso banco, sua agência é %d , conta %d e seu saldo %.2f%n já está disponível para saque", nome, agencia, conta, saldo);

    }

    }
