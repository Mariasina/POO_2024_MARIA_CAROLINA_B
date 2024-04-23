package Formativas.InterfaceEAbstracao.EX3;

public class Aluno {
    private String nome;
    private int matricula;
    private Disciplina disciplina;

    public Aluno(String nome, int matricula){
        this.nome = nome;
        this.matricula = matricula;
    }

    public void novaDiscilina(String nome, int horas){
        this.disciplina = new Disciplina(nome, horas);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
}
