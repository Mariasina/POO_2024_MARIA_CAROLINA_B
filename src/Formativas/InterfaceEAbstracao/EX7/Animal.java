package Formativas.InterfaceEAbstracao.EX7;

public abstract class Animal {
    private String nome;
    private int posicao;

    public Animal(String nome){
        this.nome = nome;
        this.posicao = 0;
    }

    public abstract String emitirSom();

    public void mover(int passos){
        posicao = posicao + passos;
    };

    public int getPosicao() {
        return posicao;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
