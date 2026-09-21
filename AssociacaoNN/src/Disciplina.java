import java.util.ArrayList;

    public class Disciplina {
    private String nome;
    private String sigla;
    private ArrayList<Matricula> matriculas;

    // construtores
    public Disciplina() {
        this("Sem nome.", "Sem sigla.");
    }

    public Disciplina(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
        this.matriculas = new ArrayList<>();
    }

    // getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public ArrayList<Matricula> getMatriculas() {
        return matriculas;
    }

    public void setMatriculas(ArrayList<Matricula> matriculas) {
        this.matriculas = matriculas;
    }

    // adiciona matricula na disciplina
    public void adicionaMatricula(Matricula matricula){
        this.matriculas.add(matricula);
    }

    // lista alunos da disciplina
        public void listarAluno() {
            for (Matricula matricula : this.matriculas){
                System.out.println(matricula.getAluno() .getNome());
            }
        }
    @Override
    public String toString() {
        return "Disciplina{" +
                "nome='" + nome + '\'' +
                ", sigla='" + sigla + '\'' +
                '}';
    }
}
