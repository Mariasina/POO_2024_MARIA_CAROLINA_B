package Formativas.InterfaceEAbstracao.EX7;

public class Main {
    public static void main(String[] args) {
        Gato animal1 = new Gato("Mimi");
        Cachorro animal2 = new Cachorro("Toby");

        System.out.println(animal1.getNome());
        System.out.println(animal1.emitirSom());
        animal1.mover(2);
        System.out.println("Posição: " + animal1.getPosicao());

        System.out.println();
        System.out.println(animal2.getNome());
        System.out.println(animal2.emitirSom());
        animal1.mover(5);
        System.out.println("Posição: " + animal2.getPosicao());
    }
}
