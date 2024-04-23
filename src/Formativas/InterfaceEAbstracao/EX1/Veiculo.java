package Formativas.InterfaceEAbstracao.EX1;

public abstract class Veiculo {
    private String marca;
    private String cor;
    private String placa;

    public Veiculo(String marca, String cor, String placa){
        this.marca = marca;
        this.cor = cor;
        this.placa = placa;
    }

    public abstract String acelerar();

    public abstract String frear();

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
