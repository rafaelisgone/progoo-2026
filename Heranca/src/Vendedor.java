public class Vendedor extends Funcionario {
    private double totalVendas;

    // construtor
    public Vendedor() {
        this("sem nome", 0, 0);
    }

    public Vendedor(String nome, double salario, double totalVendas) {
        super(nome, salario);
        this.totalVendas = totalVendas;
    }

    // getters e setters
    public double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }

    @Override
    public double calcularBonus() {
        return this.totalVendas * 0.10;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Bõnus de total de vendas: " + calcularBonus() + "\n===================================");
    }
}
