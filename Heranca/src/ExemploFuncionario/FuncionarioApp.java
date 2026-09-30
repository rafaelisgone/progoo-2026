package ExemploFuncionario;

public class FuncionarioApp {

    // aqui é onde acontece o polimorfismo
    public static void aux(Funcionario f) { // criando um objeto para chamá-lo
        f.calcularBonus();
        f.exibirDados();
    }

    public static void main(String[] args) {
//        Exemplo.Funcionario f1 = new Exemplo.Funcionario("Bernardo", 1568.00);
//        Exemplo.Funcionario f2 = new Exemplo.Funcionario("Douglas", 2700.00);
//        Exemplo.Gerente f3 = new Exemplo.Gerente("Eduardo", 4500.00, 400);
//        Exemplo.Vendedor f4 = new Exemplo.Vendedor("Kaio", 1800.00, 466);
//
//        f1.exibirDados();
//        f3.exibirDados();
//        f4.exibirDados();

        Gerente ge = new Gerente("Luciana", 6000.00, 200);
        aux(ge); // f é ge
    }
}