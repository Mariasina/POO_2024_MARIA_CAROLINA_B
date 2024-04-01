package Revisao_Avaliacao.EX3;

public class Retangulo {
    private double width;
    private double height;

    public Retangulo(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double rectangleArea(double width, double height){
        return width * height;
    }

    public double rectanglePerimiter(double width, double height){
        return 2 * (width + height);
    }
}
