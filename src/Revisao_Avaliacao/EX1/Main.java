package Revisao_Avaliacao.EX1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String name = scan.next();
        System.out.println("Digite sua idade: ");
        int age = scan.nextInt();
        scan.nextLine();
        System.out.println("Digite seu endereço: ");
        String adress = scan.nextLine();

        Pessoa new_person;

        new_person = new Pessoa(name, age, adress);

        System.out.printf("\nNome: %s\nIdade: %d\nEdereço: %s\nDeseja alterar algum dos dados? (1 - Sim | 2 - Não): ", new_person.getName(), new_person.getAge(), new_person.getAdress());
        int choice_option = scan.nextInt();

        int choice_information = 0;
        if(choice_option == 1){
            while(choice_information != 4){
                System.out.printf("\nNome: %s\nIdade: %d\nEdereço: %s", new_person.getName(), new_person.getAge(), new_person.getAdress());

                System.out.println("\n1 - Nome\n2 - Idade\n3 - Endereço\n4 - Sair\nEscolha qual dado quer alterar: ");
                choice_information = scan.nextInt();
                switch (choice_information){
                    case 1:
                        System.out.println("Digite o novo nome: ");
                        String new_name = scan.next();

                        new_person.setName(new_name);
                        System.out.println("Nome alterado.");

                        break;
                    case 2:
                        System.out.println("Digite a nova idade: ");
                        int new_age = scan.nextInt();

                        new_person.setAge(new_age);
                        System.out.println("Idade alterada.");

                        break;
                    case 3:
                        scan.nextLine();
                        System.out.println("Digite o novo endereço: ");
                        String new_adress = scan.nextLine();

                        new_person.setAdress(new_adress);
                        System.out.println("Endereço alterado.");

                        break;
                    default:
                        System.out.println("Cadastro finalizado.");

                        break;
                }
            }
        }
        else{
            System.out.println("Cadastro finalizado.");
        }
        scan.close();
    }
}
