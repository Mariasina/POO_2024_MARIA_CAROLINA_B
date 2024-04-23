package Formativas.InterfaceEAbstracao.EX4;

public class Circulo extends FiguraGeometrica{
    private double raio;

    public Circulo(double raio){
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return 3.14 * (Math.pow(raio, 2));
    }

    @Override
    public double calcularPerimetro() {
        return 2 * 3.14 * raio;
    }
}
