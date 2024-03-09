package PBL4;

public class Conta {
    private String nome;
    private int numero;
    private Double saldo;


    public Conta(String nome, int numero, Double saldo) {
        this.nome = nome;
        this.numero = numero;
        this.saldo = saldo;
    }

    public Conta(String nome, int numero){
        this.nome = nome;
        this.numero = numero;
        saldo = 0.0;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getNumero(){
        return numero;
    }

    public void setNome(int numero){
        this.numero = numero;
    }

    public Double getSaldo(){
        return saldo;
    }

    public void setSaldo(Double saldo){
        this.saldo = saldo;
    }
    boolean sacar(Double valor){
        if(this.saldo > valor) {
            this.saldo -= valor;
            return true;
        }else {
            return false;
        }
    }
    boolean depositar(Double valor){
        this.saldo += valor;
        return true;
    }
}
