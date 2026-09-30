package Exercicios;

import java.util.ArrayList;

public class Livro {
    private String titulo;
    private ArrayList<Autoria> autorias = new ArrayList<>();

    public Livro(String titulo) {
        this.titulo = titulo;
    }

    public void adicionarAutoria(Autoria autoria) {
        autorias.add(autoria);
    }

    public String getTitulo() {
        return titulo;
    }

    public ArrayList<Autoria> getAutorias() {
        return autorias;
    }
}