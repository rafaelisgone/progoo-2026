public class FuncionarioApp {
    public static void main(String[] args) {
        // criando dois funcionários
        Funcionario funcionario1 = new Funcionario("Rafael", 2500.00, 40);
        Funcionario funcionario2 = new Funcionario("Carlos", 3200.00, 44);

        // antes das alterações
        System.out.println("=== ANTES DAS ALTERACOES ===");

        System.out.println("Funcionario 1:");
        System.out.println("Nome: " + funcionario1.getNome());
        System.out.println("Salario: " + funcionario1.getSalario());
        System.out.println("Carga horaria: " + funcionario1.getCargaHorariaSemanal());

        System.out.println();

        System.out.println("Funcionario 2:");
        System.out.println("Nome: " + funcionario2.getNome());
        System.out.println("Salario: " + funcionario2.getSalario());
        System.out.println("Carga horaria: " + funcionario2.getCargaHorariaSemanal());

        // alterações válidas
        funcionario1.setNome("Rafael Silva");
        funcionario1.setSalario(3000.00);
        funcionario1.setCargaHorariaSemanal(44);

        // Alterações inválidas
        funcionario1.setNome("");
        funcionario1.setNome("Este eh um nome extremamente longo que possui mais de cinquenta caracteres");

        funcionario1.setSalario(0);
        funcionario1.setCargaHorariaSemanal(50);

        // depois das alterações
        System.out.println();
        System.out.println("=== DEPOIS DAS ALTERACOES ===");

        System.out.println("Funcionario 1:");
        System.out.println("Nome: " + funcionario1.getNome());
        System.out.println("Salario: " + funcionario1.getSalario());
        System.out.println("Carga horaria: " + funcionario1.getCargaHorariaSemanal());
    }
}
