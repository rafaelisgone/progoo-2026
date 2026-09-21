public class Gerente extends Funcionario {
    private double bonusGerencial;

    // construtor
    public Gerente(String nome, double salario, double bonusGerencial) {
        super(nome, salario); // chama o construtor da super classe
        this.bonusGerencial = bonusGerencial;
    }

    // getters e setters
    public double getBonusGerencial() {
        return bonusGerencial;
    }

    public void setBonusGerencial(double bonusGerencial) {
        this.bonusGerencial = bonusGerencial;
    }

    @Override // anulaçao de métodos
    public double calcularBonus() {
        return super.calcularBonus() + this.bonusGerencial;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Bõnus gerencial: " + this.bonusGerencial + "\n===================================");
    }
}