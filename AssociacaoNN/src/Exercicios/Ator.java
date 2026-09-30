package Exercicios;

import java.util.ArrayList;

public class Ator {
    private String nome;
    private ArrayList<Atuacao> atuacoes = new ArrayList<>();

    public Ator(String nome) {
        this.nome = nome;
    }

    public void adicionarAtuacao(Atuacao atuacao) {
        atuacoes.add(atuacao);
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Atuacao> getAtuacoes() {
        return atuacoes;
    }
}