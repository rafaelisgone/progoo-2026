public class TesteContaBancaria {
    public static void main (String[] args){
        ContaBancaria cb1 = new ContaBancaria();
        ContaBancaria cb2 = new ContaBancaria("Ana Souza", "1001", 500.00);
        ContaBancaria cb3 = new ContaBancaria("Carla Eduarda", "1002", 1000.00);
        // chamando métodos de instância
        // vai mostrar os dados do objeto que está chamando, no caso o cb1
        cb1.depositar(200.0);
        cb1.saque(150.0);
        cb1.mostra();
        cb2.depositar(50.0);
        cb2.mostra();
        cb3.mostra();
    }
}
