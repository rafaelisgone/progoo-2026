import java.util.ArrayList;

public class PagavelApp {
    public static void main(String[] args) {
        ArrayList<Pagavel> pagamentos = new ArrayList<>();

        pagamentos.add(new Boleto());
        pagamentos.add(new CartaoCredito());
        pagamentos.add(new Pix());

        for (Pagavel obj : pagamentos) {
            obj.pagar(100.99); //polimorfismo
        }
    }
}
