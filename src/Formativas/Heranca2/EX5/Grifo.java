package Formativas.Heranca2.EX5;

public class Grifo extends Criatura {
    public Grifo(String name, int atckPower){
        super(name, atckPower);
    }

    public String fly(){
        return "Voando";
    }
}
