package PBL3;
import java.util.Scanner;
import java.util.ArrayList;

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
                    Conta nova_conta = new Conta();
                    System.out.println("Digite seu nome para o cadastro: ");
                    nova_conta.nome = scan.next();
                    nova_conta.saldo = 0.0;
                    nova_conta.numero = index;

                    cadastros.add(index, nova_conta);

                    index ++;
                    System.out.printf("Cadastro realizado com sucesso, o número da sua conta é: %d", nova_conta.numero);
                    break;
                case 2:
                    System.out.println("Digite o número da sua conta: ");
                    int numero_deposito = scan.nextInt();

                    for(var i: cadastros){
                        if(cadastros.get(numero_deposito).equals(i)){
                            System.out.printf("Olá, %s.", cadastros.get(numero_deposito));

                            System.out.println("\nDigite o valor a ser depositado: ");
                            Double valor_deposito = scan.nextDouble();

                            Conta conta_atual = cadastros.get(numero_deposito);
                            conta_atual.depositar(valor_deposito);
                            System.out.println("Valor depositado com sucesso!");
                        }
                        else{
                            System.out.println("Conta não localizada.");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Digite o número da sua conta: ");
                    int numero_saque = scan.nextInt();

                    for(var i: cadastros){
                        if(cadastros.get(numero_saque).equals(i)) {
                            System.out.printf("Olá, %s.", cadastros.get(numero_saque));

                            System.out.println("\nDigite o valor a ser sacado: ");
                            Double valor_saque = scan.nextDouble();

                            Conta conta_atual = cadastros.get(numero_saque);

                            boolean status = conta_atual.sacar(valor_saque);
                            if(status){
                                System.out.println("Valor sacado com sucesso!");
                            }else{
                                System.out.println("Saque não efetuado, saldo insuficiente.");
                                break;
                            }
                        }
                        else{
                            System.out.println("Conta não localizada.");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Digite o número da sua conta: ");
                    int numero_consulta = scan.nextInt();

                    for(var i: cadastros) {
                        if (cadastros.get(numero_consulta).equals(i)) {
                            System.out.printf("Olá, %s.", cadastros.get(numero_consulta));

                            Conta conta_atual = cadastros.get(numero_consulta);
                            System.out.printf("\nSaldo disponível: %2f", conta_atual.saldo);
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
