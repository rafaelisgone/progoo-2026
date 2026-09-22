public class Produto {

    // variáveis de instância
    String nome;
    double preco;
    int quantidadeEstoque;

    // variáveis de clase
    static int totalProdutos;

    // construtor padrão
    public Produto() {
        this("produto sem nome", 0.0, 0);
    }

    // construtor com parâmetros
    public Produto(String nome, double preco, int quantidadeInicial) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeInicial;
        totalProdutos++;
    }

    // método de classe
    public static int getTotalProdutos() {
        return totalProdutos;
    }

    // métodos de instância
    public void vender(int quantidade) {
        if (quantidade <= quantidade) {
            this.quantidadeEstoque -= quantidade;
            System.out.println("Vendido.");
        }
            {
                System.out.println("Produto sem estoque suficiente.");
            }
    }

    public void repor(int quantidade) {
        this.quantidadeEstoque += quantidade;
    }

    public void exibirDados() {
        System.out.println("Nome: " + this.nome +
                "\nPreço" + this.preco +
                "\nQuantidade em estoque: " + this.quantidadeEstoque);
    }
}