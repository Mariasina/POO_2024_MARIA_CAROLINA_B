import java.util.Scanner;
public class PBL1 {

    public static Float Soma(Float num1, Float num2){
        return num1 + num2;
    }

    public static Float Subtracao(Float num1, Float num2){
        return num1 - num2;
    }

    public static Float Divisao(Float num1, Float num2){
        return num1 / num2;
    }

    public static Float Multiplicacao(Float num1, Float num2){
        return num1 * num2;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        Float num1 = scan.nextFloat();

        System.out.println("Digite o segundo número: ");
        Float num2 = scan.nextFloat();

        System.out.println("1 - Soma\n2 - Subtração\n3 - Divisão\n4 - Multiplicação\n5 - Encerrar\nDigite qual operação deseja realizar: ");
        Integer operacao = scan.nextInt();

        switch (operacao){
            case 1: System.out.println("O resultado é: " + Soma(num1, num2));
                break;
            case 2: System.out.println("O resultado é: " + Subtracao(num1, num2));
                break;
            case 3: System.out.println("O resultado é: " + Divisao(num1, num2));
                break;
            case 4: System.out.println("O resultado é: " + Multiplicacao(num1, num2));
                break;
            case 5: System.out.println("Encerrado com sucesso.");
                break;
        }
    }
}