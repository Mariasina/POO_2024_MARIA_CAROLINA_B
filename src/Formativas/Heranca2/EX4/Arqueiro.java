package Formativas.Heranca2.EX4;

public class Arqueiro extends Personagem{
    private int aim_points;

    public Arqueiro(String name, int health_points, int aim_points){
        super(name, health_points);
        this.aim_points = aim_points;
    }

    public int getAimPoints() {
        return aim_points;
    }

    public void setAimPoints(int aim_points) {
        this.aim_points = aim_points;
    }

    @Override
    public String act(){
        return "atirou";
    }
}
