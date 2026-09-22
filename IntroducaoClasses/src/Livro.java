public class Livro {

    // variáveis de instância
    public String titulo;
    public String autor;
    public boolean disponivel;

    // variáveis de clase
    public static int totalLivros;

    // métodos construtores
    public Livro() {
        this("sem títutlo", "sem autor");
    }

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true;
        Livro.totalLivros++;
    }

    // método de classe
    public static int getRetornaTotalLivros() {
        return Livro.totalLivros;
    }

    // métodos de instância
    public void emprestar() {
        if (disponivel == true) {
            disponivel = false;
            System.out.println("Livro emprestado com sucesso.");
        }
        else{
            System.out.println("Livro já está emprestado.");
        }
    }

    public void devolver() {
        this.disponivel = true;
        System.out.println("Livro devolvido com sucesso.");
    }


    public void exibirFicha() {
        System.out.println("Título: " + this.titulo +
                " | Autor: " + this.autor +
                " | Status: " + (this.disponivel ? "Disponível." : "Emprestado."));
    }
}