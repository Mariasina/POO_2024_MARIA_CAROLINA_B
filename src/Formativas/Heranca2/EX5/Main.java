package Formativas.Heranca2.EX5;

public class Main {
    public static void main(String[] args) {
        Dragao creat1 = new Dragao("Spike", 2);
        System.out.printf("\n\nNome: %s\nPoder de ataque: %d\nAção: %s", creat1.getName(), creat1.getAtckPower(), creat1.shootFire());

        Unicornio creat2 = new Unicornio("Lara", 6, "blue");
        System.out.printf("\n\nNome: %s\nPoder de ataque: %d\nCor: %s\nAção: %s", creat2.getName(), creat2.getAtckPower(), creat2.getColor(), creat2.makeRainbow());

        Grifo creat3 = new Grifo("Marta", 4);
        System.out.printf("\n\nNome: %s\nPoder de ataque: %d\nAção: %s", creat3.getName(), creat3.getAtckPower(), creat3.fly());
    }
}
