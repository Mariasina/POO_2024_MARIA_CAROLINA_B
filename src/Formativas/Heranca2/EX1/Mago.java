package Formativas.Heranca2.EX1;

public class Mago extends Personagem{
    private String magic_power;

    public Mago(String name, int health, String magic_power){
        super(name, health);
        this.magic_power = magic_power;
    }

    public String getMagicPower() {
        return magic_power;
    }

    public void setMagicPower(String magic_power) {
        this.magic_power = magic_power;
    }
}
