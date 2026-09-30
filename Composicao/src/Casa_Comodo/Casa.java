package Casa_Comodo;

import java.util.ArrayList;

public class Casa {
    private String endereco;
    private ArrayList<Comodo> comodos;

    public Casa(String endereco) {
        this.endereco = endereco;
        this.comodos = new ArrayList<>();

        comodos.add(new Comodo("Sala", 20.0));
        comodos.add(new Comodo("Quarto", 12.5));
        comodos.add(new Comodo("Cozinha", 10.0));
        comodos.add(new Comodo("Banheiro", 5.0));
    }

    public void listarComodos() {
        System.out.println("Casa em: " + endereco);
        for (Comodo c : comodos) {
            System.out.println(c.getNome() + " - " + c.getAreaM2() + " m²");
        }
    }
}