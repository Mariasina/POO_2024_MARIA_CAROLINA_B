package Formativas.Heranca2.EX5;

public class Dragao extends Criatura{
    public Dragao(String name, int atckPower){
        super(name, atckPower);
    }

    public String shootFire(){
        return "Atirando fogo";
    }
}
