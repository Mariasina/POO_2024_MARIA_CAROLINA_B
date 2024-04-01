package Formativas.Heranca.EX1;

public class Main {
    public static void main(String[] args) {
        Funcionario func1 = new Funcionario("Mari", 1000.0);
        System.out.printf("\nFuncionario: %f", func1.anualWage());

        Assistente func2 = new Assistente("James", 1200.0, 13);
        System.out.printf("\nAssistente: %f", func2.anualWage());
        System.out.print("\nAssistente num: ");
        func2.showData();

        Administrativo func3 = new Administrativo("Amilton", 1100.0, 4, "Noturno", 100.0);
        System.out.printf("\nAssistente Administrativo: %f", func3.anualWage());

        Tecnico func4 = new Tecnico("Barbara", 1500.0, 5, 300.0);
        System.out.printf("\nAssistente Tecnico: %f", func4.anualWage());
    }
}
