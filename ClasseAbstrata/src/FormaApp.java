import java.util.ArrayList;

public class FormaApp {
    public static void main(String[] args) {
        ArrayList<Forma> formas = new ArrayList<>();

        formas.add(new Circulo("branco", 3.1));
        formas.add(new Circulo("roxo", 1.2));
        formas.add(new Retangulo("amarelo", 3, 2));
        formas.add(new Retangulo("azul", 10, 2));

        for(Forma f : formas) {
            System.out.printf("Valor de área: %.2f \n", f.calcularArea());
        }
    }
}
