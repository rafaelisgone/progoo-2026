package Composicao;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Pedido {
    private int numeroPedido;
    private LocalDateTime data;
    private float valor;
    private String cliente;
    private int quantidade;
    // vetor
    private ArrayList<ItemPedido> itens;

    // getter e setters
    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    // construtor
    public Pedido() {
        this(0, LocalDateTime.now(), "Sem cliente.");
    }

    public Pedido(int numeroPedido, LocalDateTime data, String cliente) {
        this.setNumeroPedido(numeroPedido);
        this.setData(data);
        this.valor = 0;
        this.setCliente(cliente);
        this.itens = new ArrayList<ItemPedido>();
    }

    public void adiconaItemPedido(String produto, float valor, int quantidade){
        this.itens.add(new ItemPedido(produto, valor, quantidade));
        this.valor = this.valor + (valor * quantidade);
    }

    public void exibeItens(){
        System.out.println("Itens do pedido:");
        for (ItemPedido itemPedido : this.itens){
            System.out.println("\nProduto: " + itemPedido.getProduto() +
                                "\nQuantidade: " + itemPedido.getQuantidade() +
                                "\nValor: " + itemPedido.getValor());
        }
    }

    public Pedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public Pedido(LocalDateTime data) {
        this.data = data;
    }

    public Pedido(float valor) {
        this.valor = valor;
    }

    public Pedido(String cliente) {
        this.cliente = cliente;
    }
}
