package Formativas.TratamentoExcecao;
import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try{
            System.out.println("Digite o primeiro número: ");
            int num1 = scan.nextInt();
            System.out.println("Digite o segundo número: ");
            int num2 = scan.nextInt();

            int result = num1 / num2;

            System.out.printf("%d/%d = %d", num1, num2, result);
        }catch(ArithmeticException ArExp){
            System.out.println("Divisão por zero não permitida!");
        }finally {
            scan.close();
        }
    }
}
