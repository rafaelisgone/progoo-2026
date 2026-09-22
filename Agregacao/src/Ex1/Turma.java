package Ex1;

public class Turma {
    private String nome;
    private Professor professor;

    public Turma(String nome, Professor professor) {
        this.nome = nome;
        this.professor = professor;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Professor: " + professor.getNome());
    }
}