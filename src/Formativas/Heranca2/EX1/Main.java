package Formativas.Heranca2.EX1;

public class Main {
    public static void main(String[] args) {
        Personagem pers1 = new Personagem("Mario", 3);
        System.out.printf("\n\nNome: %s\nVida: %d", pers1.getName(), pers1.getHealth());

        Guerreiro pers2 = new Guerreiro("Wagner", 5, "Machado");
        System.out.printf("\n\nNome: %s\nVida: %d\nArma: %s", pers2.getName(), pers2.getHealth(), pers2.getWeapon());

        Mago pers3 = new Mago("Alan", 4, "Trovão");
        System.out.printf("\n\nNome: %s\nVida: %d\nPoder: %s", pers3.getName(), pers3.getHealth(), pers3.getMagicPower());
    }
}
