package Formativas.Heranca2.EX4;

public class Bruxo extends Personagem{
    private int magic_points;

    public Bruxo(String name, int health_points, int magic_points){
        super(name, health_points);
        this.magic_points = magic_points;
    }

    public int getMagicPoints() {
        return magic_points;
    }

    public void setMagicPoints(int magic_points) {
        this.magic_points = magic_points;
    }

    @Override
    public String act(){
        return "conjurou";
    }
}
