package Formativas.InterfaceEAbstracao.EX1;

public class Main {

    public static void main(String[] args) {
        Carro veiculo1 = new Carro("Toyota", "Azul", "HGF7G45");
        Moto veiculo2 = new Moto("Yamaha", "Vermelho", "IIS4I767");

        System.out.printf("\n\n%s da marca %s", veiculo1.acelerar(), veiculo1.getMarca());
        System.out.printf("\n%s da marca %s", veiculo1.frear(), veiculo1.getMarca());

        System.out.printf("\n\n%s da marca %s", veiculo2.acelerar(), veiculo2.getMarca());
        System.out.printf("\n%s da marca %s", veiculo2.frear(), veiculo2.getMarca());
    }
}
