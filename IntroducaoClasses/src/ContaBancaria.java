public class ContaBancaria {
    // variáveis de instância (VARIÁVEIS DE INSTÂNCIA POSSUEM SEU PRÓPRIO VALOR)
    public String titular;
    public String numero;
    public double saldo;

    // variáveis de classe (SEMPRE POSSUEM "STATIC")
    static int totalContas = 0;
    // static é compartilhada entre os objetos
    static final double TX_MANUT = 12;
    // final é uma constante

    // métodos construtores
    // sobrecarga de métodos construtores
    public ContaBancaria (){
        // chama construtor de baixo
        this("Sem titular", "0000", 0);
    }

    public ContaBancaria(String titular, String numero, double saldo){
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldo;
        // this representa o objeto que chama o método
        totalContas++;
    }

    public void depositar (double x){
        if (x >= 0){
            this.saldo += x;
            System.out.print("/nDepósito efetuado com sucesso.");
        }
        else System.out.println("Erro ao realizar o depósito. Insira um valor maior que 0.");
    }

    public void saque (double x){
        if (x >= 0 && x <= this.saldo){
            this.saldo -= x;
        }
    }

    public void mostra (){
        System.out.print("\n--------------------\n" +
                "Titular: " + this.titular +
                "\nNumero: " + this.numero +
                "\nSaldo: " + this.saldo);
    }
}
