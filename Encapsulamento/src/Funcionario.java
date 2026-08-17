public class Funcionario {
    private String nome;
    private double salario;
    private int cargaHorariaSemanal;

    public Funcionario(String nome, double salario, int cargaHorariaSemanal) {
        this.setNome(nome);
        this.setSalario(salario);
        this.setCargaHorariaSemanal(cargaHorariaSemanal);
    }

    // getters
    public String getNome() {
        return this.nome;
    }

    public double getSalario() {
        return this.salario;
    }

    public int getCargaHorariaSemanal() {
        return this.cargaHorariaSemanal;
    }

    // Setters
    public void setNome(String nome) {
        if (nome == null || nome.isEmpty() || nome.length() > 50) {
            System.out.println("Nome invalido!");
        } else {
            this.nome = nome;
        }
    }

    public void setSalario(double salario) {
        if (salario <= 0) {
            System.out.println("Salario invalido!");
        } else {
            this.salario = salario;
        }
    }

    public void setCargaHorariaSemanal(int cargaHorariaSemanal) {
        if (cargaHorariaSemanal < 1 || cargaHorariaSemanal > 44) {
            System.out.println("Carga horaria invalida!");
        } else {
            this.cargaHorariaSemanal = cargaHorariaSemanal;
        }
    }
}