import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Matricula {
    private LocalDateTime data;
    private Aluno aluno;
    private Disciplina disciplina;
    private float nota;
    private int numero;

    // construtores
    public Matricula() {
        this(LocalDateTime.now(), null, null, 0);
    }

    public Matricula(LocalDateTime data, Aluno aluno, Disciplina disciplina, int numero) {
        this.numero = numero;
        this.aluno = aluno;
        this.disciplina = disciplina;
        this.nota = 0;
        this.data = data;
    }

    // getters e setters
    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public static Matricula matricular(int numero, Aluno aluno, Disciplina disciplina) {
        Matricula m = new Matricula(LocalDateTime.now(), aluno, disciplina, numero);
        aluno.adicionaMatricula(m);
        disciplina.adicionaMatricula(m);
        System.out.println("Matrícula realizada com sucesso.");
        return m;
    }

    @Override
    public String toString() {
        return "Matricula{" +
                "data=" + data +
                ", aluno=" + aluno +
                ", disciplina=" + disciplina +
                ", nota=" + nota +
                ", numero=" + numero +
                '}';
    }
}