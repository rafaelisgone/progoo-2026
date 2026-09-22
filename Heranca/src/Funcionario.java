public class Funcionario {
    protected String nome; // protected deixa a variável públic para ser herdada
    protected double salario;

    // construtores
    public Funcionario() {
        this("sem nome", 0);
    }

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    // getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // método calcula bônus para qualquer funcionário
    public double calcularBonus() {
        return this.salario * 0.15; // 15% de bônus
    }

    public void exibirDados() {
        System.out.println("Nome: " + this.nome +
                "\nSalário: " + this.salario +
                "\nBônus: " + this.calcularBonus() +
                "\nTotal a receber: " + (this.calcularBonus() + this.salario) + "\n===================================");
    }
}