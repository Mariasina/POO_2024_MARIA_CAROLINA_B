package Formativas.Heranca2.EX4;

public class Personagem {
    private String name;
    private int health_points;

    public Personagem(String name, int health_points){
        this.name = name;
        this.health_points = health_points;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthPoints() {
        return health_points;
    }

    public void setHealthPoints(int health_points) {
        this.health_points = health_points;
    }

    public String act(){
        return "andou";
    }
}
