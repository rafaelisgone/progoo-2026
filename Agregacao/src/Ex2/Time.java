package Ex2;

import java.util.ArrayList;

public class Time {
    private String nome;
    private ArrayList<Jogador> jogadores;

    public Time(String nome) {
        this.nome = nome;
        this.jogadores = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarJogador(Jogador jogador) {
        this.jogadores.add(jogador);
    }

    public void listarJogadores() {
        for (Jogador jogador : this.jogadores) {
            System.out.println("\nNome: " + jogador.getNome() +
                    "\nNúmero da camisa: " + jogador.getNumeroCamisa());
        }
    }
}