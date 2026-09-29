abstract class Forma {
    protected String cor;

    public Forma(String cor) {
        this.cor = cor;
    }

    // metodo abstrato
    abstract double calcularArea();
}
