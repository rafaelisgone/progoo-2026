public class FuncionarioApp {

    // aqui é onde acontece o polimorfismo
    public static void aux(Funcionario f) { // criando um objeto para chamá-lo
        f.calcularBonus();
        f.exibirDados();
    }

    public static void main(String[] args) {
//        Funcionario f1 = new Funcionario("Bernardo", 1568.00);
//        Funcionario f2 = new Funcionario("Douglas", 2700.00);
//        Gerente f3 = new Gerente("Eduardo", 4500.00, 400);
//        Vendedor f4 = new Vendedor("Kaio", 1800.00, 466);
//
//        f1.exibirDados();
//        f3.exibirDados();
//        f4.exibirDados();

        Gerente ge = new Gerente("Luciana", 6000.00, 200);
        aux(ge); // f é ge
    }
}