package Exercicios;

import java.util.ArrayList;

public class TesteHeranca {
    public static void main(String[] args) {

        // veículos
        ArrayList<Veiculo> veiculos = new ArrayList<>();
        veiculos.add(new Carro("Toyota", 2022, 4));
        veiculos.add(new Moto("Honda", 2021, 300));

        for (Veiculo v : veiculos) {
            v.exibirDados();
        }

        System.out.println();

        // formas
        ArrayList<Forma> formas = new ArrayList<>();
        formas.add(new Circulo(2.0));
        formas.add(new Retangulo(3.0, 4.0));
        formas.add(new Circulo(1.0));

        double soma = 0;
        for (Forma f : formas) {
            soma += f.calcularArea();   // cada f responde pela sua classe real
        }

        // soma total
        System.out.printf("Soma total das areas: %.2f%n", soma);
    }
}