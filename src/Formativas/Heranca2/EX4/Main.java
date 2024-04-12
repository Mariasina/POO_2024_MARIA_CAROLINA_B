package Formativas.Heranca2.EX4;

public class Main {
    public static void main(String[] args) {
        Personagem pers1 = new Personagem("Angel", 5);
        System.out.printf("\n\nNome: %s\nVida: %d\nAção: %s", pers1.getName(), pers1.getHealthPoints(), pers1.act());

        Ladino pers2 = new Ladino("Americo", 7, 3);
        System.out.printf("\n\nNome: %s\nVida: %d\nPontos de destreza: %d\nAção: %s", pers2.getName(), pers2.getHealthPoints(), pers2.getDexterityPoints(), pers2.act());

        Bruxo pers3 = new Bruxo("Bella", 6, 4);
        System.out.printf("\n\nNome: %s\nVida: %d\nPontos de mágica: %d\nAção: %s", pers3.getName(), pers3.getHealthPoints(), pers3.getMagicPoints(), pers3.act());

        Arqueiro pers4 = new Arqueiro("João", 8, 2);
        System.out.printf("\n\nNome: %s\nVida: %d\nPontos de mira: %d\nAção: %s", pers4.getName(), pers4.getHealthPoints(), pers4.getAimPoints(), pers4.act());



    }
}
