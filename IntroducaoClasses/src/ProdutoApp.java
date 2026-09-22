public class ProdutoApp {
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        Produto produto2 = new Produto("Teclado", 150.00, 10);
        Produto produto3 = new Produto("Mouse", 80.00, 20);

        // alterando os dados do produto criado pelo construtor padrão
        produto1.nome = "Monitor";
        produto1.preco = 900.00;
        produto1.repor(5);

        // vendendo
        produto2.vender(3);
        produto3.vender(5);
        produto1.vender(2);

        // tentando vender mais do que existe no estoque
        produto2.vender(20);

        // repondo estoque
        produto3.repor(10);

        // exibindo os dados dos produtos
        System.out.println("\n=== DADOS DOS PRODUTOS ===");

        produto1.exibirDados();
        produto2.exibirDados();
        produto3.exibirDados();

        // exibindo o total de produtos cadastrados
        System.out.println("Total de produtos cadastrados: "
                + Produto.getTotalProdutos());
    }
}