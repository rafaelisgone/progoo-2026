public class BibliotecaApp {
    public static void main(String[] args) {

        // objetos da classe ou instância da classe
        Livro li1 = new Livro("A\n", "José\n");
        Livro li2 = new Livro("B\n", "Pedro\n");
        Livro li3 = new Livro();

        li1.emprestar();
        li1.emprestar();
        li1.devolver();
        li1.emprestar();
        li1.exibirFicha();

        li2.emprestar();
        li2.emprestar();
        li2.devolver();
        li2.emprestar();
        li2.exibirFicha();

        li3.emprestar();
        li3.emprestar();
        li3.devolver();
        li3.emprestar();
        li3.exibirFicha();

        System.out.println("TOTAL DE LIVROS: " + Livro.totalLivros);
    }
}
