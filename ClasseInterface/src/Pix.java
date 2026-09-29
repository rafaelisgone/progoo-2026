public class Pix implements Pagavel {

    @Override
    public void pagar(double valor) {
        System.out.println("Pix pago no valor de: R$" + valor);
    }
}
