package Formativas;

public interface Veiculo {
    public String placa = "";
    public float velMax = 0;
    public void inicar();
    public void parar();
    default void buzinar(){
        System.out.println("Buzinando");
    }
}
