package Revisao_Avaliacao.EX2;
import PBL4.Conta;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, Banco> accounts = new HashMap<Integer, Banco>();

        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        Integer account_number = 1;

        int option = 0;
        while(option != 5){
            System.out.println("\n\n1 - Cadastrar uma nova conta\n2 - Depositar\n3 - Sacar\n4 - Consultar saldo\n5 - Sair\nEscolha uma opção: ");
            option = scan.nextInt();
            switch (option){
                case 1:
                    Banco new_account;

                    scan.nextLine();
                    System.out.println("Digite seu nome para o cadastro: ");
                    String name = scan.nextLine();

                    new_account = new Banco(account_number, name, 0.0);
                    accounts.put(account_number, new_account);

                    System.out.printf("Cadastro realizado com sucesso, o número da sua conta é: %d", new_account.getAccount_number());

                    account_number ++;
                    break;
                case 2:
                    System.out.println("Digite o número da sua conta: ");
                    Integer account_number_deposit = scan.nextInt();

                    Banco current_account_deposit = accounts.get(account_number_deposit);

                    if (current_account_deposit != null) {
                        System.out.printf("Olá, %s.", current_account_deposit.getName());
                        System.out.println("\nDigite o valor a ser depositado: ");
                        Double deposit_amount = scan.nextDouble();

                        current_account_deposit.deposit(deposit_amount);
                        System.out.println("Valor depositado com sucesso!");
                    }
                    else{
                        System.out.println("Conta não localizada.");
                    }
                    break;
                case 3:
                    System.out.println("Digite o número da sua conta: ");
                    Integer account_number_withdraw = scan.nextInt();

                    Banco current_account_withdraw = accounts.get(account_number_withdraw);

                    if (current_account_withdraw != null) {
                        System.out.printf("Olá, %s.", current_account_withdraw.getName());
                        System.out.println("\nDigite o valor a ser sacado: ");
                        Double withdraw_amount = scan.nextDouble();

                        boolean status = current_account_withdraw.withdraw(withdraw_amount);
                        if (status) {
                            System.out.println("Valor sacado com sucesso!");
                        } else {
                            System.out.println("Saque não efetuado, saldo insuficiente.");
                        }
                    }
                    else{
                        System.out.println("Conta não localizada.");
                    }
                    break;
                case 4:
                    System.out.println("Digite o número da sua conta: ");
                    Integer account_number_check = scan.nextInt();

                    Banco current_account_check = accounts.get(account_number_check);

                    if (current_account_check != null) {
                        System.out.printf("Olá, %s.", current_account_check.getName());
                        System.out.printf("\nSaldo disponível: %2f", current_account_check.getBalance());
                    }
                    else{
                        System.out.println("Conta não localizada.");
                    }
                    break;
                case 5:
                    System.out.println("Processo finalizado.");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
    }
}
