package Formativas.Heranca2.EX4;

public class Ladino extends Personagem{
    private int dexterity_points;

    public Ladino(String name, int health_points, int dexterity_points){
        super(name, health_points);
        this.dexterity_points = dexterity_points;
    }

    public int getDexterityPoints() {
        return dexterity_points;
    }

    public void setDexterityPoints(int dexterity_points) {
        this.dexterity_points = dexterity_points;
    }

    @Override
    public String act(){
        return "fugiu";
    }
}
