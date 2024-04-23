package Formativas.TratamentoExcecao;

import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try{
            System.out.println("Digite um número inteiro por extenso: ");
            String num_string = scan.next();

            int num = Integer.parseInt(num_string);

        }catch (NumberFormatException numForExp){
            System.out.println("Não é um número válido!");
        }finally {
            scan.close();
        }
    }
}
