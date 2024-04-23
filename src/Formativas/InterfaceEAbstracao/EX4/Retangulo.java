package Formativas.InterfaceEAbstracao.EX4;

public class Retangulo extends FiguraGeometrica{
    private double base;
    private double altura;

    public Retangulo(double base, double altura){
        this.altura = altura;
        this.base = base;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 *(base + altura);
    }
}
