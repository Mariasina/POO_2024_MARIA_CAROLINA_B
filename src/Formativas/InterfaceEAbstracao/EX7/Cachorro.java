package Formativas.InterfaceEAbstracao.EX7;

public class Cachorro extends Animal{

    public Cachorro(String nome){
        super(nome);
    }

    @Override
    public String emitirSom() {
        return "AU AU";
    }
}
