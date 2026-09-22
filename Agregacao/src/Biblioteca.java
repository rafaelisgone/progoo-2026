import java.util.ArrayList;

public class Biblioteca {
    private String nome, endereco;
    // vetor de livros
    private ArrayList<Livro> livros;

    public Biblioteca() {
        this("sem nome", "sem endereço");
    }

    public Biblioteca(String nome, String endereco) {
        this.setNome(nome);
        this.setEndereco(endereco);
        livros = new ArrayList<Livro>();
    }

    // nome
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }

    // endereco
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getEndereco() {
        return this.endereco;
    }

    // adicionar livro
    public void adicionaLivro(Livro livro) {
        this.livros.add(livro);
    }

    // consulta acervo
    public void consultaAcervo() {
        for (Livro livro : this.livros) { // para cada livro do vetor livros
            System.out.println("Nome: " + livro.getTitulo() + " Autor: " + livro.getAutor());
        }
    }
}