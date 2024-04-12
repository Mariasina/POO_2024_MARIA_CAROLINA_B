package Formativas.Heranca2.EX2;

public class Pocao extends Item{
    private int cure;

    public Pocao(String name, int quantity, int cure){
        super(name, quantity);
        this.cure = cure;
    }

    public int getCure() {
        return cure;
    }

    public void setCure(int cure) {
        this.cure = cure;
    }
}
