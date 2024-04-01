package Formativas.Heranca.EX1;

public class Tecnico extends Assistente{
    private double wage_bonus;

    public Tecnico(String name, double wage, int registration_num, double wage_bonus){
        super(name, wage, registration_num);
        this.wage_bonus = wage_bonus;
    }

    @Override
    public double anualWage() {
        return super.anualWage() + (wage_bonus * 12);
    }

}
