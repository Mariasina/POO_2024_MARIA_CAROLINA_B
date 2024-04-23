package Formativas.InterfaceEAbstracao.EX3;

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Mari", 1);

        aluno1.novaDiscilina("Matemática", 10);
        aluno1.novaDiscilina("Português", 8);

        System.out.printf("O aluno %s de matricula %d tem as disciplinas: ", aluno1.getNome(), aluno1.getMatricula());
        System.out.println(aluno1.getDisciplina());
    }
}
