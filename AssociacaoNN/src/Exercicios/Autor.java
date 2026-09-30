package Exercicios;

import java.util.ArrayList;

public class Autor {
    private String nome;
    private ArrayList<Autoria> autorias = new ArrayList<>();

    public Autor(String nome) {
        this.nome = nome;
    }

    public void adicionarAutoria(Autoria autoria) {
        autorias.add(autoria);
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Autoria> getAutorias() {
        return autorias;
    }
}