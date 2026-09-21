public class EscolaApp {
    public static void main(String[] args){
        Aluno carla = new Aluno("carla", 123);
        Aluno bruno = new Aluno("burno", 124);
        Disciplina poo = new Disciplina("Programação OO", "poo");
        Disciplina bd = new Disciplina("Banco de Dados", "bd");

        Matricula mat1 = Matricula.matricular(1001, carla, poo);
        Matricula mat2 = Matricula.matricular(1002, carla, bd);
        Matricula mat3 = Matricula.matricular(1003, bruno, poo);

        System.out.println("\n");

        carla.listarDisciplinas();

        System.out.println("\n");
        
        bd.listarAluno();
    }
}
