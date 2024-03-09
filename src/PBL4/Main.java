package PBL4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static int index = 0;
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        ArrayList<Conta> cadastros = new ArrayList<>();

        int opcao = 0;
        while(opcao != 5){
            System.out.println("\n\n1 - Cadastrar uma nova conta\n2 - Depositar\n3 - Sacar\n4 - Consultar saldo\n5 - Sair\nEscolha uma opção: ");
            opcao = scan.nextInt();
            switch (opcao){
                case 1:
                    Conta nova_conta;

                    System.out.println("Digite seu nome para o cadastro: ");
                    String nome = scan.next();
                    int numero = index;

                    nova_conta = new Conta(nome, numero);
                    cadastros.add(numero, nova_conta);

                    index ++;
                    System.out.printf("Cadastro realizado com sucesso, o número da sua conta é: %d", nova_conta.getNumero());
                    break;
                case 2:
                    System.out.println("Digite o número da sua conta: ");
                    int numero_deposito = scan.nextInt();
                    int quantidade_cadastros_depos = 0;

                    for(var i: cadastros){
                        if(cadastros.get(numero_deposito).equals(i)){
                            Conta conta_atual = cadastros.get(numero_deposito);

                            System.out.printf("Olá, %s.", conta_atual.getNome());
                            System.out.println("\nDigite o valor a ser depositado: ");
                            Double valor_deposito = scan.nextDouble();

                            conta_atual.depositar(valor_deposito);
                            System.out.println("Valor depositado com sucesso!");
                            quantidade_cadastros_depos ++;
                        }
                        else{
                            if(quantidade_cadastros_depos > cadastros.size() - 1){
                                System.out.println("Conta não localizada.");
                            }
                        }
                    }
                    break;
                case 3:
                    System.out.println("Digite o número da sua conta: ");
                    int numero_saque = scan.nextInt();
                    int quantidade_cadastros_saque = 0;

                    for(var i: cadastros){
                        if(cadastros.get(numero_saque).equals(i)) {
                            Conta conta_atual = cadastros.get(numero_saque);

                            System.out.printf("Olá, %s.", conta_atual.getNome());
                            System.out.println("\nDigite o valor a ser sacado: ");
                            Double valor_saque = scan.nextDouble();

                            boolean status = conta_atual.sacar(valor_saque);
                            if(status){
                                System.out.println("Valor sacado com sucesso!");
                            }else{
                                System.out.println("Saque não efetuado, saldo insuficiente.");
                                break;
                            }
                            quantidade_cadastros_saque ++;
                        }
                        else{
                            if(quantidade_cadastros_saque > cadastros.size() - 1){
                                System.out.println("Conta não localizada.");
                            }
                        }
                    }
                    break;
                case 4:
                    System.out.println("Digite o número da sua conta: ");
                    int numero_consulta = scan.nextInt();
                    int quantidade_cadastros_cons = 0;

                    for(var i: cadastros) {
                        if (cadastros.get(numero_consulta).equals(i)) {
                            Conta conta_atual = cadastros.get(numero_consulta);

                            System.out.printf("Olá, %s.", conta_atual.getNome());
                            System.out.printf("\nSaldo disponível: %2f", conta_atual.getSaldo());
                            quantidade_cadastros_cons ++;
                        }
                        else{
                            if(quantidade_cadastros_cons > cadastros.size() - 1){
                                System.out.println("Conta não localizada.");
                            }
                        }
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
