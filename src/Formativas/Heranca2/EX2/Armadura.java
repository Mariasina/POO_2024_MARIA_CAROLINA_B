package Formativas.Heranca2.EX2;

public class Armadura extends Item{
    private int defense;

    public Armadura(String name, int quantity, int defense){
        super(name, quantity);
        this.defense = defense;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }
}
