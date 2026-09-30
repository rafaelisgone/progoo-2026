package Turma_Professor_AssociacaoSimples;

public class Professor {
    private String nome, especialidade;

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }


    public String getNome() {
        return nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }
}