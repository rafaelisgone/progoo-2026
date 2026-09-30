package Exercicios;

import java.util.ArrayList;

public class Filme {
    private String titulo;
    private ArrayList<Atuacao> atuacoes = new ArrayList<>();

    public Filme(String titulo) {
        this.titulo = titulo;
    }

    public void adicionarAtuacao(Atuacao atuacao) {
        atuacoes.add(atuacao);
    }

    public String getTitulo() {
        return titulo;
    }

    public ArrayList<Atuacao> getAtuacoes() {
        return atuacoes;
    }
}