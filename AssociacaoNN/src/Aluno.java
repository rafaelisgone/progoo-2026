import java.util.ArrayList;

public class Aluno {
    private String nome;
    private int ra;
    private ArrayList<Matricula> matriculas;

    // construtores
    public Aluno() {
        this("sem nome", 0);
    }

    public Aluno(String nome, int ra) {
        this.nome = nome;
        this.ra = ra;
        this.matriculas = new ArrayList<>();
    }

    // getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public ArrayList<Matricula> getMatriculas() {
        return matriculas;
    }

    // adicona matricula no aluno
    public void adicionaMatricula(Matricula matricula){
        this.matriculas.add(matricula);
    }

    public void listarDisciplinas(){
        System.out.println("Disciplina matriculadas pelo aluno:");
        for (Matricula matricula : this.matriculas){
            System.out.println(matricula.getDisciplina() .getNome());
        }
    }

    public void setMatriculas(ArrayList<Matricula> matriculas) {
        this.matriculas = matriculas;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", ra=" + ra +
                ", matriculas=" + matriculas +
                '}';
    }
}
