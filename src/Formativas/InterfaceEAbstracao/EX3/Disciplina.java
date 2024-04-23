package Formativas.InterfaceEAbstracao.EX3;

public class Disciplina {
    private String nome_disciplina;
    private int carga_horaria;

    public Disciplina(String nome_disciplina, int carga_horaria){
        this.nome_disciplina = nome_disciplina;
        this.carga_horaria = carga_horaria;
    }

    public String getNomeDisciplina() {
        return nome_disciplina;
    }

    public void setNomeDisciplina(String nome_disciplina) {
        this.nome_disciplina = nome_disciplina;
    }
}
