package Formativas.Heranca.EX1;

public class Administrativo extends Assistente{
    private String shift;
    private double nighttime_supplement;
    public Administrativo(String name, double wage, int registration_num, String shift, double nighttime_supplement){
        super(name, wage, registration_num);
        this.shift = shift;
        this.nighttime_supplement = nighttime_supplement;
    }

    @Override
    public double anualWage() {
        return super.anualWage() + (nighttime_supplement * 12);
    }
}
