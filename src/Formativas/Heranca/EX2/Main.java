package Formativas.Heranca.EX2;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Bella");
        animal1.setBreed("Beta");
        System.out.printf("\nNome: %s\nRaça: %s\n%s", animal1.getName(), animal1.getBreed(), animal1.bedTime());

        Cachorro animal2 = new Cachorro("Ruby");
        animal2.setBreed("Golden");
        System.out.printf("\n\nNome: %s\nRaça: %s\n%s", animal2.getName(), animal2.getBreed(), animal2.bedTime());

        Gato animal3 = new Gato("Nina");
        animal3.setBreed("Siames");
        System.out.printf("\n\nNome: %s\nRaça: %s\n%s", animal3.getName(), animal3.getBreed(), animal3.bedTime());
    }
}
