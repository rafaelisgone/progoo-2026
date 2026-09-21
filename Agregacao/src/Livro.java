public class Livro {
    private String titulo, autor, editora;
    private int ano;

    public Livro(){
        this("Sem título.", "Sem autor.", "Sem editora.", 0);
    }

    public Livro(String titulo, String autor, String editora, int ano){
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setEditora(editora);
        this.setAno(ano);
    }

    // titulo
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getTitulo(){
        return this.titulo;
    }

    // autor
    public void setAutor(String autor){
        this.autor = autor;
    }
    public String getAutor(){
        return this.autor;
    }

    // editora
    public void setEditora(String editora){
        this.editora = editora;
    }
    public String getEditora(){
        return this.editora;
    }

    // ano
    public void setAno(int ano){
        this.ano = ano;
    }
    public int getAno(){
        return this.ano;
    }
}