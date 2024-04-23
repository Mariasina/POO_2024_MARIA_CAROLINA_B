package Formativas.InterfaceEAbstracao.EX1;

public class Carro extends Veiculo{

    public Carro(String marca, String cor, String placa){
        super(marca, cor, placa);
    }

    public String acelerar(){
        return "Carro acelerando";
    }

    public String frear(){
        return "Carro freando";
    }


}
