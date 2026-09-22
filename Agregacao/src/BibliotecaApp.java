public class BibliotecaApp {
    public static void main(String[] args){
        // criar livros
        Livro l1 = new Livro("Java\n", "Daniel\n", "Pearson", 2021);
        Livro l2 = new Livro("C++\n", "Pedro\n", "Pearson", 2019);
        Livro l3 = new Livro("Pythonn\n", "Rafael\n", "Pearson", 2022);

        // cria biblioteca
        Biblioteca bi1 = new Biblioteca("Bora pra cima", "Rua dos programadores, 1011");
        // adiciona livros a biblioteca
        bi1.adicionaLivro(l1);
        bi1.adicionaLivro(l2);
        bi1.adicionaLivro(l3);

        bi1.consultaAcervo();
    }
}