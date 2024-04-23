package Formativas.InterfaceEAbstracao.EX1;

public class Moto extends Veiculo{

    public Moto(String marca, String cor, String placa){
        super(marca, cor, placa);
    }

    public String acelerar(){
        return "Moto acelerando";
    }

    public String frear(){
        return "Moto freando";
    }
}
