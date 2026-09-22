package Ex2;

public class TimeApp {
    public static void main(String[] args) {
        Time time1 = new Time("FATEC FRANCA");
        Jogador jogador1 = new Jogador("Rafael", 10);
        Jogador jogador2 = new Jogador("João Paulo", 11);
        Jogador jogador3 = new Jogador("Gabriel", 9);

        time1.adicionarJogador(jogador1);
        time1.adicionarJogador(jogador2);
        time1.adicionarJogador(jogador3);
        time1.listarJogadores();
    }
}