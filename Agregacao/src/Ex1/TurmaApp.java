package Ex1;

public class TurmaApp {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Rafael", "Física");
        Professor professor2 = new Professor("Érika", "História");

        Turma turma1 = new Turma("1A", professor1);
        Turma turma2 = new Turma("2A", professor2);

        turma1.exibirDados();
        System.out.println();
        turma2.exibirDados();
    }
}