public class ItemPedido {
    private String produto;
    private float valor;
    private int quantidade;

    // getter e setters
    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    // construtores
    public ItemPedido() {
        this("sem produto", 0, 0);
    }

    public ItemPedido(String produto, float valor, int quantidade) {
        this.produto = produto;
        this.valor = valor;
        this.quantidade = quantidade;
    }
}
