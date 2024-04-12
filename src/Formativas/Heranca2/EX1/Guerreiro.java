package Formativas.Heranca2.EX1;

public class Guerreiro extends Personagem{
    private String weapon;

    public Guerreiro(String name, int health, String weapon){
        super(name, health);
        this.weapon = weapon;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }
}
