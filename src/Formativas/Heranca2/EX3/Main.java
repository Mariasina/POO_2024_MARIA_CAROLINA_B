package Formativas.Heranca2.EX3;

public class Main {
    public static void main(String[] args) {
        Terreno area1 = new Terreno();
        System.out.println(area1.describe());

        Floresta area2 = new Floresta();
        System.out.println(area2.describe());

        Montanha area3 = new Montanha();
        System.out.println(area3.describe());

        Deserto area4 = new Deserto();
        System.out.println(area4.describe());
    }
}

