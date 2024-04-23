package Formativas.InterfaceEAbstracao.EX4;

public class Main {
    public static void main(String[] args) {
        Retangulo forma1 = new Retangulo(4, 10.5);
        Circulo forma2 = new Circulo(8);

        System.out.printf("\nA área do circulo é de %f e do retângulo é de %f", forma2.calcularArea(), forma1.calcularArea());
        System.out.printf("\nO perímetro do circulo é de %f e do retângulo é de %f", forma2.calcularPerimetro(), forma1.calcularPerimetro());

    }
}
