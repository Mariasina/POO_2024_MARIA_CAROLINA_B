package Formativas.Heranca2.EX5;

public class Unicornio extends Criatura{
    private String color;
    public Unicornio(String name, int atckPower, String color) {
        super(name, atckPower);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String makeRainbow(){
        return "Fazendo arco-íris";
    }
}
