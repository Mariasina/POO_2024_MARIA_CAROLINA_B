package Formativas.Heranca2.EX5;

public class Criatura {
    private String name;
    private int atckPower;

    public Criatura(String name, int atckPower){
        this.name = name;
        this.atckPower = atckPower;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAtckPower() {
        return atckPower;
    }

    public void setAtckPower(int atckPower) {
        this.atckPower = atckPower;
    }
}
