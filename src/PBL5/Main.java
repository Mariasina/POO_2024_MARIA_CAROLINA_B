package PBL5;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Registration> registrations = new ArrayList<>();
        int option = 0;

        while(option != 4){
            Scanner scan = new Scanner(System.in);

            System.out.println("\n\n1 - Cadastrar nova pessoa\n2 - Listar pessoas cadastradas\n3 - Buscar pessoas por tipo\n4 - Sair\nEscolha uma opção: ");
            option = scan.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Digite seus dados a baixo: ");
                    System.out.println("Nome: ");
                    String name = scan.next();
                    System.out.println("\nIdade: ");
                    int age = scan.nextInt();
                    System.out.println("\nEmail: ");
                    String email = scan.next();
                    System.out.println("\nFunção: (1 - Cliente, 2 - Funcionário ou 3 - Gerente) ");
                    int type = scan.nextInt();

                    System.out.printf("\nNome: %s\nIdade: %d\nEmail: %s\nFunção (1 - Cliente, 2 - Funcionário ou 3 - Gerente): %d", name, age, email, type);
                    System.out.println("\nConfirma os dados acima?\n1 - Salvar\n2 - Cancelar");
                    int option_save = scan.nextInt();

                    if (option_save == 1) {
                        Registration new_registration;

                        new_registration = new Registration(name, age, email, type);
                        registrations.add(new_registration);

                        System.out.println("\nCadastrado com sucesso!");
                    } else {
                        System.out.println("\nCadastro cancelado!");
                    }
                    break;

                case 2:
                    for (var i : registrations) {

                        System.out.printf("\n- %s", i.getNome());
                    }
                    break;
                case 3:
                    System.out.println("Escolha um tipo de função para buscar (1 - Cliente, 2 - Funcionário ou 3 - Gerente): ");
                    int option_type = scan.nextInt();

                    for (var i : registrations) {
                        int registration_type = i.getType();

                        System.out.printf("Pessoas cadastradas como %d (1 - Cliente, 2 - Funcionário ou 3 - Gerente): ", option_type);
                        if (option_type == registration_type) {
                            System.out.printf("\n- %s", i.getNome());
                        }

                    }
                    break;
                default:
                    System.out.println("Encerrado com sucesso.");
                    scan.close();
                    break;
            }
        }
    }
}
