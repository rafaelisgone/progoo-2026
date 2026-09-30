package Exercicios;

public class TesteAssociacaoNN {
    public static void main(String[] args) {

        // livros e autores
        Livro livro1 = new Livro("Dom Casmurro");
        Livro livro2 = new Livro("Introdução a Java");

        Autor autor1 = new Autor("Machado de Assis");
        Autor autor2 = new Autor("Maria Silva");

        Autoria.autorar(livro1, autor1, "autor principal");
        Autoria.autorar(livro2, autor2, "autor principal");
        Autoria.autorar(livro2, autor1, "coautor");

        // atores e filmes
        Ator ator1 = new Ator("Fernanda Montenegro");
        Ator ator2 = new Ator("Wagner Moura");

        Filme filme1 = new Filme("Central do Brasil");
        Filme filme2 = new Filme("Tropa de Elite");

        Atuacao.atuar(ator1, filme1, "Dora");
        Atuacao.atuar(ator2, filme2, "Capitão Nascimento");
        Atuacao.atuar(ator2, filme1, "Participação especial");

        // para cada livro, lista autores e papéis
        Livro[] livros = {livro1, livro2};
        for (Livro l : livros) {
            System.out.println("Livro: " + l.getTitulo());
            for (Autoria a : l.getAutorias()) {
                System.out.println("  - " + a.getAutor().getNome()
                        + " (" + a.getPapel() + ")");
            }
        }

        System.out.println();

        // Para cada filme, lista o elenco
        Filme[] filmes = {filme1, filme2};
        for (Filme f : filmes) {
            System.out.println("Filme: " + f.getTitulo());
            for (Atuacao at : f.getAtuacoes()) {
                System.out.println("  - " + at.getAtor().getNome()
                        + " como " + at.getPersonagem());
            }
        }
    }
}